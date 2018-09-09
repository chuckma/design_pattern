package cn.lucasma.design.pattern.structural.bridge;

/**
 * Created by lucasma
 *
 * 定期账户
 */
public class DepositAccount implements Account {
    @Override
    public Account openAcount() {
        System.out.println("打开定期账户");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账户");
    }
}
