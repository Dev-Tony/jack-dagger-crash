package com.example.jack_dagger_crash.inject;

import com.ainemo.dory.config.Configs;
import com.ainemo.msg.Rxbus;

import android.content.Context;

import dagger.Component;

/**
 * Created by tony on 11/15/16.
 */
@Component(modules = AppModule.class)
public interface AppComponent {

    Context context();
    Rxbus rxbus();
    Configs config();
}
