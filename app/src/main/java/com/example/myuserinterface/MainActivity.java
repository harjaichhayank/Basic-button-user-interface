package com.example.myuserinterface;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton1 = findViewById(R.id.button1);
        Button myButton2 = findViewById(R.id.button2);
        Button myButton3 = findViewById(R.id.button3);
        Button myButton4 = findViewById(R.id.button4);
        Button myButton5 = findViewById(R.id.button5);
        Button myButton6 = findViewById(R.id.button6);
        Button myButton7 = findViewById(R.id.button7);

        myButton1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_changed_by_button1);
                    }
                }
        );

        myButton2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_changed_by_button2);
                    }
                }
        );

        myButton3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_changed_by_button3);
                    }
                }
        );

        myButton4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_changed_by_button4);
                    }
                }
        );

        myButton5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_changed_by_button5);
                    }
                }
        );
        myButton6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_changed_by_button6);
                    }
                }
        );
        myButton7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_changed_by_Button7);
                    }
                }
        );
        myButton1.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_long_changed_by_button1);
                        return true;
                    }
                }
        );

        myButton2.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_long_changed_by_butotn2);
                        return true;
                    }
                }
        );

        myButton3.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_long_changed_by_button3);
                        return true;
                    }
                }
        );

        myButton4.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_long_changed_by_button4);
                        return true;
                    }
                }
        );

        myButton5.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_long_changed_by_button5);
                        return true;
                    }
                }
        );
        myButton6.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_long_changed_by_button6);
                        return true;
                    }
                }
        );
        myButton7.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(R.string.I_am_long_changed_by_button7);
                        return true;
                    }
                }
        );
    }
}
