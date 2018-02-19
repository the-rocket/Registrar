package demo.edu.nu.registrar.nuregistrarclassdemo.base;

import demo.edu.nu.registrar.nuregistrarclassdemo.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by daniyar on 15/02/2018.
 */

public class BaseRetrofit {
    private static Retrofit ourInstance = null;

    private static final String base_url = BuildConfig.Base_URL;

    static Retrofit getInstance() {
        if (ourInstance == null)
            ourInstance = new Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();
        return ourInstance;
    }

    private BaseRetrofit() {
    }
}
