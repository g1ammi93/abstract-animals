package animals;


    public class Dolphin extends Animal implements CanSwim {



        public Dolphin(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Fiuuu");
        }

        @Override
        public void eats() {
            System.out.println(name + " sta mangiando calamari");
        }


        @Override
        public void swim() {
            System.out.println("Sto nuotando");
        }
    }
