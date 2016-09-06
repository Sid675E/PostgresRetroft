package com.raza.ahmed.postgresretroft.retrofit;

import com.raza.ahmed.postgresretroft.CustomViewResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ahmedraza on 04/09/16.
 */
public interface ApiInterface {

    @GET("rest/")
    Call<CustomViewResponse> getJsonFromSid();

}
