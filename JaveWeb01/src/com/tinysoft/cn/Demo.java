package com.tinysoft.cn;

/**
 * Created by 董乐强 on 2017/10/22.
 */
public class Demo {
    public static void main(String [] args){
        SequenceStack<String> datas = new SequenceStack<String>();
        datas.push("a");
        datas.push("b");
        datas.push("c");
        datas.push("d");
        datas.push("e");
        datas.push("f");
        //出栈操作
        while(datas.getSize()!=0){
            String topData = datas.top();
            System.out.print(topData+" ");
        }
    }
}
