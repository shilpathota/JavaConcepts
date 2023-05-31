package Basics;

enum Season {
    SPRING("March", "April", "May"),
    SUMMER("June", "July", "August"),
    AUTUMN("September", "October", "November"),
    WINTER("December", "January", "February");

    private final String[] months;
    Season(String... months) {
        this.months = months;
    }
    public String[] getMonths() {
        return months;
    }
    public boolean isColdSeason() {
        return this == WINTER || this == AUTUMN;
    }
}
public class EnumExample {
    public static void main(String[] args) {
        // Accessing enum constants and invoking methods
        System.out.println("Months in Spring:");
        for (String month : Season.SPRING.getMonths()) {
            System.out.println(month);
        }
        // Invoking enum-specific method
        Season currentSeason = Season.WINTER;
        System.out.println("Is it a cold season? " + currentSeason.isColdSeason());
    }
}