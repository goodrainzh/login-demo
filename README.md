# Java Servlet 示例程序

## 项目介绍

本项目是一个简单的 Java Servlet 示例，这是一个 [maven](http://maven.apache.org) 项目，遵循标准的 [maven](http://maven.apache.org) 项目结构：

```
.
├── README.md
├── pom.xml
└── src
    └── main
        ├── java
        │   └── net
        │       └── goodrain
        │           └── samples
        │               └── HelloServlet.java
        └── webapp
            ├── WEB-INF
            │   └── web.xml
            └── index.html
```

## 项目要求

必须是 [maven](http://maven.apache.org) 项目，且配置好 `maven-war-plugin` 插件，以保证执行 `mvn package` 后可以在 `target` 目录下生成 web 项目的 `war` 包，否则项目将无法部署。


## 本地测试

* 执行 `mvn package` 可以在 `target` 目录生成 `war` 包。
* 执行 `java -jar target/dependency/webapp-runner.jar target/*.war`  访问 <http://localhost:8080> 查看效果。