package com.lambdaschool.hackernews.models;


import javax.persistence.*;

@Entity
@Table(name = "story")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long storyid;
    private String title;
    private String url;

    public Story() {

    }

    public long getStoryid() {
        return storyid;
    }


    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

}
