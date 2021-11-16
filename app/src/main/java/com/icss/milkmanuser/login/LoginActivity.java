package com.icss.milkmanuser.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.icss.milkmanuser.R;
import com.icss.milkmanuser.databinding.ActivityLoginBinding;
import com.icss.milkmanuser.viewmodels.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        binding.next.setOnClickListener(view -> {
            if (!binding.mobile.getText().toString().equals("")){
                binding.layout1.setVisibility(View.GONE);
                binding.layout2.setVisibility(View.VISIBLE);
                loginViewModel.addUser(binding.mobile.getText().toString());
            }
        });
    }
}