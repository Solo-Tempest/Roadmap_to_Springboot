package Phase_1.week_1.part_3.Problem_2;

public class Problem_2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 5, 3};
//        Sortable sorter = new BubbleSort();
        Sortable sorter = new SelectionSort();
        System.out.print("before sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("after sorting : ");
        sorter.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

class InsertionSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        // Start from the second element as the first is assumed sorted.
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted into the sorted portion
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Place the key in its correct position
        }
    }
}
