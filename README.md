# sb-dynamic-xml
springboot mybatis xml热更新demo

抄mybatisplus的热更新类MybatisMapperRefresh  

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

问题
+ MybatisMapperRefresh主要逻辑是找到mapper目录的文件，按照文件修改时间，刷新对应namespace的xml
+ 使用3.x最后的原版MybatisMapperRefresh时，他是精确找到修改的文件，然后刷新，但是我使用的时候会报错
+ 而MybatisMapperRefreshAllKill全清再重建的方式目前可行，感觉不太优雅，我找作者看看问题所在好了
