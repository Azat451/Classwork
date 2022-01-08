package Classwork18.Notebook;

import Classwork18.Cpu;
import Classwork18.Hdd;
import Classwork18.Os;
import Classwork18.Ram;

public class MAin {
    public static void main(String[] args) {
        Hdd hdd = new Hdd(65,45);
        Os os = new Os("Windows","1.08");
        Cpu cpu = new Cpu("INtel",3,4.5);
        Ram[] ram = new Ram[2];
        ram[0] = new Ram(45,"45");
        Notebook notebook = new Notebook(hdd,ram,os,cpu);

        Hdd newHdd = new Hdd(12,56);
        Os newOS = new Os("Ubundu","16.04");
        Cpu newCpu = new Cpu("Intel core i9",8,4.5);

        notebook.setHdd(newHdd);
        notebook.setOs(newOS);
        notebook.setCpu(newCpu);

        System.out.println(notebook);

        System.out.println();
        Ram[] fetchedRams = notebook.getRam();
        for (Ram slot : fetchedRams){
            System.out.println("--------------");
            System.out.println(slot);
        }
    }
}
