package com.company.company;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies, String strn);

    void findMoviesByDirector(List<Movies> movies,String stringDirector);

    void findMoviesByYear(List<Movies> movies, int name);

    void findMoviesAndRoleByActor(List<Movies> movies,String roleActor);

    void showActorRoles(List<Movies> movies);
}
