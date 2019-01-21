/**
 * 
 */
package com.cry.shop.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取properties的工具类
 * @author CRY
 *
 */
public class PropertiesUtil {
    /**
     * 读取properties
     *  
     * @param name 需要读取的文件路径
     * @return Properties
     */
    public static Properties getReadAbleProperties(String name) {

        InputStream ins = PropertiesUtil.class.getResourceAsStream(name);

        // 生成properties对象
        Properties p = new Properties();

        try {
            p.load(ins);
            ins.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return p;

    }

}
