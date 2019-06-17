package com.jokey.bingo.xxljob.starter.autoconfigure;

import com.jokey.bingo.xxljob.starter.builder.XxlJobSpringExecutorBuilder;
import com.jokey.bingo.xxljob.starter.properties.XxlJobProperties;
import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Zhengjingfeng
 * created 2019/6/17 10:44
 * comment
 */
@Slf4j
@Configuration
@EnableConfigurationProperties({XxlJobProperties.class})
public class XxlJobAutoConfiguration {

    @Bean(initMethod = "start", destroyMethod = "destroy")
    public XxlJobSpringExecutor xxlJobSpringExecutor(XxlJobProperties prop) {
        log.info(">>>>>>>>>>> xxl job config init...");
        return new XxlJobSpringExecutorBuilder()
                .withAdminAddresses(prop.getAdmin().getAdminAddresses())
                .withAppName(prop.getExecutor().getAppName())
                .withIp(prop.getExecutor().getIp())
                .withPort(prop.getExecutor().getPort())
                .withAccessToken(prop.getExecutor().getAccessToken())
                .withLogPath(prop.getExecutor().getLogPath())
                .withLogRetentionDays(prop.getExecutor().getLogRetentionDays())
                .build();
    }
}
