public class Main {

  public static void main(String[] args) {

    //Создать класс Food (еда). В классе должны быть:
    //
    //поле "название"
    //конструктор, геттер, сеттер
    //метод "употребить еду" с каким-нибудь выводом
    //Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
    //
    //поле "газированный" (да/нет)
    //метод "открыть", который:
    //для газированного напитка печатает "пшш",
    //для негазированного - "скр"

    Food pizza = new Food("Pizza Salami");
    pizza.eat();




    Drink drink =new Drink("Fanta");
    System.out.println( drink.getName());
    drink.open(true);




  }

  //вы сегодня уже ели Pizza Salami
  //пшш : ваш напиток Fanta газированый
}