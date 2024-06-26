> 学习过程中，遇到问题可以咨询作者（底部）

### 演示地址

前台地址：  http://zf.gitapp.cn

后台地址： http://zf.gitapp.cn/admin

后台管理帐号：

用户名：admin123
密码：admin123

### 功能介绍

平台采用B/S结构，后端采用主流的Springboot框架进行开发，前端采用主流的Vue.js进行开发。

整个平台包括前台和后台两个部分。

- 前台功能包括：首页、房屋详情页、门票订单、用户中心模块。
- 后台功能包括：总览、订单管理、房屋管理、分类管理、设施管理、评论管理、用户管理、运营管理、日志管理、系统信息模块。



### 代码结构

- server目录是后端代码
- web目录是前端代码

### 部署运行

#### 后端运行步骤

1. 下载JDK 1.8，并配置环境变量

2. 下载本代码后，使用IntelliJ IDEA打开server目录

3. 配置server目录中的application.yml文件，配置BASE_LOCATION、DB_NAME、数据库账号密码

4. 安装mysql 5.7数据库，并创建数据库，创建SQL如下：
```
CREATE DATABASE IF NOT EXISTS java_zf DEFAULT CHARSET utf8 COLLATE utf8_general_ci
```
5. 恢复sql数据。在mysql下依次执行如下命令：

```
mysql> use java_zf;
mysql> source D:/xxx/xxx/xxx.sql;
```

6. 启动后端服务：点击IDEA顶部run按钮


#### 前端运行步骤

1. 安装node 16.14

2. 修改web/src/store下的constansts.ts文件中的BASE_URL，改成你自己后端的地址

3. cmd命令进入web目录下，安装依赖，执行:
```
npm install 
```
4. 运行项目
```
npm run dev
```
5. 在浏览器输入: http://localhost:3000 即可预览


### 界面预览

首页

![](https://raw.githubusercontent.com/geeeeeeeek/java_zf/master/server/upload/image/a.png)


后台页面

![](https://raw.githubusercontent.com/geeeeeeeek/java_zf/master/server/upload/image/b.png)



### 待完善功能

- 邮箱推送功能
- 手机号绑定功能
- 粉丝关注功能
- 支付功能



