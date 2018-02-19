package demo.edu.nu.registrar.nuregistrarclassdemo;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by daniyar on 17/02/2018.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
