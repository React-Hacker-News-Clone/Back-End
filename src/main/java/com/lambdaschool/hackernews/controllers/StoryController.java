package com.lambdaschool.hackernews.controllers;

import com.lambdaschool.hackernews.models.Story;
import com.lambdaschool.hackernews.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

// GET
@RestController
@RequestMapping("/stories")
public class StoryController {
    @Autowired
    private StoryService storyService;

    @GetMapping(value = "/stories",
                produces = {"application/json"})
    public ResponseEntity<?> listAllStories() {
        List<Story> myStories = storyService.findAll();
        return new ResponseEntity<>(myStories, HttpStatus.OK);
    }


}
