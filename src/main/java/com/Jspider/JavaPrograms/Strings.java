package com.Jspider.JavaPrograms;

public class Strings
{
    /* GitHub Ready: 50 Java String Programs
   Includes: Inbuilt vs Manual Logic & Explanations
*/

    public class JavaStringPrograms {

        // 1. Print a String
        public static void p1() {
            String s = "Hello World";
            System.out.println(s);
            // Explanation: Prints the literal value of the string to the console.
        }

        // 2. Length of String
        public static void p2(String s) {
            System.out.println("Inbuilt: " + s.length()); // 2a
            int count = 0;
            for (char c : s.toCharArray()) count++; // 2b
            System.out.println("Manual: " + count);
            // Explanation: Manual method converts string to char array and increments a counter.
        }

        // 3. Convert to Uppercase
        public static void p3(String s) {
            System.out.println("Inbuilt: " + s.toUpperCase()); // 3a
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                res += (ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : ch; // 3b
            }
            System.out.println("Manual: " + res);
            // Explanation: Subtracting 32 from lowercase ASCII value gives Uppercase.
        }

        // 4. Convert to Lowercase
        public static void p4(String s) {
            System.out.println("Inbuilt: " + s.toLowerCase()); // 4a
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                res += (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch; // 4b
            }
            System.out.println("Manual: " + res);
            // Explanation: Adding 32 to uppercase ASCII value gives Lowercase.
        }

        // 5. Reverse a String
        public static void p5(String s) {
            System.out.println("Inbuilt: " + new StringBuilder(s).reverse()); // 5a
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i); // 5b
            System.out.println("Manual: " + rev);
            // Explanation: Loop starts from last index and appends characters backward.
        }

        // 6. Check Palindrome
        public static void p6(String s)
        {
            String rev = new StringBuilder(s).reverse().toString();
            System.out.println(s.equalsIgnoreCase(rev) ? "Palindrome" : "Not Palindrome");
            // Explanation: If string remains same after reversing, it is a palindrome.
        }

        // 7. Count Vowels
        public static void p7(String s) {
            int v = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) v++;
            }
            System.out.println("Vowels: " + v);
            // Explanation: Checks if each character exists in the reference string "aeiou".
        }

        // 8. Count Consonants
        public static void p8(String s) {
            int c = 0;
            for (char ch : s.toLowerCase().toCharArray()) {
                if (ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1) c++;
            }
            System.out.println("Consonants: " + c);
            // Explanation: Checks if it is an alphabet AND not a vowel.
        }

        // 9. Remove White Spaces
        public static void p9(String s) {
            System.out.println("Inbuilt: " + s.replaceAll("\\s", "")); // 9a
            String res = "";
            for (char c : s.toCharArray()) if (c != ' ') res += c; // 9b
            System.out.println("Manual: " + res);
            // Explanation: Manual loop appends only non-space characters to a new string.
        }

        // 10. Find Duplicate Characters
        public static void p10(String s) {
            char[] arr = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (arr[i] == arr[j]) { System.out.print(arr[i] + " "); break; }
                }
            }
            // Explanation: Nested loops compare every character with the rest of the string.
        }

        // 11. Anagram Check
        public static void p11(String s1, String s2) {
            char[] c1 = s1.toCharArray(); char[] c2 = s2.toCharArray();
            java.util.Arrays.sort(c1); java.util.Arrays.sort(c2);
            System.out.println(java.util.Arrays.equals(c1, c2));
            // Explanation: Two strings are anagrams if sorting them yields the same result.
        }

        // 12. Count Number of Words
        public static void p12(String s) {
            String[] words = s.trim().split("\\s+");
            System.out.println("Words: " + words.length);
            // Explanation: split("\\s+") breaks the string into an array at every space.
        }

        // 13. First Non-Repeated Character
        public static void p13(String s) {
            for (char i : s.toCharArray()) {
                if (s.indexOf(i) == s.lastIndexOf(i)) {
                    System.out.println("First Unique: " + i); break;
                }
            }
            // Explanation: If first and last index of a char are same, it occurs only once.
        }

        // 14. String to Integer (Manual)
        public static void p14(String s) {
            int res = 0;
            for (int i = 0; i < s.length(); i++) res = res * 10 + (s.charAt(i) - '0');
            System.out.println("Integer: " + res);
            // Explanation: (char - '0') converts ASCII digit to actual integer value.
        }

        // 15. Toggle Case (aBc -> AbC)
        public static void p15(String s) {
            String res = "";
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) res += Character.toLowerCase(c);
                else res += Character.toUpperCase(c);
            }
            System.out.println(res);
            // Explanation: Switches lowercase to uppercase and vice-versa for each char.
        }

        // 16. Remove Duplicate Characters
        public static void p16(String s) {
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                if (res.indexOf(s.charAt(i)) == -1) res += s.charAt(i);
            }
            System.out.println(res);
            // Explanation: Only appends the character if it's not already in the result string.
        }

        // 17. Find All Substrings
        public static void p17(String s) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) System.out.println(s.substring(i, j));
            }
            // Explanation: Nested loops define the start and end points for substring extraction.
        }

        // 18. Count Occurrences of a Character
        public static void p18(String s, char c) {
            int count = s.length() - s.replace(String.valueOf(c), "").length();
            System.out.println(count);
            // Explanation: Subtracts length of string without the char from original length.
        }

        // 19. Check if String contains only Digits
        public static void p19(String s) {
            System.out.println(s.matches("[0-9]+"));
            // Explanation: Regex [0-9]+ checks if every character is between 0 and 9.
        }

        // 20. Reverse Words in a Sentence
        public static void p20(String s) {
            String[] w = s.split(" "); String res = "";
            for (int i = w.length - 1; i >= 0; i--) res += w[i] + " ";
            System.out.println(res.trim());
            // Explanation: Splits into words, then iterates the array backward.
        }

        // 21. Swap Two Strings Without 3rd Variable
        public static void p21(String a, String b) {
            a = a + b;
            b = a.substring(0, a.length() - b.length());
            a = a.substring(b.length());
            System.out.println("a: " + a + " b: " + b);
            // Explanation: Concatenates strings then uses substring to separate them.
        }

        // 22. Capitalize First Letter of Each Word
        public static void p22(String s) {
            String[] w = s.split(" "); String res = "";
            for (String word : w) res += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
            System.out.println(res.trim());
            // Explanation: Uppercases the char at index 0 and joins the rest of the word.
        }

        // 23. Find the Longest Word
        public static void p23(String s) {
            String[] w = s.split(" "); String max = "";
            for (String word : w) if (word.length() > max.length()) max = word;
            System.out.println(max);
            // Explanation: Tracks the word with the highest length while iterating.
        }

        // 24. Sort String Characters Alphabetically
        public static void p24(String s) {
            char[] arr = s.toCharArray();
            java.util.Arrays.sort(arr);
            System.out.println(new String(arr));
            // Explanation: Converts string to array, sorts array, converts back to string.
        }

        // 25. Check if String is Rotation of another
        public static void p25(String s1, String s2) {
            System.out.println((s1.length() == s2.length()) && (s1 + s1).contains(s2));
            // Explanation: If s2 is a rotation, it must be hidden inside s1+s1.
        }

        // 26. Count Total Punctuation Marks
        public static void p26(String s) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if ("!.,;'?\":-".indexOf(c) != -1) count++;
            }
            System.out.println(count);
        }

        // 27. Count Frequency of Each Character
        public static void p27(String s) {
            int[] freq = new int[256];
            for (char c : s.toCharArray()) freq[c]++;
            for (int i = 0; i < 256; i++) if (freq[i] > 0) System.out.println((char)i + " " + freq[i]);
            // Explanation: Uses an integer array where indices represent ASCII values.
        }

        // 28. Remove All Vowels
        public static void p28(String s) {
            System.out.println(s.replaceAll("[aeiouAEIOU]", ""));
            // Explanation: Regex identifies all vowels and replaces them with empty string.
        }

        // 29. Check if String has only Alphabets
        public static void p29(String s) {
            System.out.println(s.matches("[a-zA-Z]+"));
        }

        // 30. Convert Integer to String
        public static void p30(int n) {
            System.out.println(String.valueOf(n)); // or Integer.toString(n)
        }

        // 31. Find Maximum Occurring Character
        public static void p31(String s) {
            int[] freq = new int[256]; char maxChar = ' '; int max = -1;
            for(char c : s.toCharArray()) { freq[c]++; if(freq[c] > max) { max = freq[c]; maxChar = c; } }
            System.out.println(maxChar);
        }

        // 32. Remove a given Character
        public static void p32(String s, char c) {
            System.out.println(s.replace(String.valueOf(c), ""));
        }

        // 33. Divide String into N equal parts
        public static void p33(String s, int n) {
            int size = s.length() / n;
            for(int i = 0; i < s.length(); i += size) System.out.println(s.substring(i, i + size));
        }

        // 34. Find Smallest and Largest Substring Lexicographically
        public static void p34(String s, int k) {
            java.util.TreeSet<String> set = new java.util.TreeSet<>();
            for(int i=0; i <= s.length()-k; i++) set.add(s.substring(i, i+k));
            System.out.println("Min: " + set.first() + " Max: " + set.last());
        }

        // 35. Check if two strings are Rotational Palindrome
        public static void p35(String s1, String s2) {
            String combined = s1 + s1;
            boolean isRotation = combined.contains(s2);
            String rev = new StringBuilder(s2).reverse().toString();
            System.out.println(isRotation && s2.equals(rev));
            // Explanation: Checks if s2 is a rotation of s1 AND s2 itself is a palindrome.
        }

        // 36. Print First letter of each word
        public static void p36(String s) {
            String[] words = s.split(" ");
            for (String w : words) if(!w.isEmpty()) System.out.print(w.charAt(0) + " ");
            // Explanation: Splits by space and accesses index 0 of every resulting string.
        }

        // 37. Convert String to char array
        public static void p37(String s) {
            char[] arr = s.toCharArray(); // Inbuilt
            // Manual
            char[] manualArr = new char[s.length()];
            for(int i=0; i<s.length(); i++) manualArr[i] = s.charAt(i);
        }

        // 38. Convert char array to String
        public static void p38(char[] arr) {
            String s = new String(arr); // Inbuilt
            String res = "";
            for(char c : arr) res += c; // Manual
            System.out.println(res);
        }

        // 39. Search word in a string
        public static void p39(String s, String word) {
            System.out.println(s.contains(word)); // Inbuilt
            System.out.println(s.indexOf(word) != -1); // Manual logic
        }

        // 40. Find Last index of a character
        public static void p40(String s, char c) {
            System.out.println(s.lastIndexOf(c)); // Inbuilt
            int index = -1;
            for(int i=0; i<s.length(); i++) if(s.charAt(i) == c) index = i;
            System.out.println(index); // Manual
        }

        // 41. Trim leading and trailing spaces
        public static void p41(String s) {
            System.out.println(s.trim()); // Inbuilt
            // Manual: Find first non-space and last non-space index, then use substring.
        }

        // 42. Replace space with specific character
        public static void p42(String s, char ch) {
            System.out.println(s.replace(' ', ch));
        }

        // 43. Determine if two strings are equal (Manual)
        public static void p43(String s1, String s2) {
            if(s1.length() != s2.length()) { System.out.println(false); return; }
            boolean equal = true;
            for(int i=0; i<s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)) { equal = false; break; }
            }
            System.out.println(equal);
        }

        // 44. Count vowels, consonants, digits, and special characters
        public static void p44(String s) {
            int v=0, c=0, d=0, sp=0;
            for(char ch : s.toLowerCase().toCharArray()) {
                if(ch >= 'a' && ch <= 'z') {
                    if("aeiou".indexOf(ch) != -1) v++; else c++;
                } else if(ch >= '0' && ch <= '9') d++;
                else sp++;
            }
            System.out.println("V:" + v + " C:" + c + " D:" + d + " S:" + sp);
        }

        // 45. Find all permutations of a string
        public static void p45(String str, String ans) {
            if (str.length() == 0) { System.out.print(ans + " "); return; }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                p45(ros, ans + ch);
            }
        }

        // 46. Check if string is a valid numeric
        public static void p46(String s) {
            try { Double.parseDouble(s); System.out.println(true); }
            catch(Exception e) { System.out.println(false); }
        }

        // 47. Insert a string into another string
        public static void p47(String original, String insert, int index) {
            String res = original.substring(0, index + 1) + insert + original.substring(index + 1);
            System.out.println(res);
        }

        // 48. Remove all special characters
        public static void p48(String s) {
            System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
            // Explanation: Regex [^...] means "everything except" alphabets and numbers.
        }

        // 49. Find common characters between two strings
        public static void p49(String s1, String s2) {
            for(char c : s1.toCharArray()) {
                if(s2.indexOf(c) != -1) System.out.print(c + " ");
            }
        }

        // 50. Repeat characters twice (abc -> aabbcc)
        public static void p50(String s) {
            String res = "";
            for(char c : s.toCharArray()) res = res + c + c;
            System.out.println(res);
        }

    }
}
