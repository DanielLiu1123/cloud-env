# Spring-Cloud 最新最稳定版本各组件的使用demo
***
***version:***
> - Spring boot             2.4.2       [2.4.x版本新特性](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.4-Release-Notes)
> - Spring Cloud            2020.0.2    [2020.0.x版本新特性](https://github.com/spring-cloud/spring-cloud-release/wiki/Spring-Cloud-2020.0-Release-Notes)
> - Spring Cloud Alibaba    2021.1
> - Sharding Jdbc           4.1.1
> - Seata                   1.3.0 (官方推荐)
> - Nacos                   1.4.1 (官方推荐)
> - Sentinel                1.8.0 (官方推荐)
> - [查看版本说明](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)
***
***包含:***
> - nacos(配置中心,注册中心)
>>  - 作为配置中心
>>  - 作为注册中心整合***openfeign***(服务间相互调用)的使用, 以及自定义负载均衡策略
> ***
> - sentinel(服务熔断限流)
>>  - 基本使用以及持久化限流规则到nacos
>>  - 作为spring cloud断路器的使用
> ***
> - seata(分布式事务)
>>  - 基本使用
>>  - 整合sharding-jdbc(分库分表)
> ***
> - gateway(网关)
>>  - 基本使用, 以及自定义负载均衡策略
> ***
> - security(安全)
>>  - 基本使用
>>  - oauth2(开放协议)的使用
> ***
> 其他
>>  - grpc使用demo 

***
不是很会写文档, 如果你遇到什么问题, 或者有什么好的建议, 再或者就是想找人一起学习, 可以加我qq 599502537