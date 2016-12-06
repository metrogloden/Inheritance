package zoo;

public class Snake extends Reptile {
    public Snake() {
        this.name = "Snake";
    }

    @Override
    public void hearSound() {
        System.out.println("Sssssssss!");
    }

    public String getsound() {
        return "Sssssssss!";
    }
}