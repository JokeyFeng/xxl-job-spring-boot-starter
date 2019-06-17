package com.jokey.bingo.xxljob.starter.builder;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;

/**
 * @author Zhengjingfeng
 * created 2019/6/17 10:43
 * comment
 */
public class XxlJobSpringExecutorBuilder {
    /**
     * target object.
     */
    private XxlJobSpringExecutor executor = new XxlJobSpringExecutor();
    /**
     * xxl job admin address.
     */
    private String adminAddresses;
    /**
     * xxl job registry name.
     */
    private String appName;
    /**
     * xxl job registry ip.
     */
    private String ip;
    /**
     * xxl job registry port.
     */
    private Integer port;
    /**
     * xxl job admin retistry access token.
     */
    private String accessToken;
    /**
     * xxl job log files path.
     */
    private String logPath;
    /**
     * xxl job log files retention days.
     */
    private Integer logRetentionDays;

    public XxlJobSpringExecutorBuilder withAdminAddresses(String adminAddresses) {
        this.adminAddresses = adminAddresses;
        return this;
    }

    public XxlJobSpringExecutorBuilder withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public XxlJobSpringExecutorBuilder withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public XxlJobSpringExecutorBuilder withPort(int port) {
        this.port = port;
        return this;
    }

    public XxlJobSpringExecutorBuilder withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public XxlJobSpringExecutorBuilder withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    public XxlJobSpringExecutorBuilder withLogRetentionDays(int logRetentionDays) {
        this.logRetentionDays = logRetentionDays;
        return this;
    }


    public XxlJobSpringExecutor build() {
        executor.setAdminAddresses(adminAddresses);
        executor.setAppName(appName);
        executor.setIp(ip);
        executor.setPort(port);
        executor.setAccessToken(accessToken);
        executor.setLogPath(logPath);
        executor.setLogRetentionDays(logRetentionDays);
        return this.executor;
    }

}
