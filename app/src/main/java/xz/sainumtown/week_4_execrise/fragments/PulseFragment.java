package xz.sainumtown.week_4_execrise.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import xz.sainumtown.week_4_execrise.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PulseFragment extends Fragment {


    public PulseFragment() {
        // Required empty public constructor
    }

    public static PulseFragment newInstance() {
        PulseFragment fragment = new PulseFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pulse, container, false);
        ImageView ivAddFriend = (ImageView) view.findViewById(R.id.add_friend);
        ImageView ivDropDwownOptionMenu = (ImageView) view.findViewById(R.id.iv_search_pulse);
        ImageView ivSetting = (ImageView) view.findViewById(R.id.setting_pulse);

        ivSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Setting clicked",Toast.LENGTH_SHORT).show();
            }
        });

        ivDropDwownOptionMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Search button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        ivAddFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Add friend button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
