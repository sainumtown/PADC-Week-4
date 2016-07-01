package xz.sainumtown.week_4_execrise.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import xz.sainumtown.week_4_execrise.R;


public class LinkedInFragment extends Fragment {


    public LinkedInFragment() {
        // Required empty public constructor
    }


    public static LinkedInFragment newInstance() {
        LinkedInFragment fragment = new LinkedInFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_linked_in, container, false);
        ImageView ivEdit = (ImageView) view.findViewById(R.id.iv_edit_linkin);
        ivEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Edit clicked",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
