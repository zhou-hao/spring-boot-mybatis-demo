## spring-boot+mybatis+freemarker 简单演示

##运行
```bash
  $ mvn spring-boot:run
```
或者直接运行 org.hsweb.demo.Run.java 默认端口8080
## 目录说明
```bash
 ------- src/main/java
 -------------|-----------controller #视图控制器
 -------------|-----------dao        #DAO接口
 -------------|-----------po         #PO实体类
 -------------|-----------service    #Service接口和实现类
 -------------|-----------Run.java   #程序入口
 ----------resources
 -------------|-----------o.g.d.d.mybatis  #mybatis mapper配置文件
 -------------|----------templates   # freemarker 模板文件
 -------------|----------application.yml #项目配置文件
 -------------|----------db.sql        #初始数据文件
 -------------|----------logback.xml  #loback日志配置文件
 -------------|----------mybatis-config.xml   #mybatis基础配置文件
```

##注意
程序每次启动都会执行db.sql
可在application.yml 取消配置
```yml
spring:
      datasource:
          schema: classpath:db.sql
```

广告：[基于spring-boot的后台管理基础框架](http://hsweb.me)