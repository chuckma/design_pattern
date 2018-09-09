package cn.lucasma.design.pattern.structural.bridge;

/**
 * Created by lucasma
 * 账户接口
 */
public interface Account {

    // 打开账户
    Account openAcount();

    // 查看账户类型
    void showAccountType();
}
