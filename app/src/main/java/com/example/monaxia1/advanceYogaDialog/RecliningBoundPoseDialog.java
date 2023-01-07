package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class RecliningBoundPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Reclining Bound Angle Pose")
                .setMessage("1. \tSit on the floor, bend your legs and pull your knees toward your body.\n" +
                        "\n 2. \tLet your thighs fall open, press the soles of your feet together and carefully pull your heels toward your pelvis.\n" +
                        "\n 3. \tExhale and lie down with your arms alongside your body and your palms facing up.\n" +
                        "\n 4. \tStay in reclining bound angle pose for 1 to 5 minutes.")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
