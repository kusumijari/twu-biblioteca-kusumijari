//Contains user credentials which can be compared

package com.tw.biblioteca;

public class User {
    private String role, username, password;

    public User(String role, String username, String password) {
        this.role = role;
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object that) {
        if(that == null || that.getClass() != User.class){
            return false;
        }
        User thatUser = (User) that;
        if(this.username.equals(thatUser.username) && this.password.equals(thatUser.password)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = 0;
        if(this != null) {
            for (int i = 0; i <  username.length(); i++) {
                hash = Character.getNumericValue(username.charAt(i)) + (hash << 6) + (hash << 16) - hash;
            }
        }
        return hash;

    }
    public String getUser() {
        return role;
    }
}
