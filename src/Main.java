import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");

        System.out.println("__________");
        int[] apartments = new int[3];
        int[] specificApartments = {1, 2, 3};
        apartments[0] = 1;
        apartments[1] = 2;
        apartments[2] = 3;
        System.out.println(apartments[0]);
        System.out.println(apartments[1]);
        System.out.println(apartments[2]);
        System.out.println("__________");

        float[] percents = new float[3];
        float[] specificPercents = {1.57F, 7.654F, 9.986F};
        percents[0] = 1.57F;
        percents[1] = 7.654F;
        percents[2] = 9.986F;
        System.out.println(percents[0]);
        System.out.println(percents[1]);
        System.out.println(percents[2]);
        System.out.println("__________");

        int[] movies = new int[3];
        int[] specificMovies = {12, 28, 31};
        movies[0] = 12;
        movies[1] = 28;
        movies[2] = 31;
        System.out.println(movies[0]);
        System.out.println(movies[1]);
        System.out.println(movies[2]);
        System.out.println("__________");

        System.out.println("ЗАДАЧА 2");

        System.out.print(apartments[0] + ", " + apartments[1] + ", " + apartments[2]);
        System.out.println();
        System.out.print(percents[0] + ", " + percents[1] + ", " + percents[2]);
        System.out.println();
        System.out.print(movies[0] + ", " + movies[1] + ", " + movies[2]);
        System.out.println();
        System.out.println("__________");

        System.out.println("ЗАДАЧА 3");
        System.out.print(apartments[2] + ", " + apartments[1] + ", " + apartments[0]);
        System.out.println();
        System.out.print(percents[2] + ", " + percents[1] + ", " + percents[0]);
        System.out.println();
        System.out.print(movies[2] + ", " + movies[1] + ", " + movies[0]);
        System.out.println();
        System.out.println("__________");

        System.out.println("ЗАДАЧА 4");

        int[] newApartments = new int[3];
        newApartments[0] = 1;
        newApartments[1] = 2;
        newApartments[2] = 3;

        for (int a = 0; a < newApartments.length; a++) {
            if (newApartments[a] % 2 == 0) {
                System.out.print(newApartments[a] + ", ");
            } else {
                newApartments[a] = newApartments[a] + 1;
                System.out.print(newApartments[a] + ", ");


            }
        }
    }
}