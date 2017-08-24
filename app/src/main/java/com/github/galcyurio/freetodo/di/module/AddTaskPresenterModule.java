package com.github.galcyurio.freetodo.di.module;

import com.github.galcyurio.freetodo.mvp.contract.AddTaskContract;
import com.github.galcyurio.freetodo.mvp.presenter.AddTaskPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * @author galcyurio
 */
@Module
public class AddTaskPresenterModule {

    private AddTaskContract.View mView;

    public AddTaskPresenterModule(AddTaskContract.View view) {
        mView = view;
    }

    @Provides
    AddTaskContract.View provideView() {
        return mView;
    }

    @Provides
    AddTaskContract.Presenter providePresenter(AddTaskPresenter presenter) {
        return presenter;
    }
}
