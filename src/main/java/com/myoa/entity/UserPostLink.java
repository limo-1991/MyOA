package com.myoa.entity;

public class UserPostLink {
    private User user;
    private Post post;
    private Long id;

    public UserPostLink() {
    }

    public UserPostLink(User user, Post post) {
        this.user = user;
        this.post = post;
    }

    public UserPostLink(User user, Post post, Long id) {
        this.user = user;
        this.post = post;
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
