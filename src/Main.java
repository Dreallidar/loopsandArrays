import java.sql.SQLOutput;
import java.util.regex.Pattern;

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

        String initials = name.charAt(0) + "" + surname.charAt(0);
        System.out.println(initials);

        System.out.println("Task 4");
        String galas1 = "";
        String galas2 = "";

        if (act1.length() <= 3) {
            System.out.println(act1);
            galas1 = act1;
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
        System.out.println(" Galutinis atsakymas " + galas);

        System.out.println(" Task 5");

        String pie = "An American in Paris";
        System.out.println(pie.replace("a", "*").replace("A", "*"));
        System.out.println("Task 6");

        String tiffany = "Breakfast at Tiffany's";
        String space = "2001: A Space Odyssey";
        String life = "It's a Wonderful Life";

        String newpie = pie.replaceAll("[aeiouAEIOU]", "");
        System.out.println(newpie);
        String tiffany2 = tiffany.replaceAll("[aeiouAEIOU]", "");
        String space2 = space.replaceAll("[aeiouAEIOU]", "");
        String life2 = life.replaceAll("[aeiouAEIOU]", "");
        System.out.println(life2);
        System.out.println(tiffany2);
        System.out.println(space2);
        System.out.println("End of task 6");

        System.out.println( "Most likely a shitty attempt at task 7");

        String episode = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(episode);
        System.out.println(episode.charAt(episode.length()-14));
        System.out.println( "7tos galas");


        System.out.println("Ciklu tema");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            System.out.println( "end of loops and arrays, bye bye.");


        }



    }
}