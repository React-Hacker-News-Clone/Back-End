package com.lambdaschool.hackernews.services;

import com.lambdaschool.hackernews.models.Story;
import com.lambdaschool.hackernews.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "storyService")
@Transactional
public class StoryServiceImpl implements StoryService{

    @Autowired
    private StoryRepository storyrepo;


    @Override
    public List<Story> findAll() {
        List<Story> rtnList = new ArrayList<>();
        storyrepo.findAll().iterator().forEachRemaining(rtnList::add);
        return rtnList;
    }
}
