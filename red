jdk 1.8.0_241
1.新建的lib目录  添加要点 add  as library
2.配置jdk project language level 选默认sdk
3.字体中文乱码，font换掉consel字体
4.intellij 注册 在 .vmoptions 文件中配置我们补丁放置的全路径位置。
  -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3\bin\jetbrains-agent.jar

5.找需要的jar包网站  https://mvnrepository.com

6.安装actiBPM插件装不了
  2019.2.2版本在plu插件栏里搜索不到actiBPM，在官网https://plugins.jetbrains.com/plugin/7429-actibpm/versions
  下载actibpm.jar插件，在plu插件安装栏里 选择 install plu in disk（点此选项后，可选择已经下载到盘符的actibpm.jar
  然后安装）。重启后则新建文件可以选到new bpmn的文件