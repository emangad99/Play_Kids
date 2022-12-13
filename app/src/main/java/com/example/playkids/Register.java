package com.example.playkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Register extends AppCompatActivity {

    EditText email,pass,confirm_pass;
    Button go;
    ImageView back;
    boolean passvisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email=findViewById(R.id.email_regist);
        pass=findViewById(R.id.Password_regist);
        confirm_pass=findViewById(R.id.Confirm_pass_regist);
        go=findViewById(R.id.Continue);
        back=findViewById(R.id.vector_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Register.this,Login.class);
                startActivity(back);
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent con = new Intent(Register.this,gender.class);
                startActivity(con);
            }
        });

        pass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int Right = 2 ;
                if(event.getAction()==MotionEvent.ACTION_UP) {
                    if(event.getRawX()>= pass.getRight()-pass.getCompoundDrawables()[Right].getBounds().width()){
                        int selection = pass.getSelectionEnd();
                        if(passvisible) {
                            pass.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.visibility_off,0);
                            pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passvisible=false;
                        }
                        else {
                            pass.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.visibility_icon,0);
                            pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passvisible=true;
                        }
                        pass.setSelection(selection);
                        return true;
                    }
                }
                return false;
            }
        });

        confirm_pass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int Right = 2 ;
                if(event.getAction()==MotionEvent.ACTION_UP) {
                    if(event.getRawX()>= confirm_pass.getRight()-confirm_pass.getCompoundDrawables()[Right].getBounds().width()){
                        int selection = confirm_pass.getSelectionEnd();
                        if(passvisible) {
                            confirm_pass.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.visibility_off,0);
                            confirm_pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passvisible=false;
                        }
                        else {
                            confirm_pass.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.visibility_icon,0);
                            confirm_pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passvisible=true;
                        }
                        confirm_pass.setSelection(selection);
                        return true;
                    }
                }
                return false;
            }
        });



        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }
/*
    @Override
    public void onBackPressed() {
        Intent back = new Intent(Register.this,Login.class);
        startActivity(back);
    }

 */
}