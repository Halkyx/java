  
import java.util.HashMap;
import java.util.Map;

public enum TypeProduct {
    NULL(null), FOOD("Thuc pham"), HOUSEWARE("Do gia dung"), COSMETICS("My pham"), FASHION("Thoi trang");

    private String type;
    private static Map<String, TypeProduct> mapID = new HashMap<String, TypeProduct>();

    static {
        for (TypeProduct typeIter : TypeProduct.values()) {
            mapID.put(typeIter.getType(), typeIter);
        }
    }

    public String getType() {
        return type;
    }

    private TypeProduct(String type) {
        this.type = type;
    }

    public TypeProduct getENum(String input) {
        return mapID.get(input);
    }
}