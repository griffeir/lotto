import java.util.ArrayList;
/**
 * Will run the lotto to find 
 *
 * @author Ira
 * @version 11/03/21
 */
public class Lotto
{
    // Fields
    private Draw draw = new Draw(); // dependency to draw class
    private int[] winningDraw;      // winning draw
    private int[] playerDraw;       // players draw
    private int strikePoints = 0;
    /**
     * Play the strike game
     */
    public int[] strike()
    {
        int quantity = 4; // Pass to draw to set the number of balls drawn
        // Get player and winning draw
        winningDraw = draw.drawNumbers(quantity);
        playerDraw = draw.drawNumbers(quantity);
        // Print draws
        System.out.print("Your ticket is: ");
        printArray(playerDraw);
        
        System.out.print("Winning draw is: ");
        printArray(winningDraw);
        
        this.strikePoints = strikeCheck(playerDraw, winningDraw); // Check if any winnings
        
        System.out.println("You have won strike " + strikePoints);
        return playerDraw;
    }
    
    public int strikeCheck(int[] playerDraw, int[] winningDraw){
        strikePoints = 0;
        for (int index = 0; index < playerDraw.length; index++) {
            if (playerDraw[index] == winningDraw[index]) {
                strikePoints++;
            }
        }
        return strikePoints;
    }
    /**
     * Prints out the values stored in the arrays
     */
    public void printArray(int[] arrayPassed) {
        // itterates through the array
        for (int index = 0; index < arrayPassed.length; index++) {
            // printing each value of the array to the screen on the same line
            System.out.print(" " + arrayPassed[index]);
        }
        System.out.println();
    }
}