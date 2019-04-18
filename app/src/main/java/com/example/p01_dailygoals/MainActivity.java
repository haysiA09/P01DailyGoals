package com.example.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Get RadioGroup object
                RadioGroup rg1=findViewById(R.id.radioGroup1);
                //Gte ID of the selected rb
                int selectedButtonId1= rg1.getCheckedRadioButtonId();
                //Get the radio button object from the id
                RadioButton rb1=findViewById(selectedButtonId1);



                //Get RadioGroup object
                RadioGroup rg2=findViewById(R.id.radioGroup2);
                //Gte ID of the selected rb
                int selectedButtonId2= rg2.getCheckedRadioButtonId();
                //Get the radio button object from the id
                RadioButton rb2=findViewById(selectedButtonId2);


                //Get RadioGroup object
                RadioGroup rg3=findViewById(R.id.radioGroup3);
                //Gte ID of the selected rb
                int selectedButtonId3= rg1.getCheckedRadioButtonId();
                //Get the radio button object from the id
                RadioButton rb3=findViewById(selectedButtonId3);

                //get ET
                EditText et=findViewById(R.id.editText);
                //put the rb and et object in array
                String[] info = {rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString(),et.getText().toString()};

                //create intent
                Intent i=new Intent(MainActivity.this,summaryActivity.class);

                //pass array
                i.putExtra("info",info);

                //start activity
                startActivity(i);


            }
        });


    }
}
