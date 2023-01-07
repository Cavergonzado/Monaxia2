package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class HalasanaDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Halasana")
                .setMessage("1. \tStack three blankets so that their edges line up. Place the stack near the front of your mat so that their edges line up near the middle of the mat.\n" +
                        "\n 2. \tSit at the front end of your mat and lie back over the blankets so they support your torso. Adjust your position so that the tops of your shoulders are about an inch over the edge and the back your head rests on the floor. Lie face up so that the front of your neck is long and there’s space between the back of your neck and the floor.\n" +
                        "\n 3. \tBring your knees toward your chest, then straighten your legs toward the ceiling.\n" +
                        "\n 4. \tUsing the strength of your abs—and supporting yourself with both hands at your low or mid back—lift your hips off the floor and roll up until you are supported by your shoulders. Stack your hips above your shoulders.\n" +
                        "\n 5. \tSlowly lower your legs backward over your head until your toes reach the ground behind you. Rest your toes on the ground, feet flexed.\n" +
                        "\n 6. \tRelease your hands and place your arms no the floor, palms down or with hands clasped. Press down with your outer upper arms and shoulders to create more lift along the spine.\n" +
                        "\n 7. \tHold for 5 breaths or more.\n" +
                        "\n 8. \tTo exit, unclasp your hands, press your arms and hands into the mat, and slowly roll down one vertebrae at a time.\n" +
                        "\n 9. \tTake a few moments to allow the back to settle back into its normal curves.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
