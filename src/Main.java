import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean quit = true;
        ArrayList<String> movies = new ArrayList<>();
        while(quit) {
            System.out.println("Enter a movie name or 'q' to quit: ");
            String movie = scan.nextLine();
            if(movie.equalsIgnoreCase("q")){
                System.out.println("You the films you entered are:");
                System.out.println(movies);
                System.out.println("Program ended.");
                quit = false;
            }else{
                movies.add(movie);
                System.out.println("Movie List:");
                Collections.sort(movies);
                System.out.println(movies);
            }

        }

    }
}
