package com.example.mvp_demo.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvp_demo.R;
import com.example.mvp_demo.data.GitNetProvider;

public class ProfileActivity extends AppCompatActivity {

    private TextView mTvProfile;

    private ProfilePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mPresenter = new ProfilePresenter(this);
        mTvProfile = (TextView) findViewById(R.id.tv_profile);
        mTvProfile.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_profile:
                mPresenter.getProfile();
                break;
            default:
                break;
        }
    }

    public void onGetProfileSuccess(String profile) {
        mTvProfile.setText(profile);
    }

    public void onGetProfileError() {
        Toast.makeText(getApplicationContext(), "请求失败", Toast.LENGTH_SHORT).show();
    }
}