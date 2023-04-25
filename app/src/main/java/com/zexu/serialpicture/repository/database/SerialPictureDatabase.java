package com.zexu.serialpicture.repository.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.zexu.serialpicture.repository.CollectRepository;
import com.zexu.serialpicture.repository.entity.Collect;

@Database(entities = {Collect.class}, version = 1)
public abstract class SerialPictureDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "serial_picture_db";

    private static SerialPictureDatabase databaseInstance;

    public static synchronized SerialPictureDatabase getInstance(Context context)
    {
        if(databaseInstance == null)
        {
            databaseInstance = Room
                    .databaseBuilder(context.getApplicationContext(), SerialPictureDatabase.class, DATABASE_NAME)
                    .build();
        }
        return databaseInstance;
    }

    public abstract CollectRepository collectRepository();

    @Override
    public void clearAllTables() {

    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration) {
        return null;
    }


}
