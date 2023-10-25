package com.ensak.buttterkniftest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.ensak.buttterkniftest.ui.dialog.AppDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.txtEmail)
    TextView txtEmail;

    @BindView(R.id.txtPassword)
    TextView txtPassword;

    @BindView(R.id.swtSaveCredentials)
    Switch swtSaveCredentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    void login() {
        String email = txtEmail.getText().toString();
        String password = txtPassword.getText().toString();
        if(! email.equals("test") || !password.equals("test")){
            AppDialog dialog = new AppDialog(AppDialog.DIALOG_TYPE.ERROR, "Invalid credentials");
            dialog.show(getSupportFragmentManager(), "invalid_credentials");
            return;
        }

        Intent intent = new Intent(LoginActivity.this, TransactionsActivity.class);
        startActivity(intent);
    }
}
