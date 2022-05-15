package Interface;

public interface InterfaceAll extends MyInterfaceC, MyInterfaceD {

    public abstract void method();


    @Override
    public default void methodDefault() {

    }
}
