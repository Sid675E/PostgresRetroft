package com.raza.ahmed.postgresretroft;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.raza.ahmed.postgresretroft.retrofit.ApiClient;
import com.raza.ahmed.postgresretroft.retrofit.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sid_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<CustomViewHolder> call = apiService.getJsonFromSid();
        call.enqueue(new Callback<CustomViewHolder>() {
            @Override
            public void onResponse(Call<CustomViewHolder> call, Response<CustomViewHolder> response) {

                List<CustomViewHolder> customViewHolders ;

                recyclerView.setAdapter(new AdapterSid(customViewHolders, R.layout.list_item_sid, getApplicationContext()));

            }

            @Override
            public void onFailure(Call<CustomViewHolder> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
