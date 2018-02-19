package demo.edu.nu.registrar.nuregistrarclassdemo.base;

import android.content.Context;

/**
 * Created by daniyar on 15/02/2018.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onAttachDB(Context context);

    void onDetach();


}
