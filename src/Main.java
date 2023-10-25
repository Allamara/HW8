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

for (int i = 0; i < apartments.length; i++) {
            if (i == apartments.length - 1)
                System.out.println(apartments[i]);
            break;
        }
        System.out.print(apartments[i] + ", ");

for (int i = 0; i < percents.length; i++) {
            if (i == percents.length - 1)
                System.out.println(percents[i]);
    break;
            }
        System.out.print(apartments[i] + ", ");

for (int i = 0; i < movies.length; i++) {
             if (i == movies.length - 1)
                 System.out.println(movies[i]);
    break;
             }
        System.out.print(movies[i] + ", ");
                 System.out.println("__________");

System.out.println("ЗАДАЧА 3");

                for (int i = apartments.length - 1; i >= 0; i--) {
                     if (i == 0) {
                            System.out.println(apartments[i]);
                            break;
                        }
                        System.out.print(apartments[i] + ", ");
                    }
                for (int i = percents.length - 1; i >= 0; i--) {
                     if (i == 0) {
                            System.out.println(percents[i]);
                            break;
                        }
                        System.out.print(percents[i] + ", ");
                    }
                for (int i = movies.length - 1; i >= 0; i--) {
                        if (i == 0) {
                            System.out.println(movies[i]);
                            break;
                        }
                        System.out.print(movies[i] + ", ");
                    }

                    System.out.println("__________");

System.out.println("ЗАДАЧА 4");

                    int[] newApartments = new int[3];
                    newApartments[0] = 1;
                    newApartments[1] = 2;
                    newApartments[2] = 3;

                    for (int a = 0; a < newApartments.length; a++) {
                        if (newApartments[a] % 2 == 0) {
                        } else {
                            newApartments[a] = newApartments[a] + 1;
                            System.out.print(newApartments[a] + ", ");


                        }
                    }
                }
            }



