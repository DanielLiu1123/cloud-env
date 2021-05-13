# sharding-jdbc 整合seata BASE柔性事务
>需要注意的地方
>>1. 每个模块类路径下需要一个***seata.conf***
>>2. 在使用了sharding-jdbc的模块将***seata.enable-auto-data-source-proxy***
     一定改为 ***false*** !!!
***
