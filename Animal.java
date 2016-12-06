package zoo;

public class Animal {
    String Dog = "Bark!";
    String Snake = "Sssssssss!";
    String Hawk =  "Cawwww!";
    String name;


    public static void main(String[] args) {

        String sound;
        Dog d = new Dog();
        Snake s = new Snake();
        Hawk h = new Hawk();

        sound = d.getsound() + " " + s.getsound() + " " + h.getsound();
        System.out.println(sound);
    }


    public void makeSound() {
        System.out.println("Bark!");
    }

    public void hearSound() {
        System.out.println("Sssssssss!");
    }

    public void theSound() {
        System.out.println("Cawwww!");
    }
            public static String getsound(String Dog, String Snake, String Hawk)
        {
            String sound = Dog + Snake + Hawk;
            return sound;
        }








}

