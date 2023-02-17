package com.example.monaxia1;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    private MaterialAlertDialogBuilder materialAlertDialogBuilder;

    Button registerBtn;
    TextView loginBtn;
    TextInputEditText fullName, emailAdd, password, confPassword;
    String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
    ProgressDialog progressDialog;
    CheckBox chkBox;

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
        materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);

        registerBtn.setEnabled(false);
        chkBox = findViewById(R.id.checkBox);

        chkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){

                materialAlertDialogBuilder.setTitle("Terms And Conditions");
                materialAlertDialogBuilder.setMessage("Terms & Conditions\n" +
                        "\nBy downloading or using the app, these terms will automatically apply to you – you should make sure therefore that you read them carefully before using the app. You’re not allowed to copy or modify the app, any part of the app, or our trademarks in any way. You’re not allowed to attempt to extract the source code of the app, and you also shouldn’t try to translate the app into other languages or make derivative versions. The app and all the trademarks, copyright, database rights, and other intellectual property rights related to it still belong to Christian Avergonzado, Chester Bernabe, Reniel Espinosa, and Dave Mariano.\n" +
                        "\nChristian Avergonzado, Chester Bernabe, Reniel Espinosa, and Dave Mariano are committed to ensuring that the app is as useful and efficient as possible. For that reason, we reserve the right to make changes to the app or to charge for its services, at any time and for any reason. We will never charge you for the app or its services without making it very clear to you exactly what you’re paying for.\n" +
                        "\nThe Monaxia app stores and processes personal data that you have provided to us, to provide my Service. It’s your responsibility to keep your phone and access to the app secure. We, therefore, recommend that you do not jailbreak or root your phone, which is the process of removing software restrictions and limitations imposed by the official operating system of your device. It could make your phone vulnerable to malware/viruses/malicious programs, compromise your phone’s security features and it could mean that the Monaxia app won’t work properly or at all.\n" +
                        "The app does use third-party services that declare their Terms and Conditions.\n" +
                        "\nLink to Terms and Conditions of third-party service providers used by the app:\n" +
                        "\nGoogle Play Services\n" +
                        "\nYou should be aware that there are certain things that Christian Avergonzado, Chester Bernabe, Reniel Espinosa, and Dave Mariano will not take responsibility for. Certain functions of the app will require the app to have an active internet connection. The connection can be Wi-Fi or provided by your mobile network provider, but Christian Avergonzado, Chester Bernabe, Reniel Espinosa, and Dave Mariano cannot take responsibility for the app not working at full functionality if you don’t have access to Wi-Fi, and you don’t have any of your data allowance left.\n" +
                        "If you’re using the app outside of an area with Wi-Fi, you should remember that the terms of the agreement with your mobile network provider will still apply. As a result, you may be charged by your mobile provider for the cost of data for the duration of the connection while accessing the app, or other third-party charges. In using the app, you’re accepting responsibility for any such charges, including roaming data charges if you use the app outside of your home territory (i.e. region or country) without turning off data roaming. If you are not the bill payer for the device on which you’re using the app, please be aware that we assume that you have received permission from the bill payer for using the app.\n" +
                        "Along the same lines, Christian Avergonzado, Chester Bernabe, Reniel Espinosa, and Dave Mariano cannot always take responsibility for the way you use the app i.e. You need to make sure that your device stays charged – if it runs out of battery and you can’t turn it on to avail the Service, Christian Avergonzado, Chester Bernabe, Reniel Espinosa, Dave Mariano cannot accept responsibility.\n" +
                        "With respect to Christian Avergonzado, Chester Bernabe, Reniel Espinosa, and Dave Mariano’s responsibility for your use of the app, when you’re using the app, it’s essential to bear in mind that although we endeavor to ensure that it is updated and correct at all times, we do rely on third parties to provide information to us so that we can make it available to you. Christian Avergonzado, Chester Bernabe, Reniel Espinosa, and Dave Mariano accept no liability for any loss, direct or indirect, you experience as a result of relying wholly on this functionality of the app.\n" +
                        "At some point, we may wish to update the app. The app is currently available on Android – the requirements for the system(and for any additional systems we decide to extend the availability of the app to) may change, and you’ll need to download the updates if you want to keep using the app. Christian Avergonzado, Chester Bernabe, Reniel Espinosa, and Dave Mariano do not promise that it will always update the app so that it is relevant to you and/or works with the Android version that you have installed on your device. However, you promise to always accept updates to the application when offered to you, We may also wish to stop providing the app, and may terminate your use of it at any time without giving notice of termination to you. Unless we tell you otherwise, upon any termination, (a) the rights and licenses granted to you in these terms will end; (b) you must stop using the app, and (if needed) delete it from your device.\n" +
                        "Changes to This Terms and Conditions\n" +
                        "I may update our Terms and Conditions from time to time. Thus, you are advised to review this page periodically for any changes. I will notify you of any changes by posting the new Terms and Conditions on this page.\n" +
                        "These terms and conditions are effective as of 2023-01-16\n" +
                        "\nContact Us\n" +
                        "\nIf you have any questions or suggestions about my Terms and Conditions, do not hesitate to contact me at cavergonzado31@gmail.com.\n" +
                        "This Terms and Conditions page was generated by App Privacy Policy Generator\n" +
                        "\n");
                materialAlertDialogBuilder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        registerBtn.setEnabled(true);
                        dialogInterface.dismiss();
                    }
                });
                materialAlertDialogBuilder.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        chkBox.setChecked(false);
                    }
                });
                materialAlertDialogBuilder.show();
                }else{
                    registerBtn.setEnabled(false);
                }

            }
        });


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