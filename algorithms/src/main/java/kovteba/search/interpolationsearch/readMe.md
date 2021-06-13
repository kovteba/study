# Interpolation Search


Интерполя́ция, интерполи́рование (от лат. inter–polis — «разглаженный, подновлённый, обновлённый; преобразованный») — в 
вычислительной математике нахождение неизвестных промежуточных значений некоторой функции, по имеющемуся дискретному 
набору её известных значений, определенным способом.

Используя [Формулу линейной интерполяции](https://www.matematicus.ru/vysshaya-matematika/issledovanie-funktsii/linejnaya-interpolyatsiya) мы пытаемся предсказать положения элемента в массиве .

```java
public class InterpolationSearch {

    public static int interpolationSearch(int key, int[] arr){

        int startIndex = 0;
        int lastIndex = (arr.length - 1);

        while (startIndex < lastIndex){
            int pos = startIndex + (((lastIndex-startIndex) / (arr[lastIndex]-arr[startIndex]))*(key - arr[startIndex])); // функция линейной интерполяции
            if (arr[pos] == key) {
                return pos;
            }
            if (arr[pos] < key){
                startIndex = pos + 1;
            }
            else {
                lastIndex = pos - 1;
            }
        }

        return -1;
    }
}
```