package com.example.mvp_demo.base;

import androidx.annotation.Nullable;

public interface IBaseView<Presenter extends IPresenter<? extends IBaseView<? extends Presenter>>> {
    void onNetException(int i, @Nullable String str);
}