package demo.edu.nu.registrar.nuregistrarclassdemo.ui.main.retro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniyar on 15/02/2018.
 */

public class Student {

    @Expose
    @SerializedName("ID")
    private int id;

    @Expose
    @SerializedName("Major")
    private String major;

    @Expose
    @SerializedName("Name")
    private String name;

    @Expose
    @SerializedName("Program")
    private String program;

    @Expose
    @SerializedName("School")
    private String school;

    @Expose
    @SerializedName("Admission date and semester")
    private String admissionDateAndSemester;

    @Expose
    @SerializedName("Class")
    private List<Class> classArray = new ArrayList<>();

    @Expose
    @SerializedName("History")
    private List<History> histories = new ArrayList<>();

    public int getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    public String getAdmissionDateAndSemester() {
        return admissionDateAndSemester;
    }

    public void setAdmissionDateAndSemester(String admissionDateAndSemester) {
        this.admissionDateAndSemester = admissionDateAndSemester;
    }

    public List<Class> getClassArray() {
        return classArray;
    }

    public List<History> getHistories() {
        return histories;
    }
}
