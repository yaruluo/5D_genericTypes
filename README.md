# generic types

exercises in using classes that are parameterized with
generic types

## in [`Pair` example](https://github.com/stuyvesant-cs/solutionsHolmes/tree/master/2019-04-05_PairOfGenerics)

For each item in this section, find exemplifying code in the `Pair` example.
>For easy reference in the future, take advantage of
GitHub's "Copy permalink" command: click on a line number,
then click on the resulting ellipsis. Use the permalink as the URL
in [GitHub-Flavored Markdown](https://help.github.com/en/articles/basic-writing-and-formatting-syntax#links).


- (an example of this task) the declaration of a `main` method:
```
public static void main(String[] args)
```
in [UserSavedByCompiler](https://github.com/stuyvesant-cs/solutionsHolmes/blob/21b641c9dda3c43d3e71de138c24c29f11687d88/2019-04-05_PairOfGenerics/UserSavedByCompiler.java#L11)


- definition that a class / type that is parameterized by a generic type, `T`:
```
public class Pair<T>
```
in [Pair](https://github.com/yaruluo/5D_genericTypes/blob/1c785802a52a19b5a126f3139b95951b725176b1/Pair.java#L8)


- declaration of a variable that can hold a reference to an instance
of such a class:
```
private T first;
```
in [Pair](https://github.com/yaruluo/5D_genericTypes/blob/master/Pair.java)


- assignment to such a variable:
```
this.first =  first;
```
in [Pair](https://github.com/yaruluo/5D_genericTypes/blob/1c785802a52a19b5a126f3139b95951b725176b1/Pair.java#L14)


- declaration of a method that returns an instance of such a type:
```
public static Pair<String> minmax( String[] a)
```
in [UserOfPair](https://github.com/stuyvesant-cs/solutionsHolmes/blob/650c94c91da1ad1b815e13c35c5816c2419446e5/2019-04-05_PairOfGenerics/UserOfPair.java#L30)


- successful instantiation of an instance of such a class:
```
new Pair<String>( min, max);
```
in [UserOfPair](https://github.com/stuyvesant-cs/solutionsHolmes/blob/650c94c91da1ad1b815e13c35c5816c2419446e5/2019-04-05_PairOfGenerics/UserOfPair.java#L46)


- *un*successful instantiation of an instance of such a class,
caught by the compiler:
```
new Pair<String>( "a string", Integer.valueOf( 7));
```
in [UserSavedByCompiler](https://github.com/stuyvesant-cs/solutionsHolmes/blob/650c94c91da1ad1b815e13c35c5816c2419446e5/2019-04-05_PairOfGenerics/UserSavedByCompiler.java#L12)


- a variable that can hold a reference to an instance of the generic type
in a class / type that is parameterized by a generic type:
```
Pair<Integer> pair = new Pair<Integer>(bigger, smaller);
```
in [FibPair](https://github.com/yaruluo/5D_genericTypes/blob/1c785802a52a19b5a126f3139b95951b725176b1/FibPair.java#L37)


- the declaration of a method or constructor that accepts a parameter of a generic type:
```
private static Pair<Integer> nextPairAfter(Pair<Integer> oldPair) {
```
in [FibPair](https://github.com/yaruluo/5D_genericTypes/blob/1c785802a52a19b5a126f3139b95951b725176b1/FibPair.java#L56)


- the declaration of a method that returns a value of a generic type:
```
public T getFirst()  { return first; }
public T getSecond() { return second; }
```
in [Pair](https://github.com/yaruluo/5D_genericTypes/blob/4ad6c8e36d9163d18680edfbe4d8498a0524b168/Pair.java#L18-L19)
