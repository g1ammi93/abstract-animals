package animals;

abstract class Animal {
    protected String name;

    public Animal (String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void sleep(){
        System.out.println("Zzz");
    }
    abstract void makeSound();
    abstract void eats();
}
