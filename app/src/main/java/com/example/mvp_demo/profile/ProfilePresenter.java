package com.example.mvp_demo.profile;

import androidx.lifecycle.LifecycleObserver;

import com.example.mvp_demo.data.GitNetProvider;

import java.util.logging.Logger;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ProfilePresenter implements LifecycleObserver {

    public Logger mLogger = Logger.getLogger(ProfilePresenter.class.getSimpleName());

    private ProfileActivity profileActivity;

    public ProfilePresenter(ProfileActivity profileActivity) {
        this.profileActivity = profileActivity;
    }

    public void getProfile() {
        GitNetProvider.getInstance().createGitService().getProfile()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s -> {
                    profileActivity.onGetProfileSuccess(s.toString());
                }, throwable -> {
                    mLogger.info(throwable.getMessage());
                    profileActivity.onGetProfileError();
                });
    }
}
