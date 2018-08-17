package cn.lucasma.design.principle.compositionaggregation;

/**
 * @author Administrator
 */
public class MySQLConnection  extends DBConnection{
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
