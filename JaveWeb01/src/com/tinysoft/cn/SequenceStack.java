package com.tinysoft.cn;

/**
 * Created by 董乐强 on 2017/10/23.
 * 顺序栈实现
 */
public class SequenceStack<T> {
    //栈的默认大小
    private final static int DEFAULT_SIZE = 10;
    //栈顶指针
    private int top;
    //栈的大小
    private int size;
    //数组用于存放元素
    private Object[] objects;

    public SequenceStack (){
        objects = new Object[SequenceStack.DEFAULT_SIZE];
    }

    public SequenceStack(int init_size){
        objects = new Object[init_size];
    }

    //进栈操作
    public void push(T data){
        if(size<objects.length) {
            objects[top] = data;
            top++;
            size++;
        }else{
            throw new RuntimeException("Stack is full ,not push stack");
        }
    }

    //出栈操作
    public T top(){
        if(size!=0){
            top--;
            size--;
            T data = (T)objects[top];
            return data;
        }else{
            throw new RuntimeException("Stack is Empty, not top stack");
        }
    }

    //判断栈是否为空
    public boolean isaEmpty(){
        return size ==0;
    }

    //栈的大小
    public int getSize(){
        return size;
    }
}
