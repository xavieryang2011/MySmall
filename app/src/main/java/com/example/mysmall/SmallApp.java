package com.example.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by yangxh on 17/7/25.
 */

public class SmallApp extends Application {
    public SmallApp(){
        Small.preSetUp(this);
    }
}
