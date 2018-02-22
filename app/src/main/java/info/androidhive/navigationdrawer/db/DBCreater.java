package info.androidhive.navigationdrawer.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sachitha on 21/1/2018.
 */
public class DBCreater extends SQLiteOpenHelper {

    private static DBCreater createDB;



    private DBCreater(Context context) {

        super(context, "WERAGODATRADERS", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder tableVehicle =new StringBuilder();
        tableVehicle.append("CREATE TABLE IF NOT EXISTS VEHICLE(");
        tableVehicle.append("VID TEXT PRIMARY KEY,");
        tableVehicle.append("MANUFACTURE TEXT,");
        tableVehicle.append("TYPE TEXT,");
        tableVehicle.append("ENGINE_CAPACITY DECIMAL,");
        tableVehicle.append("PRICE DECIMAL);");

        StringBuilder tableUniteRate= new StringBuilder();
        tableUniteRate.append("CREATE TABLE IF NOT EXISTS UNITE_RATE(");
        tableUniteRate.append("ENGINE_CAPACITY DECIMAL PRIMARY KEY,");
        tableUniteRate.append("RATE DECIMAL );");

        StringBuilder tableTax= new StringBuilder();
        tableTax.append("CREATE TABLE IF NOT EXISTS TAX(");
        tableTax.append("TID INTEGER PRIMARY KEY,");
        tableTax.append("BANK DECIMAL,");
        tableTax.append("CLEARANCE DECIMAL,");
        tableTax.append("OTHER DECIMAL);");



        db.execSQL(tableVehicle.toString());
        db.execSQL(tableUniteRate.toString());
        db.execSQL(tableTax.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXIST VEHICLE");
        db.execSQL("DROP TABLE IF EXIST UNITE_RATE");
        db.execSQL("DROP TABLE IF EXIST TAX");

        onCreate(db);
    }
    public static synchronized DBCreater create(Context context){
        if (createDB==null){
            createDB=new DBCreater(context);
        }
        return createDB;
    }

}
