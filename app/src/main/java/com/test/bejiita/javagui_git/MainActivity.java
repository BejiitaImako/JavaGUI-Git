package com.test.bejiita.javagui_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       RelativeLayout BejiRel = new RelativeLayout(this);
        RelativeLayout.LayoutParams btnYAYpara = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams btnHOOpara = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams btnHAApara = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        btnYAYpara.addRule(RelativeLayout.CENTER_VERTICAL); btnYAYpara.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        btnHOOpara.addRule(RelativeLayout.CENTER_VERTICAL); btnHOOpara.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnHAApara.addRule(RelativeLayout.CENTER_VERTICAL); btnHAApara.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        BejiRel.setBackgroundColor(Color.BLUE);
        Button btnYAY = new Button(this); Button btnHOO = new Button(this);  Button btnHAA = new Button(this);
        btnYAY.setText(R.string.btnYAY_name); btnHOO.setText(R.string.btnHOO_name); btnHAA.setText(R.string.btnHAA_name);
        btnYAY.setBackgroundColor(Color.GREEN);
        btnHOO.setBackgroundColor(Color.YELLOW);
        btnHAA.setBackgroundColor(Color.RED);
        BejiRel.addView(btnYAY, btnYAYpara); BejiRel.addView(btnHOO, btnHOOpara); BejiRel.addView(btnHAA, btnHAApara);
        setContentView(BejiRel);




    }
}
