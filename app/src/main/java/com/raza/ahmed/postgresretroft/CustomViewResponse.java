package com.raza.ahmed.postgresretroft;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmedraza on 06/09/16.
 */
public class CustomViewResponse {

    @SerializedName("results")
    private List<CustomViewHolder> results;

    public List<CustomViewHolder> getResults(){
        return results;
    }
    public void setResults(List<CustomViewHolder> results){
        this.results = results;

    }
}
