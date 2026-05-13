package ru.practicum.moviehub;

import ru.practicum.moviehub.api.ErrorResponse;
import ru.practicum.moviehub.http.MoviesServer;
import ru.practicum.moviehub.store.MoviesStore;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MovieHubApp {
    public static void main(String[] args) {
        final MoviesServer server = new MoviesServer(new MoviesStore(), 8080);
        Runtime.getRuntime().addShutdownHook(new Thread(server::stop));
        server.start();
        ErrorResponse errorResponse = new ErrorResponse("Test");
        ErrorResponse errorResponse2 = new ErrorResponse("Test2", new ArrayList<>());
        System.out.println(errorResponse.getDetails());
        System.out.println(errorResponse2.getDetails());
    }
}