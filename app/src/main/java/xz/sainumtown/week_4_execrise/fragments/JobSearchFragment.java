package xz.sainumtown.week_4_execrise.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xz.sainumtown.week_4_execrise.R;
import xz.sainumtown.week_4_execrise.adapters.RVJobAdapter;
import xz.sainumtown.week_4_execrise.data.JobModel;


public class JobSearchFragment extends Fragment {


    public JobSearchFragment() {
        // Required empty public constructor
    }

    public static JobSearchFragment newInstance() {
        JobSearchFragment fragment = new JobSearchFragment();
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
        View view = inflater.inflate(R.layout.fragment_job_search, container, false);
        JobModel job = new JobModel();

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);

        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        RVJobAdapter adapter = new RVJobAdapter(job.getJobList());
        rv.setHasFixedSize(true);
        rv.setLayoutManager(mLinearLayoutManager);

        rv.setAdapter(adapter);


        return view;
    }

}
