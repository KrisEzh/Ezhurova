package com.company;

public class Main {

            public static void main(String[] args) {
                byte box = 5;
                short k = 100;
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
                int bananaWeight = 80;
                int allBananaWeight = banana * bananaWeight;


                int milk = 100;
                int milkWeight = 105;
                int allMilk = 200;
                int allMilkWeight = allMilk / milk * milkWeight;


                int ice = 2;
                int iceWeight = 100;
                int allIceWeight = ice * iceWeight;


                int egg = 4;
                int weight1 = 70;
                int eggWeight = egg * weight1;


                int totalWeight = allBananaWeight + allMilkWeight + allIceWeight + eggWeight;
                System.out.println(totalWeight + "граммов");

                float kg = totalWeight / 1000f;
                System.out.println(kg + "килограммов");

                //homeTask4

                int weightLossInKg = 7;
                int weightLossInGr = weightLossInKg * 1000;
                int wlDayMin = 250;
                int daysMax = weightLossInGr / wlDayMin;
                System.out.println(daysMax + "дней уйдет, если терять в день по 250 грамм");
                int wlDayMax = 500;
                int daysMin = weightLossInGr / wlDayMax;
                System.out.println(daysMin + "дней уйдет, если терять в день по 500 грамм");
                int daysMiddle = (daysMin + daysMax) / 2;
                System.out.println(daysMiddle + "дней потребуется в среднем");


                // homeTask5

                float percent = 10f;
                float mashaSalary = 67760f;
                float mashaPercent = mashaSalary / 100 * percent;
                float mashaSalaryNew = mashaSalary + mashaPercent;
                float diff = mashaSalaryNew - mashaSalary;
                float mashaAnnualEarning = diff * 12;
                System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей");
                System.out.println("Годовой доход вырос на " + mashaAnnualEarning + " рублей");

                float denisSalary = 83690f;
                float denisPercent = denisSalary / 100 * percent;
                float denisSalaryNew = denisSalary + denisPercent;
                float denisDifference = denisSalaryNew - denisSalary;
                float denisAnnualEarning = denisDifference * 12;
                System.out.println("Денис теперь получает " + denisSalaryNew + " рублей");
                System.out.println("Годовой доход вырос на " + denisAnnualEarning + " рублей");

                float kristinaSalary = 76230f;
                float kristinaPercent = kristinaSalary / 100 * percent;
                float kristinaSalaryNew = kristinaSalary + kristinaPercent;
                float kristinaDifference = kristinaSalaryNew - kristinaSalary;
                float kristinaAnnualEarning = kristinaDifference * 12;
                System.out.println("Кристина теперь получает " + kristinaSalaryNew + " рублей");
                System.out.println("Годовой доход вырос на " + kristinaAnnualEarning + " рублей");



                // homeTask6

                int a = 12;
                int b = 27;
                int c = 44;
                int d = 15;
                int e = 9;
                int result = a * (b + (c - d * e));
                System.out.println(result);
                int resultOpposite = - result;
                System.out.println(resultOpposite);


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

