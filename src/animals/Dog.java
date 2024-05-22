package animals;


    public class Dog extends Animal {



        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Bau bau");
        }

        @Override
        public void eats() {
            System.out.println(name + " sta mangiando croccantini");
        }


    }
