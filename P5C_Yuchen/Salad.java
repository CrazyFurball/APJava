public class Salad implements MenuItem
   {
      String name;
      double price;
      
      public Salad(String iName, double iPrice)
      {
          name=iName;
          price=iPrice;
      }
      
      public String getName()
      {
          return name;
      }
      
      public double getPrice()
      {
          return price;
      }
   } // end class Salad