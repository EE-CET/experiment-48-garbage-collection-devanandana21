public class GarbageCollection {

    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {

        GarbageCollection obj = new GarbageCollection();
        obj = null;

        try {
            new GarbageCollection().finalize();
        } catch (Throwable t) {
       
        }
    }
}

