#Java并发与多线程学习
**向Doug Lea致敬**  

![Doug Lea](http://ifeve.com/wp-content/uploads/2013/05/2934349b033b5bb502db9e8436d3d539b600bcb8.jpg)  
感谢Doug Lea的在并发领域的卓越工作，让JVM平台程序员并发编程变得容易

## Java多线程使用

## 多线程同步技术
### sychronzied关键字
  sychronzied 三个使用范围和对应监视器对象
  
### 使用锁来同步
 可重入锁ReentrantLock
 	
#### 锁的各种概念
 锁粒度与并发级别   
 死锁  
 活锁   
 饥饿   
#### ReadWriteLock和ReentrantLock使用
可重入锁与读写锁所用


#### 三种同步技术比较  
 性能 便捷性  并发程度

### volatile关键字
1. 计算机体系结构和java内存模型 
    JSR-133规范  
    可见性  有序性 原子性 happen-before
2. volatile关键字的语义（可见性）     
  
3. 使用volatile经典场景 
    

### 线程间通信
 1. 使用Object对象的wait()和notify方法实现线程通信
  实现生产者和消费者


## 多线程概念
条件竞争
  概念
临界区
  概念
线程安全
  概念
  级别
逃逸
  线程安全必须满足的逃逸规则
不可变对象
  
内存模型
  JVM规范是对语言语法规则的约定和语言运行机器的一种抽象
  JVM抽象机器模型与实际机器模型

## JUC线程池和任务执行框架
### Executor框架
1. ThreadPoolExecutor   
2. ScheduledThreadPoolExecutor   
3. ExecutorService
4. Executor

Executor类型 | 特点 | 使用场合 
---------- | --------  |  ------  
ThreadPoolExecutor | 特点| 使用场合
SingleThreadExecutor | 特点| 使用场合
FixedThreadPool | 特点| 使用场合
CachedThreadPool  | 特点| 使用场合
ScheduledThreadPoolExecutor   | 特点| 使用场合   

ThreadPoolExecutor四大
.corePool：核心线程池的大小。   
.maximumPool：最大线程池的大小。   
.BlockingQueue：用来暂时保存任务的工作队列。   
.RejectedExecutionHandler：当Thread-PoolExecutor已经关闭或ThreadPoolExecu-tor已经饱和时（达到了最大线程池大小且工作队列已满），execute()方法将要调用的Handler。

### Future实现原理

### Fork Join 任务并行执行框架
 [Doug Lea 原始Fork Join框架论文](http://gee.cs.oswego.edu/dl/papers/fj.pdf)   
 Fork Join框架的思想： 递归 分治 工作窃取 
 
### Callable和Future返回异步执行结果
 异步执行也可以获取执行结果
 
## 原子操作工具类
[java.util.concurrent](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html)
### 原子操作工具类使用
 1. AtomicInteger  
 2. AtomicLong  
 3. AtomicLongArray   
 4. AtomicReference  等等 不一一列举
 
### 原子操作工具类的原理 
   CAS
   
 
## 并发容器
1. ConcurrentHashMap     
2. ConcurrentLinkedQueue  Simple, Fast, and Practical Non-Blocking and Blocking Concurrent Queue Algor
3. ConcurrentSkipListMap   

## 阻塞容器 
1. AbstractQueuedSynchronizer 基于FIFO对列的阻塞锁和同步工具类框架  
[原始论文](http://gee.cs.oswego.edu/dl/papers/aqs.pdf)

2. ArrayBlockingQueue DelayQueue 等一堆[BlockingQueue](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/BlockingQueue.html) 实现类

## 高级同步工具
1. CountDownLatch
2. CyclicBarrier	
3. Semaphore
4. Condition
5. Exchange


## 锁优化
1. 锁分离(读写分离)
2. 缩小锁范围 
3. 缩小锁粒度 ConcurrentHashMap
4. 锁粗化

 

## 并发设计模式和通用准则
脱离java语言和JVM平台 从更广泛的计算机领域视角看并发与并行编程，并发编程一些通用模式的总结 
[抄自维基百科](https://en.wikipedia.org/wiki/Concurrency_pattern)   
1. Read write lock pattern     
2. Thread pool pattern    
3. Thread-local storage    
4. Barrier    
5. Scheduler pattern  
6. Double-checked locking    
7. Immutability  
8. 不一一列举    

### 并发编程三大定律 
1.Amdahl定律   
2.Gustafson定律  
3.Sun-Ni定律  


**参考资料**   
1.[阿里Java并发编程培训](http://wenku.baidu.com/link?url=LR9AGCKKiyMhHKGCG60XrlqtMWTr3-GBVcgyMWjN2ro6d2Vid36nSQ37Re4dhMmq2bs7Udqf9qDQs1OwLn0Sma3Q0e5UHhkQ-ujxnABHXU3)   
2.[The Java Memory Model 站点](http://www.cs.umd.edu/~pugh/java/memoryModel/)  
3.[Patterns for Concurrent, Parallel, and Distributed Systems] (http://www.cs.wustl.edu/~schmidt/patterns-ace.html)  
4.[Concurrency talk given at Scaleconf] (http://shairosenfeld.com/concurrency.html)  
5.[Java并发编程艺术](http://www.duokan.com/book/94743)    
6.[实战Java高并发程序设计](http://www.duokan.com/book/118009)   
7.[Java 7 concurrency cookbook](http://ifeve.com/java-7-concurrency-cookbook/)  
8.[并发系列文章](http://tutorials.jenkov.com/java-concurrency/index.html)  
9.[Java Memory Model Pragmatics (transcript)](https://shipilev.net/blog/2014/jmm-pragmatics/)  
10.[java memory model](https://shipilev.net/blog/2016/close-encounters-of-jmm-kind/)   








