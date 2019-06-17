# xxl-job-spring-boot-starter

将xxl-job-core包简单封装成spring boot starter，方便通过Spring Boot方式开发xxl-job的executor

## 使用方法
### 添加依赖
```
<dependency>
    <groupId>com.jokey.bingo</groupId>
    <artifactId>xxl-job-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

### 修改xxl-job配置

添加以下xxl-job配置，也可不配置，不配置则使用默认值。
```
xxl-job:
  admin:
    admin-addresses: http://localhost:8080/xxl-job-admin #调度中心
  executor:
    app-name: xxl-job-spring-boot-starter-example #默认为 xxl-job-executor
    access-token: #默认为空
    log-path: logs/applogs/xxl-job/jobhandler #默认为 logs/xxl-job
    log-retention-days: 10 #默认为 10
    ip: #默认为空
    port: 9999 #默认为 9999
```
## 说明
其他编写作业逻辑和源码中提供的demo一样，请参考开源作者的demo：
**https://github.com/xuxueli/xxl-job/tree/master/xxl-job-executor-samples**