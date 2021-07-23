public enum Status {
    NEW("Moi ve"),
    GOOD("Tot"),
    BAD("Kem");

    private String status;

    public String getStatus() {
        return status;
    }

    public Status returnStatus(String statusInput) {
        for (Status index : Status.values()) {
            if (index.status.equalsIgnoreCase(statusInput)) {
                return index;
            }
        }
        return null;
    }

    private Status(String status) {
        this.status = status;
    }
    
}