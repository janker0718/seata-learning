# 基于 SpringBoot 、 Dubbo 、 Nacos、Seata 的分布式事务示例代码

## 相关环境介绍
> 基于 Docker 部署，方便启动运行。
- MySQL 5.7 - [部署文档](./doc/docker/mysql5.7/README.md)
- Nacos v2.2.0 - [部署文档](./doc/docker/nacos/README.md)
- seata v1.6.0 - [部署文档](./doc/docker/seata/README.md)

## 启动调试

1. 启动 [AccountApplication](./seata-learning-account/src/main/java/top/janker/seata/learning/account/AccountApplication.java)
2. 启动 [OrderApplication](./seata-learning-order/src/main/java/top/janker/seata/learning/order/OrderApplication.java)
3. 启动 [StockApplication](./seata-learning-stock/src/main/java/top/janker/seata/learning/stock/StockApplication.java)
4. 启动 [BusinessApplication](./seata-learning-business/src/main/java/top/janker/seata/learning/business/BusinessApplication.java)
5. 默认 BusinessApplication 启动时就已经执行了一些下单处理的逻辑，启动即可测试相应的分布式事务的代码。