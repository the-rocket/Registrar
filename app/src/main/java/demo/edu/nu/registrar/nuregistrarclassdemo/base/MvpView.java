package demo.edu.nu.registrar.nuregistrarclassdemo.base;

import android.support.annotation.StringRes;

/**
 * Created by daniyar on 14/02/2018.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

}
