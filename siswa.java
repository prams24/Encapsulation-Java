/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getterSetter;

/**
 *
 * @author Harindra
 */
public class siswa {
    private String x;
    private String y;
    private String p;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getX() {
        return x;
    }

    public void setx(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void sety(String y) {
        this.y = y;
    }

    public void cetak() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("p = " + p);
    }
}
