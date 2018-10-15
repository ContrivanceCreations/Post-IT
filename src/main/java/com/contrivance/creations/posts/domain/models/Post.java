package com.contrivance.creations.posts.domain.models;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "posts")
public class Post {

	@Id
	private String id;

	private String title;
	private String postBody;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date postDate;
	private ArrayList<String> replies = new ArrayList<String>();
	private int commentLayer;
	private int likes;
	private int dislikes;
	private ArrayList<String> tags = new ArrayList<String>();
	private boolean hasReadPost;

	public Post() {}

	public Post(String title, String postBody, Date postDate) {
		this.title = title;
		this.postBody = postBody;
		this.postDate = postDate;
	}

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

	public ArrayList<String> getReplies() {
		return replies;
	}

	public void setReplies(ArrayList<String> replies) {
		this.replies = replies;
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

	@Override
	public String toString() {
		return "Post{" +
				"id='" + id + '\'' +
				", title='" + title + '\'' +
				", postBody='" + postBody + '\'' +
				", postDate=" + postDate +
				'}';
	}
}
