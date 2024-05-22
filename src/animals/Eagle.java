package animals;


    public class Eagle extends Animal implements CanFly {



        public Eagle(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Haaah");
        }

        @Override
        public void eats() {
            System.out.println(name + " sta mangiando vermi");
        }
        @Override
        public void fly() {
            System.out.println("Sto volando");
        }

    }
