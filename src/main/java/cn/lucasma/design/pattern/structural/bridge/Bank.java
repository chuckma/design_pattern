package cn.lucasma.design.pattern.structural.bridge;

/**
 * Created by lucasma
 * 通过组合的方式 把 Account 引入 Bank 里
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
