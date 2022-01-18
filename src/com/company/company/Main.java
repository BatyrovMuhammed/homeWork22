package com.company.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static SortAble s = (SortAble) new MovieStore();
    private static FindAble f = (FindAble) new FindByMap();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InputException {
        while (true) {
            commads();
            int num = in.nextInt();
            String sim = in.nextLine();
            switch (num){
                case 1 ->{
                    s.printAllMovies(movies);
                }
                case 2 ->{
                    String findMovie = in.nextLine();
                    s.findMovie(movies,findMovie);
                }
                case 3 ->{
                    s.sortByYear(movies);
                }
                case 4 ->{
                    s.sortByName(movies);
                }
                case 5 ->{
                    s.sortByDirector(movies);
                }
                case 6 ->{
                    String findByActor=in.nextLine();
                    f.findMoviesByActor(movies,findByActor);
                }
                case  7 ->{
                    String findMoviesByDirector = in.nextLine();
                    f.findMoviesByDirector(movies,findMoviesByDirector);
                }
                case 8 ->{
                    int findMoviesYear = in.nextInt();
                    f.findMoviesByYear(movies,findMoviesYear);
                }
                case 9 ->{
                    String role = in.nextLine();
                    f.findMoviesAndRoleByActor(movies,role);
                }
                case 10->{
                    f.showActorRoles(movies);
                }

            }
    }
    }


    static void commads() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("---------------------------------------------");
    }

    static int getInt() {
        System.out.print("Write year ");
        int a = 0;
        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Wrong again, try again");
            e.printStackTrace();
        }
        return a;
    }
}
