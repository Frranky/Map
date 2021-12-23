package com.example.map.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.map.R;
import com.example.map.data.datasource.UserData;

public class ProfileActivity extends AppCompatActivity {

    private UserData userData;
    private EditText name;
    private EditText pass;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();

        userData = new UserData();
        name = (EditText)findViewById(R.id.name);
        pass = (EditText)findViewById(R.id.pass);
        email = (EditText)findViewById(R.id.email);

        name.setText(userData.getName());
        pass.setText(Integer.toString(userData.getPassword()));
        email.setText(userData.getEmail());
    }

    public void applyButtonClick(View view) {
        //Сохраняем изменения
        Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
    }

    public void backButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}