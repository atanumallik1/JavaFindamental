# Thread
## Chapter 45 : Thread

![image](https://user-images.githubusercontent.com/8110582/141331870-55787fe8-183d-4985-9cd2-82a3b915d3a3.png)
* On a single Thread the sequesnce of specific actions are predictable. It is possible to tell B will happen after A
* On Different Thread the sequence of Actions are not predictable . It is not Possible to tell when will C occur in reference to A or B ; C might happen before B or even B
* Running multiple threads creates multiple situations;  so it is difficult to develop a multithreaded architecture 


## States of thread 
Life cycle of thread
* New
* Runnable : waiting for teh processor to be picked for execution 
* Running : actually Running 
* Blocked 
* Dead

![image](https://user-images.githubusercontent.com/8110582/141343972-92933a8e-12ef-4d66-870d-728c046fba48.png)

When a thread is an Blocked State, if someone tries do something ( lets say kill ) from another thread , the first thread throws `InterruptedException`. This is a checked exception.


* Thread.run() vs Thread.start()
if we use `Thread.run()` then the coe inside `run` executes from main thread. It does not create a new thread in this case. But if we use Thread.start() , it starts a new threadand then executes the job in the new thread

* Thread class is a non abstract class; So if you do not overwrite the Run() method you do not get a compilation error. But if you call the thread.start(); it does nothing  

## Chapter 46 : Thread

Following STMT puts the Thread to `NEW` state.

````java 
Thread t = new Thread();
````
Following STMT puts the Thread to `RUNNABLE` state.

````
t.start()
````  

### IllleganThreadStateExceltion
If you tryTo start a a Thread twice , or try to start a thread after it is dead you get ,

````java


java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:789)
	at example2.MainClass.main(MainClass.java:19)
````

### InterruptedException
Blocking operations like `wait()`, `join()` etc throws a checked exception. This is a compile time exception.This exception is `InterruptedException`. You can not kill a Thread when it is in some blocking state. Compiler stops us if we try to kill a thread when it is in waiting state. If you try to do that it throws `InterruptedException`

## Thread Priority 

We can set the Priority of the Thread , by setting any vaue between 1 to 10. This is an advice to JVM but is _*not*_ guaranteed to execute the thread in that order 

````java
t1.priority(1); 
````


## join()

The following code makes the Main Thread wait until thread `t1` finishes. This method throws an `InterruptedException`

````java
public static void main(String args[]) {
		Runnable dbrunnable1 = new DBRunnable1() ;
		 
		Thread t1 = new Thread(dbrunnable1, "DB1") ;
	 
		
		t1.start();
		
		try {
		t1.join(1000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Main ended");
		

	}
````






