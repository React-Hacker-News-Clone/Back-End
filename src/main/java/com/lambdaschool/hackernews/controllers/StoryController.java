package com.lambdaschool.hackernews.controllers;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StoryController {
    private static final Logger logger = LoggerFactory.getLogger(StoryController.class);

    @Autowired
    StoryService storyService;

    @ApiOperation(value = "Get all books", response = Story.class)
    @ApiImplicitParams({
                               @ApiImplicitParam(name = "page", dataType = "integr", paramType = "query",
                                                 value = "Results page you want to retrieve (0..N)"),
                               @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query",
                                                 value = "Number of records per page."),
                               @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query",
                                                 value = "Sorting criteria in the format: property(,asc|desc). " +
                                                         "Default sort order is ascending. " +
                                                         "Multiple sort criteria are supported.")})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Books Found", response = Story.class), @ApiResponse(code = 404, message = "Books Not Found", response = ErrorDetail.class)})
    @GetMapping(value = "/stories", produces = {"application/json"})
    public ResponseEntity<?> listAllStories(HttpServletRequest request, @PageableDefault(page = 0, size = 10)
            Pageable pageable) {
        logger.warn(request.getMethod().toUpperCase() + " " + request.getRequestURI() + " accessed!");
        List<Story> storyList = storyService.findAll((java.awt.print.Pageable) pageable);
        return new ResponseEntity<>(storyList, HttpStatus.OK);
    }


}
