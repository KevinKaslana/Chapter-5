package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
    @SerializedName("feeds") List<Feed> Feeds;
    @SerializedName("success") boolean success;

    public List<Feed> getFeeds() {return Feeds;}

    public boolean getsuccess() {return success;}
}
