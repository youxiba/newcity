package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: 测试日志类
 * @DATE: 2018-05-25 16:16
 * @throws
 */
public class TestLogback {
    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public static void main(String[] args) {
        logger.info("logback 成功了");
        logger.error("logback 成功了");
    }

}
