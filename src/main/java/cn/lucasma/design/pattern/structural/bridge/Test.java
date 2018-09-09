package cn.lucasma.design.pattern.structural.bridge;

/**
 * Created by lucasma
 *
 * 桥接模式：把抽象和实现分离出来，通过组合来搭建他们之间的桥梁
 *
 * 场景 各个银行，银行账户，定期账户，活期账户
 */
public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();


        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();


        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
