package cn.lucasma.design.pattern.structural.bridge;

/**
 * Created by lucasma
 *
 * 活期账户
 */
public class SavingAccount implements Account{
    @Override
    public Account openAcount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账户");
    }
}
