package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class PadmasanaDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Padmasana")
                .setMessage("1. \tSit on the floor or on a mat with legs stretched out in front of you while keeping the spine erect.\n" +
                        "\n 2. \tBend the right knee and place it on the left thigh. Make sure that the sole of the feet point upward and the heel is close to the abdomen.\n" +
                        "\n 3. \tNow, repeat the same step with the other leg.\n" +
                        "\n 4. \tWith both the legs crossed and feet placed on opposite thighs, place your hands on the knees in mudra position.\n" +
                        "\n 5. \tKeep the head straight and spine erect.\n" +
                        "\n 6. \tHold and continue with gentle long breaths in and out.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
