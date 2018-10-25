package fundamental;

public class nine {
    public static void main(String[] args){
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                int l = i*j;
                System.out.print(j+"*"+i+"="+l+" ");
            }
            System.out.println();
        }
    }
}
