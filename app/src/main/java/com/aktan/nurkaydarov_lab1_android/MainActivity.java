package com.aktan.nurkaydarov_lab1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText editText_a;
    EditText editText_b;
    EditText editText_c;
    EditText editText_x;
    TextView resultView;

    Button btn_solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_a = findViewById(R.id.edit_a);
        editText_b = findViewById(R.id.edit_b);
        editText_c = findViewById(R.id.edit_c);
        editText_x = findViewById(R.id.edit_x);
        btn_solve = findViewById(R.id.solve_btn);


        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double y,a, b ,c , x;



                try{
                    a = Double.parseDouble(editText_a.getText().toString().trim());
                    b = Double.parseDouble(editText_b.getText().toString().trim());
                    c = Double.parseDouble(editText_c.getText().toString().trim());
                    x = Double.parseDouble(editText_x.getText().toString().trim());

                    if(x < 4){
                        y = ((Math.pow(x, 2) + Math.pow(a, 2)) * c) / (2 * b);
                    }
                    else{
                        y = (Math.pow(x, 3)) * (a - b);
                    }

                    resultView.setText(String.valueOf(y));

                }catch (Exception e){
                    resultView.setText("Неверные входные данные");
                }

            }
        };

        btn_solve.setOnClickListener(onClickListener);

    }
}