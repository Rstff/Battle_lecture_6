public class Wizard extends Human implements Magic, Win, TheEnd {

    public Wizard(String name, String specialization) {

        super(name, specialization);
    }

    private final String specAndName = getSpecialization() + " " + getName();

    @Override
    public final void usedSpell() {
        System.out.println(specAndName + " использует магическое заклинание");
    }

    @Override
    public final void bendOver() {
        System.out.println(specAndName + " ныряет под дубину и уворачивается");
    }

    @Override
    public final void swingWand() {
        System.out.println(specAndName + "" + " делает взмах волшебной палочкой");
    }

    @Override
    public final void run() {
        System.out.println(specAndName + " запрыгивает на тролля верхом");
    }

    @Override
    public final void winBattle() {
        System.out.println("Тролль повержен! + 50 очков Гриффиндору!");
    }
}
