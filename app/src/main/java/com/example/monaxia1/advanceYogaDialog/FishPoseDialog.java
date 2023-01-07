package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class FishPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Fish Pose")
                .setMessage("1. \tLie on your back on the floor with your knees bent, feet on the floor. Inhale, lift your pelvis slightly off the floor, and slide your hands, palms down, below your buttocks. Then rest your buttocks on the backs of your hands (and don’t lift them off your hands as you perform this pose). Be sure to tuck your forearms and elbows up close to the sides of your torso.\n" +
                        "\n 2. \tInhale and press your forearms and elbows firmly against the floor. Next press your shoulder blades into your back and, with an inhale, lift your upper torso and head away from the floor. Then release your head back onto the floor. Depending on how high you arch your back and lift your chest, either the back of your head or its crown will rest on the floor. There should be a minimal amount of weight on your head to avoid crunching your neck. (For more about this, see the Beginners Tip below.)\n" +
                        "\n 3. \tYou can keep your knees bent or straighten your legs out onto the floor. If you do the latter, keep your thighs active, and press out through the heels.\n" +
                        "\n 4. \tStay for 15 to 30 seconds, breathing smoothly. With an exhalation lower your torso and head to the floor. Draw your thighs up into your belly and squeeze.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
