package de.englerts.money_pit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import de.englerts.money_pit.database.Account;
import de.englerts.money_pit.database.AppDB;

public class AddAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
    }

    public void addAccount(View view) {
        Account account = createAccount();
        saveAccount(account);
        viewAccount();
    }

    public Account createAccount() {
        EditText editTextAccountName = (EditText) findViewById(R.id.editTextAddAcountName);
        String accountName = editTextAccountName.getText().toString();

        EditText editTextAccountDescription = (EditText) findViewById(R.id.editTextAddAccountDescription);
        String accountDescription = editTextAccountDescription.getText().toString();

        Account account = new Account();
        account.name = accountName;
        account.description = accountDescription;

        return account;
    }

    public void saveAccount(Account account) {
        AppDB db = AppDB.getInstance(getApplicationContext());
        db.accountDao().insertAll(account);
    }

    public void viewAccount() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}