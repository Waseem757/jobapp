package com.jobapp.jobapp.review;

import com.jobapp.jobapp.company.CompanyService;
import jakarta.persistence.Lob;

import java.util.List;

public interface ReviewService {
    List<Review> findAll(Long companyId);
    boolean createReview(Long companyId, Review review);
    Review getReview(Long companyId, Long reviewId);

    boolean updateReview(Long companyId, Long reviewId, Review review);

    boolean deleteReview(Long companyId, Long reviewId);
}
