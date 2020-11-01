# spring-azure-deploy-sample
Spring Boot Kotlin の Azure App Service Deploy Sample


# 前提
-   JDK
    - [OpenJDK (11.0.x)](http://openjdk.java.net/)
-   Kotlin
    - [Kotlin (1.3.72)](https://kotlinlang.org/)
-   Build Tool
    - [Gradle (6.7)](https://gradle.org/)
-   Framework
    - [Spring Boot (2.3.5.RELEASE)](https://spring.io/projects/spring-boot)
-   IDE
    - [Eclipse (2020‑09)](http://www.eclipse.org/home/index.php) + [Spring Tools](https://marketplace.eclipse.org/content/spring-tool-suite-sts-eclipse)
    - [IntelliJ IDEA CE (2020.2)](https://www.jetbrains.com/ja-jp/idea/download/)


# 利用方法
以下コマンドにてwarファイルを作成し、Azure App Serviceにデプロイする。
  ```shell
  ./gradlew war
  ```
