public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name ="Tim";
//        player.health=20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemainig());
//
//        player.loseHealth(12);
//        System.out.println("Remaingi health =" + player.healthRemainig());

        EnhancedPlayer tim = new EnhancedPlayer("Tim",50,"Ak47");
        System.out.println("Initial health is " + tim.healthRemainig());
    }
}