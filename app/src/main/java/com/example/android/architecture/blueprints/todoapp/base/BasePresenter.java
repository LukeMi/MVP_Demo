package com.example.android.architecture.blueprints.todoapp.base;

import androidx.lifecycle.LifecycleOwner;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BasePresenter<V extends IBaseView> implements IPresenter {

    @Nullable
    private V view;

    public BasePresenter(@Nonnull V v) {
        this.view = v;
    }

    @Nullable
    public final V getView() {
        return this.view;
    }

    @Override
    public void onCreate(@Nonnull LifecycleOwner lifecycleOwner) {

    }

    @Override
    public void onStart(@Nonnull LifecycleOwner lifecycleOwner) {

    }

    @Override
    public void onResume(@Nonnull LifecycleOwner lifecycleOwner) {

    }

    @Override
    public void onPause(@Nonnull LifecycleOwner lifecycleOwner) {

    }

    @Override
    public void onStop(@Nonnull LifecycleOwner lifecycleOwner) {

    }

    @Override
    public void onDestroy(@Nonnull LifecycleOwner lifecycleOwner) {
        this.view = (V) null;
    }
}
