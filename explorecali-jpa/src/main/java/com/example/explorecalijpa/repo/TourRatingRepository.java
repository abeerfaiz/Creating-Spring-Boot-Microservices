package com.example.explorecalijpa.repo;

import com.example.explorecalijpa.model.TourRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

public interface TourRatingRepository extends JpaRepository<TourRating, Integer> {

    List<TourRating> findByTourId(Integer tourId);
    Optional<TourRating> findByTourIdAndCustomerId(Integer tourId, Integer customerId);

}
