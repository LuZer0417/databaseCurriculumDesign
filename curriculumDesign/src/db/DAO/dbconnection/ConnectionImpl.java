package db.DAO.dbconnection;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.net.InetAddress;
import java.sql.Connection;
import java.util.Properties;

//
public class ConnectionImpl implements dbConnection {

    // 建议后期写一个小函数，可以自动写连接池文件


    //改为连接池连接法
    @Override
    public Connection getConnection() throws Exception {
        InetAddress addr = InetAddress.getLocalHost();// 获取本机的IP地址
        String URL = "jdbc:sqlserver://" + addr.getHostAddress() + "; DatabaseName=curriculumDesign";

        Connection con = null;
        //
        Properties properties = new Properties();// 新建一个配置文件
        InputStream is = ConnectionImpl.class.getClassLoader().getResourceAsStream("./db/DAO/druid.properties");// 读配置文件
        properties.load(is);// 使用properties对象加载is
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);// druid底层是使用的工厂设计模式，去加载配置文件，创建DruidDataSource对象
        con = dataSource.getConnection(); //连接
        System.out.println("连接池连接成功");

        //下面是硬连接方法
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            con = DriverManager.getConnection(URL, "sa", "123456");
//            System.out.println("连接数据库成功");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

        return con;
    }
}
