package com.saimobileapps.androidsamples;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomControlBackgroundSampleActivity extends AppCompatActivity {

    EditText emailIdEditText, passwordEditText;
    TextView HeaderPageName;
    Button loginButton;
    ImageView appLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_control_background_sample);
    }

}

