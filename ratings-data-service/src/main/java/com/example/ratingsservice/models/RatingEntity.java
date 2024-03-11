package com.example.ratingsservice.models;

import javax.persistence.*;


@Entity
@Table(name = "ratings")
@IdClass(RatingId.class)
public class RatingEntity {

    @Id
    @Column(name = "user_id",  columnDefinition = "VARCHAR(255) CHARACTER SET latin1")
    private String userId; // This field is part of the composite key

    @Id
    @Column(name = "movie_id",  columnDefinition = "VARCHAR(255) CHARACTER SET latin1")
    private String movieId; // This field is also part of the composite key

    @Column(name = "rating", columnDefinition = "INT")
    private int rating;

    // Getters and setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}