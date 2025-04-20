package Q2;

public class Main {
    public static void main(String[] args) {

        HauntedHouse DragonBallZ = new HauntedHouse("DragonBallZ");
        HauntedHouse AttackOnTitan = new HauntedHouse("AttackOnTitan");


        DragonBallZ.addGhost(new ShadowGhost("Goku", 10));
        DragonBallZ.addGhost(new Poltergeist("Vegeta", 9));
        DragonBallZ.addGhost(new Banshee("Frieza", 9));
        DragonBallZ.addGhost(new ShadowGhost("Beerus", 11));


        AttackOnTitan.addGhost(new Poltergeist("Eren", 8));
        AttackOnTitan.addGhost(new Banshee("Armin", 4));
        AttackOnTitan.addGhost(new ShadowGhost("Levi", 10));


        Visitor[] visitors = {
                new Visitor("Xaryab", 9),
                new Visitor("Arham", 5),
                new Visitor("Rafay", 2)
        };

        System.out.println("HAUNTED HOUSE SIMULATION");
        System.out.println();


        Ghost testGhost = new ShadowGhost("Test_Ghost", 5);
        testGhost.displayGhostInfo();
        testGhost.ghostHaunts();
        System.out.println();


        testGhost.upgradeGhost("Enhanced_Ghost", 3);
        testGhost.displayGhostInfo();
        testGhost.ghostHaunts();
        System.out.println();


        for (ShadowGhost ghost : DragonBallZ.shadowGhost) {
            ghost.displayGhostInfo();
        }
        for (Poltergeist ghost : DragonBallZ.poltergeist) {
            ghost.displayGhostInfo();
        }
        for (Banshee ghost : DragonBallZ.banshee) {
            ghost.displayGhostInfo();
        }
        System.out.println();

        System.out.println("Haunting in progress...");
        for (ShadowGhost ghost : AttackOnTitan.shadowGhost) {
            ghost.ghostHaunts();
        }
        for (Poltergeist ghost : AttackOnTitan.poltergeist) {
            ghost.ghostHaunts();
        }
        for (Banshee ghost : AttackOnTitan.banshee) {
            ghost.ghostHaunts();
        }
    }
}