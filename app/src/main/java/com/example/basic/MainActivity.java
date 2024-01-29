package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {
    public Button button, clearButton;
    public EditText name, email, about, password;
    public RadioGroup gender;
    public RadioButton male, female, other;
    public CheckBox javaCheckBox, pythonCheckBox, androidCheckBox;

    private void initializeViews() {
        button = findViewById(R.id.sign_up_button);
        clearButton = findViewById(R.id.clear_button);
        name = findViewById(R.id.nameField);
        email = findViewById(R.id.emailField);
        password = findViewById(R.id.passwordField);
        about = findViewById(R.id.aboutField);
        gender = findViewById(R.id.genderGroup);
        male = findViewById(R.id.maleRadio);
        female = findViewById(R.id.femaleRadio);
        other = findViewById(R.id.otherRadio);
        javaCheckBox = findViewById(R.id.javaCheckBox);
        pythonCheckBox = findViewById(R.id.pythonCheckBox);
        androidCheckBox = findViewById(R.id.androidCheckBox);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Activity", "Main activity is getting run");
        this.initializeViews();
        /*
//        you can also use final variable instead of making a class object
        final Button button = findViewById(R.id.sign_up_button);

         */

        /*
//        instead of making  a lambda u can also create a function like this which type will be view.
  button.setOnClickListener(signupListner);
        View.OnClickListener signupListner=((click)->{
//            this will also act like a button listener if you dont want to define it like a lamdba
            Log.d("key pressed", "signup button is pressed");
//            you can also use getApplicationContext() for providing the context
            Toast.makeText(this,"Hello The button is pressed wit outside a function",Toast.LENGTH_SHORT).show();
        });
         */

        button.setOnClickListener
                (v -> {
                    Log.d("key pressed", "signup button is pressed");
//            you can also use getApplicationContext() for providing the context
                    Toast.makeText(this, "Hello The button is pressed", Toast.LENGTH_SHORT).show();
                    String nameF = name.getText().toString();
                    String emailF = email.getText().toString();
                    String passwordF = password.getText().toString();
                    String aboutF = about.getText().toString();
                    String genderType = "";
                    if (male.isChecked()) {
                        genderType = "Male";
                    }
                    if (female.isChecked()) {
                        genderType = "Female";
                    }
                    if(other.isChecked()){
                        genderType = "Other";
                    }
                    String courses = "";
                    if(javaCheckBox.isChecked()){
                        courses += "java";
                    }
                    if(pythonCheckBox.isChecked()){
                        courses += "Python";
                        pythonCheckBox.setChecked(false);
                    }
                    if(androidCheckBox.isChecked()){
                        courses += "Android";
                    }
                    if(nameF.isEmpty()){
                        Toast.makeText(this,"Please Provide Name", Toast.LENGTH_SHORT).show();
                        name.setError("Name Cannot be Empty");
                    }
                    Log.w("Form message is ",nameF+emailF+passwordF +""+genderType);


                });

    }
}