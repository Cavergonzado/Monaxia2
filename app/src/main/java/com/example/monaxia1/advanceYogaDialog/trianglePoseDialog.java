package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class trianglePoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Triangle Pose")
                .setMessage(" 1. \tStep your feet 3 to 4 feet apart. Raise your arms parallel to the floor and reach them actively to the sides, shoulder blades wide, palms down.\n" +
                        "\n2. \tTurn your left foot in slightly and your right foot forward to face the front of the mat. Align your right heel with your left heel if that’s comfortable for you. Engage your quads.\n" +
                        "\n 3. \tExhale and extend your torso forward bending from your hip joint, not the waist to reach your side body directly over your front leg. Counter the reach by anchoring your left hip to the left. (Imagine someone is trying to pull your hips to the left.) Ground this movement by strengthening the left leg and pressing the outer heel firmly to the floor.\n" +
                        "\n 4. \tWhen you have reached as far as you are able, hinge at the hip and bring the torso to the right, moving toward your upper body being parallel to the floor. Reach your right hand down toward the floor and stretch your left arm toward the ceiling, in line with the tops of your shoulders. Your hands, arms and shoulders will form a straight line, perpendicular to your mat.\n" +
                        "\n 5. \tOpen your torso to the left, keeping the left and right sides of the torso equally long. Let the left hip come slightly forward and lengthen the tailbone toward the back heel.\n" +
                        "\n 6. \tRest your right hand on your shin, ankle, or the floor outside your right foot—whatever is possible without distorting the sides of the torso. Keep your head in a neutral position or turn to look up at your hand or down at the ground.\n" +
                        "\n 7. \tStay in this pose for 30 to 60 seconds. Inhale to come up, strongly pressing the back heel into the floor and reaching the top arm toward the ceiling. Recenter, then reverse the feet and repeat for the same length of time on the other side.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
