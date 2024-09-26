package 배열;

public class DoubleArrEx {
    public static void main(String[] args){
        int[][] arr = new int [2][3];
        int cnt = 1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=cnt++;
            }
        }
        for(int[] ee :arr){
            for(int e :ee){
                System.out.println(e+"");
            }
            System.out.println();
        }
    }
}
