# Review on Arrays

What is an array?
- Something that holds a set of values
- has a set number of slots (immutable/static)
- data structures
- MUST be the same data type

## Intialization of array:

```java
int [] myArray = new int[10];
```
- Arrays default to a specific value
### Template for Intialization

(dataType) [] arrayName = new (dataType)[SIZE];

## Declaration of array:

```java
int [] numbers = new int[3];
numbers[0] = 1;
numbers[2] = 3;
numbers[1] = 2;
```

```java 
int [] scores = {1, 3, 2};
```

## Traversal (Traversing)

- Traverse: to travel across or through

In the context of programming, this is usually done inside data structures

- What are we traveling/traversing across in arrays?
  indices/index

**How to traverse & print**
```java

String [] restaurantList = {"Chick-Fil-A", "In-N-Out", "Chipotle"};
for(int i = 0; i < restaurantList.length; i++){
  System.out.println(restaurantList[i]);
}
```
**How to find total sum of int/double array**
```java
int [] age = { 10, 80, 110, 300, 25};
int sum = 0;
for(int i = 0; i < age.length; i++){
  //sum = sum + age[i];
  sum+= age[i];
}
```

**How to find the average of an int/double array**
```java
int [] age = { 10, 80, 110, 300, 25};
int sum = 0;
for(int i = 0; i < age.length; i++){
  //sum = sum + age[i];
  sum+= age[i];
}

int truncAverage = sum / age.length; //truncated Average
double average = sum/ age.length;  //Normal Average
```




