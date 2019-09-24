package com.lambdaschool.hackernews.repository;

import com.lambdaschool.hackernews.models.Story;
import org.springframework.data.repository.CrudRepository;

public interface StoryRepository extends CrudRepository<Story, Long> {
}
