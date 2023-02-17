package com.example.monaxia1.activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ColorMeaningDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Meaning colors for the journal background")
                .setMessage("1. \tYellow is a color that represents the sun. It stands for cheerfulness, energy, joy, happiness, and friendship. It could also mean intelligence.\n" +
                        "\n 2. \tGrey is the color most associated with boredom, loneliness, sadness and emptiness.\n" +
                        "\n 3. \tBlue is Cool - calm - intelligent - professional - loyal\n" +
                        "\n 4. \tBlack is Stylish - distant - dramatic - modern - negative\n" +
                        "\n 5. \tRed behaves actively, strengthens the shape and gives it an almost aggressive character; soft shapes cannot tolerate red. Dark red makes the shape solid and respectable.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
