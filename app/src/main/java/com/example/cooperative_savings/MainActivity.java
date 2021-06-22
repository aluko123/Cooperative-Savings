package com.example.cooperative_savings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    TextView onSignUp;
    EditText email = (EditText) findViewById(R.id.email);
    EditText password = (EditText) findViewById(R.id.idPassword);
    //Button onLogin;
   //private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mAuth = FirebaseAuth.getInstance();


        onSignUp = (TextView) findViewById(R.id.signUp);

        onSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToInitialSignUp();
            }
        });


       /* onLogin = (Button) findViewById(R.id.login);

        /*View.OnClickListener listener = new View.OnClickListener() {
            @Override
            /*public void onClick(View v) {
                //this moves to a new page after login
                if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Intent intent = new Intent(this, UserDashActivity.class);
                    startActivity(intent);
                }
                else{
                    //send error message about sign in info
                }
            }*/
        };
        //onLogin.setOnClickListener(listener);

   /* // [START on_start_check_user]
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            currentUser.reload();
        }
    }
    // [END on_start_check_user]*/

    private void goToInitialSignUp(){
        Intent intent = new Intent(this, InitialSignUp.class);
        startActivity(intent);

    }

    public void login(View view){
        if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            Intent intent = new Intent(this, UserDashActivity.class);
            startActivity(intent);
        }
    }


}