import java.util.*;

public class WordleGame {
    public static void main (String[] args) {
        Wordle wordle = new Wordle();
        boolean win = false;

        Scanner scanner = new Scanner(System.in);
        while(wordle.returnLives() > 0 && !win){
            String guess = scanner.nextLine();
            wordle.check(guess);
            wordle.returnAns();
            if(guess.equals(wordle.returnAns())){
                win = true;
                System.out.println("\nYOU WIN!");
            }
        }
        if(wordle.returnLives() == 0)System.out.println("\nYOU LOSE!");
    }
}

