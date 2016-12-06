package zoo;

public class Hawk extends Bird {
    public Hawk() {
        this.name = "Hawk";
    }

    @Override
    public void theSound() {
        System.out.println("Cawwww!");
    }

    public String getsound() {
        return "Cawwww!";
    }
}
