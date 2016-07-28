package db;
//测试修改代码能否在sourcetree上提交到github
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class HiWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	 * Province±í½¨±íÓï¾ä
	 */
	public static final String CREATE_PROVINCE = "create table Province("
			+ "id integer primary key autoincrement, "
			+ "province_name text, "
			+ "province_code text)";
	/**
	 * City±í½¨±íÓï¾ä
	 */
	public static final String CREATE_CITY = "create table City ("
			+ "id integer primary key autoincrement, "
			+ "city_name text, "
			+ "city_code text, "
			+ "province_id integer)";
	/**
	 * County±í½¨±íÓï¾ä
	 */
	public static final String CREATE_COUNTY = "create table County ("
			+ "id integer primary key autoincrement, "
			+ "county_name text, "
			+ "county_code text, "
			+ "city_id integer)";
	
	public HiWeatherOpenHelper(Context context, String name, CursorFactory
			factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE); //´´½¨Province±í
		db.execSQL(CREATE_CITY); //´´½¨City±í
		db.execSQL(CREATE_COUNTY); //´´½¨County±í
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
