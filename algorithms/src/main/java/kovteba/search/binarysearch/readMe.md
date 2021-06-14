# Binary Search

Суть алгоритма в том что на каждой итерации массив делится на две части и используется только
та часть в которой находится искомый элемент.

```java
public class BinarySearch {

    public static boolean binarySearch(int key, int[] arr) {

        if (arr.length == 2) {
            return key == arr[0] || key == arr[1]; // 1
        }

        int middle = (arr.length) / 2; // 2

        if (arr[middle] <= key){ // 3
            var ints = Arrays.copyOfRange(arr, middle, arr.length);
            return binarySearch(key, ints);
        } else if (arr[middle] >= key) { // 4
            var ints = Arrays.copyOfRange(arr, 0, middle);
            return binarySearch(key, ints);
        }

        return false;
    }
}
```

1. Проверяется не находится ли искомый элемент на первом или последнем месте при условии размера массива == 2.
2. Делим массив пополам.
3. Если центральный элемент меньше искомого, то передаем вторую часть массив для поиска.
4. Если центральный элемент больше искомого, то передаем для поиска первую часть массива.

Пример:
* inputaray: 1, 2, 3, 4, 5, 6, 7, 8
* elementToSearch: 3
* check if (arr[0] == 3 or arr[1] == 3 and arr.length = 2) --> false
* middle = 8 / 2 = 4
* if (arr[middle]=5 <= 3) --> false
* if (arr[middle]=5 >= 3) --> true
    * run binarySearch(3, [1, 2, 3, 4, 5])
        * check if (arr[0] == 3 or arr[1] == 3 and arr.length = 2) --> false
        * middle = 5 / 2 = 2
        * if (arr[middle]=3 <= 3) --> true
            * run binarySearch(3, [3, 4, 5])
                * check if (arr[0] == 3 or arr[1] == 3 and arr.length = 2) --> false
                * middle = 3 / 2 = 1
                * if (arr[middle]=4 <= 3) --> false
                * if (arr[middle]=4 >= 3) --> true
                    * run binarySearch(3, [3, 4])
                        * check if (arr[0] == 3 or arr[1] == 3 and arr.length = 2) --> true