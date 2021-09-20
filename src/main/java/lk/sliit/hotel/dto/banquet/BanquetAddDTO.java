package lk.sliit.hotel.dto.banquet;

import java.sql.Date;

public class BanquetAddDTO {
    private int orderId;
    private int customerId;
    private String email;
    private String name;
    private String address;
    private String contactNo;
    private Date date;
    private String hallId;
    private String orderState;
    private int noOfPlates;
    private String submittedBy;
    private int menuId;
    private int banquetBillId;
    private double advanceFee;
    private double foodPrice;
    private double otherPrice;
    private double total;
    private double unitPrise;

    public BanquetAddDTO(int orderId, Date date, String hallId, int noOfPlates, int menuId) {
        this.orderId = orderId;
        this.date = date;
        this.hallId = hallId;
        this.noOfPlates = noOfPlates;
        this.menuId = menuId;
    }

    public BanquetAddDTO(int orderId, String name, Date date, int billId, double advancePayment,
                         double foodPrice, double otherPrices, double total, int noOfPlates) {
        this.orderId =orderId;
        this.name =name;
        this.date =date;
        this.noOfPlates= noOfPlates;
        this.banquetBillId =billId;
        this.total =total;
        this.foodPrice = foodPrice;
        this.otherPrice = otherPrices;
        this.advanceFee = advancePayment;
    }

    public BanquetAddDTO(int orderId, int billId, Date date, String name, String address, String hallId,
                         int menuId, int noOfPlates, double advancePayment,
                         double total, String orderState) {

        this.orderId = orderId;
        this.banquetBillId =billId;
        this.date =date;
        this.name =name;
        this.address = address;
        this.hallId = hallId;
        this.menuId =menuId;
        this.noOfPlates =noOfPlates;
        this.advanceFee =advancePayment;
        this.total =total;
        this.orderState = orderState;
    }

    public BanquetAddDTO(int orderId, int billId, Date date, String name, String address, String hallId,
                         int noOfPlates, double advancePayment, double total, String orderState) {
        this.orderId = orderId;
        this.banquetBillId =billId;
        this.date =date;
        this.name =name;
        this.address = address;
        this.hallId = hallId;
        this.noOfPlates =noOfPlates;
        this.advanceFee =advancePayment;
        this.total =total;
        this.orderState = orderState;
    }

    public BanquetAddDTO(int orderId, String name, String contactNo, Date date, String hallId,
                         int noOfPlates, double advancePayment, String orderState) {

        this.orderId = orderId;
        this.date=date;
        this.name =name;
        this.contactNo = contactNo;
        this.hallId = hallId;
        this.noOfPlates =noOfPlates;
        this.advanceFee =advancePayment;
        this.orderState = orderState;


    }

    public BanquetAddDTO(int orderId, String name, String address, Date date, String hallId,
                         int noOfPlates, int menuId, double advancePayment, int billId) {
        this.orderId = orderId;
        this.date=date;
        this.name =name;
        this.hallId = hallId;
        this.address = address;
        this.menuId =menuId;
        this.noOfPlates =noOfPlates;
        this.advanceFee =advancePayment;
        this.banquetBillId = billId;


    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

//    public int getCustomerId() {
//        return customerId;
//    }


//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }


    public BanquetAddDTO() {

    }

    public BanquetAddDTO(int orderId, int customerId, String email, String name, String address, String contactNo,
                         Date date, String hallId, String orderState, int noOfPlates, String submittedBy,
                         int menuId, int banquetBillId, double advanceFee, double foodPrice, double otherPrice,
                         double total, double unitPrice) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.email = email;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.date = date;
        this.hallId = hallId;
        this.orderState = orderState;
        this.noOfPlates = noOfPlates;
        this.submittedBy = submittedBy;
        this.menuId = menuId;
        this.banquetBillId = banquetBillId;
        this.advanceFee = advanceFee;
        this.foodPrice = foodPrice;
        this.otherPrice = otherPrice;
        this.total = total;
        this.unitPrise = unitPrice;
    }


    public BanquetAddDTO(int orderId, String name, Date date, int billId,
                         double advancePayment, double foodPrice, double otherPrices,
                         double total, double unitPrice, int noOfPlates) {
        this.orderId= orderId;
        this.name = name;
        this.date =date;
        this.banquetBillId = billId;
        this.advanceFee =advancePayment;
        this.foodPrice =foodPrice;
        this.otherPrice = otherPrices;
        this.total =total;
        this.unitPrise = unitPrice;
        this.noOfPlates = noOfPlates;
    }




    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public int getNoOfPlates() {
        return noOfPlates;
    }

    public void setNoOfPlates(int noOfPlates) {
        this.noOfPlates = noOfPlates;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getBanquetBillId() {
        return banquetBillId;
    }

    public void setBanquetBillId(int banquetBillId) {
        this.banquetBillId = banquetBillId;
    }

    public double getAdvanceFee() {
        return advanceFee;
    }

    public void setAdvanceFee(double advanceFee) {
        this.advanceFee = advanceFee;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(double otherPrice) {
        this.otherPrice = otherPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

//    public double getUnitPrice() {
//        return unitPrice;
//    }
//
//    public void setUnitPrice(double unitPrice) {
//        this.unitPrice = unitPrice;
//    }


    public double getUnitPrise() {
        return unitPrise;
    }

    public void setUnitPrise(double unitPrise) {
        this.unitPrise = unitPrise;
    }

    @Override
    public String toString() {
        return "BanquetAddDTO{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNo + '\'' +
                ", date=" + date +
                ", hallId='" + hallId + '\'' +
                ", orderState='" + orderState + '\'' +
                ", noOfPlates=" + noOfPlates +
                ", submittedBy='" + submittedBy + '\'' +
                ", menuId=" + menuId +
                ", banquetBillId=" + banquetBillId +
                ", advanceFee=" + advanceFee +
                ", foodPrice=" + foodPrice +
                ", otherPrice=" + otherPrice +
                ", total=" + total +
                ", unitPrise=" + unitPrise +
                '}';
    }


}



