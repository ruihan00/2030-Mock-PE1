/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0233640N
 */

class InvalidOperandException extends RuntimeException {
  private char invalidSymbol;

  public InvalidOperandException(char invalidSymbol) {
    super("");
    this.invalidSymbol = invalidSymbol;
  }

  @Override
  public String getMessage() {
    
    String errorMsg = String.format("ERROR: Invalid operand for operator %s", this.invalidSymbol);
    return errorMsg;
  }

}
