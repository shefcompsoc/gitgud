class Foo {
  private String message;
  private int test;

  Foo () {
    message = "Hello Git Gud?";
    test = 5;
  }

  public void sayHello () {
    for (int i=0; i<test; i++) {
      System.out.println(this.message);
    }
  }
}
