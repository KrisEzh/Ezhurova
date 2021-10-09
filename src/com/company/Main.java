package com.company;

public class Main {

            public static void main(String[] args) {
                byte box = 5;
                short B = 100;
                int i = 7;
                long x = 922377L;
                float f = 45.78f;
                double p = 68.42;
                char s = 100;
                boolean g = true;


                // homeTask2

                float a1 = 78.2f;
                float b1 = 82.7f;
                float both = a1 + b1;
                System.out.println(both + "kg");
                float difference = b1 - a1;
                System.out.println(difference + "kg");


                //homeTask3

                int banana = 5;
                int gr1 = 80;
                int bweight = banana * gr1;


                int milk1 = 100;
                int grmilk1 = 105;
                int milk2 = 200;
                int milk2weight = milk2 / milk1 * grmilk1;


                int ice = 2;
                int iceweight = 100;
                int bothweight = ice * iceweight;


                int egg = 4;
                int weight1 = 70;
                int eggweight = egg * weight1;


                int all = bweight + milk2weight + bothweight + eggweight;
                System.out.println(all + "граммов");

                float gr = 1090f;
                float kg = gr / 1000f;
                System.out.println(kg + "килограммов");

                //homeTask4

                int weightlossinkg = 7;
                int weightlossingr = weightlossinkg * 1000;
                int wldaymin = 250;
                int daysmax = weightlossingr / wldaymin;
                System.out.println(daysmax + "дней уйдет, если терять в день по 250 грамм");
                int wldaymax = 500;
                int daysmin = weightlossingr / wldaymax;
                System.out.println(daysmin + "дней уйдет, если терять в день по 500 грамм");
                int daysmiddle = (daysmin + daysmax) / 2;
                System.out.println(daysmiddle + "дней потребуется в среднем");


                // homeTask5

                float percent = 10f;
                float mashasalary = 67760f;
                float mashapercent = mashasalary / 100 * percent;
                float mashasalarynew = mashasalary + mashapercent;
                float mashaoldannualearning = mashasalary * 12;
                float mashanewannualearning = mashasalarynew * 12;
                float diff = mashanewannualearning - mashaoldannualearning;
                System.out.println("Маша теперь получает " + mashasalarynew + " рублей");
                System.out.println("Годовой доход вырос на " + diff + " рублей");

                float denissalary = 83690f;
                float denispercent = denissalary / 100 * percent;
                float denissalarynew = denissalary + denispercent;
                float denisoldannualearning = denissalary * 12;
                float denisnewannualearning = denissalarynew * 12;
                float diff2 = denisnewannualearning - denisoldannualearning;
                System.out.println("Денис теперь получает " + denissalarynew + " рублей");
                System.out.println("Годовой доход вырос на " + diff2 + " рублей");

                float kristinasalary = 76230f;
                float kristinapercent = kristinasalary / 100 * percent;
                float kristinasalarynew = kristinasalary + kristinapercent;
                float kristinaoldannualearning = kristinasalary * 12;
                float kristinanewannualearning = kristinasalarynew * 12;
                float diff3 = kristinanewannualearning - kristinaoldannualearning;
                System.out.println("Кристина теперь получает " + kristinasalarynew + " рублей");
                System.out.println("Годовой доход вырос на " + diff3 + " рублей");



                // homeTask6

                int a = 12;
                int b = 27;
                int c = 44;
                int d = 15;
                int e = 9;
                int result = a * (b + (c - d * e));
                System.out.println(result);
                int resultopposite = -1 * (a * (b + (c - d * e)));
                System.out.println(resultopposite);


                //homeTask7

                int m = 5;
                int n = 7;
                m = m + n;
                n = m - n;
                m = m - n;
                System.out.println("m = " + m + ", n = " + n);


                //homeTask8

                int num = 256;
                int num2 = num / 10;
                num2 = num2 % 10;
                System.out.println(num2);



            }
        }

