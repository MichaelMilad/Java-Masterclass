public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player has died !");
            return;
        }

        System.out.println("Health is now:: " + this.health);
    }

    public void restoreHealth(int extraHealth) {
        this.health = Math.min(extraHealth + this.health, 100);

        System.out.println("Health is now:: " + this.health);
    }

    public int healthRemaining() {
        return this.health;
    }
}
