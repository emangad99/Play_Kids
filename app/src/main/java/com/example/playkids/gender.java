package com.example.playkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class gender extends AppCompatActivity {

    ImageView back,boy,girl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        back=findViewById(R.id.vector_back2);
        boy=findViewById(R.id.boy);
        girl=findViewById(R.id.girl);

        girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent girl = new Intent(gender.this,inform_girl.class);
                startActivity(girl);
            }
        });

        boy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent boy = new Intent(gender.this,inform_boy.class);
                startActivity(boy);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(gender.this,Register.class);
                startActivity(back);
            }
        });

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }
}