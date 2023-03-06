

public class Main {
  public static void main(String[] args) {
    Vendor vendor = new Vendor();

    StandardCrockeryFactory standardCrockeryFactory = new StandardCrockeryFactory();
    LuxuryCrockeryFactory luxuryCrockeryFactory = new LuxuryCrockeryFactory();

    vendor.setFactory(standardCrockeryFactory);

    vendor.runVendor();
  }
}

class Vendor {
  AbstractCrockeryFactory factory;

  void setFactory(AbstractCrockeryFactory crockeryFactory) {
    this.factory = crockeryFactory;
  }

  void runVendor(){
    Plate plate = factory.makePlate();
    Knife knife = factory.makeKnife();
    Fork fork = factory.makeFork();

    System.out.println("Plate type: " + plate.getType());
    System.out.println("Knife type: " + knife.getType());
    System.out.println("Fork type: " + fork.getType());
  }
}



abstract interface Plate {
  public String getType();
}

abstract interface Knife {
  public String getType();
}

abstract interface Fork {
  public String getType();
}

class StandardCrockeryFactory extends AbstractCrockeryFactory {
  Plate makePlate(){
    return new StandardPlate();
  }

  Knife makeKnife(){
    return new StandardKnife();
  }

  Fork makeFork(){
    return new StandardFork();
  }
}

class LuxuryCrockeryFactory extends AbstractCrockeryFactory {
  Plate makePlate(){
    return new LuxuryPlate();
  }

  Knife makeKnife(){
    return new LuxuryKnife();
  }

  Fork makeFork(){
    return new LuxuryFork();
  }
}

class StandardPlate implements Plate {
  public String getType() {
      return "Standard Plate";
  }

}

class StandardKnife implements Knife {
  public String getType() {
      return "Standard Knife";
  }

}

class StandardFork implements Fork {
  public String getType() {
      return "Standard Fork";
  }

}

class LuxuryPlate implements Plate {
  public String getType() {
      return "Luxury Plate";
  }

}

class LuxuryKnife implements Knife {
  public String getType() {
      return "Luxury Knife";
  }

}

class LuxuryFork implements Fork {
  public String getType() {
      return "Luxury Fork";
  }

}
