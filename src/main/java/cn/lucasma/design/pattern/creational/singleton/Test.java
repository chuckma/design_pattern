package cn.lucasma.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Author: lucasma
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program end");
        /*HungrySingleton instance = HungrySingleton.getInstance();
        // 如果将这个 instance 序列号到一个文件中，然后再从这个文件中取出来，这两个对象还是同一个对象吗？
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single_file"));
        oos.writeObject(instance);

        File file = new File("single_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/


        // 反射破坏
//        Class clazz = HungrySingleton.class;
//        Class clazz = StaticInnerClassSingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
////        HungrySingleton instance = HungrySingleton.getInstance();
////        HungrySingleton obj = (HungrySingleton) constructor.newInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton obj = (StaticInnerClassSingleton) constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(obj);
//        System.out.println(instance == obj);

        // 懒汉模式 无法防御反射
        Class clazz = LazySingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton obj = (HungrySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton obj = (LazySingleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(obj);
        System.out.println(instance == obj);





    }
}
