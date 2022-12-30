 import java.util.Scanner;
class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        MonthData monthData = new MonthData();
        Converter converter = new Converter();
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                ;
            } else if (i == 2) {

            } else if (i == 3) {
                printStatistic();
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }
    static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Введите свои результаты");
        System.out.println("2 - Цели");
        System.out.println("3 - Статистика");
    }
}