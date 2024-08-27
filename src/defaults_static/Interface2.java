package defaults_static;

public interface Interface2 extends Interface1{
    @Override
    default void methodA() {
        System.out.println("2A");
    }

    default void methodB(){
        System.out.println("2B");
    }
}
