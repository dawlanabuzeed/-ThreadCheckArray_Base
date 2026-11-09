# ThreadCheckArray – Multithreaded Subset Sum

## Project Overview

This project implements a recursive multithreaded Subset Sum algorithm using Java. The primary components of the project include:

1. **SharedData.java**: This class holds shared data that is accessed and modified by multiple threads.
2. **ThreadCheckArray.java**: This class implements the Runnable interface to perform the Subset Sum algorithm concurrently using two threads.
3. **TestThreadCheckArray.java**: This class provides a user interface for testing the functionality of the Subset Sum algorithm.

## Recursive Multithreaded Subset Sum Algorithm

The Subset Sum problem is a classic decision problem: given a collection of integers and a target value `b`, determine whether some subset of the integers sums exactly to `b`. In this project, two threads search the recursion tree in parallel: `thread1` explores the branch that includes the last element and `thread2` the branch that excludes it. The first thread to find a solution sets the shared flag so the other thread can stop.

### Thread Synchronization

To ensure thread safety and avoid race conditions, the following synchronization mechanisms are used:

- **Synchronized Blocks**: The `ThreadCheckArray` class uses synchronized blocks to lock on the `SharedData` object when accessing or modifying shared data.
- **Flags**: A boolean flag is used to signal when a valid subset sum has been found. This flag is checked and modified within the synchronized blocks.

### Implementation Details

The `rec` method in the `ThreadCheckArray` class performs the recursive calculation. Each thread explores two possibilities at each step: including the current element in the subset or excluding it. The threads use the shared data to keep track of their progress and communicate using synchronization mechanisms.

## Data Structure Refactoring to ArrayList

The original code stored the numbers in a primitive array (`int[] array`). As part of the refactoring (done with the Continue AI assistant), we switched to using an `ArrayList<Integer>` to store the numbers. This change provides several benefits:

- **Dynamic Sizing**: The `ArrayList` can dynamically grow and shrink as needed.
- **Convenience**: ArrayLists offer built-in methods like `get`, `set`, and `add` which simplify the code.
- **Efficiency**: Under the hood, `ArrayList` is implemented with a dynamic array, providing efficient access and modification times.

## Code Documentation with Javadoc

Documentation is an essential aspect of any software project. In this project, we have used Javadoc comments to document our code:

- **Class-Level Comments**: Each class has a description of its purpose.
- **Method-Level Comments**: Each method includes parameters, return values, and descriptions of what the method does.
- **Field-Level Comments**: All fields are documented with their types and purposes.

This documentation makes it easier for other developers to understand and work with the code.

## Authors and Git Collaboration Roles

### Authors
- **Student A**: Dawlan Abuzeed (GitHub: dawlanabuzeed)
- **Student B**: Mohamad Dabdoub

### Git Collaboration Roles
- **Student A (repository creator, `main` branch)**: created the local and remote repository, pushed the initial commit, refactored `SharedData.java` and `ThreadCheckArray.java` to `ArrayList<Integer>` with Javadoc, and wrote this README.
- **Student B (collaborator, `feature/arraylist-refactor-b` branch)**: cloned the repository, refactored `TestThreadCheckArray.java` and `ThreadCheckArray.java` with a custom AI prompt, merged the feature branch into `main`, and resolved the merge conflict with IntelliJ's 3-Way Merge tool.

## Licensing

This project is licensed under the 'Braude College Academic License'. It was developed for academic use in the Software Engineering Methods course at Braude College of Engineering.

