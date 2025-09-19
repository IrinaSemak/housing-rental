import java.util.List;
import java.util.Scanner;

// Обновленный UI в master
public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();
        Scanner scanner = new Scanner(System.in);

        // Пример данных
        Apartment apt1 = new Apartment("ул. Ленина, 10", 50000, 60.5);
        Apartment apt2 = new Apartment("ул. Мира, 5", 75000, 80.0);
        Tenant tenant1 = new Tenant("Иван Иванов", "ivan@example.com");
        Tenant tenant2 = new Tenant("Мария Петрова", "maria@example.com");
        system.addApartment(apt1);
        system.addApartment(apt2);
        system.addContract(new Contract("C001", 12, apt1, tenant1));
        system.addContract(new Contract("C002", 6, apt2, tenant2));

        while (true) {
            System.out.println("1. Поиск квартир по цене");
            System.out.println("2. Фильтрация арендаторов по сроку");
            System.out.println("3. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Введите мин. цену: ");
                double minPrice = scanner.nextDouble();
                System.out.print("Введите макс. цену: ");
                double maxPrice = scanner.nextDouble();
                List<Apartment> apartments = system.findApartmentsByPrice(minPrice, maxPrice);
                apartments.forEach(a -> System.out.println(a.getAddress() + ": " + a.getPrice() + " руб."));
            } else if (choice == 2) {
                System.out.print("Введите минимальный срок (месяцы): ");
                int minDuration = scanner.nextInt();
                List<Tenant> tenants = system.findTenantsByContractDuration(minDuration);
                tenants.forEach(t -> System.out.println(t.getName() + ": " + t.getContact()));
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
        scanner.close();
    }
}