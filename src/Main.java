public class BubbleSort {  

    public void bubbleSort(int[] array) {  

        int n = array.length;  

        for (int i = 0; i < n - 1; i++) {  

            for (int j = 0; j < n - i - 1; j++) {  

                if (array[j] > array[j + 1]) {  

                    int temp = array[j];  

                    array[j] = array[j + 1];  

                    array[j + 1] = temp;  

                }  

            }  

        }  

    }  

}  

  

public class Main {  

    public static void main(String[] args) throws Exception {  

        int[] array = {38, 65, 3, 17, 2};  

  

        BubbleSort bubbleSort = new BubbleSort();  

        bubbleSort.bubbleSort(array);  

        for (int i = 0; i < array.length; i++) {  

            System.out.print(array[i] + ",");  

        }  

    }  

}