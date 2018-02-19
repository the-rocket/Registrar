package demo.edu.nu.registrar.nuregistrarclassdemo.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by daniyar on 07/02/2018.
 */

public class DatabaseClassSqliteHelper {

    public static final String DATABASE_NAME = "class_database.db";
    private static final String TABLE = "Class_table";

    private Context context;

    private SQLiteDatabase db;


    public DatabaseClassSqliteHelper(Context context) {
        this.context = context;

    }


    public List<Course> getAllClass() {
        List<Course> courses;
        String query = "select * from " + TABLE;
        open();
        //db = this.getReadableDatabase(); not need because database is in physical file
        Cursor cursor = db.rawQuery(query, null);

        //Class generator will run cursor and get all data with Class instance
        courses = Course.generateCursor(cursor);

        cursor.close();
        close();
        return courses;
    }



    /**
     * //# copy from assets file*/
    private void copydatabase(File file_db) throws Exception{
        OutputStream out = new FileOutputStream(file_db);
        InputStream in = context.getAssets().open("databases/" + DATABASE_NAME);
        byte[] buffer = new byte[1024];
        while (in.read(buffer)>0) {
            out.write(buffer);
        }
        out.flush();
        out.close();
        in.close();
    }

    /**
     * function back-end
     * to open db
     */
    private void open() {
        File file_db = context.getDatabasePath(DATABASE_NAME);

        if (!file_db.exists()) {
            try {
                copydatabase(file_db);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        db = SQLiteDatabase.openDatabase(file_db.getPath(), null, SQLiteDatabase.NO_LOCALIZED_COLLATORS | SQLiteDatabase.OPEN_READONLY);
    }

    /**
     * function back-end
     * to close db
     */
    public void close() {
        if (db != null)
            db.close();
    }

}
