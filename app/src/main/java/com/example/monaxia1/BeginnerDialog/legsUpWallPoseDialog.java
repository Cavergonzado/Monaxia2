package com.example.monaxia1.BeginnerDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class legsUpWallPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Legs Up Wall Pose")
                .setMessage("1.\tSit on the floor facing a wall. Lower your shoulders and head to the floor, lying on your side. Then roll onto your back and stretch your legs up the wall, with your feet hip-distance apart or whatever distance feels comfortable.\n" +
                        "\n 2. \tAdjust your position by scooting your tailbone toward the wall. It doesn’t need to touch the wall.\n" +
                        "\n 3. \tFind a comfortable position for your arms at your side, with palms turned up; relax your arms and shoulders. Relax your legs against the wall. Release all effort. You might feel your femurs sink into your hip sockets. Feel the spine lengthening. Settle into the pose and breathe for at least 10 minutes.\n" +
                        "\n 4. \tTo come out of the pose, bend your knees and roll to your side. Remain here for a few breaths before using the strength of your arms to slowly push yourself back up to seated.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
