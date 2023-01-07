package com.example.monaxia1.BeginnerDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class HeadToKneeForwardBendDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Head To Knee Forward Bend")
                .setMessage("1. \tBend your right knee and place the sole of your right foot high on your left inner thigh.\n" +
                        "\n 2. \tInhale and lengthen your spine; exhale and take your right hand to the outside of your left thigh and your left hand behind your left hip.\n" +
                        "\n 3. \tOn an exhalation, bend at your hips and lean forward over your left leg.\n" +
                        "\n 4. \tReach for your left foot. If it is available to you, clasp your left wrist with your right hand.\n" +
                        "\n 5. \tInhale and reach your sternum forward; exhale and revolve your right ribs toward your left knee even more.\n" +
                        "\n 6. \tTo exit the pose, inhale and lift your chest. Straighten your right leg, returning to Staff Pose.\n" +
                        "\n 7. \tRepeat on the other side.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
