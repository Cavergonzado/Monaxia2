package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class corpsePoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Corpse Pose")
                .setMessage("1.\tSit on the floor with your knees bent, feet on the floor. Lean back onto your forearms.\n" +
                        "\n 2.\tAs you inhale, slowly extend your legs with your feet apart and toes turned out equally.\n" +
                        "\n 3.\tNarrow the front of your pelvis and soften (but don’t flatten) your lower back. Lift your pelvis off the floor, slightly tuck your tailbone. (You may use your hand to sweep your buttocks away from your lower back. ) Lower your pelvis.\n" +
                        "\n 4.\tWith your hands, lift the base of your skull away from the back of your neck creating length. If it’s more comfortable, support your head and neck with a folded blanket. Make sure your shoulders are down and away from your ears.\n" +
                        "\n 5.\tReach your arms toward the ceiling, perpendicular to the floor. Rock slightly from side to side and broaden the back ribs and the shoulder blades away from the spine. Then release your arms to the floor, angled evenly away from the sides of the body.\n" +
                        "\n 6.\tTurn your arms outward and extend them toward to bottom of the mat. Rest the backs of your hands on the floor. Make sure your shoulder blades rest evenly on the floor.\n" +
                        "\n 7.\tSoften your mouth and tongue, and the skin around your nose, ears, and forehead. Let your eyes sink to the back of your head, then turn them downward to gaze toward your heart.\n" +
                        "\n 8.\tStay in this pose for at least 5 minutes.\n" +
                        "\n 9.\tTo exit, exhale and gentle roll onto one side. Take 2 or 3 breaths. With another exhale, press your hands against the floor and lift your torso, bringing your head slowly after.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
