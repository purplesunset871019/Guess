package com.fju.guess;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText enter;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        int number = random.nextInt(99);
        TextView secret = findViewById(R.id.secret);
        secret.setText(number);

        enter = findViewById(R.id.number);
        send = findViewById(R.id.send);

        String e = enter.getText().toString();
        final Float enter = Float.parseFloat(e);
        for(int a=1;;a++){
            if(enter!=number) {
                if (number < enter) {
            /*Toast.makeText(this,"1 to"+enter,Toast.LENGTH_LONG).show();
            new AlertDialog.Builder(this)
                    .setTitle(R.string.s)
                    .setMessage(getString(R.id.))*/
                    send.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("1 to " + enter)
                                    .show();
                        }

                    });

                } else {
                    send.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            new AlertDialog.Builder(MainActivity.this)
                                    .setMessage("1 to " + enter)
                                    .show();
                        }

                    });
                }
        }
            else{
                send.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        new AlertDialog.Builder(MainActivity.this)
                                .setMessage("1 to " + enter)
                                .show();
                    }

                });
            }

        }
    }
}