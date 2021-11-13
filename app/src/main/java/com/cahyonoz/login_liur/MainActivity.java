package com.cahyonoz.login_liur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btLogin;
    TextView eUser, epass;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = (Button) findViewById(R.id.btnLogin); // dari button login agar dapat dieksekusi ke coding
        eUser = (TextView)findViewById(R.id.edUser); // dari textview user
        epass = (TextView) findViewById(R.id.edPassword); // digunakan untuk coding dari desain layout agar dapat di eksekusi

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = eUser.getText().toString(); // membaca masukan sebuah string
                pass = epass.getText().toString();

                Bundle b = new Bundle();
                b.putString("u" , user); // untuk membaca user yng dimasukkan
                b.putString("p", pass); // membaca password

                Intent in = new Intent(MainActivity.this, Welcome.class); // membuat activity baru agar dapat membaca user masukan
                in.putExtras(b);
                startActivity(in);

            }
        });
    }
}
