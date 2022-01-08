package Classwork18.Reset;


import Classwork18.Reset.NOTEbook.*;

public class Notebook {
    HDD hdd;
    RAM[] ram;
    OS os;
    CPU cpu;
    SSD[] ssd;
    char[] keys;

    public Notebook(HDD hdd, OS os,CPU cpu,RAM[] ram,SSD[] ssd){
        this.hdd = hdd;
        this.cpu = cpu;
        this.os = os;
        this.ram = ram;
        this.ssd = ssd;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM[] getRam() {
        return ram;
    }

    public void setRam(RAM[] ram) {
        this.ram = ram;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    /**
     * Приклеивание
     * @param keys
     */

    public void setKeys(char[] keys){
        this.keys = keys;
    }

    public SSD[] getSsd() {
        return ssd;
    }

    public void setSsd(SSD[] ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "\nhdd=" + hdd +
                "\nram=" + getRams() +
                "\nos=" + os +
                "\ncpu=" + cpu +
                "\nssd=" + getSsds() +
                '}' + "\n";
    }
    public String getRams(){
        String rams = "";
        for (RAM item : ram){
            rams = rams + " " + item;
        }
        return rams;
    }
    public String getSsds(){
        String ssds = "";
        for (SSD item : ssd){
            ssds = ssds + " " + item;
        }
        return ssds;
    }
}
