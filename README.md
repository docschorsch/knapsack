# knapsack
Java solution to famous knapsack problem, recursive and with only 2 parameters method call

Following is a solution to the (in)famous knapsack problem. I will not go into depth about the problem itself nor the different approaches to solve it. I rather implemented the recursive solution in Java.
However, while similar solutions found online use 4 parameters in the method call (e.g. here: https://www.baeldung.com/java-knapsack), my goal was to implement it only with two parameters, one of them being the ArrayList of items with their respective weight and value (public int maximumValue(int capacity, ArrayList<Item> items)).
  
I took this approach because of the exercism.io challenge (by the way a brilliant website imho, thanks for the contributors), where the JUnit tests require the method maximumValue just like that.
