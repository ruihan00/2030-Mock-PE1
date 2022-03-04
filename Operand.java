/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0233640N
 */

class Operand implements Expression{
  private Object operand;
  
  public Operand(Object operand) {
    this.operand = operand;
  }
  

  public Object eval() {
    return this.operand;
  }




}
