public class MountainTroll extends Troll implements HandCombat {
    public MountainTroll(String name, String specialization) {
        super(name, specialization);
    }

    private final String specAndName = getSpecialization() + " " + getName();

    @Override
    public void bludgeonStrike() {
        System.out.println(specAndName + " делает взмах дубиной");
    }

    @Override
    public void stepsBack() {
        System.out.println(specAndName + " пятится назад");
    }

    @Override
    public void run() {
        System.out.println(specAndName + " медленно подходит");
    }

}
