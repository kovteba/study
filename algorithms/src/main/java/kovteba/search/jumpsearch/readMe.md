# Jump Search

```java
public class JumpSearch {

    public static int jumpSearch(int key, int[] arr) {

        int jumpSize = (int) Math.floor(Math.sqrt(arr.length));
        int step = jumpSize;

        while (arr[Math.min(step, arr.length) - 1] < key && step < arr.length) {
            step = step + jumpSize;
        }

        for (int i = (step - jumpSize); i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
```

* пример:
* inputarray: [1, 2, 3, 4, 5, 6, 7, 8, 9]
* elementToSearch: 7
* jumpSize = 3
* step = 3
* while
    * 1 loop (arr[3-1]=3 < 7 and 3 < 9) --> true
    * step = 3 + 3
    * 2 loop (arr[6-1]=6 < 7 and 6 < 9) --> true
    * step = 6 + 3
    * 3 loop (arr[9-1]=9 < 7 and 9 < 9) -->false
* run linear search from 6 index to arr.length