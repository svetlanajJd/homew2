public class Main {
    public static void main(String[] args) {
        System.out.println("привет");


        float boxerFirstWeight = 78.2f;
        float boxerSecondWeight = 82.7f;
        float totalWeight = boxerFirstWeight + boxerSecondWeight;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг");
        float difference = totalWeight % boxerFirstWeight;
        System.out.println("Разница в весе составляет " + difference + " кг");

        byte bananasThings = 5;
        byte bananasThingsWeight = 80;
        int bananasWeightTotal = bananasThingsWeight * bananasThings;
        int g = 200;
        int h = 100;
        int m = g / h;
        int l = 105;
        int milkWeightTotal = m * l;
        byte iceCreamThings = 2;
        byte iceCreamThingsWeight = 100;
        int iceCreamWeightTotal = iceCreamThings * iceCreamThingsWeight;
        byte eggsThings = 4;
        byte eggsThingsWeight = 80;
        int eggsWeightTotal = eggsThings * eggsThingsWeight;
        float totalWeightProducts = bananasWeightTotal + milkWeightTotal + iceCreamWeightTotal + eggsWeightTotal;
        int p = 1000;
        float weightProducts = totalWeightProducts / p;
        System.out.println("Общий вес продуктов " + weightProducts + " кг");

        byte weightAthlete = 7;
        int a = 1000;
        int weightAthleteTranslated = weightAthlete * a;
        int b = 250;
        int c = 500;
        int daysDietFirst = weightAthleteTranslated / b;
        System.out.println("Если терять по 250грамм в день, то потребуется " + daysDietFirst + " дней");
        int daysDietNext = weightAthleteTranslated / c;
        System.out.println("Если терять по 500грамм в день, то потребуется " + daysDietNext + " дней");
        int d = 2;
        int e = b / d;
        float meanWeight = b + e;
        float meanDays = weightAthleteTranslated / meanWeight;
        System.out.println("В среднем для сброса веса может потребоваться " + meanDays + " дней");

        int currentSalaryMasha=67760;
        int currentSalaryDenis=83690;
        int currentSalaryKristina=76230;
        byte month=12;
        byte percent=10;
        int additionMasha=currentSalaryMasha/percent;
        int additionDenis=currentSalaryDenis/percent;
        int additionKristina=currentSalaryKristina/percent;
        int additionSalaryMasha =currentSalaryMasha+additionMasha;
        System.out.println("Маша теперь получает "+additionSalaryMasha+" рублей в месяц");
        int differenceMasha=additionMasha*month;
        System.out.println("Годовой доход Маши вырос на "+differenceMasha+" рублей");
        int additionSalaryDenis=currentSalaryDenis+additionDenis;
        System.out.println("Денис теперь получает "+additionSalaryDenis+" рублей");
        int differenceDenis=additionDenis*month;
        System.out.println("Годовой дход Дениса вырос на "+differenceDenis+" рублей");



    }
}