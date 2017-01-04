#Java并发与多线程学习
**向Doug Lea致敬**  

![Doug Lea](http://ifeve.com/wp-content/uploads/2013/05/2934349b033b5bb502db9e8436d3d539b600bcb8.jpg)  


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
 性能 便捷性等 

### volatile关键字
计算机体系结构和java内存模型 
volatile关键字的语义（可见性）     
使用volatile经典使用场景 



### 使用Object对象的wait()和notify方法实现线程通信
 使用wait和notify实现生产者和消费者


## JUC线程池和任务执行框架
### Executor框架
1. ThreadPoolExecutor   
2. ScheduledThreadPoolExecutor   
3. ExecutorService

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
   CAS原理
 
## 并发容器
1. ConcurrenthashMap   
2. ConcurrentLinkedDeque    
3. ConcurrentLinkedQueue 
4. ConcurrentSkipListMap   

## 阻塞容器 
1. AbstractQueuedSynchronizer 基于FIFO对列的阻塞锁和同步工具类框架  
2. ArrayBlockingQueue DelayQueue 等一堆[BlockingQueue](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/BlockingQueue.html) 实现类

## 高级同步工具
1. CountDownLatch
2. CyclicBarrier	
3. Semaphore
4. Condition

## Lock free 实现和使用
 CAS指令

## 并发设计模式
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


**并发设计模式参考资料**   
1. [Patterns for Concurrent, Parallel, and Distributed Systems] (http://www.cs.wustl.edu/~schmidt/patterns-ace.html)  
2. [Concurrency talk given at Scaleconf] (http://shairosenfeld.com/concurrency.html)








