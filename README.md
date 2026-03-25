# Java Data Structures & Zoo Package

Personal Java project implementing a generic array data structure and an object-oriented zoo management system.

## Contents

- **CustArray<T>** – A generic resizable array built from scratch (no ArrayList)
- **Zoo Package** – Animal hierarchy with sorting via Comparator and merge sort

## Build
```bash
make
```

Produces `zoo.jar`.

## Run
```bash
make run
```

## Project Structure
```
.
├── CustArray.java       # Generic array implementation
├── TestArray.java       # CustArray tests
├── zoo/
│   ├── Animal.java
│   ├── AnimalTest.java
│   └── ...
└── Makefile
```

## Requirements

- Java 17+
- GNU Make
## Sample Output
```
make run
```

Outputs to `CustArray_results.txt`. Features tested:
- Generic array fill and display
- Overloaded constructor (array param)
- Swap, remove
- Duplicate detection and removal
- Merge sort by age (Comparator)