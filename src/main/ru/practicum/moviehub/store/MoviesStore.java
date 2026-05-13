package ru.practicum.moviehub.store;

import ru.practicum.moviehub.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesStore {
    private List<Movie> movie = new ArrayList<>();
    private long idGenerator;

    public List<Movie> findAllMovie() {
        return new ArrayList<>(movie);
    }

    public Movie save(String title, int year) {
        Movie movie = new Movie(idGenerator, title, year);
        this.movie.add(movie);
        return movie;

    }
}