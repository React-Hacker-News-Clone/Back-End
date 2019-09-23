package com.lambdaschool.hackernews.models;


import javax.persistence.*;

@Entity
@Table(name = "story")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long storyid;
    private String storytitle;
    private String storyurl;



    public long getStoryid() {
        return storyid;
    }


    public String getStorytitle() {
        return storytitle;
    }

    public String getStoryurl() {
        return storyurl;
    }

}
