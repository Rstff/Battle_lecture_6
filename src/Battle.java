public class Battle {
    public static void start() {
        Wizard wizardHarry = new Wizard("Гарри Поттер", "гриффиндорец");
        Wizard wizardRon = new Wizard("Рон Уизли", "гриффиндорец");
        MountainTroll mountainTroll = new MountainTroll("Громила", "большой тролль");

        mountainTroll.run();
        mountainTroll.bludgeonStrike();
        wizardHarry.bendOver();
        wizardHarry.run();
        wizardRon.usedSpell();
        mountainTroll.stepsBack();
        wizardRon.swingWand();
        mountainTroll.death();
        wizardRon.winBattle();
        wizardRon.endBattle();
    }
}
