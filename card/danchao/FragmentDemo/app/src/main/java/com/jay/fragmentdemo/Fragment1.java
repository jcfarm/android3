package com.jay.fragmentdemo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jay on 2015/8/28 0028.
 */
public class Fragment1 extends Fragment {

    private String content;
    public Fragment1(String content) {
        this.content = content;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg1,container,false);
        ImageView img = (ImageView)view.findViewById(R.id.imageView6);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"huhsagjgjebcvjhavchjsdvhj",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),Main2Activity.class);
                startActivity(intent);
            }
        });
        ImageView img1 = (ImageView)view.findViewById(R.id.imageView5);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"huhsagjgjebcvjhavchjsdvhj",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),Main2Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
