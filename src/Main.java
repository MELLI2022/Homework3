public class Main {
    public static void main(String[] args) {
        {// Задача 1

            byte egg = 100;
            System.out.println("Значение переменной egg с типом byte = " + egg);
            short bread = 101;
            System.out.println("Значение переменной bread с типом short = " + bread);
            int bun = 98;
            System.out.println("Значение переменной bun с типом int = " + bun);
            long bagel = 120L;
            System.out.println("Значение переменной bagel с типом long = " + bagel);
            float meat = 2.5f;
            System.out.println("Значение переменной meat с типом float = " + meat);
            double fish = 3.687254;
            System.out.println("Значение переменной fish с типом double = " + fish);
        }
        {//Задача 2
            byte a = 67;
            System.out.println("a=" + a);
            short b = 27897;
            System.out.println(b);
            int c = -159;
            System.out.println(c);
            long d = 987678965549L;
            System.out.println(d);
            float e = 27.25f;
            System.out.println(e);
            double f = 2.786;
            System.out.println(f);
            char g = 569;
            System.out.println(g);
            boolean k = false;
            System.out.println(k);


        }
        // Задача 3
        byte studentTeacher1 = 23;
        int studentTeacher2 = 27;
        short studentTeacher3 = 30;
        int totalStudent = studentTeacher1 + studentTeacher2 + studentTeacher3;
        int totalSheetsPaper = 480;
        int sheetEach = totalSheetsPaper / totalStudent;
        System.out.println("На каждого ученика рассчитано " + sheetEach + " листов бумаги");


        {// Задача 4
            int t = 16;
            int r = 2;
            int perfomanceMinute = t / r;
            int y = 20;
            System.out.println("За время " + y + " минут машина произвела " + (perfomanceMinute * y) + " бутылок");
            int minutesDay = 24 * 60;
            System.out.println("За сутки машина произвела " + (perfomanceMinute * minutesDay) + " бутылок");
            int threeDay = minutesDay * 3;
            System.out.println("За трое суток машина произвела " + (perfomanceMinute * threeDay) + " бутылок");
            int mounth = minutesDay * 30;
            System.out.println("За месяц машина произвела " + (perfomanceMinute * mounth) + " бутылок");
        }
        {// Задача 5
            int allCiass = 120 / (2 + 4);
            int white = 2 * allCiass;
            int brown = 4 * allCiass;
            System.out.println("В школе, где " + allCiass + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
        }
        {// Задача 6
            double banan = 5 * 80;
            double milk = 2 * 105;
            double iceCream = 2 * 100;
            double egg = 4 * 70;
            double allGramm = banan + milk + iceCream + egg;
            System.out.println("Общий вес " + allGramm + " граммов");
            double kg = allGramm / 1000;
            System.out.println("Общий вес " + kg + " граммов");
        }
        {//Задача 7
            int allWeight = 7000;
            int everyDay1 = 250;
            int everyDay2 = 500;
            int dayLoseWeight250 = 7000 / 250;
            System.out.println("При рационе " + everyDay1 + " граммов в день , на похудение уйдёт " + dayLoseWeight250 + " дней");
            int dayLoseWeight500 = 7000 / 500;
            System.out.println("При рационе " + everyDay2 + " граммов в день , на похудение уйдёт " + dayLoseWeight500 + " дней");
            double m = 7000 / (750 / 2);
            System.out.println(m);
            {// Задача 8
                double masha1 = 67760;
                double masha2 = 67760 * 1.1;
                double denis1 = 83690;
                double denis2 = 83690 * 1.1;
                double xristina1 = 76230;
                double xristina2 = 76230 * 1.1;
                double diferens1 = masha2 - masha1;
                double diferens2 = denis2 - denis1;
                double diferens3 = xristina2 - xristina1;
                System.out.println("Маша теперь получает  " + masha2 + " рублей. Годовой доход вырос на " + diferens1 + "  рублей");
                System.out.println("Кристина теперь получает  " + xristina2 + " рублей. Годовой доход вырос на " + diferens2 + "  рублей");
                System.out.println("Денис теперь получает  " + denis2 + " рублей. Годовой доход вырос на " + diferens3 + "  рублей");


            }


        }
    }
}
































