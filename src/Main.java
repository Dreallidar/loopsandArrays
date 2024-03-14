import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        String name = "Henry";
        String surname = "Cavill";
        if (name.length() < surname.length()) {
            System.out.println(name);
        } else {
            System.out.println(surname);
        }
        System.out.println("Task 2");
        String act1 = "Keanu";
        String act2 = "Reeves";
        System.out.println(act1.toUpperCase() + " " + act2.toLowerCase());
        System.out.println(" Task 3");

        String initials = name.charAt(0) + " " + surname.charAt(0);
        System.out.println(initials);

        System.out.println("Task 4");
        String galas1 = "";
        String galas2 = "";

        if (act1.length() <= 3){
            System.out.println(act1);
            galas1=act1;
        }

        if (act2.length() <= 3) {
            System.out.println(act2);
            galas2 = act2;
        }
        if (act1.length() > 3) {
            System.out.println(act1.substring(act1.length() - 3));
            galas1 = act1.substring(act1.length() - 3);

        }
        if (act2.length() > 3) {
            System.out.println(act2.substring(act2.length() - 3));
            galas2 = act2.substring(act2.length() - 3);

        }
        String galas = galas1 + galas2;
        System.out.println( galas);

        System.out.println(" Task 5");

        String pie = "An American in Paris";
        System.out.println(pie.replace("a","*").replace("A","*"));


    }
}