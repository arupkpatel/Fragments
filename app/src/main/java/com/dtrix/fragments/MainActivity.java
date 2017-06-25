package com.dtrix.fragments;

import android.app.Activity;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState==null){
            getFragmentManager().beginTransaction().add(R.id.container,new FActivity()).commit();
        }
    }

    String msg="";

    public void status(){
        msg= "Activity"+"--->"+msg;
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        msg="Restoreinst";
        status();
    }

    @Override
    protected void onStart() {
        super.onStart();
        msg="Start";
        status();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        msg="Restart";
        status();
    }

    @Override
    protected void onResume() {
        super.onResume();
        msg="resume";
        status();
    }

    @Override
    protected void onStop() {
        super.onStop();
        msg="Stop";
        status();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        msg="destroy";
        status();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        msg="savedinst";
        status();
    }

    @Override
    protected void onPause() {
        super.onPause();
        msg="onpause";
        status();
    }
}
