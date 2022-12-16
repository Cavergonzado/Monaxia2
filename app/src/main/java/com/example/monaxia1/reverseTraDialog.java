package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class reverseTraDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Reverse Triangle Pose")
                .setMessage("1.\tBegin in Mountain Pose at the top of your mat.\n" +
                        "\n 2.\tStep or lightly jump your feet 3 to 4 feet apart. Raise your arms parallel to the floor and reach them actively to the sides, shoulder blades wide, palms down.\n" +
                        "\n 3.\tTurn your left foot in slightly and your right foot out to 90 degrees. Align your right heel with your left heel. Firm your thighs and turn your right thigh outward, so the center of your right kneecap is in line with the center of the right ankle.\n" +
                        "\n 4.\tExhale and extend your torso to the right, directly over the plane of your right leg, bending from the hip joint, not the waist. Anchor this movement by strengthening your left leg and pressing your outer heel firmly to the floor. Rotate your torso to the left, keeping the left and right sides of your torso equally long. Let your left hip come slightly forward and lengthen your tailbone toward the back heel.\n" +
                        "\n 5.\tRest your right hand on your shin or ankle or the floor outside your right foot whatever is possible without distorting the sides of your torso. Stretch your left arm toward the ceiling, in line with the tops of your shoulders. Keep your head in a neutral position or turn it to the left, eyes gazing softly at your left thumb.\n" +
                        "\n 6.\tStay in this pose for 30 to 60 seconds. Inhale to come up, strongly pressing your back heel into the floor and reaching your top arm toward the ceiling. Reverse your e feet and repeat for the same length of time on the other side.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}


