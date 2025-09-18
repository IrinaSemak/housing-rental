public class Contract {
    private String number;
    private int durationMonths;
    private Apartment apartment;
    private Tenant tenant;

    public Contract(String number, int durationMonths, Apartment apartment, Tenant tenant) {
        this.number = number;
        this.durationMonths = durationMonths;
        this.apartment = apartment;
        this.tenant = tenant;
    }

    public int getDurationMonths() { return durationMonths; }
    public Apartment getApartment() { return apartment; }
    public Tenant getTenant() { return tenant; }
}