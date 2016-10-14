package com.example.project;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.app.AlertDialog;
import android.content.*;

public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
    if (keyCode == KeyEvent.KEYCODE_BACK){
        new AlertDialog.Builder(this)
                .setTitle("アプリケーションの終了")
                .setMessage("アプリケーションを終了してよろしいですか？")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO 自動生成されたメソッド・スタブ
                        SubActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO 自動生成されたメソッド・スタブ

                    }
                })
                .show();

        return true;
    }
    return false;
}
}