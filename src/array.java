public class array {
    public static void main(String[] args) {
        int num []={3,4,5};
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
//        System.out.println(num[2]);
//        System.out.println(arr[3]);
//        for(int i=0;i<=4;i++){
//            System.out.println(arr[i]);
//        }
//        for(int j=0;j<=2;j++){
//            System.out.println(num[j]);
//        }

        int arr1[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr1[i][j]= (int) Math.random()*10);
            }
        }

    }
}
