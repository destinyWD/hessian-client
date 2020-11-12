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
