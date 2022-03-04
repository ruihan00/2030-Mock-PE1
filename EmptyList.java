/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */
public class EmptyList<T> implements SourceList<T> {
  
  @Override
  public T getFirst() {
    return null;
  }

  @Override
  public SourceList<T> getSecond() {
    return null;
  }

  @Override
  public String toString() {
    return "EmptyList";
  }

  // Write your code here
  @Override
  public int length() {
    return 0;
  }
  @Override
  public boolean equals(Object list) {
    return list instanceof EmptyList;    
  }
  @Override
  public SourceList<T> filter(BooleanCondition<? super T> cond) {
    return this;
  }

  @Override
  public <U> SourceList<U> map(Transformer<? super T, ? extends U> transformer) {
    return new EmptyList<U>();
  }
}
