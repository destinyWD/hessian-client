工作、学习中知识点记录
# hessian-service
给电信做项目时用的的轻量级RPC框架，结合spring、通过反射实现服务调用，客户端项目请下载hessian-client

Hessian是一个轻量级的remoting on http工具,采用的是Binary RPC协议，所以它很适合于发送二进制数据,同时又具有防火墙穿透能力。
Hessian一般是通过Web应用来提供服务，因此非常类似于平时我们用的 WebService。只是它不使用SOAP协议,但相比webservice而言更简单、快捷。
Hessian官网：http://hessian.caucho.com/

Hessian 可通过Servlet提供远程服务，需要将匹配某个模式的请求映射到Hessian服务。
此案例是Spring框架整合，通过它的 DispatcherServlet可以完成该功能，DispatcherServlet可将匹配模式的请求转发到Hessian服务。

Hessian处理过程示意图：客户端——>序列化写到输出流——>远程方法(服务器端)——>序列化写到输出流 ——>客户端读取输入流——>输出结果
# hessian-client
hessian学习中的Demo，结合spring、通过动态代理实现服务调用，服务端项目请下载hessian-service

Hessian是一个轻量级的remoting on http工具,采用的是Binary RPC协议，所以它很适合于发送二进制数据,同时又具有防火墙穿透能力。 Hessian一般是通过Web应用来提供服务，因此非常类似于平时我们用的 WebService。只是它不使用SOAP协议,但相比webservice而言更简单、快捷。 Hessian官网：http://hessian.caucho.com/

Hessian 可通过Servlet提供远程服务，需要将匹配某个模式的请求映射到Hessian服务。 服务端是Spring框架整合，通过它的 DispatcherServlet可以完成该功能，DispatcherServlet可将匹配模式的请求转发到Hessian服务。

Hessian处理过程示意图：客户端——>序列化写到输出流——>远程方法(服务器端)——>序列化写到输出流 ——>客户端读取输入流——>输出结果

注：此项目为普通项目，也可以web项目实现调用。 
# spi-service
SPI ，全称为 Service Provider Interface，是一种服务发现机制。它通过在ClassPath路径下的META-INF/services文件夹查找文件，自动加载文件里所定义的类。
这一机制为很多框架扩展提供了可能，比如在Dubbo、JDBC中都使用到了SPI机制。
Java SPI 实际上是“基于接口的编程＋策略模式＋配置文件”组合实现的动态加载机制。

系统设计的各个抽象，往往有很多不同的实现方案，在面向的对象的设计里，一般推荐模块之间基于接口编程，模块之间不对实现类进行硬编码。一旦代码里涉及具体的实现类，就违反了可拔插的原则，如果需要替换一种实现，就需要修改代码。为了实现在模块装配的时候能不在程序里动态指明，这就需要一种服务发现机制。
Java SPI就是提供这样的一个机制：为某个接口寻找服务实现的机制。有点类似IOC的思想，就是将装配的控制权移到程序之外，在模块化设计中这个机制尤其重要。

适用场景：调用者根据实际使用需要，启用、扩展、或者替换框架的实现策略

# short-url
短信短连接实现
