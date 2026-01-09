package Practice;

public class binearysearch {
    public static void main(String[] args) {
        // Test case 1: [0,1,0]
        int[] arr1 = {0,1,0};
        System.out.println("Peak index for [0,1,0]: " + peakIndexInMountainArray(arr1)); // Expected: 1
        
        // Test case 2: [0,2,1,0]
        int[] arr2 = {0,2,1,0};
        System.out.println("Peak index for [0,2,1,0]: " + peakIndexInMountainArray(arr2)); // Expected: 1
        
        // Test case 3: [0,10,5,2]
        int[] arr3 = {0,10,5,2};
        System.out.println("Peak index for [0,10,5,2]: " + peakIndexInMountainArray(arr3)); // Expected: 1
        
        // Test case 4: [3,4,5,1]
        int[] arr4 = {3,4,5,1};
        System.out.println("Peak index for [3,4,5,1]: " + peakIndexInMountainArray(arr4)); // Expected: 2
    }
    
   
        public static int peakIndexInMountainArray(int[] arr) {
            int low = 0;
            int high = arr.length - 1;
            while (low < high) {
                int mid = (low + high) / 2;
                if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

