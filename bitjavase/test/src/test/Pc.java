package test;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/4/10 9:38
 */
public class Pc extends Computer{
    private String brand;

    public Pc(String cpu, int memory, int disk,String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void print(){
        System.out.println("cpu:"+super.getCpu()+",memory:"+super.getMemory()+",disk:"+super.getDisk()+",brand:"+this.brand);
    }
}
