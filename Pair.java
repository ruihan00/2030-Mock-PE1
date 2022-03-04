/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */
public class Pair<T> implements SourceList<T> {
  private T first;
  private SourceList<T> second;

  public Pair(T first, SourceList<T> second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public T getFirst() {
    return this.first;
  }

  @Override
  public SourceList<T> getSecond() {
    return this.second;
  }

  @Override
  public String toString() {
    return this.first + ", " + this.second;
  }

  // Write your code here
  //
  @Override
  public int length() {
    return 1 + this.second.length();
  }
  @Override
  public boolean equals(Object list) {
    if (list instanceof Pair) {
      Pair<?> obj = (Pair) list;
      if (this.getFirst().equals(obj.getFirst())) {
        return this.getSecond().equals(obj.getSecond());
      }
    }
    return false;
  }
  
  @Override
  public SourceList<T> filter(BooleanCondition<? super T> cond) {
    if (cond.test(this.getFirst())) {
      return new Pair<>(this.getFirst(), this.getSecond().filter(cond));
    } else {
      return this.getSecond().filter(cond);
    }

  }

  @Override
  public <U> SourceList<U> map(Transformer<? super T, ? extends U> transformer) {
    return new Pair<>(transformer.transform(this.getFirst()), this.getSecond().map(transformer));
  }
}
