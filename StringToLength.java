/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */

class StringToLength implements Transformer<String, Integer> {
  
  @Override
  public Integer transform(String str) {
    return str.length();
  }

}
