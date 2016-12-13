package com.eagles.appcontrol;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.samsung.android.sdk.education.SamsungEducation;
import com.samsung.android.sdk.education.utils.MLog;

/**
 * Created by carlosc on 09/12/2016.
 */

public class Aplication extends Application{
    private static Aplication instance;

    private SamsungEducation samsungEducation;

    public Aplication getInstance() {
        return instance;
    }

    public SamsungEducation getEducation() {
        return samsungEducation;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        samsungEducation  = new SamsungEducation();

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable ex) {
                MLog.e(ex);

                System.exit(1);
            }
        });
    }

}
