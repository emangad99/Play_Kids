package com.example.playkids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class inform_girl extends AppCompatActivity {

    ImageView back;
    EditText age,name;
    CardView one, two, three, four, five,six;
    Button regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform_girl);

        back=findViewById(R.id.vector_back3);
        name=findViewById(R.id.full_name);
        age=findViewById(R.id.age);
        regist=findViewById(R.id.register);
        one=findViewById(R.id.one_girl);
        two=findViewById(R.id.two_girl);
        three=findViewById(R.id.Three_girl);
        four=findViewById(R.id.four_girl);
        five=findViewById(R.id.five_girl);
        six=findViewById(R.id.six_girl);


        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

    }
}