package demo.edu.nu.registrar.nuregistrarclassdemo.database;

import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniyar on 07/02/2018.
 */

public class Course {
    //private int COURSEID;
    private String COURSEID;
    private String ABBR;
    private String TITLE;
    //private Float CRUS;
    private String CRUS;
    //private int CRECTS;
    private String CRECTS;
    //private int LASTTAUGHT;
    private String LASTTAUGHT;
    private String SCHOOL;
    private String SCHOOLABBR;
    //private int SCHOOLID;
    private String SCHOOLID;
    private String DEPARTMENT;
    private String SHORTDESC;
    private String ACADEMICLEVEL;
    //private int ACADEMICLEVELID;
    private String ACADEMICLEVELID;
    private String BREADTH;
    //private Boolean CCDISPLAY;
    private String CCDISPLAY;
    private String TERMNAME;
    //private int RNO;
    private String RNO;
    private String PREREQ;
    private String COREQ;
    private String ANTIREQ;

    public String getCOURSEID() {
        return COURSEID;
    }

    private void setCOURSEID(String COURSEID) {
        this.COURSEID = COURSEID;
    }

    public String getABBR() {
        return ABBR;
    }

    public void setABBR(String ABBR) {
        this.ABBR = ABBR;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getCRUS() {
        return CRUS;
    }

    public void setCRUS(String CRUS) {
        this.CRUS = CRUS;
    }

    public String getCRECTS() {
        return CRECTS;
    }

    public void setCRECTS(String CRECTS) {
        this.CRECTS = CRECTS;
    }

    public String getLASTTAUGHT() {
        return LASTTAUGHT;
    }

    public void setLASTTAUGHT(String LASTTAUGHT) {
        this.LASTTAUGHT = LASTTAUGHT;
    }

    public String getSCHOOL() {
        return SCHOOL;
    }

    public void setSCHOOL(String SCHOOL) {
        this.SCHOOL = SCHOOL;
    }

    public String getSCHOOLABBR() {
        return SCHOOLABBR;
    }

    public void setSCHOOLABBR(String SCHOOLABBR) {
        this.SCHOOLABBR = SCHOOLABBR;
    }

    public String getSCHOOLID() {
        return SCHOOLID;
    }

    public void setSCHOOLID(String SCHOOLID) {
        this.SCHOOLID = SCHOOLID;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getSHORTDESC() {
        return SHORTDESC;
    }

    public void setSHORTDESC(String SHORTDESC) {
        this.SHORTDESC = SHORTDESC;
    }

    public String getACADEMICLEVEL() {
        return ACADEMICLEVEL;
    }

    public void setACADEMICLEVEL(String ACADEMICLEVEL) {
        this.ACADEMICLEVEL = ACADEMICLEVEL;
    }

    public String getACADEMICLEVELID() {
        return ACADEMICLEVELID;
    }

    public void setACADEMICLEVELID(String ACADEMICLEVELID) {
        this.ACADEMICLEVELID = ACADEMICLEVELID;
    }

    public String getBREADTH() {
        return BREADTH;
    }

    public void setBREADTH(String BREADTH) {
        this.BREADTH = BREADTH;
    }

    public String getCCDISPLAY() {
        return CCDISPLAY;
    }

    public void setCCDISPLAY(String CCDISPLAY) {
        this.CCDISPLAY = CCDISPLAY;
    }

    public String getTERMNAME() {
        return TERMNAME;
    }

    public void setTERMNAME(String TERMNAME) {
        this.TERMNAME = TERMNAME;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getPREREQ() {
        return PREREQ;
    }

    public void setPREREQ(String PREREQ) {
        this.PREREQ = PREREQ;
    }

    public String getCOREQ() {
        return COREQ;
    }

    public void setCOREQ(String COREQ) {
        this.COREQ = COREQ;
    }

    public String getANTIREQ() {
        return ANTIREQ;
    }

    public void setANTIREQ(String ANTIREQ) {
        this.ANTIREQ = ANTIREQ;
    }


    static List<Course> generateCursor(Cursor cursor) {

        List<Course> tmp = new ArrayList<>();
        if (cursor.moveToFirst())
            do {
                Course mCourse = new Course();
                mCourse.setCOURSEID(cursor.getString(0));
                mCourse.setABBR(cursor.getString(1));
                mCourse.setTITLE(cursor.getString(2));
                mCourse.setCRUS(cursor.getString(3));
                mCourse.setCRECTS(cursor.getString(4));
                mCourse.setLASTTAUGHT(cursor.getString(5));
                mCourse.setSCHOOL(cursor.getString(6));
                mCourse.setSCHOOLABBR(cursor.getString(7));
                mCourse.setSCHOOLID(cursor.getString(8));
                mCourse.setDEPARTMENT(cursor.getString(9));
                mCourse.setSHORTDESC(cursor.getString(10));
                mCourse.setACADEMICLEVEL(cursor.getString(11));
                mCourse.setACADEMICLEVELID(cursor.getString(12));
                mCourse.setBREADTH(cursor.getString(13));
                mCourse.setCCDISPLAY(cursor.getString(14));
                mCourse.setTERMNAME(cursor.getString(15));
                mCourse.setRNO(cursor.getString(16));
                mCourse.setPREREQ(cursor.getString(17));
                mCourse.setCOREQ(cursor.getString(18));
                mCourse.setANTIREQ(cursor.getString(19));

                tmp.add(mCourse);
            } while (cursor.moveToNext());

        return tmp;
    }


}
