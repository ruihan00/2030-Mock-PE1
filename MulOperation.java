class MulOperation extends Operation {
  public MulOperation(Expression o1, Expression o2) {
    super(o1, o2);
  }

  @Override
  public Object eval() {
    if (super.getExp1().eval() instanceof Integer && super.getExp2().eval() instanceof Integer) {
      return (int) super.getExp1().eval() * (int) super.getExp2().eval();
    } else {
      super.invalidOperand('*');
      return null;
    }
  }



}
