package com.ytainc.submission1;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String username, name, location, company, followers, following,repository,about;
    private int avatar;

    public User(){

    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public String getFollowers(){
        return followers;
    }
    public void setFollowers(String followers){
        this.followers = followers;
    }
    public String getFollowing(){
        return following;
    }
    public void setFollowing(String following){
        this.following = following;
    }
    public String getRepository(){
        return repository;
    }
    public void setRepository(String repository) {
        this.repository = repository;
    }
    public String getAbout(){
        return about;
    }
    public void setAbout(String about){
        this.about = about;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public static Creator<User> getCreator(){
        return CREATOR;
    }

    protected User (Parcel in){
        username = in.readString();
        name = in.readString();
        location = in.readString();
        company = in.readString();
        followers = in.readString();
        following = in.readString();
        repository = in.readString();
        about = in.readString();
        avatar = in.readInt();
    }
    public static final Creator<User>  CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
    @Override
    public int describeContents(){
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest,int flags){
        dest.writeString(username);
        dest.writeString(name);
        dest.writeString(location);
        dest.writeString(company);
        dest.writeString(followers);
        dest.writeString(following);
        dest.writeString(repository);
        dest.writeString(about);
        dest.writeInt(avatar);
    }
}
