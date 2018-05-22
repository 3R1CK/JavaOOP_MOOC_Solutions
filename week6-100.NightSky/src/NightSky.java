
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emeji
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.height = height;
        this.width = width;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
     
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
           
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }            
        }
        System.out.println("");      
    }

    public void print() {
        for (int i = 0; i < this.height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        int counter = this.starsInLastPrint;
        this.starsInLastPrint =0;
        return counter;
    }
}
