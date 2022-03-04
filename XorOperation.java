class XorOperation extends Operation {

  public XorOperation(Expression o1, Expression o2) {
    super(o1, o2);
  }

  @Override
  public Object eval() {
    if (super.getExp1().eval() instanceof Boolean && super.getExp2().eval() instanceof Boolean) {
      return (boolean) super.getExp1().eval() ^ (boolean) super.getExp2().eval();
    } else {
      super.invalidOperand('^');
      return null;
    }
  }
}
