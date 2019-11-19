public class Main {

    public static void main(String [] args){
//
//        Player player = new Player();
//        player.fullName = "Emilio";
//        player.health= 20;
//        player.weapon = "Gun";
////        System.out.println(player.name);
//
//        int damage = 10;
//         player.loseHealth(damage);
//        System.out.println("Remaining health : " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health : " + player.healthRemaining());

        EnhancedPlayer player = new  EnhancedPlayer("Emilio", 500, "Sword");
        System.out.println("Initial heath is: " + player.getHealth());

    }
}
