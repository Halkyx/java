public enum Weekday {
    MONDAY("Thứ hai"),
    TUESDAY("Thứ ba"),
    WEDNESDAY("Thứ tư"),
    THURSDAY("Thứ năm"),
    FRIDAY("Thứ sáu"),
    SATURDAY("Thứ bảy"),
    SUNDAY("Chủ nhật");
    
    String value;

    //constructor: hàm tạo là phương thức sử dụng để khởi tạo đối tuonwgj
    private Weekday(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}
