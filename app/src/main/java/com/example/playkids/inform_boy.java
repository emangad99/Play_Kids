package com.example.playkids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class inform_boy extends AppCompatActivity {

    ImageView back;
    EditText age,name;
    CardView one, two, three, four, five,six;
    Button regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inform_boy);

        back=findViewById(R.id.vector_back4);
        name=findViewById(R.id.full_name2);
        age=findViewById(R.id.age2);
        regist=findViewById(R.id.register2);
        one=findViewById(R.id.one_boy);
        two=findViewById(R.id.two_boy);
        three=findViewById(R.id.Three_boy);
        four=findViewById(R.id.four_boy);
        five=findViewById(R.id.five_boy);
        six=findViewById(R.id.six_boy);


        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }
}