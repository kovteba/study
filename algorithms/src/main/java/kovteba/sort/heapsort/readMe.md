# Heap Sort

For find left child for element used nex formula: 2i + 1, for right child: 2i + 2.

* Example:
* INPUT ARRAY: [1, 12, 9, 5, 6, 10, 11, 12, 13]
```json
         1
       /   \
     12      9
    /  \    / \
   5    6  10  11
  / \
12   13
```
* Find max element and will set as a root element:
```json
         1
       /   \
     12      9
    /  \    / \
   5    6  10  11
  / \
12   13
```
* For find last element which have child elements: arr.length / 2 - 1; 
* Call buildHeap with next arguments: array, arr.length, arr.length / 2 - 1, 
```json
        13
       /  \
     12    11
    /  \    / \
   12   6  10  9
  / \
 1   5
```
* for (int i = n - 1; i >= 0; i--)
    * 1 loop: replace arr[0] and arr[8] 
```json
        5
       /  \
     12    11
    /  \    / \
   12   6  10  9
  / \
 1   13
```
* Call buildHeap
    * 2 loop: 
```json
        12
       /  \
     12    11
    /  \   / \
   5   6  10  9
  / \
 1   13
```
* replace arr[0] and arr[7]
```json
        1
       /  \
     12    11
    /  \   / \
   5   6  10  9
  / \
12   13
```
* Call buildHeap
    * 3 loop: 
```json
        12
       /  \
     6      11
    /  \    / \
   5    1  10  9
  / \
12   13
```
* replace arr[0] and arr[6]
```json
        9
       /  \
     6      11
    /  \    / \
   5    1  10  12
  / \
12   13
```
* Call buildHeap
    * 4 loop: 
```json
        11
       /  \
     6      10
    /  \    / \
   5    1  9  12
  / \
12   13
```
* replace arr[0] and arr[5]
```json
        9
       /  \
     6      10
    /  \    / \
   5    1  11  12
  / \
12   13
```
* Call buildHeap
    * 5 loop: 
```json
        10
       /  \
     6      9
    /  \    / \
   5    1  11  12
  / \
12   13
```
* replace arr[0] and arr[4]
```json
        1
       /  \
     6      9
    /  \    / \
   5   10  11  12
  / \
12   13
```
* Call buildHeap
    * 6 loop:
```json
        9
       /  \
     6      1
    /  \    / \
   5   10  11  12
  / \
12   13
```
* replace arr[0] and arr[3]
```json
        5
       /  \
     6      1
    /  \    / \
   9   10  11  12
  / \
12   13
```
* Call buildHeap
    * 7 loop:
```json
        6
       /  \
     5      1
    /  \    / \
   9   10  11  12
  / \
12   13
```
* replace arr[0] and arr[2]
```json
        1
       /  \
     5      6
    /  \    / \
   9   10  11  12
  / \
12   13
```
* Call buildHeap
    * 7 loop:
```json
        5
       /  \
     1      6
    /  \    / \
   9   10  11  12
  / \
12   13
```
* replace arr[0] and arr[1]
```json
        1
       /  \
     5      6
    /  \    / \
   9   10  11  12
  / \
12   13
```
