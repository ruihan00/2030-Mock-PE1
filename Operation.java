/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0233640N
 */

abstract class Operation implements Expression{
  private Expression expression1;
  private Expression expression2;
  
  public Operation(Expression e1, Expression e2) {
    this.expression1 = e1;
    this.expression2 = e2;
  }

  public static Operation of(char opr, Expression o1, Expression o2) {
    if (opr == '*') {
        return new MulOperation(o1, o2);
    } else if (opr == '+') {
        return new AddOperation(o1, o2);
    } else if (opr == '^') {
      return new XorOperation(o1, o2);
    } else {
      return null;
    }
  }

  public abstract Object eval();


  public void invalidOperand(char opr) throws InvalidOperandException {
    throw new InvalidOperandException(opr);
  }
  
  public Expression getExp1() {
    return this.expression1;
  }

  public Expression getExp2() {
    return this.expression2;
  }


}
