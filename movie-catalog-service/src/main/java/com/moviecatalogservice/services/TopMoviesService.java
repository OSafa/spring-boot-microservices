package com.moviecatalogservice.services;

import com.example.topmovieproto.TopMoviesRequest;
import com.example.topmovieproto.TopMoviesResponse;
import com.example.topmovieproto.TopMoviesServiceGrpc;
import com.moviecatalogservice.models.Rating;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopMoviesService {
    @GrpcClient("topmovies-server")
    private TopMoviesServiceGrpc.TopMoviesServiceBlockingStub topMoviesServiceBlockingStub;

    public List<Rating> topMovies() {
        TopMoviesRequest topMoviesRequest = TopMoviesRequest.newBuilder().build();
        TopMoviesResponse topMoviesResponse = this.topMoviesServiceBlockingStub.topMovies(topMoviesRequest);
        return topMoviesResponse.getRatingList()
                .stream()
                .map(rating -> new Rating(rating.getMovieId(), rating.getRatingVal()))
                .collect(Collectors.toList());
    }
}
