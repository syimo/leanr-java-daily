package org.example.androd;

import java.io.Serializable;

public class USer implements Serializable {

    //相当于类的版本号
    private static final long serialVersionUID = 1;

    public int userID;
    public String name;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
