//import java.util.Arrays;
//
//public class SivasMaratonu {
//
//    public static void main(String[] args) {
//        String[] names = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pinar", "Mehmet", "Ali", "Emel", "Firat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
//        int[] times = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
//
//        // First three runners
//        printTopThree(names, times);
//
//        // Classify runners
//        classifyRunners(times);
//    }
//
//    public static void printTopThree(String[] names, int[] times) {
//        int[] sortedTimes = Arrays.copyOf(times, times.length);
//        Arrays.sort(sortedTimes);
//
//        System.out.println("Birinci: " + names[getIndex(times, sortedTimes[0])] + " " + sortedTimes[0] + "'");
//        System.out.println("İkinci: " + names[getIndex(times, sortedTimes[1])] + " " + sortedTimes[1] + "'");
//        System.out.println("Üçüncü: " + names[getIndex(times, sortedTimes[2])] + " " + sortedTimes[2] + "'");
//    }
//
//    public static int getIndex(int[] array, int value) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void classifyRunners(int[] times) {
//        int classA = 0, classB = 0, classC = 0;
//        for (int time : times) {
//            if (time >= 200 && time < 300) {
//                classA++;
//            } else if (time >= 300 && time < 400) {
//                classB++;
//            } else if (time >= 400) {
//                classC++;
//            }
//        }
//        System.out.println("A -> " + classA);
//        System.out.println("B -> " + classB);
//        System.out.println("C -> " + classC);
//    }
//}

//import java.util.*;
//
//class Runner {
//    String name;
//    int time;
//
//    public Runner(String name, int time) {
//        this.name = name;
//        this.time = time;
//    }
//}
//
//public class SivasMaratonu {
//    public static void main(String[] args) {
//        Runner[] runners = {
//                new Runner("Kadir", 341),
//                new Runner("Gökhan", 273),
//                new Runner("Hakan", 278),
//                new Runner("Suzan", 329),
//                new Runner("Pinar", 445),
//                new Runner("Mehmet", 402),
//                new Runner("Ali", 388),
//                new Runner("Emel", 270),
//                new Runner("Firat", 243),
//                new Runner("James", 334),
//                new Runner("Jale", 412),
//                new Runner("Ersin", 393),
//                new Runner("Deniz", 299),
//                new Runner("Gözde", 343),
//                new Runner("Anıl", 317),
//                new Runner("Burak", 265)
//        };
//
//        // İlk üç dereceyi alanları bulma
//        findTopThreeRunners(runners);
//
//        // A, B ve C sınıflarını bulma
//        classifyRunners(runners);
//    }
//
//    public static void findTopThreeRunners(Runner[] runners) {
//        Arrays.sort(runners, Comparator.comparingInt(r -> r.time));
//        System.out.println("Birinci: " + runners[0].name + " " + runners[0].time + "'");
//        System.out.println("İkinci: " + runners[1].name + " " + runners[1].time + "'");
//        System.out.println("Üçüncü: " + runners[2].name + " " + runners[2].time + "'");
//    }
//
//    public static void classifyRunners(Runner[] runners) {
//        int classA = 0, classB = 0, classC = 0;
//        for (Runner runner : runners) {
//            if (runner.time >= 200 && runner.time <= 299) {
//                classA++;
//            } else if (runner.time >= 300 && runner.time <= 399) {
//                classB++;
//            } else {
//                classC++;
//            }
//        }
//        System.out.println("A -> " + classA);
//        System.out.println("B -> " + classB);
//        System.out.println("C -> " + classC);
//    }
//}

class Kossar {
    String name;
    int time;

    public Kossar(String name, int time) {
        this.name = name;
        this.time = time;
    }
}

public class Tournament {
    public static void main(String[] args) {
        Kossar[] kossars = {
                new Kossar("Kadir", 341),
                new Kossar("Gökhan", 273),
                new Kossar("Hakan", 278),
                new Kossar("Suzan", 329),
                new Kossar("Pinar", 445),
                new Kossar("Mehmet", 402),
                new Kossar("Ali", 388),
                new Kossar("Emel", 270),
                new Kossar("Firat", 243),
                new Kossar("James", 334),
                new Kossar("Jale", 412),
                new Kossar("Ersin", 393),
                new Kossar("Deniz", 299),
                new Kossar("Gözde", 343),
                new Kossar("Anıl", 317),
                new Kossar("Burak", 265)
        };


        uciyiKossars(kossars);


        Kossarclass(kossars);
    }

    public static void uciyiKossars(Kossar[] kossars) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < kossars.length - i - 1; j++) {
                if (kossars[j].time > kossars[j + 1].time) {

                    Kossar temp = kossars[j];
                    kossars[j] = kossars[j + 1];
                    kossars[j + 1] = temp;
                }
            }
        }

        System.out.println("Birinci: " + kossars[0].name + " " + kossars[0].time + "'");
        System.out.println("İkinci: " + kossars[1].name + " " + kossars[1].time + "'");
        System.out.println("Üçüncü: " + kossars[2].name + " " + kossars[2].time + "'");
    }

    public static void Kossarclass(Kossar[] kossars) {
        int classA = 0, classB = 0, classC = 0;
        for (Kossar runner : kossars) {
            if (runner.time >= 200 && runner.time <= 299) {
                classA++;
            } else if (runner.time >= 300 && runner.time <= 399) {
                classB++;
            } else {                classC++;
            }
        }
        System.out.println("A -> " + classA);
        System.out.println("B -> " + classB);
        System.out.println("C -> " + classC);
    }
}
