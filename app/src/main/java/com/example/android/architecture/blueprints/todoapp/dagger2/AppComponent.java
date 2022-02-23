package com.example.android.architecture.blueprints.todoapp.dagger2;

import com.example.android.architecture.blueprints.todoapp.App;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;


@Component(modules = {AndroidInjectionModule.class, AppModule.class})
public interface AppComponent  extends AndroidInjector<App> {
//    App getContext();  // 提供App的Context

    @Component.Builder
    interface Builder {
        AppComponent build();
    }
}
