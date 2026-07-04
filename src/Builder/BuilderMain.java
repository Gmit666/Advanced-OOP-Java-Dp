package Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Character c = new Character.CharacterBuilder().setName("Amit").setHealth(100).build();
        System.out.println(c.toString());
    }
}
