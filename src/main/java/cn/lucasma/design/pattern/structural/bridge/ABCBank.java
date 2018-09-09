package cn.lucasma.design.pattern.structural.bridge;

/**
 * Created by lucasma
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账户");
        account.openAcount();
        return account;
    }
}
