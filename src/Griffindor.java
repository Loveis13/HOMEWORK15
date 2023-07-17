public class Griffindor extends Hogwards{
    private  int nobility; /// Благородство
    private int honor; /// Честь
    private int bravery; /// Храбрость

    public Griffindor(String name, String surname, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" + super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery ;
    }
    public void compareTo(Griffindor other){
        int countThis = this.nobility + this.honor + this.bravery;
        int countOther = other.nobility + other.honor + this.bravery;
        if (countThis > countOther){
            prentComparablesStudent(this, other);
        }else if (countThis < countOther){
            prentComparablesStudent(other,this);
        }else {
            System.out.println(" Студенты одинаково сильны");
        }
    }
    private void prentComparablesStudent(Griffindor bestStudent , Griffindor loseStudent){
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " Лучший грифиндорец чем "
                + loseStudent.getName() + " " +  loseStudent.getSurname());


    }
}

