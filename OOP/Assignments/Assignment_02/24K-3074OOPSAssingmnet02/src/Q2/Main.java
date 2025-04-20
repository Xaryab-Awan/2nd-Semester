package Q2;

public class Main {
    public static void main(String[] args) {

        HauntedHouse demonSlayer = new HauntedHouse("Demon Slayer");
        HauntedHouse soloLeveling = new HauntedHouse("Solo Leveling");


        demonSlayer.addGhost(new ShadowGhost("Muzan", 8));
        demonSlayer.addGhost(new Poltergeist("Sakura", 5));
        demonSlayer.addGhost(new Banshee("Bertholdt", 9));
        demonSlayer.addGhost(new ShadowGhost("Lurker", 6));


        soloLeveling.addGhost(new Poltergeist("Dragon Monarch", 7));
        soloLeveling.addGhost(new Banshee("Shadow Monarch", 9));
        soloLeveling.addGhost(new ShadowGhost("Kim Young Un", 10));


        Visitor[] visitors = {
                new Visitor("Saad", 9),
                new Visitor("Arham", 5),
                new Visitor("Ali", 2)
        };

        System.out.println("=== HAUNTED HOUSE SIMULATION ===");
        System.out.println();


        Ghost testGhost = new ShadowGhost("Test Ghost", 5);
        testGhost.displayGhostInfo();
        testGhost.ghostHaunts();
        System.out.println();


        testGhost.upgradeGhost("Enhanced Ghost", 3);
        testGhost.displayGhostInfo();
        testGhost.ghostHaunts();
        System.out.println();


        for (ShadowGhost ghost : demonSlayer.shadowGhost) {
            ghost.displayGhostInfo();
        }
        for (Poltergeist ghost : demonSlayer.poltergeist) {
            ghost.displayGhostInfo();
        }
        for (Banshee ghost : demonSlayer.banshee) {
            ghost.displayGhostInfo();
        }
        System.out.println();

        System.out.println("Haunting in progress...");
        for (ShadowGhost ghost : soloLeveling.shadowGhost) {
            ghost.ghostHaunts();
        }
        for (Poltergeist ghost : soloLeveling.poltergeist) {
            ghost.ghostHaunts();
        }
        for (Banshee ghost : soloLeveling.banshee) {
            ghost.ghostHaunts();
        }
    }
}