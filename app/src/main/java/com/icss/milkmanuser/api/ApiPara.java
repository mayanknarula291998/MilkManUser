package com.icss.milkmanuser.api;


import android.location.Location;

import com.icss.milkmanuser.response.LoginResponse;
import com.icss.milkmanuser.response.OtpResponse;
import com.icss.milkmanuser.response.ProfileResponse;
import com.icss.milkmanuser.response.UpdateResponse;

import java.util.HashMap;
import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiPara {

    @FormUrlEncoded
    @POST(BaseUrl.appuserlogin)
    Call<LoginResponse> login(
            @Field("mobile") String mobile);

    @FormUrlEncoded
    @POST(BaseUrl.appmatchotp)
    Call<OtpResponse> checkOtp(
            @Field("mobile") String mobile,
            @Field("otp") String otp);

    @FormUrlEncoded
    @POST(BaseUrl.app_get_profile)
    Call<ProfileResponse> getProfile(
            @Field("user_id") String userId);

    @Multipart
    @POST(BaseUrl.app_update_profile)
    Call<UpdateResponse> updateProfile(
            @Part("user_id") RequestBody user_id,
            @Part("user_fullname") RequestBody user_fullname,
            @Part("district") RequestBody district,
            @Part("area") RequestBody area,
            @Part MultipartBody.Part image);

}

