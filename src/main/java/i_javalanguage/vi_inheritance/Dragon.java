package i_javalanguage.vi_inheritance;

public class Dragon implements EggLayer, FireBreather {
    @Override
    public String identifyMyself() {
        return EggLayer.super.identifyMyself() + " " + FireBreather.super.identifyMyself();
    }
    public static void main(String[] args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());

        Class obj = myApp.getClass();
        System.out.println("class name: " + obj.getSimpleName());
        System.out.println("superclass name: " + obj.getSuperclass());
        for (Class c : obj.getInterfaces()) {
            System.out.println("interfaces: " + c.getName());
        }

        System.out.println(myApp.hashCode());
        System.out.println(myApp.toString());

        System.out.println(myApp.NAME);
    }
}
