public class Kogtevran extends Hogwards {
    private int smart;/// показатель ума
    private int wisdom; /// мудрость

    private int wit; /// остроумие
    private int creation; /// творчество

    public Kogtevran(String name, String surname, int magic, int transgression, int smart, int wisdom,
                     int wit, int creation) {
        super(name, surname, magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;

    }

    @Override
    public String toString() {
        return "Kogtevran{" + super.toString() +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation;
    }

    public void compareTo(Kogtevran other) {
        int countThis = this.smart + this.wisdom + this.wit + this.creation;
        int countOther = other.smart + other.wisdom + other.wit + other.creation;
        if (countThis > countOther) {
            prentComparablesStudent(this, other);
        } else if (countThis < countOther) {
            prentComparablesStudent(other, this);
        } else {
            System.out.println(" Студенты одинаково сильны ");
        }
    }

    private void prentComparablesStudent(Kogtevran bestStudent, Kogtevran loseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Лучший Ковтевранец чем "
                + loseStudent.getName() + " " + loseStudent.getSurname());


    }
}
