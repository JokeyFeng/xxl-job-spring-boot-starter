package com.jokey.bingo.xxljob.starter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Zhengjingfeng
 * created 2019/6/17 10:37
 * comment
 */
@Data
@ConfigurationProperties(prefix = "xxl-job")
public class XxlJobProperties {

    /**
     * 作业调度中心配置
     */
    private JobAdminProperties admin = new JobAdminProperties();
    /**
     * 作业执行器相关配置
     */
    private JobExecutorProperties executor = new JobExecutorProperties();

    @Data
    public static class JobAdminProperties {
        /**
         * xxl job admin address.
         */
        private String adminAddresses = "http://127.0.0.1:8080/xxl-job-admin";
    }

    @Data
    public static class JobExecutorProperties {
        /**
         * xxl job registry name.
         */
        private String appName = "xxl-job-executor";
        /**
         * xxl job registry ip.
         */
        private String ip;
        /**
         * xxl job registry port.
         */
        private Integer port = 9999;
        /**
         * xxl job admin registry access token.
         */
        private String accessToken;
        /**
         * xxl job log files path.
         */
        private String logPath = "logs/xxl-job";
        /**
         * xxl job log files retention days.
         */
        private Integer logRetentionDays = 30;

    }
}
