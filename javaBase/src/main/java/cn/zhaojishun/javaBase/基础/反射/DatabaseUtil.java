package cn.zhaojishun.javaBase.基础.反射;

import java.lang.reflect.Field;
import java.sql.*;

public class DatabaseUtil {
    private static String databaseName="1111";
    private static String hostIP="localhost";
    private static String userName="root";
    private static String password="111111";


    public static Connection getMySQLConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://"+hostIP+":3306/"+databaseName+"?useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false", userName, password);
        return conn;
    }
	public static void execute(String sql) throws Exception {
		Connection conn = getMySQLConnection();
        Statement stmt = conn.createStatement();  
        
        stmt.execute(sql);  
        
        stmt.close();  
        conn.close(); 
	}

    public static void close(Connection conn, Statement stmt){
        if(stmt != null) {
            try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        if(conn != null) {
            try { conn.close(); }catch (SQLException e) { e.printStackTrace(); }
        }

    }

    /**
     * @Description: 反射的常见应用
     * @Param:
     * @return:
     * @Author:
     * @Date:
     */
    public static void insertEntity(Object obj,String tableName) throws Exception {
        // System.out.println("1");
        if (obj == null)
            return;
        Field[] fields = obj.getClass().getDeclaredFields();
        int fieldSize = fields.length;
        //String tableName = c.getSimpleName().toLowerCase();// person
        String[] types1 = { "int", "java.lang.String", "boolean", "char",
                "float", "double", "long", "short", "byte" };
        String[] types2 = { "Integer", "java.lang.String", "java.lang.Boolean",
                "java.lang.Character", "java.lang.Float", "java.lang.Double",
                "java.lang.Long", "java.lang.Short", "java.lang.Byte" };

        StringBuffer sql = new StringBuffer("insert into " + tableName
                + " values(");
        for (int i = 0; i < fieldSize; i++) {
            sql.append("?,");
        }
        sql.deleteCharAt(sql.length() - 1);
        sql.append(")");
        //System.out.println(sql);
        Connection conn = getMySQLConnection();
        conn.setAutoCommit(false);
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql.toString());
            for (int j = 0; j < fieldSize; j++) {
                fields[j].setAccessible(true);
                for (int i = 0; i < types1.length; i++) {
                    if (fields[j].getType().getName()
                            .equalsIgnoreCase(types1[i])
                            || fields[j].getType().getName()
                            .equalsIgnoreCase(types2[i])) {

                        if (fields[j].get(obj) != null
                                && !"".equals(fields[j].get(obj))
                                && !"null".equals(fields[j].get(obj))) {
                            //System.out.println(fields[j].get(obj) + " ");
                            ps.setObject(j + 1, fields[j].get(obj));
                        } else {
                            //System.out.println(fields[j].get(obj) + " ");
                            ps.setObject(j + 1, null);
                        }
                    }
                }
            }
            System.out.println(ps.toString());
            ps.executeUpdate();
            conn.commit();
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            close(conn,ps);
        }

    }




}
