package demo.edu.nu.registrar.nuregistrarclassdemo.ui.main;

import java.util.List;

import demo.edu.nu.registrar.nuregistrarclassdemo.base.MvpView;
import demo.edu.nu.registrar.nuregistrarclassdemo.database.Course;
import demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.retro.Student;

/**
 * Created by daniyar on 14/02/2018.
 */

public interface MainView extends MvpView {

    void display();

    void displayDB(List<Course> list);

    void displayStudentDB(Student student);
}
