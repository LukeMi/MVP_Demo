package com.example.android.architecture.blueprints.todoapp.base;

public abstract class BaseMvpFragment<P extends BasePresenter<? extends BaseMvpFragment<P>>> extends BaseDaggerFragment implements IBaseView {
}
