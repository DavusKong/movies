package dev.davus.movies;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;
    private MongoTemplate mongoTemplate;

    public Review createReviewBy(String reviewBody, String imdbId) {
        Review review = new Review(reviewBody);
        reviewRepository.insert(review);
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewId").value(review)).
                first();
        return review;

    }
}
