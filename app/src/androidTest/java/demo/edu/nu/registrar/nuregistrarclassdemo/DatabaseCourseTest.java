package demo.edu.nu.registrar.nuregistrarclassdemo;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.List;

import demo.edu.nu.registrar.nuregistrarclassdemo.database.Course;
import demo.edu.nu.registrar.nuregistrarclassdemo.database.DatabaseClassSqliteHelper;

@RunWith(AndroidJUnit4.class)
public class DatabaseCourseTest {


    @Test
    public void shouldClassDatabaseExist() throws Exception{
        File database = InstrumentationRegistry.getTargetContext().getApplicationContext().getDatabasePath(DatabaseClassSqliteHelper.DATABASE_NAME);
        Assert.assertTrue(database.exists());
    }

    @Test
    public void shouldClassDatabaseHasDATA() {
        DatabaseClassSqliteHelper db = new DatabaseClassSqliteHelper(InstrumentationRegistry.getTargetContext());
        List<Course> courses = db.getAllClass();
        Assert.assertTrue(courses.size() > 400);
    }
}
