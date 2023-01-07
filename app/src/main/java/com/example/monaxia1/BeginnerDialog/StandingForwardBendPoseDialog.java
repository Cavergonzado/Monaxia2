package com.example.monaxia1.BeginnerDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class StandingForwardBendPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Standing Forward Bend Pose")
                .setMessage("1. \tAt the front of the mat with your hands at your hips.\n" +
                        "\n 2. \tBend your knees slightly and fold your torso over your legs, hinging from the hips, not the lower back.\n" +
                        "\n 3. \tYour hands may land next to your feet or on the ground in front of you.\n" +
                        "\n 4. \tInhale and extend your chest to lengthen your spine.\n" +
                        "\n 5. \tExhale and gently press both legs toward straight without hyperextending. Lift the kneecaps and gently spiral your upper, inner thighs back.\n" +
                        "\n 6. \tOn an exhalation, extend your torso down without rounding your back. Lengthen your neck, extending the crown of your head toward the ground, while you draw your shoulders down your back toward your hips.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
