import java.util.Random; //It's used for calculating the pistol's shooting probability

public class Game {

    //An inner class is created for saving each player's information
    public static class Player {
        boolean isTerrorist;
        String name;
        int currentMoney = 1000;
        int currentHealth = 100;
        int currentMagazine = 20;
        int DAMAGE = 20;
        int HEALTH = 100;
        final int MAX_BULLET = 20;
        final int COST_PER_BULLET = 5;
        final int COST_FOR_CURE = 500;

        public Player(boolean isTerrorist, String name) {
            this.isTerrorist = isTerrorist;
            this.name = name;
        }
    }

    //It's a method for calculating pistol's shooting probability
    public static boolean probability() {
        Random random = new Random();
        int ratio = random.nextInt(9);
        return ratio != 0 && ratio != 1 && ratio != 2;

    }

    //It's a method that gives some outputs according to the result of the question 'Is the target terrorist or not?'
    public static void canShoot(Player shooter, Player target) {
        if (target.isTerrorist) {
            if (target.currentHealth != 0) {
                if (shooter.currentMagazine != 0) {
                    boolean fire = probability();
                    if (fire) {
                        System.out.println("Success! Pinpoint accuracy!");
                        shooter.currentMagazine -= 1; //the bullet numbers decrease by one if the shot is successful
                        target.currentHealth -= target.DAMAGE; //the target's health decrease by twenty in every successful shot
                        System.out.println("Info: There are " + shooter.currentMagazine + " bullet(s) left in " + shooter.name + "'s magazine");
                        System.out.println("Info: " + target.name + "'s health level is decreased to " + target.currentHealth);
                    } else {
                        System.out.println("Failed! Pistol misfired!");
                    }
                } else {
                    System.out.println("Failed! No bullet left in magazine!");
                }
            } else {
                System.out.println("Failed! The enemy is already dead!");
            }
        } else {
            System.out.println("Failed! Target player is on the same side!");
        }
    }

    //It's a method that outputs whether the player can load his/her magazine
    public static void loadMagazine(Player player) {
        if (player.currentMoney <= 500 && player.currentMoney >= 0) { //if the player's money is not enough, (s)he cannot load his/her magazine
            System.out.println("Failed! " + player.name + " cannot afford it now!");
        } else {
            System.out.println("Success! The real war begins now!");
            System.out.println("Info: " + player.name + " has now " + player.MAX_BULLET + " bullets in the magazine!");    //if the money is enough, the magazine will be full(20) and
            player.currentMoney -= (player.MAX_BULLET - player.currentMagazine) * player.COST_PER_BULLET;                  //his/her money will be decreased by $5 per bullet
            System.out.println("Info: " + player.name + " has now " + player.currentMoney);
        }
    }

    //It's a method that outputs whether the player can get cured
    public static void cure(Player player) {
        if (player.currentMoney >= 500 && player.currentMoney <= 1000) {
            player.currentHealth = player.HEALTH;          //if the player's money is enough, his/her health will be full(100) and
            player.currentMoney -= player.COST_FOR_CURE;   //his/her money will be decreased by $500
            System.out.println("Success! " + player.name + " is now as fit as s(he) has never been before!");
            System.out.println("Info: " + player.name + "'s health level is now " + player.currentHealth);
            System.out.println("Info: " + player.name + " has now " + player.currentMoney + " dollars!");
        } else {
            System.out.println("Failed! " + player.name + " cannot afford it now!"); //if the player's money is not enough, (s)he cannot get any cure
        }

    }

    //It's a method that outputs the lender's and the borrower's current money after loaning if the borrower is not a terrorist
    public static void loanMoney(Player lender, Player borrower, int amountOfDebt) {
        if (borrower.isTerrorist)
            System.out.println("Failed! Come on! Too young to be a spy!");
        else {
            if(amountOfDebt > lender.currentMoney)
                System.out.println("Failed! " + lender.name + " cannot afford it now!");
            else {
                System.out.println("Success! " + lender.name + " is a perfect philanthropist!");
                lender.currentMoney -= amountOfDebt;
                borrower.currentMoney += amountOfDebt;
                System.out.println("Info: " + lender.name + " has now " + lender.currentMoney + " dollars!");
                System.out.println("Info: " + borrower.name + " has now " + borrower.currentMoney + " dollars!");
            }
        }
    }

    public static void main(String[] args) {
        Player kayla = new Player(false, "Kayla");
        Player katie = new Player(false, "Katie");
        Player joseph = new Player(true, "Joseph");

        //this is a possible scenario and its possible outputs
        System.out.println("Operation #1: Kayla shoots at Katie");
        Game.canShoot(kayla, katie);

        System.out.println("-------------------------------------");

        System.out.println("Operation #2: Kayla shoots at Joseph");
        canShoot(kayla, joseph);

        System.out.println("-------------------------------------");

        System.out.println("Operation #3: Kayla shoots at Joseph");
        canShoot(kayla, joseph);

        System.out.println("-------------------------------------");

        System.out.println("Operation #4: Kayla shoots at Joseph");
        canShoot(kayla, joseph);

        System.out.println("-------------------------------------");

        System.out.println("Operation #5: Kayla shoots at Joseph");
        canShoot(kayla, joseph);

        System.out.println("-------------------------------------");

        System.out.println("Operation #6: Kayla shoots at Joseph");
        canShoot(kayla, joseph);

        System.out.println("-------------------------------------");

        System.out.println("Operation #7: Kayla shoots at Joseph");
        canShoot(kayla, joseph);

        System.out.println("-------------------------------------");

        System.out.println("Operation #8: Kayla shoots at Joseph");
        canShoot(kayla, joseph);

        System.out.println("-------------------------------------");

        System.out.println("Operation #9: Joseph takes cure");
        cure(joseph);

        System.out.println("-------------------------------------");

        System.out.println("Operation #10: Kayla loads magazine");
        loadMagazine(kayla);

        System.out.println("-------------------------------------");

        System.out.println("Operation #11 Kayla loans money to Joseph");
        loanMoney(kayla, joseph, 100);

        System.out.println("-------------------------------------");

        System.out.println("Operation #12: Kayla loans money to Katie");
        loanMoney(kayla, katie, 100);
    }
}