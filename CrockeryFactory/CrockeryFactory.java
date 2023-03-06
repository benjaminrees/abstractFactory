package CrockeryFactory;
public abstract class CrockeryFactory {
  Crockery makeCrockery() {
    Crockery crockery = createCrockery();
    return crockery;
}

abstract Crockery createCrockery();
}
