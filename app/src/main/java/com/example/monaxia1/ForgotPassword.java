package com.example.monaxia1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.monaxia1.databinding.ActivityForgotPasswordBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {
    ActivityForgotPasswordBinding binding;
    ProgressDialog dialog;
    FirebaseAuth auth;
    Button doneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgotPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        doneButton = findViewById(R.id.doneBtn);

        auth = FirebaseAuth.getInstance();

        dialog = new ProgressDialog(ForgotPassword.this);
        dialog.setCancelable(false);
        dialog.setMessage("Loading....");
        
        binding.doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgotPassword1();
            }
        });
    }

    private Boolean validationEmail(){
        String val = binding.Email.getText().toString();
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";

        if(val.isEmpty()){
            binding.Email.setError("Field cannot be empty");
            return  false;
        }else if(!val.matches(emailPattern)){
            binding.Email.setError("Invalid email address");
            return  false;
        }else{
            binding.Email.setError(null);
            return true;
        }
    }

    private void forgotPassword1() {

        if(!validationEmail()){
            return;
        }

        dialog.show();

        auth.sendPasswordResetEmail(binding.Email.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                dialog.dismiss();
                if(task.isSuccessful()){
                    startActivity(new Intent(ForgotPassword.this, Login.class));
                    finish();
                    Toast.makeText(ForgotPassword.this, "Please Check your email Address!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(ForgotPassword.this, "Enter correct email Id", Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(ForgotPassword.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}