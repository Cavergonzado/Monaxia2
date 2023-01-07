package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class AdhoMukhaSvanasanaDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Adho Mukha Svanasana")
                .setMessage("1. \tCome to your hands and knees with your wrists underneath the shoulders and your knees underneath the hips.\n" +
                        "\n 2. \tCurl your toes under and push back through your hands to lift your hips and straighten your legs.\n" +
                        "\n 3. \tSpread your fingers and ground down from the forearms into the fingertips.\n" +
                        "\n 4. \tOutwardly rotate your upper arms to broaden the collarbones.\n" +
                        "\n 5. \tLet your head hang and move your shoulder blades away from your ears towards your hips.\n" +
                        "\n 6. \tEngage your quadriceps strongly to take the burden of your body's weight off your arms. This action goes a long way toward making this a resting pose.\n" +
                        "\n 7. \tRotate your thighs inward, keep your tail high, and sink your heels towards the floor.\n" +
                        "\n 8. \tCheck that the distance between your hands and feet is correct by coming forward to a plank position. The distance between the hands and feet should be the same in these two poses. Do not step the feet toward the hands in Down Dog in order the get the heels to the floor.\n" +
                        "\n 9. \tExhale and bend your knees to release and come back to your hands and knees.")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
