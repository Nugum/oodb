package lab1;

import java.util.List;

public class DeliveryMan {

    String name;
    String data;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DeliveryMan(String name, String data) {

        this.name = name;
        this.data = data;
    }
}
