package com.example.ratingsservice.models;

import java.io.Serializable;
import java.util.Objects;

public class RatingId implements Serializable {
    private String userId; // Corresponds to the name of the attribute in RatingEntity
    private String movieId; // Corresponds to the name of the attribute in RatingEntity

    public RatingId() {
    }

    public RatingId(String userId, String movieId) {
        this.userId = userId;
        this.movieId = movieId;
    }

    // Getters and setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RatingId)) return false;
        RatingId ratingId = (RatingId) o;
        return Objects.equals(userId, ratingId.userId) &&
                Objects.equals(movieId, ratingId.movieId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, movieId);
    }
}