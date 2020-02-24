package com.kamer.thymeleafcrashcourse;

import java.time.LocalDateTime;

/**
 * Created on February, 2020
 *
 * @author kamer
 */
class Post {

    private String title;

    private String excerpt;

    private LocalDateTime createdDate;

    public Post(String title, String excerpt) {
        this.title = title;
        this.excerpt = excerpt;
        this.createdDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", excerpt='" + excerpt + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
