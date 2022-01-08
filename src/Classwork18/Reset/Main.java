package Classwork18.Reset;

import Classwork18.Reset.NOTEbook.*;

public class Main {
    public static void main(String[] args) {
        RAM[] ram = new RAM[4];
        ram[0] = new RAM(4096,"DDR4");
        SSD[] ssd = new SSD[2];
        ssd[0] = new SSD("1trb");
        ssd[1] = new SSD("500gb");
        HDD hdd = new HDD(2048,720);
        OS os = new OS("Windows","10");
        CPU cpu = new CPU("INTEL",8,2.5);
        Notebook notebook = new Notebook(hdd,os,cpu,ram,ssd);

        HDD newHdd = new HDD(12048,1720);
        OS newOs = new OS("Upundtu","16.04");
        CPU newCpu = new CPU("Intel core i9",8,2.5);

        notebook.setHdd(newHdd);
        notebook.setOs(newOs);
        notebook.setCpu(newCpu);
        System.out.println(notebook);

        RAM[] fetchedRams = notebook.getRam();
        for (RAM slot : fetchedRams){
            System.out.println(slot);
        }
    }
}
