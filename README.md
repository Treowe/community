## 开源社区

## 资料
[Spring 文档](https://spring.io/guides)
[Spring web文档](https://spring.io/guides/gs/serving-web-content/)
[es 社区](https://elasticsearch.cn/explore)

## 工具
[Visual Paradigm](http://www.visual-paradigm.com)

## SQL脚本
```sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(100) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `token` char(36) DEFAULT NULL,
  `gmt_create` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
```