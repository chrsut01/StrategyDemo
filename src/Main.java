/**
 *
 * @author tha
 */
public class Main {


    public static void main(String[] args)
    {

        System.out.println("main launched");

        // Create animal

        Animal rr = new Animal("roadrunner");

           // set strategy 1

        rr.setStrategy(new NormalPattern());

        //run

        rr.run(3);

        // change strategy to 2

        rr.setStrategy(new ZigZagPattern());

        rr.run(2);

        // change strategy to EatingStrategy

        rr.setStrategy(new EatingArmadillos());

        rr.eat(5);
    }


}
