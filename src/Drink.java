public class Drink extends Food {
  //Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
  //
  //поле "газированный" (да/нет)
  //метод "открыть", который:
  //для газированного напитка печатает "пшш",
  //для негазированного - "скр"

  boolean sparkling;
  public Drink(String name,boolean sparkling) {
    super(name);
  }
  public void open(boolean sparkling){
    if (sparkling){
      System.out.println("пшш :" +" ваш напиток "+name+" газированый");
    }else {
      System.out.println("скр  - Напиток совсем без газировки");
    }
  }
}
