package com.wisnukrn_.dagger2ex.di.component;

import android.app.Application;
import android.content.Context;

import com.wisnukrn_.dagger2ex.DemoApplication;
import com.wisnukrn_.dagger2ex.data.DataManager;
import com.wisnukrn_.dagger2ex.data.DbHelper;
import com.wisnukrn_.dagger2ex.data.SharedPrefsHelper;
import com.wisnukrn_.dagger2ex.di.ApplicationContext;
import com.wisnukrn_.dagger2ex.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wisnu on 27/12/2016.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
