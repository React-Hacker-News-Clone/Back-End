package com.lambdaschool.hackernews.services;

import com.lambdaschool.hackernews.models.Story;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public interface StoryService {

    List<Story> findAll();
}
