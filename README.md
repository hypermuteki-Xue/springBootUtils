# springBootUtils

### 只是一个springboot的模板。
我也不知道会不会有人看

### 须知
yml文件中配置JDBC地址

表创建代码：

```
 CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuname` varchar(50) NOT NULL,
  `classname` varchar(50) NOT NULL,
  `stuage` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 

```

```
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8

```
