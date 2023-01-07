package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class SetuBandhasanaDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Setu Bandhasana")
                .setMessage("1. \tLie on your back in the center of your mat with your knees bent, your legs and feet parallel and hip-distance apart.\n" +
                        "\n 2. \tMove your feet closer to your buttocks. Press down firmly through both of your feet and inhale to raise your hips, lifting from the pubic bone rather than the navel.\n" +
                        "\n 3. \tClasp your hands under your back on the floor. Broaden your collarbones and get on top of your shoulders. Firm the outer shins and roll your upper thighs inward. Press down firmly through your heels and lift the back of your thighs and the bottom of your buttocks even higher while keeping the thighs parallel.\n" +
                        "\n 4. \tTo finish, exhale, release your hands, and lower to the floor. Allow your back to rest in a neutral state as you observe the spaciousness within your chest.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
