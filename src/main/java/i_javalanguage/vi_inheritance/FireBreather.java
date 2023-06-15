package i_javalanguage.vi_inheritance;

public interface FireBreather extends Animal {
    @Override
    default public String identifyMyself() {
        return "I breathe out fire.";
    }
}
