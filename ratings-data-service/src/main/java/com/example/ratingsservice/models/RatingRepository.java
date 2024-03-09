package com.example.ratingsservice.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, RatingId> {
    // Custom query method to find ratings by user ID
    List<RatingEntity> findByUserRatingId(String id);
}