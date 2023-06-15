package i_javalanguage.iii_classesandobjects;

enum DayEnum {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumTest {
    public static void main(String[] args) {
        for (DayEnum d : DayEnum.values()) {
            System.out.println(d.name());
        }
    }
}
