class AddOperation extends Operation {

  public AddOperation(Expression o1, Expression o2) {
    super(o1, o2);
  }

  @Override
  public Object eval() {
    if (super.getExp1().eval() instanceof String && super.getExp2().eval() instanceof String) {
      return (String) super.getExp1().eval() + (String) super.getExp2().eval();
    } else {
      super.invalidOperand('+');
      return null;
    }
  }


}
