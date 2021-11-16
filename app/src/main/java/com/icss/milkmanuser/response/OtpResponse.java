package com.icss.milkmanuser.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OtpResponse {
    @SerializedName("responce")
    @Expose
    public Boolean responce;
    @SerializedName("data")
    @Expose
    public String data;
    @SerializedName("user_id")
    @Expose
    public String userId;
    @SerializedName("mobile_no")
    @Expose
    public String mobileNo;

}
