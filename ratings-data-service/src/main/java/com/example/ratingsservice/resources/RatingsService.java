package com.example.ratingsservice.resources;

import com.example.ratingsservice.models.Rating;
import com.example.ratingsservice.models.RatingEntity;
import com.example.ratingsservice.models.RatingRepository;
import com.example.ratingsservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingsService {

    private final RatingRepository ratingRepository;

    @Autowired
    public RatingsService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }
    public UserRating getRatingsByUserId(String userId) {
        List<RatingEntity> ratings = ratingRepository.findByUserId(userId);
        return new UserRating(ratings.stream()
                .map(rating -> new Rating(rating.getMovieId(), rating.getRating()))
                .collect(Collectors.toList()));
    }
}