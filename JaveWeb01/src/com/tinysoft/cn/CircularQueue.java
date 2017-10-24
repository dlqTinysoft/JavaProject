package com.tinysoft.cn;

/**
 * Created by 董乐强 on 2017/10/23.
 * 循环队列实现
 */
public class CircularQueue<T>{

     private final static int DEFAULT_SIZE = 10;
     //队列存储元素个数
     private int size;
     //队列头位置
     private int head;
     //队列尾位置
     private int tail;
     private Object [] objects ;

     public CircularQueue(){
         objects = new Object[CircularQueue.DEFAULT_SIZE];
     }

     public CircularQueue(int init_size){
         objects = new Object[init_size];
     }

     //入队操作
     public void add(T data){
         //队列已满，则不能够入队
         if((tail+1)%objects.length == head){
             throw new RuntimeException("CircularQueue is full, do not add");
         }
         objects[tail]=data;
         tail = tail++ % objects.length;
         size++;
     }

     //出队操作
     public T poll(){
         T data = null;
         //队空，则不出队
         if(tail == head){
             throw new RuntimeException("CircularQueue is null, do not poll");
         }
         data = (T)objects[head];
         head = head++%objects.length;
         size--;
         return data;
     }
     //得到队列的大小
     public int getSize(){
         return size;
     }

     //队列是否为空
     public boolean isEmpty(){
         return size ==0;
     }
     //得到对头元素
     public T getHeadData(){
         if(!isEmpty()) {
             T data = (T) objects[head];
             return data;
         }
         return null;
     }
}
