package CrockeryFactory;
abstract class CrockeryFactory {
  public Crockery makeCrockery() {
    Crockery crockery = createCrockery();
    return crockery;
    }

    abstract Crockery createCrockery();
}
