# CONTENT

+ [Algorithms](algorithms)
  + Sort:
    + [Bubble Sort](algorithms/src/main/java/kovteba/sort/bubblesort/BubbleSort.java)
    + [Insertion Sort](algorithms/src/main/java/kovteba/sort/insertionsort/readMe.md)
    + [GCD Euclid](algorithms/src/main/java/kovteba/sort/euclid)
    + [Heap Sort](algorithms/src/main/java/kovteba/sort/heapsort/readMe.md)
    + [Merge Sort](algorithms/src/main/java/kovteba/sort/mergesort/readMe.md)
    + [Selection sort](algorithms/src/main/java/kovteba/sort/selectionsort/readMe.md)
  + Search:
    + [Binary Search](algorithms/src/main/java/kovteba/search/binarysearch/readMe.md)
    + [Linear Search](algorithms/src/main/java/kovteba/search/linearsearch)
    + [Exponential Search](algorithms/src/main/java/kovteba/search/exponentialsearch/readMe.md)
    + [Interpolation Search](algorithms/src/main/java/kovteba/search/interpolationsearch/readMe.md)
    + [Jump Search](algorithms/src/main/java/kovteba/search/jumpsearch/readMe.md)
  + Algorithms:
    + [Dijkstra’s algorithm](algorithms/src/main/java/kovteba/algorithm/dijkstra/readMe.md) 


+ [Collections](collections)
  + [My implementation of ArrayList](collections/src/main/java/kovteba/myarraylist)
  + [My implementation of LinkedList](collections/src/main/java/kovteba/linkedlist)
  

+ [Jackson]()
  + [@JsonFormat](jackson/src/main/java/kovteba/jsonformat)
  + [@JsonProperty](jackson/src/main/java/kovteba/jsonproperty)


+ Spring:
  + Web Servlet
    + [Spring request parameters and headers](spring-request-mapping/src/main/java/kovteba/webservlet/annotatedcontrollers/parametersheaders/readMe.md)
    + [Spring Matrix variables](spring-request-mapping/src/main/java/kovteba/webservlet/annotatedcontrollers/matrixvariables/readMe.md)
    + [Spring Consumable / Producible]()
    + [Spring Path Pattern]()


  + [Spring factory method](spring-factory-method)
  + [Spring AOP]()
    + [Before Advice](spring-aop/src/main/java/kovteba/before)
    + [After Advice](spring-aop/src/main/java/kovteba/after)
    + [Around Advice](spring-aop/src/main/java/kovteba/around)
    + [Trows Advice](spring-aop/src/main/java/kovteba/trowadvice)


  + [Spring actuator custom component](spring-actuator-health-custom-component)
  + [Spring actuator flyway](spring-actuator-flyway)
  + [Spring actuator GIT](spring-actuator-git)
  + [Spring application arguments](spring-application-arguments)
  + [Custom Spring banner](spring-banner)
  + [Spring configuration properties](spring-configuration-properties)
  + [Spring maven actuator](spring-maven-actuator)
  + [Spring maven profiles](spring-maven-profiles)

For testing all examples should run:

```shell
mvn clean install
```

And then following instruction in README file for each example.