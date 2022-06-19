public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_120; // Стоимость билета
        int mileCost = 20; // Стоимость одной бонусной мили
        int miles; // Переменная для количества миль
        miles = ticketPrice / mileCost; // Формула расчета бонусных миль
        System.out.println("Количество бонусных миль: " + miles ); // Вывод на экран количества бонусных миль
    }
}
