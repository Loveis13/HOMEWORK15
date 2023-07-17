public  abstract class Hogwards {
    private String name;
    private String surname;

    private  int magic;

    private int transgression;

    public Hogwards(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression; /// нарушение

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression ;


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void compareTo(Hogwards other) {
        int countThis = this.magic + this.transgression ;
        int countOther = other.magic + other.transgression;
        if (countThis > countOther) {
            prentComparablesStudent(this, other);
        } else if (countThis < countOther) {
            prentComparablesStudent(other, this);
        } else {
            System.out.println(" Студенты одинаково сильны ");
        }
    }

    private void prentComparablesStudent(Hogwards bestStudent, Hogwards loseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Сильнее маг "
                + loseStudent.getName() + " " + loseStudent.getSurname());


    }
}
