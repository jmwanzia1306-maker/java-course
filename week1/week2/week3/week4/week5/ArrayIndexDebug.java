package week2.week3.week4.week5;

public java
// This program contains array index errors. Can you find and fix them?

public class ArrayIndexDebug {
public static void main(String[] args) {

// Declare an array of 5 elements.
int[] numbers = {10, 20, 30, 40, 50};

// ============================================================
// BUG 1: Off-by-one error in loop condition
// ============================================================

System.out.println("=== BUG 1 ===");

// The intention: print all 5 elements.
// BUG: i <= numbers.length allows i to reach 5.
// Valid indices are 0, 1, 2, 3, 4. Index 5 is out of bounds.
// FIX: Change <= to <.
for (int i = 0; i <= numbers.length; i++) {
System.out.println("numbers[" + i + "] = " + numbers[i]);

}

// ============================================================
// BUG 2: Accessing invalid index directly
// ============================================================

System.out.println("\n=== BUG 2 ===");

// The intention: access the last element.
// BUG: numbers[5] is out of bounds for a length-5 array.
// FIX: Use numbers.length - 1 instead of a hardcoded value.
System.out.println("Last element: " + numbers[5]);

// ============================================================
// BUG 3: Negative index
// ============================================================

System.out.println("\n=== BUG 3 ===");

// The intention: access the first element.
// BUG: Index -1 is invalid; arrays start at index 0.
// FIX: Use index 0.
System.out.println("First element: " + numbers[-1]);
}
}

Step 6.2: Identify the Bugs
Bug 1:
• Problem: i <= numbers.length allows i to reach numbers.length (which is 5).
• Fix: Change <= to < (so i goes from 0 to 4).
Bug 2:
• Problem: Hardcoded index 5 is out of bounds for an array of length 5.
• Fix: Use numbers.length - 1 (which is 4).
Bug 3:
• Problem: Index -1 is invalid; arrays start at index 0.
• Fix: Use index 0.
Step 6.3: Create the Fixed Version
Create a new file called FixedArrays.java:
java
// This program contains the corrected versions of the array bugs.

public class FixedArrays {
public static void main(String[] args) {

// Declare an array of 5 elements.
int[] numbers = {10, 20, 30, 40, 50};

// ============================================================
// FIXED BUG 1: Print all elements
// ============================================================

System.out.println("=== FIXED BUG 1 ===");

// FIX: Change <= to <. Now i goes from 0 to 4.
for (int i = 0; i < numbers.length; i++) {
System.out.println("numbers[" + i + "] = " + numbers[i]);
}

// ============================================================
// FIXED BUG 2: Access last element
// ============================================================

System.out.println("\n=== FIXED BUG 2 ===");

// FIX: Use numbers.length - 1 to get the last valid index.
System.out.println("Last element: " + numbers[numbers.length - 1]);

// ============================================================
// FIXED BUG 3: Access first element
// ============================================================

System.out.println("\n=== FIXED BUG 3 ===");

// FIX: Use index 0 to get the first element.
System.out.println("First element: " + numbers[0]);

System.out.println("\nAll arrays accessed safely!");
}
}