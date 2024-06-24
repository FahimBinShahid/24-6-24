public class EnhancedPlayer {
    private String fullname;
    private int healthPercentage;
    private String weapom;

    public EnhancedPlayer(String fullname, int health, String weapon){
        this.fullname = fullname;
        if(health <=0) {
            this.healthPercentage = 1;
        }else if (health > 100){
            this.healthPercentage =100;
        }
        this.weapom = weapon;
    }
    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage < -0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemainig() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
