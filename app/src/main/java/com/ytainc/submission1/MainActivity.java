package com.ytainc.submission1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;


import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<User> userArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setList();
        setData();
    }
    private void setList(){
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(userArrayList);
        rv.setAdapter(listAdapter);
        rv.setHasFixedSize(true);

    }
    private void setData(){
        String[] dataName = getResources().getStringArray(R.array.name);
        String[] dataUserName = getResources().getStringArray(R.array.username);
        String[] dataCompany = getResources().getStringArray(R.array.company);
        String[] dataLocation = getResources().getStringArray(R.array.location);
        String[] dataFollowing = getResources().getStringArray(R.array.following);
        String[] dataFollowers = getResources().getStringArray(R.array.followers);
        String[] dataRepository = getResources().getStringArray(R.array.repository);
        String[] dataAbout = getResources().getStringArray(R.array.about);

        TypedArray dataImage = getResources().obtainTypedArray(R.array.avatar);

        for (int i = 0; i < dataName.length; i++){
            User user = new User();
            user.setName(dataName[i]);
            user.setUsername(dataUserName[i]);
            user.setCompany(dataCompany[i]);
            user.setLocation(dataLocation[i]);
            user.setFollowing(dataFollowing[i]);
            user.setFollowers(dataFollowers[i]);
            user.setRepository(dataRepository[i]);
            user.setAbout(dataAbout[i]);
            user.setAvatar(dataImage.getResourceId(i ,-1));
            userArrayList.add(user);
        }
    }
}
