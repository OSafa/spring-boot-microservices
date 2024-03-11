package com.example.topmoviesservice.resources;

import com.example.topmoviesservice.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/top-movies")
public class TopMoviesResource {

    private final TopMoviesService topMoviesService;

    @Autowired
    public TopMoviesResource(TopMoviesService topMoviesService){
        this.topMoviesService = topMoviesService;
    }
    @RequestMapping("/")
    public List<Rating> getTopRatings() {
        System.out.println("Hello");
        return this.topMoviesService.getTopRatings();
    }
}
