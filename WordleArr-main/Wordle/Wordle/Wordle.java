//# is perfect, @ is in word

import java.util.Arrays;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Wordle
{
    private String[] correct = {"A","L","U","D","E"};
    private int lives = 6;

    public void check(String input){
        if(input.length() == 5){
            String[] guess = toArray(input);

            for(int i = 0; i < guess.length; i++){
                if(guess[i].equals(correct[i])){
                    guess[i] = guess[i] + "#";
                }else{
                    for(int a = 0; a < guess.length; a++){
                        if(guess[i].equals(correct[a]) && i != a)
                        guess[i] = guess[i] + "@";
                    }
                }
            }
            
            lives--;
            System.out.println(toString(guess) + "    LIVES: " + lives);
        } else {
            System.out.println("INVALID WORD LENGTH!");
        }
    }

    public String toString(String[] x){
        String str = "";
        for(int i = 0; i < x.length; i++){
            str += x[i] + " ";
        }
        return str;
    }

    public String[] toArray(String x){
        String[] temp = new String[5];
        for(int i = 0; i < x.length(); i++){
            temp[i] = x.substring(i, i+1);
        }
        return temp;
    }

    public int returnLives(){
        return lives;
    }

    public String returnAns(){
        String ans = "";
        for(int i = 0; i < correct.length; i++){
            ans += correct[i];
        }
        return ans;
    }
}
