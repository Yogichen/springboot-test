=========================================
    idea启动spring-boot说明
=========================================

1、通过在Controller中加上@EnableAutoConfiguration开启自动配置，然后通过SpringApplication.run(UserController.class);
运行这个控制器；这种方式只运行一个控制器比较方便；
2、通过@Configuration+@ComponentScan+@EnableAutoConfiguration开启注解扫描并自动注册相应的注解Bean
3、idea启动配置spring-boot启动项，mainclass使用统一入口Application.java
