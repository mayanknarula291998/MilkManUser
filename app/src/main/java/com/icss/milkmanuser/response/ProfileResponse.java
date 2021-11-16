package com.icss.milkmanuser.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.icss.milkmanuser.models.ProfileData;

public class ProfileResponse {
    @SerializedName("responce")
    @Expose
    public Boolean responce;
    @SerializedName("data")
    @Expose
    public ProfileData data;
}
