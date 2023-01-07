package com.example.monaxia1.BeginnerDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class HeroPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Hero Pose")
                .setMessage("1. \tKneel on the floor (use a folded blanket or bolster to wedge between your calves and thighs if necessary), with your thighs perpendicular to the floor, and touch your inner knees together. Slide your feet apart, slightly wider than your hips, with the tops of the feet flat on the floor. Angle your big toes slightly in toward each other and press the top of each foot evenly on the floor.\n" +
                        "\n 2. \tExhale and sit back halfway, with your torso leaning slightly forward. Wedge your thumbs into the backs of your knees and draw the skin and flesh of the calf muscles toward the heels. Then sit down between your feet.\n" +
                        "\n 3. If \tyour buttocks don’t comfortably rest on the floor, raise them on a block or thick book placed between the feet. Make sure both sitting bones are evenly supported. Allow a thumb’s-width space between the inner heels and the outer hips. Turn your thighs inward and press the heads of the thigh bones into the floor with the bases of your palms. Then lay your hands in your lap, one on the other, palms up, or on your thighs, palms down.\n" +
                        "\n 4. \tFirm your shoulder blades against the back ribs and lift the top of your sternum like a proud warrior. Widen the collarbones and release the shoulder blades away from the ears. Lengthen the tailbone into the floor to anchor the back torso.\n" +
                        "\n 5. \tAt first stay in this pose from 30 seconds to 1 minute. Gradually extend your stay up to 5 minutes. To come out, press your hands against the floor and lift your buttocks up, slightly higher than the heels. Cross your ankles underneath your buttocks, sit back over the feet and onto the floor, then stretch your legs out in front of you. It may feel good to bounce your knees up and down a few times on the floor.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
