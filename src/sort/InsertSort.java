package sort;

public class InsertSort {
    public static int[] Sort(int[] data){
        for (int i=1;i<data.length;i++){
            int j = i ;
            int temp = data[i];
            while(j>0&&temp<data[j-1]){
                data[j]=data[j-1];
                j--;
            }
            data[j] = temp;
            System.out.println("第"+i+"次排序结果：");
            show(data);
        }
        return data;
    }

    public static void show(int[] data){
        for (int i = 0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] a={4,2,5,1,3,8,7,9,6};
        System.out.println("原始数组为：");
        show(a);
        Sort(a);
        System.out.println("排序结果为：");
        show(a);
    }
}
