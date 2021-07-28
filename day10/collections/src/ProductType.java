import java.util.HashMap;
import java.util.Map;

public enum ProductType {

    NULL(null),FOOD("Thuc an"), HOUSEWARE("Do gia dung"), CLOTHES("Quan ao"), MAKEUP("My pham");

    private String type;
    private static Map<String, ProductType> map = new HashMap<String, ProductType>();

    static {
        for (ProductType eNumType : ProductType.values()) {
            map.put(eNumType.type, eNumType);
        }
    }

    public String getType() {
        return type;
    }

    private ProductType(String type) {
        this.type = type;
    }

    public ProductType getENum(String input) {
        return map.get(input);
    }

}