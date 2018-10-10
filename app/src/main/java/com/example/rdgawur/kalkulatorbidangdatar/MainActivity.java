package com.example.rdgawur.kalkulatorbidangdatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        txtResult = (TextView) findViewById(R.id.hasil);
    }

    public void hitung(int type){
        double val1 = Double.parseDouble(input1.getText().toString());
        double val2 = Double.parseDouble(input2.getText().toString());

        double hasil = 0;

        if (type == 1){
            hasil = val1 * val2;
        }else if (type == 2){
            hasil = 2 * (val1 + val2);
        }else if (type == 3){
            hasil = (val1 * val2) / 2;
        }else if (type == 4){
            double hypo = Math.sqrt(Math.pow(val1, 2)+Math.pow(val2, 2));
            hasil = val1 + val2 + hypo;
        }else if (type == 5){
            hasil = Math.pow(Math.PI * (val1/2), 2);
        }else if (type == 6){
            hasil = Math.PI * val1;
        }
        txtResult.setText(Double.toString(hasil));

    }

    public void a(View v){hitung(1);  }

    public void b(View v){hitung(2);  }

    public void c(View v){hitung(3);  }

    public void d(View v){hitung(4);  }

    public void e(View v){hitung(5);  }

    public void f(View v){hitung(6);  }
}
