package com.example.stork.API.ProcessEftRequestToAccount.Response;

import com.example.stork.API.ProcessEftRequestToAccount.Response.Data;
import com.google.gson.annotations.SerializedName;

public class Response {
    @SerializedName("$type")
    public String $type;

    @SerializedName("Data")
    public Data data;

    public String get$type() {

        return $type;
    }

    public Data getData() {

        return data;
    }
}