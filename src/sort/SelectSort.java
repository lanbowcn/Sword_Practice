package sort;

public class SelectSort {
    //数组遍历
    public static void Display(int[] data){
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static int[] Ssort(int[] data){
        for (int i=0;i<data.length-1;i++) {
            int minindex = i;
            for (int j = i+1; j < data.length; j++) {
                minindex = data[j] > data[minindex] ? minindex : j;
            }
            if (i!=minindex) {
                int temp = data[i];
                data[i] = data[minindex];
                data[minindex] = temp;
                System.out.println("第" + i + "轮排序结果：");
                Display(data);
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 4, 6, 2, 1, 7, 9, 8};
        System.out.println("未排序数组为：");
        Display(a);
        System.out.println("--------------");
        Ssort(a);
        System.out.println("--------------");
        System.out.println("冒泡排序结果为：");
        Display(a);
    }
}
