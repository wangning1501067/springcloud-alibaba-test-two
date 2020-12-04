#简介
springcloud阿里巴巴

1.nacos（注册中心） 

2.网关（gateway） 

3.hystrix（熔断器）和熔断器降级（用的是熔断器失败后回调gateway给用户提示）


#入门
一 安装Nacos
Nacos作为配置中心和服务发现

1 下载地址

    可以下载执行文件，也可以下载源代码。本文后面是下载执行文件
    https://github.com/alibaba/nacos/releases

2 解压后直接执行nacos\bin\startup.cmd (windows环境，在linux环境则执行startup.sh)
   http://localhost:8848/nacos/#/login 查看是否启动成功
   输入初始用户密码 nacos / nacos 登录