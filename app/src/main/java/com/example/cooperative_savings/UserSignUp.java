package com.example.cooperative_savings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserSignUp extends AppCompatActivity {

    Button onSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);

        onSignUp = (Button) findViewById(R.id.signUp);

        onSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToUserDashActivity();
            }
        });
    }
    private void goToUserDashActivity(){
        Intent intent = new Intent(this, UserDashActivity.class);
        startActivity(intent);

    }

}