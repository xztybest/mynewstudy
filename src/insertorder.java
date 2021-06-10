public class insertorder {
    public static void main(String[] args) {
        int arr[] = {9, 6, 4, 3, 2, 1};
        if(arr.length>=2){
            for(int i=1;i<arr.length;i++){
                int x=arr[i];
                int j=i-1;
                while(j>=0&&arr[j]>x){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=x;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

