package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class BoundAngleDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Standing Side Pose")
                .setMessage("1.\tBegin in Staff Pose. Sit directly on top of your sitting bones, rather than behind them.\n" +
                        "\n 2.\tBend your knees and allow them to fall open to the sides.\n" +
                        "\n 3.\tDraw the soles of your feet together and use your hands to open them as if you were opening the pages of a book.\n" +
                        "\n 4.\tPress your shoulder blades against your upper back to lift through your sternum or chest. Clasp your ankles to help you find lift along your torso.\n" +
                        "\n 5.\tTo exit the pose, gently release your feet and come back to Staff Pose.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
