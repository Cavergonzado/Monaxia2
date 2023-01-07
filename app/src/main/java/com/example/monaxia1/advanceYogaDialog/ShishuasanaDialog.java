package com.example.monaxia1.advanceYogaDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ShishuasanaDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Shishuasana")
                .setMessage("1. \tSit on your heels. Keeping your hips on the heels, bend forward, and lower your forehead to the floor.\n" +
                        "\n 2. \tKeep the arms alongside your body with hands on the floor, palms facing up. (If this is not comfortable, you can place one fist on top of another and rest your forehead on them.)\n" +
                        "\n 3. \tGently press your chest on the thighs.\n" +
                        "\n 4. \tHold.\n" +
                        "\n 5. \tSlowly come up to sit on the heels, uncurling vertebra by vertebra and relax.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
