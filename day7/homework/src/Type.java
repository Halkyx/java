public enum Type {
    PHONE("Dien thoai", 1), 
    LAPTOP("May tinh", 2), 
    ACCESSORIES("Phu kien", 3), 
    CLOCK("Dong ho", 4);

    private String name;
    private int order;
    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    private Type(String name, int order) {
        this.name = name;
        this.order = order;
    }
    



    
    
}