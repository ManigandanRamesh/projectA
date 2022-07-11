 1. First JVM gets loaded  
 1. Main method gets executed  
 1. ApplicationContext is loaded  
 1. ApplicationContext reads xml configuration file  
 1. ApplicationContext pre-loads one object for each bean in the config file 
             if the bean is marked as lazy-init="true"  
 1. lazy-init="true" This informs springContainer not to pre-load for this bean  
 1. By default Spring early loads objects in memory  
 1. For lazy-init beans object is created only when the getBean() method is called.  
 1. For pre-init beans getBean() returns the reference of the pre-loaded objects  
 1. By default only one object for every bean is created(Singleton)  
 1. Singleton: Atleast one bject for every class but not more than one object  
 1. Spring for lazy-init beans creates a singleton object on firstcall of getBeans() method and  
 then uses that objects for future getBean() method calls  
 
 ---
 
## Prototype  
Prototype beans are by default lazy-init  
Prototype are not singleton  
A new object is created for Prototype when getBean() methid is called every time  
java  
    <bean id="act" class="com.chainsys.projectA.beans.Actor" scope="prototype"></bean>
---
## Bean with parameterized constructor

```java
 <bean id="film" class="com.chainsys.projectA.beans.Movie">
         <constructor-arg  type="java.lang.String" value="Vikram"/>
         <constructor-arg  type="java.lang.String" value="kamal"/>

```
---
## factory Method