package com.example.android.architecture.blueprints.todoapp.base;

public interface IBaseView<Presenter extends IPresenter<? extends IBaseView<? extends Presenter>>> {
    // 可放置公用操作 - 网络变化
}
