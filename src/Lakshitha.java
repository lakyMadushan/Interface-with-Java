interface Lakshitha {
    public abstract void sound();
    public abstract void sleep();
}
class Human implements Lakshitha{
    @Override
    public void sound() {
        System.out.println("Grrr...Grrr...Grrr");
    }

    @Override
    public void sleep() {
        System.out.println("suus.....suus.....suus");
    }
}
class Main{
    public static void main(String[] args) {
        Human h = new Human();
        h.sound();
        h.sleep();
    }
}
