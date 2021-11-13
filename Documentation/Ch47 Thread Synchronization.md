# Thread
## Chapter 47 : Need of Synchronization

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

