/**
 *
 * @author tha
 */
public class NormalPattern implements RunningPatternStrategy {

    @Override
    public void move(int energy){
        do {
            if (energy > 0){
                energy--;
                System.out.println("the animal is moving one step in direction North");
            }
        } while (energy > 0);
        System.out.println("run completed....");
    }

}
