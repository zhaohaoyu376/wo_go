package com.gyf.szcrm.model;

import java.util.Date;

public class CourseOrder {
//    private int number;
//    private int water;
//    private int air_humidity;
//    private int air_temper;
//    private int soil_humidity;
//    private int soil_temper;
//    private int sun;
//    private int date;
////    private String state;
//    private Date update_datetime;
//
//    public int getNumber(){ return number; }
//    public void setNumber(int number){ this.number=number; }
//    public int getWater(){return water;}
//    public void setWater(int water){this.water=water;}
//    public int getAir_humidity(){return air_humidity;};
//    public void setAir_humidity(int air_humidity){this.air_humidity=air_humidity;}
//    public int getAir_temper(){return air_temper;}
//    public void setAir_temper(int air_temper){this.air_temper=air_temper;}
//    public int getSoil_humidity(){return soil_humidity;};
//    public void setSoil_humidity(int soil_humidity){this.soil_humidity=soil_humidity;}
//    public int getSoil_temper(){return soil_temper;}
//    public void setSoil_temper(int soil_temper){this.soil_temper=soil_temper;}
//    public int getSun(){return sun;}
//    public void setSun(int sun){this.sun=sun;}
//
//    @Override
//    public String toString() {
//        return "FarmlandOne{" +
//                "number='" + number + '\'' +
//                ", water='" + water + '\'' +
//                ", air_humidity='" + air_humidity + '\'' +
//                ", air_temper='" + air_temper + '\'' +
//                ", soil_humidity='" + soil_humidity + '\'' +
//                ", soil_temper='" + soil_temper + '\'' +
//                ", sun='" + sun + '\'' +
//                ", date='" + date + '\'' +
////                ", state='" + state + '\'' +
//                '}';

    private String uuid;
    private String order_id;
    private String name;
    private String wechat_no;
    private String wechat_mark;
    private String qq_no;
    private String tel;
    private String course_name;
    private String course_price;
    private String order_date;
    private Date update_datetime;
    private String remark;



    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWechat_no() {
        return wechat_no;
    }

    public void setWechat_no(String wechat_no) {
        this.wechat_no = wechat_no;
    }

    public String getWechat_mark() {
        return wechat_mark;
    }

    public void setWechat_mark(String wechat_mark) {
        this.wechat_mark = wechat_mark;
    }

    public String getQq_no() {
        return qq_no;
    }

    public void setQq_no(String qq_no) {
        this.qq_no = qq_no;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_price() {
        return course_price;
    }

    public void setCourse_price(String course_price) {
        this.course_price = course_price;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public Date getUpdate_datetime() {
        return update_datetime;
    }

    public void setUpdate_datetime(Date update_datetime) {
        this.update_datetime = update_datetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CourseOrder{" +
                "uuid='" + uuid + '\'' +
                ", order_id='" + order_id + '\'' +
                ", name='" + name + '\'' +
                ", wechat_no='" + wechat_no + '\'' +
                ", wechat_mark='" + wechat_mark + '\'' +
                ", qq_no='" + qq_no + '\'' +
                ", tel='" + tel + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_price='" + course_price + '\'' +
                ", order_date='" + order_date + '\'' +
                ", update_datetime=" + update_datetime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
