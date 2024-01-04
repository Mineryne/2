public class Main {


    public static int task1(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void task2(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }


    public static int task4(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }


    public static boolean task5(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int task6(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }


    public static double task7(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }


    public static int task8(int a, int b) {
        if (b == 0) {
            return a;
        }
        return task8(b, a % b);
    }


    public static int task9(int n) {
        if (n <= 1) {
            return n;
        }
        return task9(n - 1) + task9(n - 2);
    }


    public static void task10(int[] arr, int N) {
        boolean[] present = new boolean[N + 1];
        for (int num : arr) {
            present[num] = true;
        }
        System.out.print("Missing elements: ");
        for (int i = 1; i <= N; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static boolean task11(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static boolean task12(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }


    public static void task13(int[] arr) {
        int maxLength = 1;
        int currLength = 1;
        int end = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currLength++;
                if (currLength > maxLength) {
                    maxLength = currLength;
                    end = i;
                }
            } else {
                currLength = 1;
            }
        }
        System.out.print("Largest increasing sequence: ");
        for (int i = end - maxLength + 1; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int task14(int[] arr) {
        int minElement = arr[0];
        int maxDiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minElement > maxDiff) {
                maxDiff = arr[i] - minElement;
            }
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return maxDiff;
    }


    public static int task15(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }


    public static void task16(int[] arr1, int[] arr2) {
        System.out.print("Common elements in both arrays: ");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
        System.out.println();
    }


    }


