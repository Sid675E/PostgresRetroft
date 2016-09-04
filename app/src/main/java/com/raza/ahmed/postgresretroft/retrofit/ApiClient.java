package com.raza.ahmed.postgresretroft.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ahmedraza on 04/09/16.
 */
public class ApiClient {

    public static final String BASR_URL = "http://192.143.1.0/";

    public static Retrofit retrofit = null;

    public static Retrofit getClient(){
                if (retrofit== null){
                    retrofit = new Retrofit.Builder()
                            .baseUrl(BASR_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }


        return retrofit;
    }

}
