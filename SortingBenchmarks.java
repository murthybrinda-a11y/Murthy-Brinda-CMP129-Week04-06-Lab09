public class SortingBenchmarks { 
    public static void main(String[] args) { 
        int[] original = {42, 15, 8, 23, 4, 99, 16, 87, 54, 11, 34, 7, 2, 3, 19, 55, 12, 9, 50, 95}; 
        
        // Create identical copies of original array
        int[] bubbleArray = new int[original.length]; 
        int[] selectionArray = new int[original.length]; 
        for (int i = 0; i < original.length; i++) { 
            bubbleArray[i] = original[i]; 
            selectionArray[i] = original[i]; 
        } 
        
        // Run sorts
        int bubbleSorting = bubbleSort(bubbleArray); 
        int selectionSorting = selectionSort(selectionArray); 
        
        // Display bubble sorting results
        System.out.println("Bubble Sort Results"); 
        System.out.print("Sorted Array: "); 
        for (int i = 0; i < bubbleArray.length; i++) { 
            System.out.print(bubbleArray[i] + " "); 
        } 
        System.out.println(); 
        System.out.println("Number of exchanges: " + bubbleSorting); 
        System.out.println(); 
        
        // Display selection sorting results
        System.out.println("Selection Sort Results"); 
        System.out.print("Sorted Array: "); 
        for (int i = 0; i < selectionArray.length; i++) { 
            System.out.print(selectionArray[i] + " "); 
        } 
        System.out.println(); 
        System.out.println("Number of exchanges: " + selectionSorting); 
        System.out.println(); 
        
        // Compare results 
        if (bubbleSorting < selectionSorting) { 
            System.out.println("Bubble sort made fewer exchanges"); 
        } else if (selectionSorting < bubbleSorting) { 
            System.out.println("Selection sort made fewer exchanges"); 
        } else { 
            System.out.print("Both performed the same number of exchanges"); 
        } 
    } 
    
    public static int bubbleSort(int[] arr) { 
        int count = 0; 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    count++; 
                } 
            } 
        } 
        return count; 
    } 
    
    public static int selectionSort(int[] arr) { 
        int exchangeCount = 0; 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) { 
            int minIndex = i; 
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[minIndex]) { 
                    minIndex = j; 
                } 
            } 
            if (minIndex != i) { 
                int temp = arr[i]; 
                arr[i] = arr[minIndex]; 
                arr[minIndex] = temp; 
                exchangeCount++; 
            } 
        } 
        return exchangeCount; 
    } 
}
