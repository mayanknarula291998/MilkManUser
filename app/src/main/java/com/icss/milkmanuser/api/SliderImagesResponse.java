package com.icss.milkmanuser.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SliderImagesResponse {

    @SerializedName("response")
    @Expose
    public Boolean response;
    @SerializedName("code")
    @Expose
    public Integer code;
    @SerializedName("data")
    @Expose
    public List<SliderImages> data = null;

}
