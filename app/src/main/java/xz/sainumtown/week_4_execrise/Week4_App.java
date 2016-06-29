package xz.sainumtown.week_4_execrise;

import android.app.Application;
import android.content.Context;

/**
 * Created by asus on 6/28/2016.
 */
public class Week4_App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
