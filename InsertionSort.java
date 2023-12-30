public class InsertionSort {
    public static void main(String[] args) {
        int i, j, temp; 
        int[] array = {1, 10, 3, 2 ,4 ,5, 9, 7, 6, 8};
        for(i=0; i<9; i++){
            j = i;
            while(array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        for(i = 0; i<10; i++){
            System.out.printf("%d ", array[i]);
        }
    }
}
