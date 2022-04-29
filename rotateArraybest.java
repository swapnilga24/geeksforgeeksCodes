// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class rotateArraybest {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5,6,7};
        int d=2;
        reverse(arr,0,d-1);
        display(arr);
        reverse(arr,d,arr.length-1);
        display(arr);
        reverse(arr,0,arr.length-1);
        display(arr);
    }
    public static void display(int temp1[]){
        System.out.print("Array is :[");
        for(int i=0;i<temp1.length;i++){
            System.out.print(temp1[i]+",");
        }
        System.out.print("]\n");
    }
    public static void reverse(int arr[],int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
