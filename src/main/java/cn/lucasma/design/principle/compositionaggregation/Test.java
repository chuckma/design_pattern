package cn.lucasma.design.principle.compositionaggregation;

/**
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();

    }
}
