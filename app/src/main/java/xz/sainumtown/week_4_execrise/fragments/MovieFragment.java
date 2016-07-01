package xz.sainumtown.week_4_execrise.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import xz.sainumtown.week_4_execrise.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {


    public MovieFragment() {
        // Required empty public constructor
    }

    public static MovieFragment newInstance() {
        MovieFragment fragment = new MovieFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        Button btnDetailMovie = (Button) view.findViewById(R.id.btn_detail_movie);
        ImageButton imbShareMovie = (ImageButton) view.findViewById(R.id.btn_share_movie);
        ImageButton imbCall = (ImageButton) view.findViewById(R.id.button_call);
        ImageButton imbShare = (ImageButton) view.findViewById(R.id.button_share);

        imbShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(),"Share moview place clicked",Toast.LENGTH_SHORT).show();
            }
        });

        imbCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Call button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        imbShareMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Share clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btnDetailMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Detail button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
