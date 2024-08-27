package defaults_static;

public interface Interface3 extends Interface2{
    default void methodC(){
        System.out.println("3C");
    }

    @Override
    default void methodB() {
        System.out.println("3B");
    }
}
