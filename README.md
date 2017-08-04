# SpringBoot-Helloworld
	
	一个SpringBoot的入门案例，记录下遇到的问题。

# 问题描述
	
  按照Spring-Bott官网提供的案例，编写第一个Spring-Boot案例，完成之后运行成功，但是想把Control分离出启动程序，分离之后的代码接口如下：
	![](http://i.imgur.com/OQCLCCx.png)

  导致访问时报错。
	![](http://i.imgur.com/Szi42tN.png)

# 原因分析：
	
无法找到给予的Mapping，所以，也没有页面返回。可能出现的原因：
 
1. mapping名称出现错误（在代码的过程中，如果可以赋值，请不要完全手写，因为这很容易出现错误）
2. 在初始化的过程中，我们忽略了文件的结构，controller不在包里面，超出了spring能机制的能力范围（个人猜测）。


# 最终处理
	
   修改项目的结构，将Spring-Boot的启动文件放在src根目录下即可，也就是把Main方法的那个类放在Control包的根包下，详细的请看错误结构和正确结构的对比，修正之后的目录接口为：

   ![](http://i.imgur.com/NbOlUNG.png)

   ![](http://i.imgur.com/j4hvx0q.png)



