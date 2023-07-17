public class Slytherin extends Hogwards {
    private int cunning;///хитрость
    private int determination; ///решительность
    private int ambition;/// амбиционность

    private int inventiveness; /// находчивость
    private int powerLust; /// жажда власти

    public Slytherin(String name, String surname, int magic, int transgression, int cunning, int determination,
                     int ambition, int inventiveness, int powerLust) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return "Slytherin{" + super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", inventiveness=" + inventiveness +
                ", powerLust=" + powerLust ;
    }
    public void compareTo(Slytherin other) {
        int countThis = this.cunning + this.determination + this.ambition + this.inventiveness + this.powerLust;
        int countOther = other.cunning + other.determination + other.ambition + other.inventiveness+ other.powerLust;
        if (countThis > countOther) {
            prentComparablesStudent(this, other);
        } else if (countThis < countOther) {
            prentComparablesStudent(other, this);
        } else {
            System.out.println(" Студенты одинаково сильны");
        }
    }

    private void prentComparablesStudent(Slytherin bestStudent, Slytherin loseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Лучший Слезериниц чем "
                + loseStudent.getName() + " " + loseStudent.getSurname());


    }
}
