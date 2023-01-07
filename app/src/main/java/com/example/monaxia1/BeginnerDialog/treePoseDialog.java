package com.example.monaxia1.BeginnerDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class treePoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Tree Pose")
                .setMessage("1. \tStand in Tad asana.Spread your toes, press your feet into the mat and firm your leg muscles. Raise your front hip points toward your lower ribs to gently lift in your lower belly.\n" +
                        "\n 2. \tInhale deeply, lifting your chest, and exhale as you draw your shoulder blades down your back. Look straight ahead at a steady gazing spot.\n" +
                        "\n3. \tPlace your hands on your hips and raise your right foot high onto your left thigh or shin. Avoid contacting the knee.\n" +
                        "\n4. \tPress your right foot and left leg into each other.\n" +
                        "\n5. \tCheck that your pelvis is level and squared to the front.\n" +
                        "\n6. \tWhen you feel steady, place your hands into Anjali Mudra at the heart or stretch your arms overhead like branches reaching into the sun.\n" +
                        "\n7. \tHold for several breaths, then step back into Mountain Pose and repeat on the other side.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
