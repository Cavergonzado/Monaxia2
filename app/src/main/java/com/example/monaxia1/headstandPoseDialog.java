package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class headstandPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Headstand Pose")
                .setMessage("1.\tGet on your hands and knees with your wrists under your shoulders and your knees under your hips.\n" +
                        "\n 2.\tBring your forearms to the floor, keeping your elbows directly under your shoulders.\n" +
                        "\n 3.\tClasp hands around the opposite elbow. Adjust as needed to ensure your elbows are the shoulder-width apart.\n" +
                        "\n 4.\tRelease your hands from your elbows.\n" +
                        "\n 5.\tClasp your hands together on the floor, interlacing your fingers (tuck the bottom pinky into the basket of your hand to avoid squishing it).\n" +
                        "\n 6.\tPlace the crown of your head on the floor. The very top of your head should be down—neither too far forward nor back. The back of your head will rest at the bases of your thumbs rather than your hands holding your skull.\n" +
                        "\n 7.\tLift your hips and straighten your legs as if you were doing Downward-Facing Dog.\n" +
                        "\n 8.\tCarefully walk your feet in toward your head until your hips are as close to over your shoulders as possible.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
