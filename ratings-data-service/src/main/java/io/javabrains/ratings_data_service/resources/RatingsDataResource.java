package io.javabrains.ratings_data_service.resources;

import io.javabrains.ratings_data_service.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public static Rating getRating(@PathVariable("movieId") String movieId){

        return(
                new Rating(movieId, 4)
                );

    }
}
