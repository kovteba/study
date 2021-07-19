# Merge Sort

* Example
* INPUT VALUE: 44, 69, 85, 79, 36, 98
* 1 loop:
    * merge([69], [85])
    * 0 == arr1.length -> false
    * 0 == arr2.length -> false
    * 44 < 69 -> true
    * arr[0]=69
    * 1 == arr1.length ->true
    * arr[1]=85
    * merge return [69, 85]
* 2 loop:
    * merge([44], [69, 85])
    * 0 == arr1.length -> false
    * 0 == arr2.length -> false
    * 44 < 69 -> true
    * arr[0]=44
    * 1 == arr1.length -> true
    * arr[1]=69
    * 1 == arr1.length -> true
    * arr[2]=85
    * merge return [44, 69, 85]
* 3 loop:
    * merge([36], [98])
    * 0 == arr1.length -> false
    * 0 == arr2.length -> false
    * 36 < 98 -> true
    * arr[0]=36
    * 1 == arr1.length -> true
    * arr[1]=98
    * merge return [36, 98]
3 loop:
    * merge([79], [36, 98])
    * 0 == arr1.length -> false
    * 0 == arr2.length -> false  
    * 79 < 36 -> false
    * arr[0]=36
    * 0 == arr1.length -> false
    * 1 == arr2.length -> false
    * 79 < 98 -> true
    * arr[1]=79
    * 1 == arr1.length -> true
    * arr[2]=98
    * merge return [36, 79, 98]
4 loop:
    * merge([44, 69, 85], [36, 79, 98])
    * 0 == arr1.length -> false
    * 0 == arr2.length -> false 
    * 44 < 36 -> false
    * arr[0]=36
    * 0 == arr1.length -> false
    * 1 == arr2.length -> false
    * 44 < 79 - true
    * arr[1]=44
    * 1 == arr1.length -> false
    * 1 == arr2.length -> false 
    * 69 < 79 -> true
    * arr[2]=69
    * 2 == arr1.length -> false
    * 1 == arr2.length -> false 
    * 85 < 79 -> false
    * arr[3]=79
    * 2 == arr1.length -> false
    * 2 == arr2.length -> false 
    * 85 < 98 -> true
    * arr[4]=85
    * 3 == arr1.length -> true
    * arr[5]=98
    * merge return [36, 44, 69, 79, 85, 98]
    