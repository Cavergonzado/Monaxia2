package com.example.monaxia1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class PigeonPoseDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Modified Pigeon Pose")
                .setMessage("1.\tFrom Downward Facing Dog, bring the right leg up into a Down Dog Split.\n" +
                        "\n 2.\tBend your right knee and bring that leg forward as if you were going to step into a lunge. Instead of placing your foot down as you would for a lunge, bring your right knee to the floor on the outside of your right hand. The right shin may angle back towards the left hip or be more parallel to the front of your mat, depending on your range of motion.\n" +
                        "\n 3.\tRelease your left knee to your mat. Your left leg should be flat on the floor. Take a look backward and make sure that your left foot is pointing straight back.\n" +
                        "\n 4.\tSquare your hips towards the front of your mat.\n" +
                        "\n 5.\tTake padding (a folded blanket works well) under the right side of your hip as necessary to make the pose more comfortable.3\n" +
                        "\n 6.\tIf you feel stable, bring your torso down into a forward bend over your right leg.\n" +
                        "\n 7.\tKeep hips square and weight balanced equally on both sides as best you can. If this feels too intense, place a blanket or block or under the hip or back knee. Reach your forehead toward the floor.\n" +
                        "\n 8.\tContinue squaring your hips and breathing into any tightness.5\n" +
                        "\n 9.\tCome back up, bringing your hands in line with your hips.\n" +
                        "\n 10.\tTo release, curl your left toes under and step back into a Downward Facing Dog.\n" +
                        "\n 11.\tRepeat the pose on the other side.\n")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
