package com.cahyonoz.login_liur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView txUserr;
    ImageButton btOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txUserr = (TextView) findViewById(R.id.txtUsermu);// membaca layout textview
        btOff = (ImageButton) findViewById(R.id.btnOff);

        Intent in = getIntent();
        Bundle b = in.getExtras(); //mengambil data masukan dr main activity

        String uname = b.getString("u"); //menampilkan user dr main activity

        txUserr.setText(uname);

        btOff.setOnClickListener(new View.OnClickListener() { // button keluar
            @Override
            public void onClick(View v) {

                Intent in = new Intent(Welcome.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}
