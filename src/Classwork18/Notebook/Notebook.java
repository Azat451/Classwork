package Classwork18.Notebook;

import Classwork18.Cpu;
import Classwork18.Hdd;
import Classwork18.Os;
import Classwork18.Ram;

import java.util.Arrays;

public class Notebook {
    Hdd hdd;
    Ram[] ram;
    Os os;
    Cpu cpu;
    char[] keys;

    public Notebook(Hdd hdd,Ram[] ram,Os os,Cpu cpu){
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.cpu = cpu;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void setRam(Ram[] ram) {
        this.ram = ram;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    /**
     * Преклеивание
     * @param keys
     */

    public void setKeys(char[] keys) {
        this.keys = keys;
    }

    public Ram[] getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return String.format("Notebook:" +
                "\n----------------" +
                "\nhdd=" + hdd +
                "\n----------------" +
                "\nram=" + Arrays.toString(ram) +
                "\n----------------" +
                "\nos=" + os +
                "\n----------------" +
                "\ncpu=" + cpu);
    }

    public String getRams(){
        String rams = "";
        for (Ram item : ram){
            rams = rams + " " + item;
        }
        return rams;
    }
}
