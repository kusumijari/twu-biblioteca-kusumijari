//Contains user credentials which can be compared

package com.tw.biblioteca;

public class User {
    private String role, username, password, name, email;
    private int phoneNumber;

    public User(String role, String username, String password, String name, String email, int phoneNumber) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object that) {
        if(that == null || that.getClass() != User.class){
            return false;
        }
        User thatUser = (User) that;
        if(this.username.equals(thatUser.username)){
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
    public String getRole() {
        return role;
    }

    public boolean authenticatePassword(User that) {
        if(this.password.equals(that.password)) {
            return true;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString(){
        return ("Name:" + name + "\tEmail:" + email + "\tPhone Number:" + phoneNumber);
    }
}
