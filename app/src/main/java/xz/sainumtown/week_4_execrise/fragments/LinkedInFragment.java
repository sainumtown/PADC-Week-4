package xz.sainumtown.week_4_execrise.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_linked_in, container, false);

        // set the title according to the fragment name
        TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
        tvTitle.setText(getResources().getText(R.string.left_menu_linkIn));
        return view;
    }


}
