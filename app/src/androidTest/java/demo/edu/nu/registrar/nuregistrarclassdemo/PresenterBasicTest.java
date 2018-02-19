package demo.edu.nu.registrar.nuregistrarclassdemo;

import android.support.test.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import demo.edu.nu.registrar.nuregistrarclassdemo.database.Course;
import demo.edu.nu.registrar.nuregistrarclassdemo.database.DatabaseClassSqliteHelper;
import demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.MainPresenter;
import demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.MainView;
import demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.retro.Student;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static org.junit.Assert.assertTrue;
/**
 * Created by daniyar on 15/02/2018.
 */

@RunWith(MockitoJUnitRunner.class)
public class PresenterBasicTest {

    @Mock MainView view;
    @Mock MainPresenter<MainView> presenter;

    private List<Course> listCourses;
    private Student student;
    private Single<Student> temp;
    private String studentName = null;

    public void setUp() {
        presenter = new MainPresenter<>();
        listCourses = new ArrayList<>();
        presenter.onAttach(view);

    }
    @Before
    public void setUpDB() {
        setUp();
        Observable.fromIterable(new DatabaseClassSqliteHelper(InstrumentationRegistry.getTargetContext()).getAllClass())
            .observeOn(Schedulers.trampoline())
            .subscribeOn(Schedulers.trampoline())
            .take(10)
            .subscribeWith(new Observer<Course>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(Course aCourse) {
                    listCourses.add(aCourse);
                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onComplete() {

                }
            });

        student = new Student();
        student.setName("Nurdaulet Yeltayev");

        temp = Single.just(student);
    }

    @Test
    public void shouldTempHasValue() {
        temp.subscribeWith(new SingleObserver<Student>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onSuccess(Student student) {
                studentName = student.getName();
            }

            @Override
            public void onError(Throwable e) {

            }
        });

        assertTrue(studentName != null && studentName.equals("Nurdaulet Yeltayev"));
    }



}
