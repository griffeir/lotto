import java.util.Random;
/**
 * Write a description of class Draw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Draw {
    //fields
    private final int MAX = 40; // The highest possible number
    private Random randint = new Random();
    private int num; // Stores a number before adding to the draw
    //declare arrray
    
    int[] draw;
    public int[] strikeDraw() {
        int quantity = 4;
        drawNumbers(quantity);
        return draw;
    }
    
    public int[] drawNumbers(int quantity) {  
        int[] draw = new int[quantity];
        //initialise the array values
        for (int index = 0; index < draw.length; index++) {
            numberGen(draw);
            draw[index] = num;
        }
        return draw;
    }
    
    public void numberGen(int[] draw) {
        // generate a random int between 1 and 40
        num = randint.nextInt(MAX);
        
        // check to make sure it is not already in the draw
        while (verify(num, draw)) {
            num = randint.nextInt(MAX);

        }
    }
    
    public boolean verify(int num, int[] draw) {
        // checks through array and returns true if num is there
        for (int index = 0; index < draw.length; index++) {
            if (num == draw[index]) {
                return true;
            }
        }
        // if it isn't there false is returned
        return false;
    }
    
}

    