# Exponential Search

Экспоненциальный поиск использует бинарный поиск, но уже на более маленьком промежутке.

```java
public class ExponentialSearch {

    public static int exponentialSearch(int[] arr, int key) {

        if (arr[0] == key) { // 1
            return 0;
        }

        if (arr[arr.length - 1] == key) { // 2
            return arr.length;
        }

        int range = 1; // 3

        while (range < arr.length && arr[range] <= key) { // 4
            range = range * 2;
        }

        return Arrays.binarySearch(arr, range / 2, Math.min(range, arr.length), key); // 5
    }
}
```

1. Проверяем первый элемент в массиве на равенство с искомым. Если есть совпадение, то возвращаем индекс = `0`.
2. Проверяем последний элемент в массиве на равенство с искомым. Если есть совпадение, то возвращаем индекс = `arr.length`.
3. Если предыдущие проверки не дали результата, то устанавливаем начала промежутка равным `1`.
4. Начинаем сужать диапазон где может находиться искомый элемент.
5. Используем бинарный поиск уже на более узком интервале значений.

Пример:
input: 1, 2, 3, 4, 5, 6, 7
element to search: 3
if arr[0] == 3 --> false
if arr[arr.length - 1] == 3 --> false
range = 1
while:
    1 loop:
        (range=1) < arr.length(7) && (arr[range]=2) <= 3 --> true
        range = 1 * 2
    2 loop:
        (range=2) < arr.length(7) && (arr[range]=3) <= 3 --> true
        range = 2 * 2
    3 loop:
        (range=4) < arr.length(7) && (arr[range]=5) <= 3 --> false
end while.
range = 4
run binarySearch with input array = [3, 4, 5]