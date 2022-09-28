package com.example.caloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView label;
    EditText food1Edit;
    EditText food2Edit;
    EditText food3Edit;
    EditText food4Edit;
    public static int[] count = new int[4];

    public int sum(){
        int sum = 0;

        sum += (count[0] * 500);
        sum += (count[1] * 350);
        sum += (count[2] * 600);
        sum += (count[3] * 800);
        return sum;
    }

    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food1Edit = (EditText) findViewById(R.id.food1Edit);
        food2Edit = (EditText) findViewById(R.id.food2Edit);
        food3Edit = (EditText) findViewById(R.id.food3Edit);
        food4Edit = (EditText) findViewById(R.id.food4Edit);
        label = (TextView) findViewById(R.id.calories);

//        while(true){
//            int food1 = Integer.parseInt(food1Edit.getText().toString());
//            int food2 = Integer.parseInt(food2Edit.getText().toString());
//            int food3 = Integer.parseInt(food3Edit.getText().toString());
//            int food4 = Integer.parseInt(food4Edit.getText().toString());
//
//            label.setText(String.valueOf(food1 + food2 + food3 + food4) + "Calories");
//        }

        food1Edit.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {

                int num = tryParse(food1Edit.getText().toString());
                count[0] = num;
                label.setText(String.valueOf(sum()) + " Calories");
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });

        food2Edit.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {

                int num = tryParse(food2Edit.getText().toString());
                count[1] = num;
                label.setText(String.valueOf(sum()) + " Calories");
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });

        food3Edit.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {

                int num = tryParse(food3Edit.getText().toString());
                count[2] = num;
                label.setText(String.valueOf(sum()) + " Calories");
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });

        food4Edit.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {

                int num = tryParse(food4Edit.getText().toString());
                count[3] = num;
                label.setText(String.valueOf(sum()) + " Calories");
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });

    }
}