import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalSystem {
    private List<Apartment> apartments = new ArrayList<>();
    private List<Contract> contracts = new ArrayList<>();

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public List<Apartment> findApartmentsByPrice(double minPrice, double maxPrice) {
        return apartments.stream()
                .filter(a -> a.getPrice() >= minPrice && a.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Tenant> findTenantsByContractDuration(int minDuration) {
        return contracts.stream()
                .filter(c -> c.getDurationMonths() >= minDuration)
                .map(Contract::getTenant)
                .collect(Collectors.toList());
    }
}