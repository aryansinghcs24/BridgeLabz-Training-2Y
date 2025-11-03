class PrototypeModel implements Cloneable {
    String modelName;

    PrototypeModel(String modelName) {
        this.modelName = modelName;
    }

    @Override
    @SuppressWarnings("CloneDeclaresCloneNotSupported")
    public PrototypeModel clone() {
        try {
            return (PrototypeModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }

    @Override
    public String toString() {
        return "PrototypeModel{" + "modelName='" + modelName + '\'' + '}';
    }
}

public class Cloning_Prototype_Objects {
    public static void main(String[] args) {
        PrototypeModel original = new PrototypeModel("Alpha");
        PrototypeModel clone = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}
