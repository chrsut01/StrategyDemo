    /**
     * The context object
     * @author tha
     */
    public class Animal {

        private final String name;
        private RunningPatternStrategy strategy;

        private EatingStrategy strategyE;
        public Animal(String name) {
            this.name = name;
        }

        public void setStrategy(RunningPatternStrategy strategy) {
            this.strategy = strategy;
        }

        public void run(int energy){
            System.out.println(this.name + " started to run....");
            strategy.move(energy);
        }

        public void setStrategy(EatingStrategy strategyE) {
            this.strategyE = strategyE;
        }

        public void eat(int difficulty){
            System.out.println(this.name + " has spotted armadillo.");
            strategyE.eat(difficulty);
        }
    }


