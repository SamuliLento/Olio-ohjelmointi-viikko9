package com.example.userprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser(View view) {

        EditText firstName = findViewById(R.id.firstName);
        EditText lastName = findViewById(R.id.lastName);
        EditText email = findViewById(R.id.email);
        RadioGroup rgDegreeProgram = findViewById(R.id.rgDegreeProgram);
        User user;

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.rbComputer:
                user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), "Tietotekniikka");
                UserStorage.getInstance().addUser(user);
                break;
            case R.id.rbBusiness:
                user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), "Tuotantotalous");
                UserStorage.getInstance().addUser(user);
                break;
            case R.id.rbCalculation:
                user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), "Laskennallinen tekniikka");
                UserStorage.getInstance().addUser(user);
                break;
            case R.id.rbElectricity:
                user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), "Sähkötekniikka");
                UserStorage.getInstance().addUser(user);
                break;
        }
    }
}