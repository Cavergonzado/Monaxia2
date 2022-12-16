package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class LotusDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Lotus Pose")
                .setMessage("1.\tSit on the floor with your legs extended. Bend your right knee out to the side, and cradle your knee and your foot in your hands. Rotate your leg from the hip (not the knee) and guide your foot into your left hip crease.\n" +
                        "\n 2.\tBend your left knee, rotating the thigh outward from the hip and, just as you did on the right. Lift your shin slightly and guide the left foot over the right, and bring it to tuck into the right hip crease.\n" +
                        "\n 3.\tSettle the tops of your feet against your upper thighs and release your knees towards the floor. Try not to let the ankles sickle.\n" +
                        "\n 4.\tSit up tall, lift your sternum and lengthening your spine. Sitting on a folded blanket may help keep the spine from rounding.\n" +
                        "\n 5.\tTake slow, deep breaths and stay in the pose as long as is comfortable.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
