# SpringIoC
Spring IoC

***** Dependency Injection (DI)**********

 The DI Principle is being able to pass (inject) the dependencies inside of the recipient class (Ex. ClassA).
Without initializing the ClassB in ClassA 

Initializing= new ()
inject=Don't use new (). 

*****Constructor Injection:************

recipient class (ClassA) using constructor injection taking help inharitance of Class 
without initializing the depended class (ClassB)

It can be easy to manage and test the application.
Dependency Injection makes our programming code loosely coupled

*********Inversion of Control (IOC)**********

Instance Creation by IOC for depended class (ClassB) for Injection to recipient class.

*******Spring IoC Container************
The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container. Spring framework provides two distinct types of containers.

1. BeanFactory container
2. ApplicationContext container

BeanFactory is the root interface of Spring IOC container. ApplicationContext is the child interface of BeanFactory interface that provides Spring AOP features, i18n etc.

Why use IoC Container:

1. after modifying the dependicies class, receipent class needed recompilation which very costly for maintain development and release 
2. this container maintain the object life cycle through bean scope.

Imagine an application with dozens or even hundreds of classes. Sometimes we want to share a single instance of a class across the whole application, other times we need a separate object for each use case, and so on.

Managing such a number of objects is nothing short of a nightmare. This is where inversion of control comes to the rescue.

Bean Scope:
time (When) and number object (How many) Creation in Container
Singletone: Only 1 instance of bean per spring container
Prototype: Create instance every time when bean is requested
Request: Single bean instance per HTTP Request
Session: Single bean instance per HTTP Session
Global Session: Single bean instance per global HTTP Session 

What is the different between Singletone scope and Prototype Scope?
1. when value set to Singletone (one time) same value will get from another instance of the application contex (IoC).
But for Prototype scope you have to set the value when you initializing

Spring singleton is different than Java singleton. 
In java, one instance of the bean is created per JVM whereas in spring, 
one instance of the bean is created per application context.

Singleton bean scope: In Spring default scope of the bean is Singleton	
	It is used for all the beans which are stateless

Prototype Scope: It is created whenever it is called.

Singleton bean scope

 (Number of Instances) It returns a single bean instance per Spring IoC container. 
 This single instance is stored in a cache of such singleton beans, 
 and all subsequent requests and references for that named bean return the cached object

In Spring default scope of the bean is Singleton
It is created during the initialization of the application context
It is used for all the beans which are stateless

Prototype bean scope
A new object is created each time it is injected/looked up. It will use new X() each time
It is not default scope of the beans in Spring
It is created whenever it is called.
It is used for beans which are stateful by nature

Annotation-based Configuration
If multiple implemention of single interface that time we will get error (expected single matching bean but found 2) if we don't define the @Primary annotion of the targeted class.

@Primary is an effective way to use autowiring by type with several instances when you can determine one primary candidate. Alternatively, you can use Spring’s 
@Qualifier annotation to control the selection process using the bean name




*************************
https://www.javaguides.net/p/spring-core-tutorial.html

https://github.com/RameshMF/spring-core-tutorial.git
Spring Dependency Injection 

------Annotation-based Configuration---------

https://www.javaguides.net/2018/10/spring-scope-annotation-with-singleton-scope-example.html

Annotation-based Configuration

