package com.contrivance.creations.posts.domain.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;

public class PostRequest {

    private String id;
    // STILL NEEDS USER ID
    private String title;
    // MIGHT NEED TO CHANGE THIS TO A BSON OBJECT
    private String postBody;
    @DateTimeFormat(pattern="dd-MM-yyyy")
    private Date postDate;
    private ArrayList<String> repliesPostIds = new ArrayList<String>();
    private int commentLayer;
    private int likes;
    private int dislikes;
    private ArrayList<String> tags = new ArrayList<String>();
    private boolean hasReadPost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public ArrayList<String> getRepliesPostIds() {
        return repliesPostIds;
    }

    public void setRepliesPostIds(ArrayList<String> repliesPostIds) {
        this.repliesPostIds = repliesPostIds;
    }

    public int getCommentLayer() {
        return commentLayer;
    }

    public void setCommentLayer(int commentLayer) {
        this.commentLayer = commentLayer;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public boolean isHasReadPost() {
        return hasReadPost;
    }

    public void setHasReadPost(boolean hasReadPost) {
        this.hasReadPost = hasReadPost;
    }
}
