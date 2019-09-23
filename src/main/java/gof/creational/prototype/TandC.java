package gof.creational.prototype;

public class TandC extends PrototypeCapableDocument {

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        //Clone with Shallow copy
        TandC tandC = null;
        try {
            tandC = (TandC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tandC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}
