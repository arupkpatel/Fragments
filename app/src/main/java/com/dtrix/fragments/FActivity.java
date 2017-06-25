package com.dtrix.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Soumya on 15-06-2017.
 */

public class FActivity extends Fragment {

    String msg="";
    int order =0;

    public void status(){
        order++;
        msg= order+"--->"+msg;
        View v =getView();
        if(v!=null)
            msg=msg+"[+1]";
        Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        msg="oncreate";
        status();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragments, container, false);
        msg = "Fragment Create View";
        status();
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        msg="createdv";
        status();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        msg="create activity";
        status();
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        msg="StateRestored";
        status();
    }

    @Override
    public void onStart() {
        super.onStart();
        msg="Start";
        status();
    }

    @Override
    public void onResume() {
        super.onResume();
        msg="Resume";
        status();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        msg="Save Instance State";
        status();
    }

    @Override
    public void onPause() {
        super.onPause();
        msg="Pause";
        status();
    }

    @Override
    public void onStop() {
        super.onStop();
        msg="stop";
        status();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        msg="Desstroyv";
        status();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        msg="Destroy";
        status();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        msg="Detach";
        status();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        msg="Attach";
        status();
    }
}
