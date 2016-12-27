package com.wisnukrn_.dagger2ex.di.module;

import android.app.Activity;
import android.content.Context;

import com.wisnukrn_.dagger2ex.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wisnu on 27/12/2016.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}