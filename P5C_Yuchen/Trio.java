public class Trio
   {

      String name;
      double price;
      
      public Trio(Sandwich sandwich, Salad salad, Drink drink)
      {
          name=sandwich.getName()+"/"+salad.getName()+"/"+drink.getName()+" Trio";
          
          price=sandwich.getPrice()+salad.getPrice()+drink.getPrice()-Math.min(drink.getPrice(),Math.min(sandwich.getPrice(), salad.getPrice()));
      }
      
      public String getName()
      {
          return name;
        }
      public double getPrice()
      {
          return price;
      }
    
   } // end class Trio
    