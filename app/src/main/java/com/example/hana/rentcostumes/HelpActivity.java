package com.example.hana.rentcostumes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Annisa on 12/17/2016.
 */

//ANNISA NURSYA'S
public class HelpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView textView = (TextView)findViewById(R.id.CommonQ);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        TextView textView2 = (TextView)findViewById(R.id.Report);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpActivity.this, HelpReport.class);
                startActivity(intent);
            }
        });

        TextView textView3 = (TextView)findViewById(R.id.SIW);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpActivity.this, HelpSIW.class);
                startActivity(intent);
            }
        });

        TextView textView4 = (TextView)findViewById(R.id.Feedback);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpActivity.this, HelpFeedback.class);
                startActivity(intent);
            }
        });

        TextView textView5 = (TextView)findViewById(R.id.RentalAg);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpActivity.this, HelpRentalAg.class);
                startActivity(intent);
            }
        });
    }
}