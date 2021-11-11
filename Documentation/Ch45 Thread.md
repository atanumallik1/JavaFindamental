# Chapter 45 : Thread

![image](https://user-images.githubusercontent.com/8110582/141331870-55787fe8-183d-4985-9cd2-82a3b915d3a3.png)
* On a single Thread the sequesnce of specific actions are predictable. It is possible to tell B will happen after A
* On Different Thread the sequence of Actions are not predictable . It is not Possible to tell when will C occur in reference to A or B ; C might happen before B or even B
* Running multiple threads creates multiple situations;  so it is difficult to develop a multithreaded architecture 


## States of thread 

* New
* Runnable : waiting for teh processor to be picked for execution 
* Running : actually Running 
* Blocked 
* Dead

![image](https://user-images.githubusercontent.com/8110582/141343972-92933a8e-12ef-4d66-870d-728c046fba48.png)

When a thread is an Blocked State, if someone tries do something ( lets say kill ) from another thread , the first thread throws `InterruptedException`. This is a checked exception.


* Thread.run() vs Thread.start()
if we use `Thread.run()` then the coe inside `run` executes from main thread. It does not create a new thread in this case. But if we use Thread.start() , it starts a new threadand then executes the job in the new thread
