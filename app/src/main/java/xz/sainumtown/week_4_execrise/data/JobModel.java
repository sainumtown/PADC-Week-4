package xz.sainumtown.week_4_execrise.data;

import java.util.ArrayList;
import java.util.List;

import xz.sainumtown.week_4_execrise.R;

/**
 * Created by asus on 6/29/2016.
 */
public class JobModel {
    String jobName;
    String company;
    String city;
    int img;
    String posttime;

    public JobModel() {
        initializeData();
    }

    public JobModel(String jobName, String company, String city, int img, String posttime) {
        this.jobName = jobName;
        this.company = company;
        this.city = city;
        this.img = img;
        this.posttime = posttime;

    }

    public String getJobName() {
        return jobName;
    }

    public String getCompany() {
        return company;
    }

    public String getCity() {
        return city;
    }

    public int getImg() {
        return img;
    }

    public String getPosttime() {
        return posttime;
    }

    public List<JobModel> getJobList() {
        return jobList;
    }

    private List<JobModel> jobList;


    private void initializeData(){
        jobList = new ArrayList<>();
        jobList.add(new JobModel("Developer", "Facebook","Yangon", R.drawable.icon_facebook_0,"now"));
        jobList.add(new JobModel("Designer", "Twitter", "Mandalay",R.drawable.icon_facebook_0,"2 days ago"));
        jobList.add(new JobModel("Backup", "Whatapps", "Singapore",R.drawable.icon_facebook_0,"1 hour ago"));
    }
}
