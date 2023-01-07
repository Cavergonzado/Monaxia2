package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class InstructionDashboardDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("What is Monxia?")
                .setMessage("Each of us is committed to improving our mental health. No one is exempt from this. If you live as a person in this world, you constantly strive to improve your mental health. This application is supposed to be a destination for everyone. We all have something to give. We can all take something with us.\n\n" +
                        "These pandemic-related repercussions are particularly relevant for low- and middle-income nations like the Philippines, which recently ended one of Asia's longest lockdowns. The pandemic also impacted the mental health of people. According to a study done in the Philippines, 28% of adults suffer moderate to severe anxiety.\n\n" +
                        "Around the world, more people are developing common mental illnesses, including anxiety and depression. More specifically, in low-income nations like the Philippines, the population is expanding quickly, more people are entering their adolescent years, and depression and anxiety are most widespread.\n\n" +
                        "The researcher was fascinated with developing a mobile application that will alleviate the existing problem nowadays which the generalized anxiety disorder. Monaxia is a prevention and wellness mobile application that helps people prevent experiencing generalized anxiety disorder through the use of various " +
                        "functions of the application. This will help them alleviate and relax their mind.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
