package sort;

import java.awt.*;

public class BubbleSort {
    //冒泡排序
    public static int[] sort(int[] data){
        for (int i=1;i<data.length;i++){
            boolean flag =true;
            for (int j=0;j<data.length-i;j++){
                if (data[j]>data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                    flag = false;
                }
            }
            //如果当前轮未发生交换，则数组已按顺序排列
            if (flag){
                break;
            }
            System.out.print("第"+i+"次排序结果为：");
            Display(data);
        }
        return data;
    }

    //数组遍历
    public static void Display(int[] data){
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] a = {3,5,4,6,2,1,7,9,8};
        System.out.println("未排序数组为：");
        Display(a);
        System.out.println("--------------");
        sort(a);
        System.out.println("--------------");
        System.out.println("冒泡排序结果为：");
        Display(a);

    }
}
