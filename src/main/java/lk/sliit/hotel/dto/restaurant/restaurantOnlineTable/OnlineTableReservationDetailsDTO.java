package lk.sliit.hotel.dto.restaurant.restaurantOnlineTable;



public class OnlineTableReservationDetailsDTO {

    private int onlineTableReservation;
    private int tableId;
    private double quantity;
    private double unitePrice;
    private String place;

    public OnlineTableReservationDetailsDTO(int onlineTableReservation, int tableId, double quantity, double unitePrice) {
        this.onlineTableReservation = onlineTableReservation;
        this.tableId = tableId;
        this.quantity = quantity;
        this.unitePrice = unitePrice;
    }

    public OnlineTableReservationDetailsDTO(int onlineTableReservation, int tableId, double quantity, double unitePrice, String place) {
        this.onlineTableReservation = onlineTableReservation;
        this.tableId = tableId;
        this.quantity = quantity;
        this.unitePrice = unitePrice;
        this.place = place;
    }

    public OnlineTableReservationDetailsDTO() {
    }

    public int getOnlineTableReservation() {
        return onlineTableReservation;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setOnlineTableReservation(int onlineTableReservation) {
        this.onlineTableReservation = onlineTableReservation;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(double unitePrice) {
        this.unitePrice = unitePrice;
    }

    @Override
    public String toString() {
        return "OnlineTableReservationDetailsDTO{" +
                "onlineTableReservation='" + onlineTableReservation + '\'' +
                ", tableId='" + tableId + '\'' +
                ", quantity=" + quantity +
                ", unitePrice=" + unitePrice +
                '}';
    }
}
