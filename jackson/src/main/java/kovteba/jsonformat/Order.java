package kovteba.jsonformat;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Order {

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MMMM-dd HH:mm:ss z", timezone = "EST")
    private Date orderDate;

    @JsonFormat(shape=JsonFormat.Shape.NUMBER)
    private Date date;

    public Order() {
    }

    public Order(Date orderDate, Date date) {
        this.orderDate = orderDate;
        this.date = date;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
