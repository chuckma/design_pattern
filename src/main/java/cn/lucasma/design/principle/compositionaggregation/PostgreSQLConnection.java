package cn.lucasma.design.principle.compositionaggregation;

/**
 * @author Administrator
 */
public class PostgreSQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
