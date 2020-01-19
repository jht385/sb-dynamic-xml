# sb-dynamic-xml
springboot mybatis xml热更新demo

说明 https://blog.csdn.net/jht385/article/details/104037222

双开关控制其是否生效
```
@ConditionalOnProperty(prefix = "spring.profiles", name = "active", havingValue = "dev", matchIfMissing = false)
```
```
@Value("${mybatis.refreshMapper:false}")
private boolean refreshMapper;
```

测试  
+ http://localhost:8080/api/city?cityName=%E4%B8%8A%E6%B5%B7  
+ 修改xml，比如在where添加一个and 1=2  
+ 控制台显示替换日志  
+ 再次访问 http://localhost:8080/api/city?cityName=%E4%B8%8A%E6%B5%B7 查询不出内容
