package com.example.twitxclone.model;

public class User {

    static final String N_KEY = "EMAILV";
    static final String DOB_KEY = "DOBV";
    private String email;
    private String dob;


    public void setName(String email){
        this.email = email;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public String getDob(String dob){
        return dob;
    }

    public String getEmail(String email){
        return email;
    }
}
