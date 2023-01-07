package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class UrdhvaMukhaDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Urdhva Mukha Svanasana")
                .setMessage("1. \tBegin on your belly with your feet hip-distance apart and your hands placed beside your lower ribs.\n" +
                        "\n 2. \tExtend your legs and press down with all ten toenails to activate your quadriceps.\n" +
                        "\n 3. \tRotate your inner thighs to the ceiling while firming your outer ankles into your midline.\n" +
                        "\n 4. \tPress down with your hands and feet.\n" +
                        "\n 5. \tOn an inhalation, straighten your arms and lift your legs.\n" +
                        "\n 6. \tWith your arms perpendicular to the floor, your feet anchored, and your legs active, draw your chest forward and up.\n" +
                        "\n 7. \tDraw your shoulders back while rooting down with your hands.\n" +
                        "\n 8. \tMake sure that the curve of your neck is a continuation of the curve of your mid and upper back.\n" +
                        "\n 9. \tHold for 5 breaths, then release.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
