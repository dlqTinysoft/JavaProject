package com.tinysoft.cn;

/**
 * Created by 董乐强 on 2017/10/23.
 * 链栈实现
 */
public class LinkedStack <T>{

     public static class Node<U>{
         U data;
         Node<U> next;

         public Node(){}

         public Node(U data, Node<U> next){
             this.data = data;
             this.next = next;
         }
    }

    //记录栈的大小
    private int size;
    //栈顶
    private Node<T> top;
    //进栈操作
    public void push(T data){
        //得到新的栈顶
        top =new Node<T>(data,top);
        size++;
    }

    //出栈操作
    public T top(){
        T data = null;
        //栈空不能够出栈
        if(!isEmpty()) {
            Node<T> node = top;
            data = node.data;
            node=null;
            top = top.next;
            return data;
        }else{
            throw new RuntimeException("Stack is  Empty!!");
        }
    }

    //判断栈是否为空
    private boolean isEmpty(){
        return size == 0 ;
    }
    //得到栈中元素的个数
    public  int  getSize(){
        return size;
    }

    //获得栈顶元素
    public T getTop(){
        if(!isEmpty())
            return top.data;
        else
            throw new RuntimeException("Stack is Empty");
    }
}


