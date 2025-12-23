package com.Jspider.JavaPrograms;


    /* GitHub Ready: 50 Java Array Programs
   Includes: Inbuilt vs Manual Logic & Explanations
*/

    public class JavaArrayPrograms {

        // 1. Print an Array
        public static void a1() {
            int[] arr = {10, 20, 30};
            System.out.println(java.util.Arrays.toString(arr)); // 1a. Inbuilt
            for(int i : arr) System.out.print(i + " "); // 1b. Manual
            // Explanation: Manual method uses a for-each loop to access each index memory.
        }

        // 2. Sum of Array Elements
        public static void a2(int[] arr) {
            int sum = 0;
            for(int i : arr) sum += i;
            System.out.println("Sum: " + sum);
            // Explanation: Accumulates the value of each element into a 'sum' variable.
        }

        // 3. Find Largest Element
        public static void a3(int[] arr) {
            int max = arr[0];
            for(int i=1; i<arr.length; i++) if(arr[i] > max) max = arr[i];
            System.out.println("Max: " + max);
            // Explanation: Assumes index 0 is max; updates 'max' if any element is larger.
        }

        // 4. Find Smallest Element
        public static void a4(int[] arr) {
            int min = arr[0];
            for(int i : arr) if(i < min) min = i;
            System.out.println("Min: " + min);
        }

        // 5. Average of Array Elements
        public static void a5(int[] arr) {
            double sum = 0;
            for(int i : arr) sum += i;
            System.out.println("Avg: " + (sum / arr.length));
        }

        // 6. Reverse an Array
        public static void a6(int[] arr) {
            int i = 0, j = arr.length - 1;
            while(i < j) {
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
                i++; j--;
            }
            // Explanation: Two-pointer approach swapping elements from both ends.
        }

        // 7. Search Element (Linear Search)
        public static void a7(int[] arr, int target) {
            for(int i=0; i<arr.length; i++) {
                if(arr[i] == target) { System.out.println("Found at index " + i); return; }
            }
            System.out.println("Not Found");
        }

        // 8. Sort an Array (Bubble Sort)
        public static void a8(int[] arr) {
            for(int i=0; i<arr.length-1; i++) {
                for(int j=0; j<arr.length-1-i; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
                    }
                }
            }
            // Explanation: Repeatedly compares adjacent elements and swaps the larger one to the right.
        }

        // 9. Find Second Largest
        public static void a9(int[] arr) {
            int m1 = -1, m2 = -1;
            for(int n : arr) {
                if(n > m1) { m2 = m1; m1 = n; }
                else if(n > m2 && n != m1) m2 = n;
            }
            System.out.println("Second Largest: " + m2);
        }

        // 10. Copy Elements to Another Array
        public static void a10(int[] arr) {
            int[] newArr = new int[arr.length];
            for(int i=0; i<arr.length; i++) newArr[i] = arr[i];
        }

        // 11. Find Frequency of Each Element
        public static void a11(int[] arr) {
            boolean[] visited = new boolean[arr.length];
            for(int i=0; i<arr.length; i++) {
                if(visited[i]) continue;
                int count = 1;
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[i] == arr[j]) { visited[j] = true; count++; }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }

        // 12. Left Rotate Array by 1
        public static void a12(int[] arr) {
            int first = arr[0];
            for(int i=0; i<arr.length-1; i++) arr[i] = arr[i+1];
            arr[arr.length-1] = first;
        }

        // 13. Right Rotate Array by 1
        public static void a13(int[] arr) {
            int last = arr[arr.length-1];
            for(int i=arr.length-1; i>0; i--) arr[i] = arr[i-1];
            arr[0] = last;
        }

        // 14. Remove Duplicates (Sorted Array)
        public static void a14(int[] arr) {
            int j = 0;
            for(int i=0; i<arr.length-1; i++) if(arr[i] != arr[i+1]) arr[j++] = arr[i];
            arr[j++] = arr[arr.length-1];
        }

        // 15. Merge Two Arrays
        public static void a15(int[] a, int[] b) {
            int[] res = new int[a.length + b.length];
            int k = 0;
            for(int i : a) res[k++] = i;
            for(int i : b) res[k++] = i;
        }

        // 16. Find Even and Odd numbers in Array
        public static void a16(int[] arr) {
            for(int i : arr) if(i % 2 == 0) System.out.println("Even: " + i);
        }

        // 17. Find Intersection of Two Arrays
        public static void a17(int[] a, int[] b) {
            for(int i : a) for(int j : b) if(i == j) System.out.print(i + " ");
        }

        // 18. Find Missing Number in Range (1 to N)
        public static void a18(int[] arr, int n) {
            int expected = n * (n + 1) / 2;
            int actual = 0;
            for(int i : arr) actual += i;
            System.out.println("Missing: " + (expected - actual));
        }

        // 19. Check if Array is Sorted
        public static void a19(int[] arr) {
            boolean sorted = true;
            for(int i=0; i<arr.length-1; i++) if(arr[i] > arr[i+1]) sorted = false;
            System.out.println(sorted);
        }

        // 20. Move all Zeros to the End
        public static void a20(int[] arr) {
            int count = 0;
            for(int i : arr) if(i != 0) arr[count++] = i;
            while(count < arr.length) arr[count++] = 0;
        }



        // 21. Matrix Addition (2D Array)
        public static void a21(int[][] a, int[][] b) {
            int[][] res = new int[2][2];
            for(int i=0; i<2; i++)
                for(int j=0; j<2; j++) res[i][j] = a[i][j] + b[i][j];
        }

        // 22. Transpose of a Matrix
        public static void a22(int[][] a) {
            int[][] res = new int[2][2];
            for(int i=0; i<2; i++)
                for(int j=0; j<2; j++) res[j][i] = a[i][j];
        }

        // 23. Find Duplicates in Array
        public static void a23(int[] arr) {
            for(int i=0; i<arr.length; i++)
                for(int j=i+1; j<arr.length; j++) if(arr[i] == arr[j]) System.out.println(arr[i]);
        }

        // 24. Find Smallest and Largest in 2D Array
        public static void a24(int[][] a) {
            int max = a[0][0];
            for(int[] row : a) for(int val : row) if(val > max) max = val;
            System.out.println(max);
        }

        // 25. Sort Array (Inbuilt)
        public static void a25(int[] arr) {
            java.util.Arrays.sort(arr);
        }

        // 26. Count Negative Numbers in Array
        public static void a26(int[] arr) {
            int count = 0;
            for(int i : arr) if(i < 0) count++;
            System.out.println(count);
        }

        // 27. Find Sum of Diagonal Elements (Matrix)
        public static void a27(int[][] a) {
            int sum = 0;
            for(int i=0; i<a.length; i++) sum += a[i][i];
            System.out.println(sum);
        }

        // 28. Search in Sorted Array (Binary Search)
        public static void a28(int[] arr, int key) {
            int low = 0, high = arr.length - 1;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(arr[mid] == key) { System.out.println("Found"); return; }
                if(arr[mid] < key) low = mid + 1; else high = mid - 1;
            }
        }

        // 29. Swap First and Last Element
        public static void a29(int[] arr) {
            int temp = arr[0]; arr[0] = arr[arr.length-1]; arr[arr.length-1] = temp;
        }

        // 30. Convert Array to String
        public static void a30(int[] arr) {
            System.out.println(java.util.Arrays.toString(arr));
        }

        // 31. Find Union of Two Arrays (Manual)
        public static void a31(int[] a, int[] b) {
            java.util.Set<Integer> set = new java.util.HashSet<>();
            for (int i : a) set.add(i);
            for (int i : b) set.add(i);
            System.out.println(set);
            // Explanation: A Set automatically handles uniqueness, combining all distinct elements.
        }

        // 32. Multiply Two Matrices (2D)
        public static void a32(int[][] a, int[][] b) {
            int[][] res = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) res[i][j] += a[i][k] * b[k][j];
                }
            }
            // Explanation: Standard row-by-column multiplication logic.
        }

        // 33. Find the K-th Smallest Element
        public static void a33(int[] arr, int k) {
            java.util.Arrays.sort(arr);
            System.out.println(arr[k - 1]);
            // Explanation: Sorting puts elements in order; the K-th smallest is at index K-1.
        }

        // 34. Find Pairs with Given Sum
        public static void a34(int[] arr, int sum) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == sum) System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }

        // 35. Rotate Matrix by 90 Degrees
        public static void a35(int[][] matrix) {
            // Transpose first
            for(int i=0; i<matrix.length; i++) {
                for(int j=i; j<matrix[0].length; j++) {
                    int temp = matrix[i][j]; matrix[i][j] = matrix[j][i]; matrix[j][i] = temp;
                }
            }
            // Reverse each row
            for(int[] row : matrix) {
                int i=0, j=row.length-1;
                while(i<j) { int t=row[i]; row[i]=row[j]; row[j]=t; i++; j--; }
            }
        }

        // 36. Print Matrix in Spiral Form
        public static void a36(int[][] matrix) {
            int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;
            while(top <= bottom && left <= right) {
                for(int i=left; i<=right; i++) System.out.print(matrix[top][i] + " "); top++;
                for(int i=top; i<=bottom; i++) System.out.print(matrix[i][right] + " "); right--;
                if(top <= bottom) for(int i=right; i>=left; i--) System.out.print(matrix[bottom][i] + " "); bottom--;
                if(left <= right) for(int i=bottom; i>=top; i--) System.out.print(matrix[i][left] + " "); left++;
            }
        }

        // 37. Check if Two Arrays are Equal (Manual)
        public static void a37(int[] a, int[] b) {
            if(a.length != b.length) { System.out.println(false); return; }
            for(int i=0; i<a.length; i++) if(a[i] != b[i]) { System.out.println(false); return; }
            System.out.println(true);
        }

        // 38. Find Majority Element (Boyer-Moore Voting)
        public static void a38(int[] arr) {
            int candidate = 0, count = 0;
            for (int num : arr) {
                if (count == 0) candidate = num;
                count += (num == candidate) ? 1 : -1;
            }
            System.out.println(candidate);
        }

        // 39. Peak Element (Element greater than neighbors)
        public static void a39(int[] arr) {
            for(int i=1; i<arr.length-1; i++) {
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) System.out.println(arr[i]);
            }
        }

        // 40. Largest Continuous Subarray Sum (Kadane’s Algorithm)
        public static void a40(int[] arr) {
            int maxSoFar = arr[0], currentMax = arr[0];
            for(int i=1; i<arr.length; i++) {
                currentMax = Math.max(arr[i], currentMax + arr[i]);
                maxSoFar = Math.max(maxSoFar, currentMax);
            }
            System.out.println(maxSoFar);
        }

        // 41. Sort 0s, 1s, and 2s (Dutch National Flag)
        public static void a41(int[] a) {
            int lo = 0, mid = 0, hi = a.length - 1;
            while (mid <= hi) {
                if (a[mid] == 0) { int t=a[lo]; a[lo]=a[mid]; a[mid]=t; lo++; mid++; }
                else if (a[mid] == 1) mid++;
                else { int t=a[mid]; a[mid]=a[hi]; a[hi]=t; hi--; }
            }
        }

        // 42. Find Common Elements in 3 Sorted Arrays
        public static void a42(int[] a, int[] b, int[] c) {
            int i=0, j=0, k=0;
            while(i<a.length && j<b.length && k<c.length) {
                if(a[i]==b[j] && b[j]==c[k]) { System.out.print(a[i]+" "); i++; j++; k++; }
                else if(a[i]<b[j]) i++; else if(b[j]<c[k]) j++; else k++;
            }
        }

        // 43. Find Subarray with Zero Sum
        public static void a43(int[] arr) {
            java.util.Set<Integer> set = new java.util.HashSet<>();
            int sum = 0;
            for(int i : arr) {
                sum += i;
                if(sum == 0 || set.contains(sum)) { System.out.println("Found"); return; }
                set.add(sum);
            }
        }

        // 44. Find First Repeating Element
        public static void a44(int[] arr) {
            for(int i=0; i<arr.length; i++) {
                for(int j=i+1; j<arr.length; j++) if(arr[i]==arr[j]) { System.out.println(arr[i]); return; }
            }
        }

        // 45. Find Smallest Missing Positive Integer
        public static void a45(int[] arr) {
            java.util.Arrays.sort(arr);
            int res = 1;
            for(int i : arr) if(i == res) res++;
            System.out.println(res);
        }

        // 46. Rearrange Positive and Negative Numbers
        public static void a46(int[] arr) {
            int j = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] < 0) { int t=arr[i]; arr[i]=arr[j]; arr[j]=t; j++; }
            }
        }

        // 47. Equilibrium Index (Left sum == Right sum)
        public static void a47(int[] arr) {
            int totalSum = 0, leftSum = 0;
            for(int i : arr) totalSum += i;
            for(int i=0; i<arr.length; i++) {
                totalSum -= arr[i];
                if(leftSum == totalSum) System.out.println("Index: " + i);
                leftSum += arr[i];
            }
        }

        // 48. Leaders in an Array (Greater than all elements to its right)
        public static void a48(int[] arr) {
            int max = arr[arr.length-1];
            System.out.print(max + " ");
            for(int i=arr.length-2; i>=0; i--) {
                if(arr[i] > max) { max = arr[i]; System.out.print(max + " "); }
            }
        }

        // 49. Minimum Jumps to Reach End
        public static void a49(int[] arr) {
            int jumps = 0, currentEnd = 0, farthest = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                farthest = Math.max(farthest, i + arr[i]);
                if (i == currentEnd) { jumps++; currentEnd = farthest; }
            }
            System.out.println(jumps);
        }

        // 50. Trap Rain Water Logic (Simple version)
        public static void a50(int[] h) {
            int n = h.length, res = 0;
            for (int i = 1; i < n - 1; i++) {
                int left = h[i]; for(int j=0; j<i; j++) left = Math.max(left, h[j]);
                int right = h[i]; for(int j=i+1; j<n; j++) right = Math.max(right, h[j]);
                res += Math.min(left, right) - h[i];
            }
            System.out.println(res);
        }
    }


