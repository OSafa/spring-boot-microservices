package com.example.movieinfoservice.models;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
    Movie findByMovieId(String MovieId);
}
