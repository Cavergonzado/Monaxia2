package com.example.monaxia1.BeginnerDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExtendedPuppyPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Extended Puppy Pose")
                .setMessage("1. \tCome onto all fours. See that your shoulders are above your wrists and your hips are above your knees. Walk your hands forward a few inches and curl your toes under.\n" +
                        "\n 2. \tAs you exhale, move your buttocks halfway back toward your heels. Keep your arms active; don’t let your elbows touch the ground.\n" +
                        "\n 3. \tDrop your forehead to the floor or to a blanket and let your neck relax. Keep a slight curve in your lower back. To feel a nice long stretch in your spine, press the hands down and stretch through the arms while pulling your hips back toward your heels.\n" +
                        "\n 4. \tBreathe into your back, feeling the spine lengthen in both directions. Hold for 30 seconds to a minute, then release your buttocks down onto your heels.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
