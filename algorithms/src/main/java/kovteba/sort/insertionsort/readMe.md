# Insertion Sort

```java
public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int value;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        return arr;
    }
}
```

* Пример:
* inputarray: 2, 0, 1, 4
* for (i = 1, i < arr.length, i++)
    * 1 loop:
        * i=1
        * value = arr[i]=0
        * j = i - 1 = 0
            * while (j(0) >= 0 and arr[j]=2 > value=0) --> true
                * arr[1] = arr[0]
                * j = -1
            * while (j(-1) >= 0 and arr[j]=2 > value=0) --> false
        * arr[j + 1] == value=2
        * tmp value array: [0, 2, 1, 4]
    * 2 loop:
        * i=2
        * value = arr[i] = 1
        * j = i - 1 = 1
        * while (j(1) >= 0 and arr[j]=2 > value=1) --> true
            * arr[2] = arr[1]
            * j= j - 1 = 0
        * while (j(0) >= 0 and arr[j]=0 > value=1) --> false
        * arr[j + 1] == value=1
        * tmp value array: [0, 1, 2, 4]
    * 3 loop:
        * i = 3
        * value = arr[i] = 4
        * j = i - 1 = 2   
        * while (j(2) >= 0 and arr[j]=2 > value=4) --> false
* END.