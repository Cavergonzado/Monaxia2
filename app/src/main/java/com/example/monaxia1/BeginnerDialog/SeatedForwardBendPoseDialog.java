package com.example.monaxia1.BeginnerDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class SeatedForwardBendPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Seated Forward Bend Pose")
                .setMessage("1. \tSitting on the edge of a folded blanket. Press your heels away from your body; press your palms or finger tips into the floor beside your hips.\n" +
                        "\n 2. \tInhale. Keeping your front torso long, exhale and lean forward from your hips. Lengthen the spine to fold toward your legs, without rounding your back.\n" +
                        "\n 3. \tWalk your hands out along the outside of each leg as far as they will go. If you can reach them, hold the sides of your feet with your hands.\n" +
                        "\n 4. \tWith each inhalation, lift and lengthen your front torso just slightly; with each exhalation, release a little more fully into the forward bend. If you are holding your feet, bend your elbows out to the sides and lift them away from the floor.\n" +
                        "\n 5. \tStay in the pose from 1–3 minutes. To come up, release your feet. Inhale and lift your torso by pulling your tailbone down and into the pelvis.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
