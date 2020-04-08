 package com.example.androidlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

 public class MainActivity extends AppCompatActivity {
    TextInputEditText TextInputEditText_Email;
    TextInputEditText TextInputEditText_Password;
    Button Button_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText_Email = findViewById(R.id.TextInputTextEdit_Email);
        TextInputEditText_Password = findViewById(R.id.TextInputTextEdit_Password);
        Button_Login = findViewById(R.id.Button_Login);

        Button_Login.setClickable(true);
        Button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = TextInputEditText_Email.getText().toString();
                String password = TextInputEditText_Password.getText().toString();

                Intent intent = new Intent(MainActivity.this, LoginResultActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);

                startActivity(intent);
            }
        });
    }
}
