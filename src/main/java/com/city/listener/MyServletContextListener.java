package com.city.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyServletContextListener implements ServletContextListener {


    /**
     * 当Servlet容器启动Web 应用时调用该方法，在调用完该方法之后，容器再对
     * Filter初始化，并且对那些在web应用启动时就需要初始化的Servlet进行初始化。
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("===================================");
        System.out.println("==============应用启动=============");
        System.out.println("===================================");

        //应用启动读取other.properties中ftp相关配置
        //该方式只能读取类路径下的配置文件，有局限但是如果配置文件在类路径下比较方便
        Properties properties = new Properties();
        //使用ClassLoader加载properties配置文件生成对应的输入流
        InputStream in = MyServletContextListener.class.getClassLoader().getResourceAsStream("other.properties");
        try {
            //使用prperties对象加载输入流
            properties.load(in);
        }catch (IOException e){
            e.printStackTrace();
        }
        //获取key对应的value值
        String ftp_address = properties.getProperty("ftp.ip.address");
        String ftp_port = properties.getProperty("ftp.port");
        String ftp_username = properties.getProperty("ftp.username");
        String ftp_password = properties.getProperty("ftp.password");

        String sftp_address = properties.getProperty("sftp.ip.address");
        String sftp_port = properties.getProperty("sftp.port");
        String sftp_username = properties.getProperty("sftp.username");
        String sftp_password = properties.getProperty("sftp.password");
        System.out.println("ftp服务器配置信息：");
        System.out.println("ftp_address:" + ftp_address);
        System.out.println("ftp_port:" + ftp_port);
        System.out.println("ftp_username:" + ftp_username);
        System.out.println("ftp_password:" + ftp_password);
        System.out.println("sftp服务器配置信息：");
        System.out.println("sftp_address:" + sftp_address);
        System.out.println("sftp_port:" + sftp_port);
        System.out.println("sftp_username:" + sftp_username);
        System.out.println("sftp_password:" + sftp_password);
        //放到application中
        servletContextEvent.getServletContext().setAttribute("ftp_address",ftp_address);
        servletContextEvent.getServletContext().setAttribute("ftp_port",ftp_port);
        servletContextEvent.getServletContext().setAttribute("ftp_username",ftp_username);
        servletContextEvent.getServletContext().setAttribute("ftp_password",ftp_password);

        servletContextEvent.getServletContext().setAttribute("sftp_address",sftp_address);
        servletContextEvent.getServletContext().setAttribute("sftp_port",sftp_port);
        servletContextEvent.getServletContext().setAttribute("sftp_username",sftp_username);
        servletContextEvent.getServletContext().setAttribute("sftp_password",sftp_password);

    }

    /**
     * 当Servlet容器终止Web 应用时调用该方法，在调用该方法之前，容器会先销毁所有的Servlet 和 Filter过滤器。
     *
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("=======================");
        System.out.println("=========应用销毁========");
        System.out.println("=======================");


    }
}
