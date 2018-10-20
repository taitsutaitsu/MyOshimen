package com.example.student.myoshimen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Oshimen_Input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oshimen__input);
        //データ保存オブジェクトの生成
        final DataStore DataStore;
        DataStore=new DataStore();
        //ボタンの設定
        Button button = (Button)findViewById(R.id.button);
        //textViewの設定
        final TextView textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            //年齢取得(int)
            EditText editTextAge = (EditText) findViewById(R.id.editTextAge);


            //所属グループ取得(String)
            EditText editTextGroup = (EditText) findViewById(R.id.editTextGroup);


            //名前取得(String)
            EditText editTextName = (EditText) findViewById(R.id.editTextName);

            public void onClick(View view) {
                if(editTextAge.equals("")==false&&editTextGroup.equals("")==false&&editTextName.equals("")==false){
                    int age = Integer.parseInt(editTextAge.getText().toString());
                    String group = editTextGroup.getText().toString();
                    String name =editTextGroup.getText().toString();
                    String end=DataStore.OshiRegist(age,group,name);
                    textView.setText("おわり");
                    textView.setText(end);
                }
            }
        });

    }
}
