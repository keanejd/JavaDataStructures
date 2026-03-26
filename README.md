# Java Data Structures & Zoo Package

Personal Java project implementing a generic array data structure and an object-oriented zoo management system.

## Contents

- **CustArray<T>** – A generic resizable array built from scratch (no ArrayList)
- **DoubleList<T>** - A generic doubly linked list 
- **Queue<T>** - A generic Queue,  based on the doubly linked list
- **Stack<T>** - A generic Stack, based on the doubly linked list
- **Zoo Package** – Animal hierarchy with sorting via Comparator and merge sort

## Project Structure
```
JavaDataStructures/
|-- zoo/
|-- CustArray/
|-- Linear
|-- Makefile
```

## Build
```bash
make
```

## Run
```bash
make run-custarray
make run-linear
```cd 
```

## Requirements

- Java 17+
- GNU Make
## Sample Output
```
make run
```
Outputs to `CustArray_results.txt`.
Outputs to `Linear_results.txt`. 
Features tested:
- Generic array fill and display
- Overloaded constructor (array param)
- Swap, remove
- Duplicate detection and removal
- Merge sort by age (Comparator)