package Pattern4Factory.mod2.interfaces;

public interface Pizza {
    void prepare();

    default void bake() {
        System.out.println("Запекается");
    }

    default void cut() {
        System.out.println("Разрезается");
    }

    default void box() {
        System.out.println("Упоковывается");
    }
}
