package cn.zhaojishun.javaBase.设计模式.工厂模式.抽象工厂模式.反射与抽象工厂;

import cn.zhaojishun.javaBase.基础.路径相关.Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 11:44
 */
public class DataBaseServer {

    private static String dataBaseType;
    private static String packageName;
    static {
        //设置数据库类型
        setDataBaseType(readProperty("dbtype"));
        //设置包名
        setPackageName(DataBaseServer.class.getPackage().getName());
    }

    //使用反射动态创建需要的类型
    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IUser) Class.forName(packageName+"."+dataBaseType+"User").newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IDepartment) Class.forName(packageName+"."+dataBaseType+"Department").newInstance();
    }


    public static String getDataBaseType() {
        return dataBaseType;
    }

    public static void setDataBaseType(String dataBaseType) {
        DataBaseServer.dataBaseType = dataBaseType;
    }

    public static String getPackageName() {
        return packageName;
    }

    public static void setPackageName(String packageName) {
        DataBaseServer.packageName = packageName;
    }

    //获得配置文件
    private static String readProperty(String key) {
        String drivers = null;
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath()));
            drivers = prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drivers;
    }
}