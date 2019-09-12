package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("location")
    public String location;

    @SerializedName("cid")
    public String weatherId;

}
