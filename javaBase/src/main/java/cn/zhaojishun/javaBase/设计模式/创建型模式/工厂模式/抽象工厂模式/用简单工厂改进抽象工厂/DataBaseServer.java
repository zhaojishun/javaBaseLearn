package cn.zhaojishun.javaBase.设计模式.创建型模式.工厂模式.抽象工厂模式.用简单工厂改进抽象工厂;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 11:44
 */
public class DataBaseServer {
    private static String dataBaseType = "mysql";

    public static IUser createUser(){
        IUser iUser = null;
        switch (dataBaseType) {
            case "mysql":
                iUser = new MySqlUser();
                break;
            case "sqlserver":
                iUser = new SqlServerUser();
                break;
        }
        return iUser;
    }

    public static IDepartment createDepartment(){
        IDepartment iDepartment = null;
        switch (dataBaseType) {
            case "mysql":
                iDepartment = new MysqlDepartment();
                break;
            case "sqlserver":
                iDepartment = new SqlServerDepartment();
                break;
        }
        return iDepartment;
    }


    public static String getDataBaseType() {
        return dataBaseType;
    }

    public static void setDataBaseType(String dataBaseType) {
        DataBaseServer.dataBaseType = dataBaseType;
    }
}