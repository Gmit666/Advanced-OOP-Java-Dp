package Builder;

public class Character {
    private String name;
    private int health;
    private int strength;
    private int dexterity;
    private int intelligence;
    private boolean isAlive;

    private Character(CharacterBuilder builder) {
        this.name = builder.name;
        this.health = builder.health;
        this.strength = builder.strength;
        this.dexterity = builder.dexterity;
        this.intelligence = builder.intelligence;
        this.isAlive = builder.isAlive;
    }

    @Override
    public String toString() {
        return this.name + " " + this.health + " " + this.strength + " "
                + this.dexterity + " " + this.intelligence + " " + this.isAlive;

    }
    public static class CharacterBuilder {
        private String name;
        private int health;
        private int strength;
        private int dexterity;
        private int intelligence;
        private boolean isAlive;


        public CharacterBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public CharacterBuilder setHealth(int health) {
            this.health = health;
            return this;
        }
        public CharacterBuilder setStrength(int strength) {
            this.strength = strength;
            return this;
        }
        public CharacterBuilder setDexterity(int dexterity) {
            this.dexterity = dexterity;
            return this;
        }
        public CharacterBuilder setIntelligence(int intelligence) {
            this.intelligence = intelligence;
            return this;
        }
        public CharacterBuilder setIsAlive(boolean isAlive) {
            this.isAlive = isAlive;
            return this;
        }
        public Character build() {
           return new Character(this);
        }
    }
}
