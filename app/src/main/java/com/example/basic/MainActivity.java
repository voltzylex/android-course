package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.time.Duration;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    public Button button, clearButton;
    public EditText name, email, about, password,datePickerField;
    public RadioGroup gender;
    public RadioButton male, female, other;
    public CheckBox javaCheckBox, pythonCheckBox, androidCheckBox;
    public Spinner countrySpinner;
    public String contryArray[] = {
            "India","America","Japan","UK","Pakistan","Russia"
    };


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
        datePickerField = findViewById(R.id.pick_date_button);
        countrySpinner = findViewById(R.id.country_spinner);


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
        datePickerField.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    this,(view, selectedYear, selectedMonth, selectedDay) -> {
                        Toast.makeText(getApplicationContext(),"selected month "+selectedMonth,Toast.LENGTH_LONG).show();
                        datePickerField.setText(String.valueOf(selectedDay)+"/"+String.valueOf(selectedMonth)+"/"+String.valueOf(selectedYear));
            },year,month,day
            );
            datePickerDialog.show();
        });

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

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
//                this,
//                R.array.spinner_items,
//                android.R.layout.simple_spinner_item
//        );
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        countrySpinner.setAdapter(adapter);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,contryArray);
        countrySpinner.setAdapter(adapter);
    }
}