package com.zybooks.kamilaproject4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.zybooks.kamilaproject4.FibonacciFragment;

public class LargeInputConfirmationDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireContext())
                .setMessage(getString(R.string.confirmation))
                .setPositiveButton(getString(R.string.yes), (dialog, which) -> {

                } )
                .setNegativeButton(getString(R.string.no), (dialog, which) -> {
                    getDialog().dismiss();
//                    FibonacciFragment fragment = (FibonacciFragment)
//                            getParentFragmentManager().findFragmentById(R.id.fibonacciFragment);
//                    getParentFragmentManager().beginTransaction()
//                            .attach(fragment)
//                            .commit();
                })
                .create();

    }

    public static String TAG = "LargeInputConfirmationDialog";
}
