package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ChaturangaDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Chaturanga Pose")
                .setMessage("1.1.\tStart in Mountain pose and inhale into Upward Salute pose.\n" +
                        "\n 2.\tExhale into a standing forward bend. \n" +
                        "\n 3.\tPlace both hands on the floor and step the right foot back, placing the ball of the foot on the floor and keeping the right leg straight. \n" +
                        "\n 4.\tThe left foot is between the hands, which are shoulder-width apart, palms flat on the floor. \n" +
                        "\n 5.\tThe left knee is directly over the left ankle.  \n" +
                        "\n 6.\tLook forward, keeping the chin parallel with the floor and extending the spine. \n" +
                        "\n 7.\tTake a breath and while exhaling, soften the groin and let it sink toward the floor.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
