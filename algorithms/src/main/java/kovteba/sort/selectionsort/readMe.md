# Selection sort

* INPUT ARRAY: [64, 25, 12, 22, 11]
  * start index = 0
    * find index for min element: `4`
    * replace arr[0] with arr[4]
    * [11, 25, 12, 22, 64]
  * start index = 1
    * find index for min element: 2
    * replace arr[1] with arr[2]
    * [11, 12, 25, 22, 64]
  * start index = 2
    * find index for min element: 3
    * replace arr[2] with arr[3]
    * [11, 12, 22, 25, 64]
  * start index = 3
    * find index for min element: 3
    * replace arr[3] with arr[3]
    * [11, 12, 22, 25, 64]
  * start index = 4
    * find index for min element: 3
    * replace arr[4] with arr[4]
    * [11, 12, 22, 25, 64]
* SORTED ARRAY: [11, 12, 22, 25, 64]