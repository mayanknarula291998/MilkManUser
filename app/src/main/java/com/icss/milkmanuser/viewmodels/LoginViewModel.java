package com.icss.milkmanuser.viewmodels;

import android.app.Application;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.icss.milkmanuser.api.RetrofitClient;
import com.icss.milkmanuser.login.SelectCity;
import com.icss.milkmanuser.response.LoginResponse;
import com.icss.milkmanuser.response.OtpResponse;
import com.icss.milkmanuser.response.UpdateResponse;

import java.io.File;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewModel extends AndroidViewModel {

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    public void addUser(String toString) {
        RetrofitClient.getAPIService().login(toString).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()){
                    if (response.body().responce){
//                        Intent intent = new Intent(getApplication(), SelectCity.class);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                        getApplication().startActivity(intent);
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(getApplication(), ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void updateData(RequestBody userId, RequestBody name, RequestBody district, RequestBody area, MultipartBody.Part image) {
        RetrofitClient.getAPIService().updateProfile(userId,name,district,area,image).enqueue(new Callback<UpdateResponse>() {
            @Override
            public void onResponse(Call<UpdateResponse> call, Response<UpdateResponse> response) {
                if (response.isSuccessful()){
                    if (response.body().responce){
//                        Intent intent = new Intent(getApplication(), SelectCity.class);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                        getApplication().startActivity(intent);
                    }
                }
            }

            @Override
            public void onFailure(Call<UpdateResponse> call, Throwable t) {
                Toast.makeText(getApplication(), ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void checkOtp(String mobile,String otp) {
        RetrofitClient.getAPIService().checkOtp(mobile, otp).enqueue(new Callback<OtpResponse>() {
            @Override
            public void onResponse(Call<OtpResponse> call, Response<OtpResponse> response) {
                if (response.isSuccessful()){
                    if (response.body().responce){
//                        Intent intent = new Intent(getApplication(), SelectCity.class);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                        getApplication().startActivity(intent);
                    }
                }
            }

            @Override
            public void onFailure(Call<OtpResponse> call, Throwable t) {
                Toast.makeText(getApplication(), ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
