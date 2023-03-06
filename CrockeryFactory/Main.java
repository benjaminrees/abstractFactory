package CrockeryFactory;
public class Main {
      public static void main(String[] args) {

            // client must instatiate a new factory of that type
            Vendor vendor = new Vendor();
            vendor.setupVendor("Plate");


            vendor.runVendor();

      }
}

class Vendor {
  CrockeryFactory vendorFactory;

  void setupVendor(String crockeryType){
    if (crockeryType == "Plate"){
      vendorFactory = new PlateFactory();
    }
    if (crockeryType == "Knife"){
      vendorFactory = new KnifeFactory();
    }
    if (crockeryType == "Fork"){
      vendorFactory = new ForkFactory();
    }
  }

  void runVendor(){
    Crockery crockery = vendorFactory.createCrockery();
    System.out.println("This vendor produces items of type " + crockery.getType());
    crockery.getType();
  }

}
  
  abstract class Crockery {
       abstract String getType();
  }

  class Plate extends Crockery {
    String getType() {
        return "Plate";
    }
  
  }

  class PlateFactory extends CrockeryFactory{
    @Override
    Crockery createCrockery() {
      return new Plate();
    }
  }

  class Knife extends Crockery {
    String getType() {
        return "Knife";
    }
  
  }

  class KnifeFactory extends CrockeryFactory{
    @Override
    Crockery createCrockery() {
      return new Knife();
    }
  }

  class Fork extends Crockery {
    String getType() {
        return "Fork";
    }
  
  }

  class ForkFactory extends CrockeryFactory{
    @Override
    Crockery createCrockery() {
      return new Fork();
    }
  }
  

