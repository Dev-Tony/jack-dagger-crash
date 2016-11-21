package com.example.jack_dagger_crash.inject;

import android.content.Context;

/**
 * Created by tony on 11/21/16.
 */

public class AppComponents {
    private AppComponents(){}
    public static AppComponent get(Context context) {
        Context application = context.getApplicationContext();
        if (application instanceof IAppComponentProvider) {
            IAppComponentProvider componentable = (IAppComponentProvider) application;
            return componentable.getAppComponent();
        }
        throw new IllegalArgumentException("cannot get components");
    }
}
