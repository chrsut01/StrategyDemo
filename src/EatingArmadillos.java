public class EatingArmadillos implements EatingStrategy{
    @Override
    public void eat(int difficulty) {
        System.out.println("Run after armadillo... ");

        do {
            if (difficulty > 0) {
                System.out.println("...continue to run after armadillo... ");
                difficulty--;
            }
          /*  if (difficulty > 0) {
                System.out.println(" ");
                difficulty--;
            }*/

        } while (difficulty > 0);

        System.out.println("Catch armadillo, chew thoroughly and swallow.");
    }
}
