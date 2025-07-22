public class EnhancedPlayer {
    private final String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        this.healthPercentage = getProperHealthValue(health);
        this.weapon = weapon;

        System.out.println("Player: " + this.fullName + ", With health of: " + this.healthPercentage + ", And Weapon of: " + this.weapon + ", \n Has been created !");
    }

    public EnhancedPlayer(String fullName, String weapon) {
        this(fullName, 100, weapon);
    }

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    private int getProperHealthValue (int health) {
        if (health <= 0) return 1;
        else if (health >= 100) return 100;
        else return health;
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            System.out.println("Player has died !");
            return;
        }

        System.out.println("Health is now:: " + this.healthPercentage);
    }

    public void restoreHealth(int extraHealth) {
        this.healthPercentage = Math.min(extraHealth + this.healthPercentage, 100);

        System.out.println("Health is now:: " + this.healthPercentage);
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }
}
