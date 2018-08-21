package cn.lucasma.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *
 * 适合在程序初始化的时候，就把多个单例对象放到 singletonMap 容器里面 统一管理
 * 使用的时候直接从 容器里获取单例对象。
 */
public class ContainerSingleton {
    private ContainerSingleton(){

    }
    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNoneBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
