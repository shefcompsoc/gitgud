class Foo {
  private String message;
  private int test;

  Foo () {
    message = "Hello Git Workshop!";
    test = 6;
  }

  public void sayHello () {
    for (int i=0; i<test; i++) {
      System.out.println(this.message);
    }
  }
}
