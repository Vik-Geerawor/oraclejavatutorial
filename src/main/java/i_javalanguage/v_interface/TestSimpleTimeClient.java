package i_javalanguage.v_interface;

public class TestSimpleTimeClient {
    public static void main(String... args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient.toString());
        System.out.println("Time in Los Angeles: " + myTimeClient.getZonedDateTime("bla bla").toString());
    }
}
