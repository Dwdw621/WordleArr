import java.util.*;

public class WordleGame {
    public static void main (String[] args) {
        Wordle wordle = new Wordle();
        boolean win = false;

        Scanner scanner = new Scanner(System.in);
        while(wordle.returnLives() > 0 && !win){
            String guess = scanner.nextLine();
            wordle.check(guess);
            if(guess.equals(wordle.returnStorage())){
                win = true;
                System.out.println("\nYOU WIN!");
            }
        }
        System.out.println("\nYOU LOSE!");
    }

    /*public static void clearScreen() {
    System.out.println("\f");
    }*/
}

