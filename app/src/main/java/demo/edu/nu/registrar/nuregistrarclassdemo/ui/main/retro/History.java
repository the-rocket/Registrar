package demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.retro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniyar on 19/02/2018.
 */

public class History {

    @Expose
    @SerializedName("Time")
    String Time;

    @Expose
    @SerializedName("Credits Earned")
    int creditsEarned;

    @Expose
    @SerializedName("Credits Enrolled")
    int creditsEnrolled;

    @Expose
    @SerializedName("Semester GPA")
    float semesterGPA;

    @Expose
    @SerializedName("data")
    List<Class> classes = new ArrayList<>();


    public String getTime() {
        return Time;
    }

    public int getCreditsEarned() {
        return creditsEarned;
    }

    public int getCreditsEnrolled() {
        return creditsEnrolled;
    }

    public float getSemesterGPA() {
        return semesterGPA;
    }

    public List<Class> getClasses() {
        return classes;
    }
}
