package com.example.topmoviesservice.resources;

import com.example.topmovieproto.*;
import com.example.topmoviesservice.models.Rating;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@GrpcService
public class TopMoviesServer extends TopMoviesServiceGrpc.TopMoviesServiceImplBase {
    TopMoviesService topMoviesService;

    @Autowired
    public TopMoviesServer (TopMoviesService topMoviesService) {
        this.topMoviesService = topMoviesService;
    }

    @Override
    public void topMovies(TopMoviesRequest request,
                          StreamObserver<TopMoviesResponse> responseObserver) {
        TopMoviesResponse.Builder responseBuilder = TopMoviesResponse.newBuilder();
        List<Rating> topRatings = topMoviesService.getTopRatings();
        for (Rating rating: topRatings) {
            responseBuilder.addRating(
                    com.example.topmovieproto.Rating.newBuilder()
                            .setMovieId(rating.getMovieId())
                            .setRatingVal(rating.getRating()))
                            .build();
        }
        TopMoviesResponse response = responseBuilder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
