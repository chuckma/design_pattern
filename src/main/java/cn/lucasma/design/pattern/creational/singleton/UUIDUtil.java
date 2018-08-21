package cn.lucasma.design.pattern.creational.singleton;

import java.util.UUID;

/**
 * @author Administrator
 */
public class UUIDUtil {

    private  static UUIDUtil uuidUtil = null;

    private UUIDUtil() {

    }

    public static UUIDUtil getInstance() {
        if (uuidUtil == null) {
            synchronized (UUIDUtil.class) {
                if (uuidUtil == null) {
                    uuidUtil = new UUIDUtil();
                }
            }
        }
        return uuidUtil;
    }


    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
    }
}
