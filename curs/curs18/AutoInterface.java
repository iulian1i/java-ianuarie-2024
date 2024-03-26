package curs.curs18;

public interface AutoInterface {

    /**
     * se presupune ca toate proprietatile dintr-o interfata sunt deja =>public static final =>
     */
    public static final int viteza = 10;

    void accelereaza();

    // default method
    default void showDefault() {
        System.out.println("Default TestInterface1");
    }

    // static method
    static void showStatic() {
        System.out.println("Text");
    }

}
