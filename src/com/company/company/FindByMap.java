package com.company.company;

import java.util.List;

public class FindByMap implements FindAble {
    private static final List<Movies> dataBase2 = JsonIO.getMovies();
    @Override
    public void findMoviesByActor(List<Movies> movies,String strnActo) {
      dataBase2.stream().filter(movies1 -> {
          List<Cast> cast = movies1.getCast();
          List<String> strings = cast.stream().map(Cast::getFullName).toList();
          return  strings.contains(strnActo);
      }).forEach(System.out::println);

    }
    @Override
    public void findMoviesByDirector(List<Movies> movies,String stringDirector) {
        dataBase2.stream().filter(movies1 -> movies1.getDirector().getFullName().equals(stringDirector)).
                forEach(System.out::println);
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {
dataBase2.stream().filter(movies1 -> movies1.getYear()==name).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies,String roleActor) {
        dataBase2.stream().filter(movies1 -> {
            List<Cast> cast = movies1.getCast();
            //  List<String> strings = cast.stream().map(Cast::getFullName).toList();
            List<String> strings1 = cast.stream().map(Cast::getRole).toList();
            return  strings1.contains(roleActor);
        }).forEach(System.out::println);


    }

    @Override
    public void showActorRoles(List<Movies> movies) {
movies.stream().forEach(Movies::printCast);
    }
}
