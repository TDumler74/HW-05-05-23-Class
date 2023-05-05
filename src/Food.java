public class Food {
  String name;
  public Food(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void eat(){
    System.out.printf("вы сегодня уже ели "+name+"%n%n");
  }
}
