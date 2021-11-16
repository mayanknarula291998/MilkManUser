package com.icss.milkmanuser.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileData {

    @SerializedName("user_id")
    @Expose
    public String userId;
    @SerializedName("uid")
    @Expose
    public String uid;
    @SerializedName("user_phone")
    @Expose
    public String userPhone;
    @SerializedName("user_fullname")
    @Expose
    public String userFullname;
    @SerializedName("user_email")
    @Expose
    public String userEmail;
    @SerializedName("user_password")
    @Expose
    public String userPassword;
    @SerializedName("user_image")
    @Expose
    public String userImage;
    @SerializedName("pincode")
    @Expose
    public String pincode;
    @SerializedName("socity_id")
    @Expose
    public String socityId;
    @SerializedName("house_no")
    @Expose
    public String houseNo;
    @SerializedName("mobile_verified")
    @Expose
    public String mobileVerified;
    @SerializedName("user_gcm_code")
    @Expose
    public String userGcmCode;
    @SerializedName("user_ios_token")
    @Expose
    public String userIosToken;
    @SerializedName("varified_token")
    @Expose
    public String varifiedToken;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("reg_code")
    @Expose
    public String regCode;
    @SerializedName("d_o_b")
    @Expose
    public String dOB;
    @SerializedName("location")
    @Expose
    public String location;
    @SerializedName("otp")
    @Expose
    public String otp;
    @SerializedName("district")
    @Expose
    public String district;
    @SerializedName("area")
    @Expose
    public String area;
    @SerializedName("image")
    @Expose
    public String image;

}
