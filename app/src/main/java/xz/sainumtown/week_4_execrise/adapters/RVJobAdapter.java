package xz.sainumtown.week_4_execrise.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import xz.sainumtown.week_4_execrise.R;
import xz.sainumtown.week_4_execrise.data.JobModel;

/**
 * Created by asus on 6/29/2016.
 */
public class RVJobAdapter extends RecyclerView.Adapter<RVJobAdapter.JobViewHolder> {

    List<JobModel> jobs;

    @Override
    public JobViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_item, parent, false);
        JobViewHolder jvh = new JobViewHolder(v);
        return jvh;
    }

    public RVJobAdapter(List<JobModel> Jobs) {
        JobModel jobModel = new JobModel();
        this.jobs = jobModel.getJobList();
    }

    @Override
    public void onBindViewHolder(JobViewHolder holder, int i) {
        holder.tvJobName.setText(jobs.get(i).getJobName());
        holder.tvCompany.setText(jobs.get(i).getCompany());
        holder.tvCity.setText(jobs.get(i).getCity());
        holder.tvPost.setText(jobs.get(i).getPosttime());
        holder.iv_image.setImageResource(jobs.get(i).getImg());

    }



    @Override
    public int getItemCount() {
        return 3;
    }

    public static class JobViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView tvJobName;
        TextView tvCompany;
        TextView tvCity;
        TextView tvPost;
        ImageView iv_image;


        JobViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv_job_search);
            tvJobName = (TextView) itemView.findViewById(R.id.tv_job_name);
            tvCompany = (TextView) itemView.findViewById(R.id.tv_job_company);
            tvPost = (TextView) itemView.findViewById(R.id.tv_job_post_time);
            tvCity = (TextView) itemView.findViewById(R.id.tv_job_city);
            iv_image = (ImageView) itemView.findViewById(R.id.iv_job_photo);
        }
    }
}
