//Contains user credentials which can be compared

package com.tw.biblioteca;

public class User {
    private String role, name, username, password;

    public User(String role, String name, String username, String password) {
        this.role = role;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object that) {
        if(that == null || that.getClass() != User.class){
            return false;
        }
        return true;
    }
}
