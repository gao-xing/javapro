package com.neuedu.test.bean;

/**
 * Created by 高星 on 2020/2/11.
 */
public class MyBook{
    private String name;
    private Double price;
    private String press;
    private String autuor;
    private String bookISBN;

    public MyBook(String name, Double price, String press, String autuor, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.autuor = autuor;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAutuor() {
        return autuor;
    }

    public void setAutuor(String autuor) {
        this.autuor = autuor;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }
}
