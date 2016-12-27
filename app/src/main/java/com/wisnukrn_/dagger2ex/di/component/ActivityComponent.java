package com.wisnukrn_.dagger2ex.di.component;

import com.wisnukrn_.dagger2ex.MainActivity;
import com.wisnukrn_.dagger2ex.di.PerActivity;
import com.wisnukrn_.dagger2ex.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by wisnu on 27/12/2016.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}