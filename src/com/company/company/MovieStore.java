package com.company.company;

import java.util.Comparator;
import java.util.List;

public class MovieStore implements SortAble {
    private static final List<Movies> dataBase1 = JsonIO.getMovies();

    @Override
    public void printAllMovies(List<Movies> movies) {
    dataBase1.stream().forEach(System.out::println);
    }

    @Override
    public void findMovie(List<Movies> movies,String string) {
dataBase1.stream().filter(movies1 -> movies1.getName().equals(string)).forEach(System.out::println);
                                      //Bul filmder
    }
    @Override
    public void sortByYear(List<Movies> movies) {
   dataBase1.stream().sorted(Comparator.comparingInt(Movies::getYear).reversed()).forEach(System.out::println);
    }

    @Override
    public void sortByName(List<Movies> movies) {
        dataBase1.stream().sorted(Comparator.comparing(Movies::getName)).forEach(System.out::println);
    }
    @Override
    public void sortByDirector(List<Movies> movies) {
  dataBase1.stream().map(Movies::getDirector).sorted(Comparator.comparing(Director::getFullName)).forEach(System.out::println);
    }
}
