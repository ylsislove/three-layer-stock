package com.yain.gupiao.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/13 12:56
 */
@Entity
public class Gupiao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private double b_c_price;
    private double o_price;
    private double top_price;
    private double floor_price;
    private double c_price;
    private long trade_num;
    private long trade_money;

    public Gupiao() {
    }

    public Gupiao(String date, double b_c_price, double o_price, double top_price, double floor_price, double c_price, long trade_num, long trade_money) {
        this.date = date;
        this.b_c_price = b_c_price;
        this.o_price = o_price;
        this.top_price = top_price;
        this.floor_price = floor_price;
        this.c_price = c_price;
        this.trade_num = trade_num;
        this.trade_money = trade_money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getB_c_price() {
        return b_c_price;
    }

    public void setB_c_price(double b_c_price) {
        this.b_c_price = b_c_price;
    }

    public double getO_price() {
        return o_price;
    }

    public void setO_price(double o_price) {
        this.o_price = o_price;
    }

    public double getTop_price() {
        return top_price;
    }

    public void setTop_price(double top_price) {
        this.top_price = top_price;
    }

    public double getFloor_price() {
        return floor_price;
    }

    public void setFloor_price(double floor_price) {
        this.floor_price = floor_price;
    }

    public double getC_price() {
        return c_price;
    }

    public void setC_price(double c_price) {
        this.c_price = c_price;
    }

    public long getTrade_num() {
        return trade_num;
    }

    public void setTrade_num(long trade_num) {
        this.trade_num = trade_num;
    }

    public long getTrade_money() {
        return trade_money;
    }

    public void setTrade_money(long trade_money) {
        this.trade_money = trade_money;
    }

    @Override
    public String toString() {
        return "Gupiao{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", b_c_price=" + b_c_price +
                ", o_price=" + o_price +
                ", top_price=" + top_price +
                ", floor_price=" + floor_price +
                ", c_price=" + c_price +
                ", trade_num=" + trade_num +
                ", trade_money=" + trade_money +
                '}';
    }
}
