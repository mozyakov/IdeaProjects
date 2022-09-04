package Constructor;

public class Bus {
    private String name;
    private String color = "red"; //параметр по умолчанию
    //Bus(String name) { //если создаем конструктор с параметрами, то дефолтный отменяется и
       //this.name = name;
   // }
    //Bus() {}; //надо дефолтный конструктор выписать отдельно, если нужно создавать без параметров
    public void setName(String s) {
        name = s;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
}

class Test {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        bus1.setName("ford");
        bus2.setName("man");
        bus3.setName("liaz");
        System.out.println(bus1.getName());
        System.out.println(bus1.getColor());
        System.out.println("================");
        Bus[] arr = {bus1, bus2, bus3};
        for(Bus b: arr) {
            System.out.println(b.getName());
        }
    }
}


