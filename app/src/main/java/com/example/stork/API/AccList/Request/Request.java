package com.example.stork.API.AccList.Request;

import com.example.stork.API.Header;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("Header")
    @Expose
    private Header header;
    @SerializedName("Parameters")
    @Expose
    private Parameters Parameters[] = new Parameters[1];

    public Request(Header header, com.example.stork.API.AccList.Request.Parameters parameters) {
        this.header = header;
        this.Parameters[0]=parameters;

    }
}
