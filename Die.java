package Stats;
import java.util.Random;
public class Die {
    private int sides;
    private int sideUp;
    private final Random generator = new Random(2679);


    public int getSides() {
        return sides;
    }
    public Die(int numSides){
        sides = numSides;
    }
    public void roll(){
        sideUp =  generator.nextInt(sides) + 1;
    }
    public int roll(int times)throws IllegalArgumentException{
        if(times <= 0){
            throw new IllegalArgumentException("please use a positive integer.");
        }
        int sum = 0;
        for (int i = 0; i < times; i++) {
            sum +=  generator.nextInt(sides) + 1;
        }
        return sum;
    }
}
