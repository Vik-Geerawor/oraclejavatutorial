package i_javalanguage.vi_inheritance;

public interface Animal {
    public static final String NAME = "virus";

    default public String identifyMyself() {
        return "I am an animal.";
    }
}
