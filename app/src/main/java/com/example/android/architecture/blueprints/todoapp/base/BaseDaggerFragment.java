package com.example.android.architecture.blueprints.todoapp.base;

import android.util.NoSuchPropertyException;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public abstract class BaseDaggerFragment extends BaseFragment implements HasAndroidInjector {

    @Inject
    @Nonnull
    public DispatchingAndroidInjector<Object> androidInjector;

    @Nonnull
    public final DispatchingAndroidInjector<Object> getAndroidInjector$ModuleBase_release() {
        DispatchingAndroidInjector<Object> dispatchingAndroidInjector = this.androidInjector;
        if (dispatchingAndroidInjector == null) {
             throw new NoSuchPropertyException("no inject");
        }
        return dispatchingAndroidInjector;
    }

    public AndroidInjector<Object> androidInjector() {
        AndroidInjector<Object> androidInjector = this.androidInjector;
        if (androidInjector == null) {
            throw new NoSuchPropertyException("no inject");
        }
        return androidInjector;

    }
}
