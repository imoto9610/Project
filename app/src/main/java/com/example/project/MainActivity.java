package com.example.project;

import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String action = intent.getAction();

        if (NfcAdapter.ACTION_TECH_DISCOVERED.equals(action)) {
            //NFCがタッチされた時にする処理
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("テストメッセージ")
                    .setPositiveButton("終了", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // ボタンをクリックしたときの動作
                            finish();
                        }
                    });
            builder.show();

        }else {

            Intent Sub = new Intent(MainActivity.this, SubActivity.class);
            startActivity(Sub);
            MainActivity.this.finish(); //

        }

    }

}
