package com.example.gyk_01;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainScreen extends AppCompatActivity {

    TextView followerNum, userName01;
    String name;
    ListView followerList ;
    ArrayList<UserModel> userModels = new ArrayList<>();
    String []followers = new String[5];
    int []numberOfDays = new int[5];
    int []imageID = new int[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        followerList = findViewById(R.id.followersList);

        Intent getValue = getIntent();
        name = getValue.getStringExtra("Melisa");

        userName01 = findViewById(R.id.userName);
        userName01.setText(name);

        for(int i = 0; i < followers.length; i++) {
            followers[i] = "User";
        }

        followerNum = findViewById(R.id.followersNum);
        followerNum.setText(String.valueOf(followers.length));

        numberOfDays[0] = 2307;
        numberOfDays[1] = 1703;
        numberOfDays[2] = 871;
        numberOfDays[3] = 450;
        numberOfDays[4] = 151;

        imageID[0] = R.drawable.iron_man;
        imageID[1] = R.drawable.spy;
        imageID[2] = R.drawable.st;
        imageID[3] = R.drawable.turtle;
        imageID[4] = R.drawable.uni;

        for(int counter = 0; counter < followers.length; counter++) {
            userModels.add(new UserModel(counter + " " + followers[counter] + "", " " + numberOfDays[counter], imageID[counter]));
        }

        CustomListAdapter listViewAdapter = new CustomListAdapter(this, userModels);

        followerList.setAdapter(listViewAdapter);
    }
}
