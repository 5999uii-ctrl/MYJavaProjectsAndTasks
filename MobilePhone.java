class MobilePhone {

    String brandName;
    int ramGB;
    int storageGB;
    double price;
    boolean is5GSupported;

    // 5-parameter Constructor
    MobilePhone(
            String brandName,
            int ramGB,
            int storageGB,
            double price,
            boolean is5GSupported
    ) {

        this.brandName = brandName;
        this.ramGB = ramGB;
        this.storageGB = storageGB;
        this.price = price;
        this.is5GSupported = is5GSupported;
    }
}

