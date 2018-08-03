package com.mypackage.kunjal.firstandroidapptyimca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
TextView tv;
    Button btn_ok,btn_cancel;
    EditText ed1, ed2;
    String str_uname, str_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //Referencing of the UI elements
        tv= (TextView) findViewById(R.id.textView4);
        btn_ok= (Button) findViewById(R.id.button5);
        btn_cancel= (Button) findViewById(R.id.button6);
        ed1= (EditText) findViewById(R.id.editText3);
        ed2= (EditText) findViewById(R.id.editText4);
        btn_ok.setOnClickListener(this);
        btn_cancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.button5)
        {
            str_uname=ed1.getText().toString();
            str_pwd=ed2.getText().toString();
            if(str_uname.equals("kunjal") && str_pwd.equals("kunjal"))
            {
                tv.setText("Credertials match!!!");
                Toast t=Toast.makeText(this,"Credentials match",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
            }
            else
                tv.setText("Credertials donot match!!!");
        }
        else
        {
            ed1.setText("");
            ed2.setText("");
        }
    }
}
