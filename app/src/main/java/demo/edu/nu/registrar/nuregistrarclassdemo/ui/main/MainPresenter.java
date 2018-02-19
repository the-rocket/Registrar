package demo.edu.nu.registrar.nuregistrarclassdemo.ui.main;

import demo.edu.nu.registrar.nuregistrarclassdemo.base.BasePresenter;
import demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.retro.Student;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by daniyar on 14/02/2018.
 */

public class MainPresenter<V extends MainView> extends BasePresenter<V> {


    public void load() {
        //view().displayDB(getDataManager().getAllClass());
        //showUserInfo(); //use only in case to test
        //view().showLoading();
    }

    private void showUserInfo() {
        /*
          how rx java and retrofit combined together
         */
        getFirebaseApi().getStudentInfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(new SingleObserver<Student>() {
                @Override
                public void onSubscribe(Disposable d) {
                    view().showLoading();//if you wanna show loading on view
                }

                @Override
                public void onSuccess(Student student) {
                    view().hideLoading();
                    view().displayStudentDB(student);
                }

                @Override
                public void onError(Throwable e) {
                    e.printStackTrace();
                    view().onError(e.getMessage());
                    view().hideLoading();
                }
            });
    }
}
