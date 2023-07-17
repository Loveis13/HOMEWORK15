public class SortingHat {
    public static void main(String[] args) {
        Griffindor Harry = new Griffindor("harry", "potter", 50, 50,
                50, 50, 40);
        Griffindor Germiona = new Griffindor("Germiona ", "Grenger", 60, 60,
                70, 80, 40);
        Griffindor Ron = new Griffindor("Ron", "Weasley", 70, 50,
                40, 50, 55);


        Slytherin Drako = new Slytherin("Drako", "Malfloi", 40, 40,
                50, 90, 80, 90, 30);
        Slytherin Graham = new Slytherin(" Graham", "Montague", 40, 40,
                50, 27, 80, 90, 30);
        Slytherin Gregory = new Slytherin("Gregory", "Goyle", 40, 40,
                50, 45, 80, 90, 30);


        Hufflepuff Zacharias = new Hufflepuff("Zacharias", "Smith", 30, 50,
                40, 15, 45);
        Hufflepuff Cedric = new Hufflepuff("Cedric ", "Diggory", 90, 50,
                40, 25, 45);
        Hufflepuff Justin = new Hufflepuff("Justin", "Finch-Fletchley", 40, 70,
                40, 65, 45);


        Kogtevran Cho = new Kogtevran("Cho", "Chang", 44, 56, 72,
                89, 54, 66);
        Kogtevran Padma = new Kogtevran(" Padma", "Patil", 90, 25, 67,
                66, 34, 80);
        Kogtevran Marcus = new Kogtevran("Marcus ", "Belby", 40, 55, 77,
                81, 54, 66);

        System.out.println(Harry);
        System.out.println(Drako);
        System.out.println(Cedric);
        System.out.println(Cho);

        Harry.compareTo(Ron);
        Drako.compareTo(Graham);
        Justin.compareTo(Cedric);
        Cho.compareTo(Padma);
        Harry.compareTo(Marcus);



    }
}