package com.icss.milkmanuser.login;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.icss.milkmanuser.R;
import com.icss.milkmanuser.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        toggle = new ActionBarDrawerToggle(
                this, binding.drawerLayout, binding.appBarMain.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        binding.drawerLayout.setDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(false);

        MenuIC();


    }

    public void MenuIC()
    {  toggle.setHomeAsUpIndicator(R.drawable.hamburg);
        toggle.syncState();
    }
    public void BackIC()
    {
        toggle.setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
        toggle.syncState();
    }
}