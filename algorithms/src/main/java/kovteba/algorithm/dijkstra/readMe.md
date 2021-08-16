# Dijkstra

* INPUT STRING: ( 1 + ( 2 * 2 ) + 1 ) 
* `(` -> break
* `1` -> add `1` to queue of values
  * queue of values: [1]
  * queue of operations: []
* `+` -> add `+` to queue of operations
  * queue of values: [1]
  * queue of operations: [+]
* `(` -> break
* `2` -> add `2` to queue of values
  * queue of values: [1, 2]
  * queue of operations: [+]
* `*` -> add `*` to queue of operations
  * queue of values: [1, 2]
  * queue of operations: [+, *]
* `2` -> add `2` to queue of values
  * queue of values: [1, 2, 2]
  * queue of operations: [+, *]
* `)` 
  * v1 = values.pop() = 2
  * v2 = values.pop() = 2
  * op = operations.pop() = *
  * values.push = v1 op v2
  * queue of values: [1, 4]
  * queue of operations: [+]
* `+` -> add `+` to queue of operations
  * queue of values: [1, 4]
  * queue of operations: [+, +]
* `1` -> add `1` to queue of values
  * queue of values: [1, 4, 1]
  * queue of operations: [+, +]
* `)`
  * v1 = values.pop() = 1
  * v2 = values.pop() = 4
  * op = operations.pop() = +
  * values.push = v1 op v2
  * queue of values: [1, 5]
  * queue of operations: [+]
* while operations not empty
  * v1 = values.pop() = 5
  * v2 = values.pop() = 1
  * op = operations.pop() = +
  * values.push = v1 op v2
  * queue of values: [6]
  * queue of operations: []
* RESULT: values.pop = 6