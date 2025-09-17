public class PartitionArray {

    public static boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // If total sum not divisible by 3, partition not possible
        if (totalSum % 3 != 0) {
            return false;
        }

        int target = totalSum / 3;
        int count = 0, runningSum = 0;

        // Traverse the array and count partitions with target sum
        for (int i = 0; i < arr.length; i++) {
            runningSum += arr[i];
            if (runningSum == target) {
                count++;
                runningSum = 0; // reset for next partition
            }
        }

        // We need at least 3 partitions
        return count >= 3;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,2,1,-6,6,-7,9,1,2,0,1};
        int[] arr2 = {0,2,1,-6,6,7,9,-1,2,0,1};

        System.out.println("Test Case 1: " + canThreePartsEqualSum(arr1)); // true
        System.out.println("Test Case 2: " + canThreePartsEqualSum(arr2)); // false
    }
}
/*
## **Test Case 1**

**Input:**

```
arr = [0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1]
```

### Step 1: Find total sum

```
0 + 2 + 1 + (-6) + 6 + (-7) + 9 + 1 + 2 + 0 + 1 = 9
```

### Step 2: Check divisibility by 3

```
9 % 3 == 0 ✅
```

So, each partition must have sum = `9 / 3 = 3`.

### Step 3: Traverse and partition

* Running sum = 0

* Add 0 → sum = 0

* Add 2 → sum = 2

* Add 1 → sum = 3 → **Partition 1 found**

* Reset running sum = 0

* Add -6 → sum = -6

* Add 6 → sum = 0

* Add -7 → sum = -7

* Add 9 → sum = 2

* Add 1 → sum = 3 → **Partition 2 found**

* Reset running sum = 0

* Add 2 → sum = 2

* Add 0 → sum = 2

* Add 1 → sum = 3 → **Partition 3 found**

✅ We found **3 partitions with sum = 3 each**.
So **Output: true**

---

## **Test Case 2**

**Input:**

```
arr = [0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1]
```

### Step 1: Find total sum

```
0 + 2 + 1 + (-6) + 6 + 7 + 9 + (-1) + 2 + 0 + 1 = 21
```

### Step 2: Check divisibility by 3

```
21 % 3 == 0 ✅
```

So, each partition must have sum = `21 / 3 = 7`.

### Step 3: Traverse and partition

* Running sum = 0
* Add 0 → sum = 0
* Add 2 → sum = 2
* Add 1 → sum = 3
* Add -6 → sum = -3
* Add 6 → sum = 3
* Add 7 → sum = 10 (overshoots 7 ❌)
  → Already impossible to match exactly 7 here.

Even if we continue, we cannot split into **3 exact partitions of 7**.

❌ So no valid partition exists.
**Output: false**

---

✅ **Final Results**

* Test Case 1 → `true` (can partition into `[0,2,1]`, `[-6,6,-7,9,1]`, `[2,0,1]`)
* Test Case 2 → `false` (no way to split into 3 equal sums)

---

Would you like me to **modify the program to also show the actual partitions (subarrays)** when the result is `true`? That might make the explanation even clearer.

 *
 *
 *
 *
 *
 *
 */