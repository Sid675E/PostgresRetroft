package com.raza.ahmed.postgresretroft;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmedraza on 04/09/16.
 */
public class CustomViewHolder {

    //tt char
    //varr int
    //edi char

    @SerializedName("id")
    private Integer id;


    @SerializedName("tt")
    private String tt;

    @SerializedName("varr")
    private Integer varr;

    @SerializedName("edi")
    private String edi;


    public CustomViewHolder(String tt, Integer varr, String edi, Integer id){
        this.tt = tt;
        this.varr = varr;
        this.edi = edi;
        this.id = id;
    }

    public Integer getid(){
        return id;
    }
    public void setid(){
        this.id = id;
    }

    public String gettt()
    {
        return tt;
    }
    public void settt(){
        this.tt = tt;
    }

    public Integer getvarr(){
        return varr;
    }
    public void setvarr(){
        this.varr = varr;
    }
    public String getedi(){
        return edi;
    }

    public void setedi(){
        this.edi = edi;
    }




}
