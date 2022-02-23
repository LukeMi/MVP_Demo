package com.example.android.architecture.blueprints.todoapp.dagger2;

import com.example.android.architecture.blueprints.todoapp.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {FragmentModule.class})
public class AppModule {
   /* private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
//    @ContextLife("Application")
    App provideApplicationContext() {
        return application;
    }*/

}
