package com.icss.milkmanuser.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateResponse {
    @SerializedName("responce")
    @Expose
    public Boolean responce;
    @SerializedName("data")
    @Expose
    public String data;
}
