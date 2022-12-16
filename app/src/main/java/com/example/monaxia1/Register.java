package com.example.monaxia1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    Button registerBtn;
    TextView loginBtn;
    TextInputEditText fullName, emailAdd, password, confPassword;
    String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
    ProgressDialog progressDialog;

    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        loginBtn = findViewById(R.id.alreadyBtn);
        registerBtn = findViewById(R.id.RegisterBtn);
        fullName = findViewById(R.id.FullName);
        emailAdd = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confPassword = findViewById(R.id.confirmPass);
        progressDialog = new ProgressDialog(this);
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();




        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerforAuth();
            }


        });

    }

    private void PerforAuth() {
        String emailTxt = emailAdd.getText().toString();
        String passwordTxt = password.getText().toString();
        String confirmPassTxt = confPassword.getText().toString();

        if(!emailTxt.matches(emailPattern)){
            emailAdd.setError("Enter Correct Email");
        }else if(passwordTxt.isEmpty()|| passwordTxt.length()<6)
        {
            password.setError("Enter valid password");
        }else if(!passwordTxt.equals(confirmPassTxt)){
            confPassword.setError("Password not match");
        }else{
            progressDialog.setMessage("Please wait Registration...");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(emailTxt,passwordTxt).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        progressDialog.dismiss();
                        sendUserToNextActivity();
                        Toast.makeText(Register.this, "Registration Successfully", Toast.LENGTH_SHORT).show();
                    }else{
                        progressDialog.dismiss();
                        Toast.makeText(Register.this, ""+task.getException(), Toast.LENGTH_SHORT).show();
                    }
                    String username = fullName.getText().toString();
                    Intent intent1 = new Intent(Register.this, Dashboard.class);
                    intent1.putExtra("keyname",  username);
                    startActivity(intent1);
                }
            });
        }
    }

    private void sendUserToNextActivity() {
        Intent intent = new Intent(Register.this, Welcome_Page.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}