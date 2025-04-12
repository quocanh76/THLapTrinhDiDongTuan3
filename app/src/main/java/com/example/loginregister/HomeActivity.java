package com.example.loginregister;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {

    private Button signOutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        signOutbtn = findViewById(R.id.signOutBtn);
        signOutbtn.setOnClickListener(v -> {
            handleSignOut();
        });
    }
    private void handleSignOut() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
}
}
