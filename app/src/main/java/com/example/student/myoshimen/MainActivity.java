package com.example.student.myoshimen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ボタンの設定
        Button button = (Button)findViewById(R.id.button);
        //textViewの設定
        textView = (TextView) findViewById(R.id.textView);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.editText);
                TextView yudou=(TextView)findViewById(R.id.yudou);
                String str =editText.getText().toString();
                if(str.equals("")!=false){
                    yudou.setText("入力してください。");
                }else if(Integer.parseInt(str)==1){
                    Intent intent = new Intent(getApplication(), Oshimen_Input.class);
                    startActivity(intent);
                }
            }
        });
    }
}
