 package com.icss.milkmanuser.api;


import android.content.Context;
import android.location.Location;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

 public class RetrofitClient {

     private static Retrofit retrofit = null,address_retrofit = null;

     public static Retrofit getClient(String url) {
         HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
         interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
         OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).connectTimeout(1000, TimeUnit.SECONDS)
                 .readTimeout(1000, TimeUnit.SECONDS).build();
         retrofit = new Retrofit.Builder()
                 .baseUrl(url).client(client)
                 .addConverterFactory(GsonConverterFactory.create(new Gson())).build();
         return retrofit;
     }

     public static ApiPara getAPIService(){
         return RetrofitClient.getClient(BaseUrl.Main_Baseurl).create(ApiPara.class);
     }

 }
