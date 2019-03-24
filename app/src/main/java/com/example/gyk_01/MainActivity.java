package com.example.gyk_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName, password;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        signInButton = findViewById(R.id.signInButton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString().equals("Melisa") && password.getText().toString().equals("123")) {
                    Intent toMainPage = new Intent(MainActivity.this, MainScreen.class);
                    String name = userName.getText().toString();
                    toMainPage.putExtra("Melisa", name);
                    startActivity(toMainPage);
                }else {
                    Toast.makeText(MainActivity.this, "Username or password is invalid.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
