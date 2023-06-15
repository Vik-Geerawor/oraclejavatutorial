package i_javalanguage.v_interface;

public class SubClass extends SuperClass {

    public static void main(String[] args) {
        SuperClass parent = new SubClass();        //TODO: parent var --> child obj

        if (parent instanceof SubClass) {
            //TODO: compiler doesn't know that parent var -> child obj
            SubClass child = (SubClass) parent;
        }
    }
}
