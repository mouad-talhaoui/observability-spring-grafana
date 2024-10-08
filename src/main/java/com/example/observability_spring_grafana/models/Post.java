package com.example.observability_spring_grafana.models;

public class Post {
	private Integer id;
	private Integer userId;
	private String title;
	private String body;

	public Post() {
	}
	
	public Post(Integer userId, String title, String body) {
		super();
		this.userId = userId;
		this.title = title;
		this.body = body;
	}

	public Post(Integer id, Integer userId, String title, String body) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
