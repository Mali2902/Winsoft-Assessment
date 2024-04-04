public class MergeArrays {

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = m - 1; // Pointer for array X
        int j = n - 1; // Pointer for array Y
        int k = m + n - 1; // Pointer for merged array

        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k--] = X[i--];
            } else {
                X[k--] = Y[j--];
            }
        }

        // Copy remaining elements of Y[] (if any) to X[]
        while (j >= 0) {
            X[k--] = Y[j--];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);

        // Print the merged array X[]
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}