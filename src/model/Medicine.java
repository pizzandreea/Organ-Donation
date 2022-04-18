package model;

public class Medicine {
    private int medicineId;
    private String name;
    private int price;

    public Medicine(int medicineId, String name, int price) {
        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId='" + medicineId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
