package de.englerts.money_pit.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Account.class}, version = 1)
public abstract class AppDB extends RoomDatabase {
    private static final String DB_NAME = "money_pit";
    private static volatile AppDB instance;

    public static synchronized AppDB getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static AppDB create(final Context context) {
        return Room.databaseBuilder(context, AppDB.class, DB_NAME).build();
    }

    public abstract AccountDao accountDao();
}
