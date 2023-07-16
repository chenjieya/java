package bank;

public abstract class Person {
    protected String name;

    public String getName() {
        return this.name;
    }
    // 1. 进入银行 叫号
    public abstract void callNumber();
    // 2. 排队 办理业务
    public abstract void transact();
    // 3. 办理完业务离开
    public abstract void leave();
}
