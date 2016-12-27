package com.wisnukrn_.dagger2ex;

import android.app.Application;
import android.content.Context;

import com.wisnukrn_.dagger2ex.data.DataManager;
import com.wisnukrn_.dagger2ex.di.component.ApplicationComponent;
import com.wisnukrn_.dagger2ex.di.component.DaggerApplicationComponent;
import com.wisnukrn_.dagger2ex.di.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by wisnu on 27/12/2016.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}