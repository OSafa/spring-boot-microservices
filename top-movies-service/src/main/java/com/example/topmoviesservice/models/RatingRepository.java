package com.example.topmoviesservice.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, RatingId> {
    // Custom query method to find ratings by user ID
    @Query(value = "SELECT movie_id as movieId, AVG(rating) as rating FROM ratings GROUP BY movie_id ORDER BY AVG(rating) DESC LIMIT 10",
    nativeQuery = true)
    List<RatingEntityInfo> topRatings();
}