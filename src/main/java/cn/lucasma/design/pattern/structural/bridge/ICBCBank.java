package cn.lucasma.design.pattern.structural.bridge;

/**
 * Created by lucasma
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账户");
        account.openAcount();
        return account;
    }
}
