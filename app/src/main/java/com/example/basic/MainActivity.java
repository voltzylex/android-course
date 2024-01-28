package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Activity", "Main activity is getting runeed");
        /*
//        you can also use final variable instead of making a class object
        final Button button = findViewById(R.id.sign_up_button);

         */
        button = findViewById(R.id.sign_up_button);
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
                });

    }
}