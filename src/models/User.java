package models;

import interfaces.Authenticable;

public class User implements Authenticable {

    private String name;
    private String address;
    private String phoneNumber;
    private String username;
    private String password;
    private String profileImage;

    public User(String name, String address, String phoneNumber,
            String username, String password) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String passsword) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public boolean register(String name, String address, String phoneNumber,
            String username, String password) {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
