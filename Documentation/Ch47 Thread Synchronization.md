# Thread
## Chapter 47 : Need of Synchronization

* when multiple Threads contest for a common resource it is very important to implement _Synchronization_
* If not synchronized, the programs will produce unexpected result


## Producer consumer Problem 
This problem is easy to depict using a simple Producer Consumer problem. 
*	Producer  : A Thread that Produces something continuously 
* 	Consumer	  : A Thread Consumes something continuously 
*	Common Resource  : Both tryto access a common resource 


The Problem :

JVM has the authority to change teh state of thread from Runnable to Running and vice versa. This causes some issues when try to enforce atomicity in the operation. For example : let us consider the following example: 

*	Let us assume the following Consumer code is executed by Multiple Consumer Threads.
*	It is possible that , when Consumer Thread TC1 executes line A, it was in Running state. At this stage ther was an item in the bucket and the code enters to the next line. At this point the JVM put  TC1 to runnable state.
* Another Thread TC2 now executes Line A and line B and consumes the last  item successfuly. 
* At this state the JVM makes the TC1 Running again and TC1 tries to execute code at line B. This causes Null pointer exception as the bucket is already empty and this closes teh program to end abruptly. 


````java
public class Consumer implements Runnable {
	@Override
	public void run() {
		while (true) {
				if (!Main.bucket.isEmpty()) {            <-------    A
					int i = Main.bucket.remove(0);       <------    B
					System.out.println(i + " Consumer  by Consumer Thread: " + Thread.currentThread().getName());
				}
		}
	}
}
````
 

The Problem here is we did not tell the JVM which part of the code to run atomically.  We did not tell JVM that JVM can not put a Running thread into Runnable in the middle of execution. 




## Synchronization  of thread 
We need to specify the Synchronization of code which should perform atomically. If synchronized , the JVM will keep the thread running for the whole block of Synchronization .


````java
public class Consumer implements Runnable {

	@Override
	public void run() {
		while (true) {
			synchronized (Main.bucket)

			{
				if (!Main.bucket.isEmpty()) {
					int i = Main.bucket.remove(0);
					System.out.println(i + " Consumer  by Consumer Thread: " + Thread.currentThread().getName());

				}
			}

		}

	}

}
````
Keyword 	`synchronized (Main.bucket)` takes a Monitor object. 
Synchrozise ensures that no thread can exit the Synchronized Block / method. But to ensure that at a time only one thread is accessing  that block needs to be achieved using a Monitor. 

Monitor is a common object (a Bucket in this example), which acts a a lock. It means only one thread achieves a lock on the Monitor and executes the complete Synchronized block . Other threads can not achieve the lock. Once teh first thread leaves , the other thread can achieve the lock and proceed.



