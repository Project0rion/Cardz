package com.hwr_goes_beuth.cardz.core.app;

import com.hwr_goes_beuth.cardz.core.modules.AppModule;
import com.hwr_goes_beuth.cardz.core.modules.ViewModule;
import com.hwr_goes_beuth.cardz.core.presentation.ActivityPresenter;
import com.hwr_goes_beuth.cardz.core.presentation.PresentedActivity;
import com.hwr_goes_beuth.cardz.core.presentation.PresenterCacheInjectionWrapper;
import com.hwr_goes_beuth.cardz.menu.MainMenuPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Project0rion on 04.12.2016.
 */
@Singleton
@Component(modules = { AppModule.class, ViewModule.class})
public interface AppComponent {

    void inject(PresenterCacheInjectionWrapper presenterCacheWrapper);
    void inject(MainMenuPresenter presenter);
}