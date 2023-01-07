package com.example.monaxia1.BeginnerDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ChildPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Child's Pose")
                .setMessage("1. \tCome to your hands and knees on the yoga mat.\n" +
                        "\n 2. \tSpread your knees as wide as your mat, keeping the tops of your feet on the floor with the big toes touching.\n" +
                        "\n 3. \tBring your belly to rest between your thighs and root your forehead to the floor. Relax the shoulders, jaw, and eyes. If it is not comfortable to place the forehead on the floor, rest it on a block or two stacked fists. There is an energy point at the center of the forehead in between the eyebrows that stimulates the vagus nerve and supports a \"rest and digest\" response. Finding a comfortable place for the forehead is key to gaining this soothing benefit.\n" +
                        "\n 4. \tThere are several possible arm variations. You can stretch your arms in front of you with the palms toward the floor or bring your arms back alongside your thighs with the palms facing upwards. These are the most common variations. But you can also stretch the arms forward with palms facing up for a shoulder release or try bending the elbows so that the palms touch and rest the thumbs at the back of the neck. In this position inch the elbows forward.\n" +
                        "\n 5. \tDo whichever feel more comfortable for you. If you've been doing a lot of shoulder work, the second option feels nice.\n" +
                        "\n 6. \tStay as long as you like, eventually reconnecting with the steady inhales and exhales of your breath.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
