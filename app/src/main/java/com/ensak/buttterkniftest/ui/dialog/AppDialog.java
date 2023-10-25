package com.ensak.buttterkniftest.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class AppDialog extends AppCompatDialogFragment {
    public enum DIALOG_TYPE {
        INFORMATION,
        ERROR,
        WARNING
    }
    protected String title;
    protected String message;
    public AppDialog(DIALOG_TYPE type, String message) {
        this.message = message;
        switch (type) {
            case INFORMATION:
                this.title = "Information";
                break;
            case ERROR:
                this.title = "Error";
                break;
            case WARNING:
                this.title = "Warning";
                break;

        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
