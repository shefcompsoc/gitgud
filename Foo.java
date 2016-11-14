class Foo {
  private String message;

  Foo () {
    message = "Hello Git Gud!";
  }

  public void sayHello () {
    System.out.println(this.message);
  }

  public static void main(String[] args) {
    new Foo().sayHello();
  }
}
