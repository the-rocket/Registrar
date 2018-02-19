package demo.edu.nu.registrar.nuregistrarclassdemo.base;

import android.app.Activity;
import android.content.Context;

import demo.edu.nu.registrar.nuregistrarclassdemo.database.DatabaseClassSqliteHelper;
import demo.edu.nu.registrar.nuregistrarclassdemo.service.ApiFirebaseService;

/**
 * Created by daniyar on 15/02/2018.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;
    private DatabaseClassSqliteHelper db;
    private ApiFirebaseService mApiFirebaseApi = BaseRetrofit.getInstance().create(ApiFirebaseService.class);


    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;

        if (mvpView instanceof Activity)
            onAttachDB((Activity) mvpView);
    }

    @Override
    public void onAttachDB(Context context) {
        db = new DatabaseClassSqliteHelper(context);
    }


    @Override
    public void onDetach() {
        mMvpView = null;
        db.close();
        db = null;
    }


    public DatabaseClassSqliteHelper getDataManager() {
        return db;
    }


    protected ApiFirebaseService getFirebaseApi() {
        return mApiFirebaseApi;
    }

    protected V view() {
        return mMvpView;
    }


}
