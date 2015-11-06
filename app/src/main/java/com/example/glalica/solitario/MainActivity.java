package com.example.glalica.solitario;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends Activity {
    int SIZE =7;
    private RadioButton button5;
    private RadioButton button10;
    private RadioButton button17;

    private final int ids[][] = {
            { 0, 0, R.id.f1, R.id.f2, R.id.f3, 0, 0 },
            { 0, 0, R.id.f4, R.id.f5, R.id.f6, 0, 0 },
            { R.id.f7, R.id.f8, R.id.f9, R.id.f10, R.id.f11, R.id.f12, R.id.f13 },
            { R.id.f14, R.id.f15, R.id.f16, R.id.f17, R.id.f18, R.id.f19, R.id.f20 },
            { R.id.f21, R.id.f22, R.id.f23, R.id.f24, R.id.f25, R.id.f26, R.id.f27 },
            { 0, 0, R.id.f28, R.id.f29, R.id.f30, 0, 0 },
            { 0, 0, R.id.f31, R.id.f32, R.id.f33, 0, 0 } };

    /** Es llamado cuando la actividad se crea*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFigure();
        button5 =(RadioButton) findViewById(R.id.f5);
        button10 = (RadioButton) findViewById(R.id.f10);
        button17 = (RadioButton) findViewById(R.id.f17);
    }

    private void setFigure(){
        RadioButton button;

        for (int i=0; i<SIZE; i++)
            for (int j=0; j<SIZE; j++)
                if (ids[i][j]!=0){
                    button = (RadioButton) findViewById(ids[i][j]);
                    if (ids[i][j]!=R.id.f17)
                        button.setChecked(true);
                }
    }

    public void onRadioButtonClick(View view){
        button5.setChecked(false);
        button10.setChecked(false);
        button17.setChecked(true);
    }

}
