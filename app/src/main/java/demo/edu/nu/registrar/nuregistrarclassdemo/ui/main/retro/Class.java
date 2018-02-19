package demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.retro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by daniyar on 18/02/2018.
 */

public class Class {

    @Expose
    @SerializedName("Course Code")
    String courseCode;

    @Expose
    @SerializedName("Course Title")
    String courseTitle;

    @Expose
    @SerializedName("Credits")
    float credits;

    @Expose
    @SerializedName("ECTS")
    float ects;

    @Expose
    @SerializedName("Grd")
    String grade;

    @Expose
    @SerializedName("QPts")
    float qualityPoint;

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public float getCredits() {
        return credits;
    }

    public float getEcts() {
        return ects;
    }

    public String getGrade() {
        return grade;
    }

    public float getQualityPoint() {
        return qualityPoint;
    }
}
