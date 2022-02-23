package com.example.android.architecture.blueprints.todoapp.dagger2;

import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {

//    @FragmentScope
    @ContributesAndroidInjector
    abstract AddEditTaskFragment addEditTaskFragment();
}
