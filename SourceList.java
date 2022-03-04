/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */
interface SourceList<T> {
  T getFirst();

  SourceList<T> getSecond();
  // Write your code here
  int length();

  @Override
  boolean equals(Object list);
  
  SourceList<T> filter(BooleanCondition<? super T> cond);

  <U> SourceList<U> map(Transformer<? super T, ? extends U> transformer);
}
