
public class FactoryProducer {
	 public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("shape")){
	         return new shapeFactory();
	      } else if(choice.equalsIgnoreCase("color")){
	         return new colorFactroy();
	      }
	      return null;
	   }
}
