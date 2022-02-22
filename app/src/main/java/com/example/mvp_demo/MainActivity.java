package com.example.mvp_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mvp_demo.profile.ProfileActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_profile).setOnClickListener(this::onClick);
        startActivity(new Intent(this, ProfileActivity.class));
    }

    private void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_profile:
                startActivity(new Intent(this, ProfileActivity.class));
                break;
            default:
                break;
        }
    }
}





