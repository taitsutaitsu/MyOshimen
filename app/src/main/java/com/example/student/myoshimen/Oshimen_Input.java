package com.example.student.myoshimen;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Oshimen_Input extends AppCompatActivity {
    private TestOpenHelper helper;
    private SQLiteDatabase db;
    private Button button;
    private EditText editTextAge,editTextGroup,editTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oshimen__input);
        //データ保存オブジェクトの生成
        final DataStore DataStore;
        DataStore=new DataStore();
        //ボタンの設定
        button = (Button)findViewById(R.id.button);
        //textViewの設定
        final TextView textView = (TextView) findViewById(R.id.textView);
        //年齢取得(int)
        editTextAge =findViewById(R.id.editTextAge);
        //所属グループ取得(String)
        editTextGroup =findViewById(R.id.editTextGroup);
        //名前取得(String)
        editTextName = (EditText) findViewById(R.id.editTextName);

        button.setOnClickListener(new View.OnClickListener() {


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
