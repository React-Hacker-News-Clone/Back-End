package com.lambdaschool.hackernews.services;

import com.lambdaschool.hackernews.models.Story;

import java.awt.print.Pageable;
import java.util.ArrayList;

public interface StoryService {
    ArrayList<Story> findAll(Pageable pageable);
}
