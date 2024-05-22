package animals;


    public class Sparrow extends Animal implements CanFly {



        public Sparrow(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Cip cip");
        }

        @Override
        public void eats() {
            System.out.println(name + " sta mangiando uvetta");
        }

        @Override
        public void fly() {
            System.out.println("Sto volando");
        }
    }
