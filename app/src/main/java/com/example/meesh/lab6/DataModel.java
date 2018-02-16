package com.example.meesh.lab6;

/**
 * Created by meesh on 2/15/2018.
 */

public class DataModel {
    public String uname;
    public String umsg;
    public String time;
    DataModel(String uname, String umsg, String time){
        this.uname= uname;
        this.umsg= umsg;
        this.time=time;
    }
    public String getUname(){
        return uname;
    }

    public String getUmsg() {
        return umsg;
    }

    public String getTime() {
        return time;
    }
}
