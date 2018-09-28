import sun.font.TrueTypeFont;

public class MyArray {
    //定义一个数组
    private int[] Array;
    //当前长度
    private int elem;
    //最大长度
    private int Length;

    public MyArray(){
        elem=0;
        Length = 50;
        Array =new int [Length];
    }

    public MyArray(int Length){
        elem = 0;
        this.Length = Length;
        Array = new int[Length];
    }

    //获取有效长度
    public int getElem(){
        return elem;
    }

    //遍历数组元素
    public void dispaly(){
        for (int i=0;i<elem;i++){
            System.out.println(Array[i]);
        }
    }

    //添加元素
    public boolean add(int val){
        if (elem!=Length) {
            Array[elem] = val;
            elem++;
            return true;
        }else
            return false;
    }

    //查找元素
    public int getIndex(int val){
        int i;
        for (i = 0; i<elem;i++){
            if (Array[i]==val){
                break;
            }
            if (i==elem){
                return -1;
            }
        }
        return i;
    }

    //删除元素
    public boolean delete(int val){
        int k = this.getIndex(val);
        if (k == -1){
            return false;
        }else if(k==elem){
            elem--;
        }else{
            for(int i=k;i<elem;i++){
                Array[i]=Array[i+1];
            }
            elem--;
        }
        return true;
    }

    //修改元素
    public boolean upDate(int oldValue,int newValue){
        int k = this.getIndex(oldValue);
        if (k==-1){
            return false;
        }else{
            Array[k] = newValue;
        }
        return true;
    }
}
