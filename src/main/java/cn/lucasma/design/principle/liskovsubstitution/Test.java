package cn.lucasma.design.principle.liskovsubstitution;

/**
 * @author Administrator
 *
 * 里式替换原则
 *
 * 里式替换原则 要求子类的行为功能和父类保持一致
 */
public class Test {

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("with:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("resize 方法结束 with:" + rectangle.getWidth());
    }

   /* public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);

    }*/

    public static void main(String[] args) {
        Square square = new Square();
//        square.setLength(10);
//        resize(square);

    }
}
