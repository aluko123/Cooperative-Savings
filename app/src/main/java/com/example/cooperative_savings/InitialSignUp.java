package com.example.cooperative_savings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InitialSignUp extends AppCompatActivity {

    Button onSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_sign_up);

        onSignUp = (Button) findViewById(R.id.signUp);
        onSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToUserSignUp();
            }
        });
    }

    private void goToUserSignUp(){
        Intent intent = new Intent(this, UserSignUp.class);
        startActivity(intent);

    }
}