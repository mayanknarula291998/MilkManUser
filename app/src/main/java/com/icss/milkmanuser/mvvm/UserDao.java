package com.icss.milkmanuser.mvvm;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface UserDao {

//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void insert(List<UserModel> userModels);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void insertData(ProfileData profileData);
//
//    @Query("DELETE FROM users")
//    void deleteAll();
//
//    @Query("SELECT * FROM users")
//    LiveData<List<UserModel>> getAllUsers();
//
//    @Query("SELECT * FROM data WHERE userId = :userId")
//    LiveData<ProfileData> getProfileData(String userId);
}
