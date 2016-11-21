package com.example.jack_dagger_crash.inject;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tony on 11/16/16.
 */
@Module
public class AppModule {
    private final Context mContext;

    public AppModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    public Context context() {
        return mContext;
    }
}
