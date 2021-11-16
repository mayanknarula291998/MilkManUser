package com.icss.milkmanuser.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SliderImages {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("images")
    @Expose
    public String images;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("created")
    @Expose
    public String created;

}
