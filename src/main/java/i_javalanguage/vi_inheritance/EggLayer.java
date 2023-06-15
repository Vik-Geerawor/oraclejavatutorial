package i_javalanguage.vi_inheritance;

public interface EggLayer extends Animal {

    @Override
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}
