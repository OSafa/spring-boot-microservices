package com.example.ratingsservice.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_ratings")
public class UserRatingEntity {

    @Id
    @Column(name="id", columnDefinition = "VARCHAR(255) CHARACTER SET latin1")
    private String id;

    @OneToMany(mappedBy = "userRating", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RatingEntity> ratings;

    public String getId() {
        return id;
    }
}