package com.icss.milkmanuser.mvvm;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.icss.milkmanuser.response.LoginResponse;

@Database(entities = {LoginResponse.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "UserList";

    public static UserDatabase instance;

    public abstract UserDao userDao();

    public static UserDatabase getInstance(Context context) {

        if (instance == null) {
            instance = Room.databaseBuilder(context,
                    UserDatabase.class,
                    DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .addCallback(callback).build();
        }
        return instance;
    }

    static Callback callback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateAsyncTask(instance).execute();
        }
    };

    static class PopulateAsyncTask extends AsyncTask<Void, Void, Void> {

        UserDao userDao;

        public PopulateAsyncTask(UserDatabase userDatabase){
            userDao = userDatabase.userDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }
}

