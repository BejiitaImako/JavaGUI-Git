package com.test.bejiita.javagui_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       RelativeLayout BejiRel = new RelativeLayout(this);

        //WIDGET CREATION
        //Create the buttons and apply color and text.
        Button btnYAY = new Button(this); Button btnHOO = new Button(this);  Button btnHAA = new Button(this);
        btnYAY.setText(R.string.btnYAY_name); btnHOO.setText(R.string.btnHOO_name); btnHAA.setText(R.string.btnHAA_name);
        btnYAY.setBackgroundColor(Color.GREEN);
        btnHOO.setBackgroundColor(Color.YELLOW);
        btnHAA.setBackgroundColor(Color.RED);
        //DIP to px conversion
       Resources r = getResources();
       int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300, r.getDisplayMetrics());
        int py = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,40, r.getDisplayMetrics());
       //Create the Text view
        EditText txtTJOHOO = new EditText(this);
        txtTJOHOO.setBackgroundColor(Color.YELLOW);
        txtTJOHOO.setWidth(px);
        txtTJOHOO.setHeight(py);
        //ADD ID
        btnYAY.setId(R.id.YAYid); btnHOO.setId(R.id.HOOid); btnHAA.setId(R.id.HAAid); txtTJOHOO.setId(R.id.TJOHOOid);
        //LAYOUT PARAMETERS
        //Button layouts
        RelativeLayout.LayoutParams btnYAYpara = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams btnHOOpara = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams btnHAApara = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        //Button layout rules
        btnYAYpara.addRule(RelativeLayout.CENTER_VERTICAL); btnYAYpara.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        btnHOOpara.addRule(RelativeLayout.CENTER_VERTICAL); btnHOOpara.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnHAApara.addRule(RelativeLayout.CENTER_VERTICAL); btnHAApara.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        //EditText layout
        RelativeLayout.LayoutParams txtTJOHOOpara = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        //EditTextLayout rules
        txtTJOHOOpara.addRule(RelativeLayout.ABOVE, btnYAY.getId()); txtTJOHOOpara.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txtTJOHOOpara.setMargins(0,0,0,50);
        //Set background color
        BejiRel.setBackgroundColor(Color.BLUE);


        BejiRel.addView(btnYAY, btnYAYpara); BejiRel.addView(btnHOO, btnHOOpara); BejiRel.addView(btnHAA, btnHAApara);

        //Create EditText and apply BG color, then add it to the layout and set the rules

        BejiRel.addView(txtTJOHOO, txtTJOHOOpara);

        setContentView(BejiRel);




    }
}
