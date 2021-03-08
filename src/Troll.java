public abstract class Troll {
    private final String name;
    private final String specialization;

    public Troll(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public abstract void run();

    public void death() {
        System.out.println(specialization + " " + name + " теряет сознание и падает");
    }
}
