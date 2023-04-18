/**
 *
 * @author tha
 */
public class ZigZagPattern implements RunningPatternStrategy {
    @Override
    public void move(int energy){

        do {
            if (energy > 0){
                System.out.println("going one step in direction South ");
                energy--;
            }
            if (energy > 0){
                System.out.println("going one step in direction East ");
                energy--;
            }
        } while (energy > 0);

        System.out.println("run completed...");
    }

}
