package com.Kiriki.AdvancedSnackBar;

import android.app.Application;
import android.content.Context;

public class ContextApplication extends Application {

    private static Context context;

    private void ContextApplication(){
        context.getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
