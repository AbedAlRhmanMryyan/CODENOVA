package com.example.myapplication;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class connectionclass {

    protected static String databaseN="";
    protected static  String Port="";
    protected static  String User="";
    protected static  String ip= "";
    protected static  String password="";
    public Connection connect() {
        Connection conn =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionstring="jdbc:mysql://"+ip+":"+Port+"/"+databaseN;
            conn= DriverManager.getConnection(connectionstring,User,password);
            Log.e("erro", "corrrrrrrrrrrectttttttttt0");

        }
        catch (Exception e){
            Log.e("erro", Objects.requireNonNull(e.getMessage()));
        }

        return conn;
    }

}
