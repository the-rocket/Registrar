package demo.edu.nu.registrar.nuregistrarclassdemo.service;

import demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.retro.Student;
import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by daniyar on 15/02/2018.
 */

public interface ApiFirebaseService {
    @GET("/Student.json")
    Single<Student> getStudentInfo();
}
