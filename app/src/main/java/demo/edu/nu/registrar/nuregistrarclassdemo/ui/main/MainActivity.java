package demo.edu.nu.registrar.nuregistrarclassdemo.ui.main;

import android.os.Bundle;

import java.util.List;

import butterknife.ButterKnife;
import demo.edu.nu.registrar.nuregistrarclassdemo.R;
import demo.edu.nu.registrar.nuregistrarclassdemo.base.BaseActivity;
import demo.edu.nu.registrar.nuregistrarclassdemo.database.Course;
import demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.retro.Student;

public class MainActivity extends BaseActivity implements MainView {


    MainPresenter<MainView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUnBinder(ButterKnife.bind(this));

        init();
    }

    void init() {
        presenter = new MainPresenter<>();
        presenter.onAttach(this);
    }


    /**
     * Just a example to show
     *  -how mvp using interfaces to communicate with view(Main Activity)
     */
    @Override
    public void display() {
        //TODO: Show something to view;
    }

    /**
     *
     * @param all
     * Just a example to show
     *  -how mvp getting course from internal database
     *  -then to show in view
     */
    public void displayDB(List<Course> all) {
        /*Observable.fromIterable(all)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(AndroidSchedulers.mainThread())
            .take(10)
            .subscribe(new Observer<Course>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(Course aCourse) {
                    //Timber.d(aClass.getSHORTDESC());
                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onComplete() {

                }
            });*/
    }

    /**
     *
     * @param student
     * Just a example to show
     *  -how mvp getting data from networking
     *  -then to show in view
     */
    @Override
    public void displayStudentDB(Student student) {
    /*    Timber.d(String.valueOf(student.getID()));
        Timber.d(student.getName());
        Timber.d(student.getMajor());
        Timber.d(student.getProgram());
        Timber.d(student.getSchool());
        for (Class current: student.getClassArray())
            Timber.d(current.getCourseCode() + '\n' + current.getCourseTitle() + '\n' + current.getCredits());

        for (History history: student.getHistories()) {
            Timber.d(history.getTime());
            Timber.d("" + history.getCreditsEarned() + '\n' + history.getCreditsEnrolled() + '\n' + history.getSemesterGPA());
        }*/

    }


    @Override
    protected void onStart() {
        super.onStart();
        presenter.load();
    }
}
