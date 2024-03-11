package com.example.topmoviesservice.resources;

import com.example.topmoviesservice.models.Rating;
import com.example.topmoviesservice.models.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopMoviesService {

    private final RatingRepository ratingRepository;

    @Autowired
    public TopMoviesService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }
    public List<Rating> getTopRatings() {
        return ratingRepository.topRatings().stream()
                .map(rating -> new Rating(rating.getMovieId(), rating.getRating()))
                .collect(Collectors.toList());
    }
}