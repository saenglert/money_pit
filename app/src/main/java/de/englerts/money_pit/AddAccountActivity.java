package de.englerts.money_pit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
    }

    public void saveAccount(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}