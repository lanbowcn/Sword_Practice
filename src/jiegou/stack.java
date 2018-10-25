package jiegou;

import java.awt.*;

public class stack {
    int[] data;
    int length=0;

    public void push(int val){
        data[length] = val;
        length++;
    }

    public int pop(){
        if(this.length!=0){
            length--;
            System.out.print(data[length]);
            return data[length];
        }
        System.out.print("出栈数据为："+data[length]);
        return data[length];
    }



    public stack(int[] data){
        this.data = data;
        for (int i = 0;i<data.length;i++){
            push(data[i]);
        }
    }

    public void Display(){
        for (int i = 0;i<this.length;i++){
            System.out.print(this.data[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] a = {1,3,2,4,8,5,6,7,9,8,7};
        stack s = new stack(a);
        s.Display();
        for (int j = 0;j<5;j++){
            s.pop();
            s.Display();
        }
    }
}
