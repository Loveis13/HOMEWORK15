public class Hufflepuff extends Hogwards{
    private  int hardWorking; /// трудолюбие
    private int loyalty;/// верность
    private int honesty; /// честность

    public Hufflepuff(String name, String surname, int magic, int transgression, int hardWorking, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() +
                "hardWorking=" + hardWorking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
    public void compareTo(Hufflepuff other) {
        int countThis = this.hardWorking + this.loyalty + this.honesty ;
        int countOther = other.hardWorking + other.loyalty + other.honesty;
        if (countThis > countOther) {
            prentComparablesStudent(this, other);
        } else if (countThis < countOther) {
            prentComparablesStudent(other, this);
        } else {
            System.out.println(" Студенты одинаково сильны");
        }
    }

    private void prentComparablesStudent(Hufflepuff bestStudent, Hufflepuff loseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " учший пуфендуец чем "
                + loseStudent.getName() + " " + loseStudent.getSurname());


    }
}
