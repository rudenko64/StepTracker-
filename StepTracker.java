import java.util.Scanner;
 class StepTracker {
    Scanner scanner;
    MonthData[] monthToData;
    MonthData monthData = new MonthData();
    int targetStep;
    public StepTracker(Scanner scan) {
        scanner = scan;
        monthToData = new MonthData[12];
        for (int i = 0; i < 12 ; i++) {
            monthToData[i] = new MonthData();
        }
        targetStep = 10000;
    }
     void addNewNumberStepsPerDay(){
        System.out.println("Введите номер месяца");
        int Month = scanner.nextInt();
        Month = MonthData[] - 1 ;
        System.out.println("Введите день от 1 до 30 (включительно)");
        int days = scanner.nextInt();
        days = days -1 ;
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();


        MonthData monthData = new MonthData();
        monthData.days[] = days - 1;
    }
    void printStatistic() {
        System.out.println("Введите число месяца");
        printMonth();

        OldMonthData monthData =
        long sumSteps =

        System.out.println();
    }
}
