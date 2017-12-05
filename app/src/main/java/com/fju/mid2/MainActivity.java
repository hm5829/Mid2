package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int FUNCTION_MAIN = 102;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void func1(View v){
        Intent i = new Intent(this, Func1Activity.class);
        startActivity(i);
    }
    public void func2(View v){
        Intent i = new Intent(this, Func2Activity.class);
        startActivity(i);
    }
    public void func3(View v){
        Intent i = new Intent(this, Func3Activity.class);
        startActivityForResult(i, FUNCTION_MAIN);
    }
    public void func4(View v){
        Intent i = new Intent(this, Func4Activity.class);
        startActivity(i);
    }
    public void func5(View v){
        Intent i = new Intent(this, Func5Activity.class);
        startActivity(i);
    }
    public void func6(View v){
        Intent i = new Intent(this, Func6Activity.class);
        startActivity(i);
    }
    public void func7(View v){
        Intent i = new Intent(this, Func7Activity.class);
        startActivityForResult(i, FUNCTION_MAIN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNCTION_MAIN){
            Toast.makeText(this, "特殊功能", Toast.LENGTH_SHORT).show();
        }
    }

    public void func8(View v){
        Intent i = new Intent(this, Func8Activity.class);
        startActivityForResult(i, FUNCTION_MAIN);
    }


}
