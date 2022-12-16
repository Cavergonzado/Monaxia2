package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class StandingSideDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Standing Side Pose")
                .setMessage("1.\tFirstly align and settle the body in the foundation pose of Standing, From here, bring the legs a little closer and align the distance between them to hip-width apart.\n" +
                        "\n 2.\tRaise the right arm above your head, stretching the right side torso on a deep inhale. Bend the hip towards the left, softly placing the left palm on the left leg. Exhale and stay here with normal breathing for about four to six breaths and feel the shoulder expand sideways.\n" +
                        "\n 3.\tRelease the pose and re-center with hands on the hips.\n" +
                        "\n 4.\tMoving to the other side of the pose, inhale and stretch the left arm above your head. Bend towards your right, taking the hip sideways.\n" +
                        "\n 5.\tRemain in this stretch for about 6 breaths and take the stretch deeper.\n" +
                        "\n 6.\tOne can repeat this two more times to open the shoulders and the neck.\n" +
                        "\n 7.\tFinally release and relax.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}

