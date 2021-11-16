package com.icss.milkmanuser.response;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "login" , indices = @Index(value = {"uniqueId"},unique = true))
public class LoginResponse {

    @PrimaryKey(autoGenerate = true)
    public int uniqueId;

    public int getUniqueId() {
        return uniqueId;
    }

    public Boolean getResponce() {
        return responce;
    }

    public String getData() {
        return data;
    }

    public String getMobile() {
        return mobile;
    }

    public String getId() {
        return id;
    }

    @SerializedName("responce")
    @ColumnInfo(name = "responce")
    @Expose
    public Boolean responce;

    @SerializedName("data")
    @ColumnInfo(name = "data")
    @Expose
    public String data;

    @SerializedName("mobile")
    @ColumnInfo(name = "mobile")
    @Expose
    public String mobile;

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @Expose
    public String id;

}
