/**
 * Created by Diego Castaneda on 03/09/2016.
 */
public class Developers {

    public String nombre;
    public String inicial;
    public boolean Web;
    public boolean Java;
    public boolean Mobil;

    public Developers(String nombre, String inicial, boolean web, boolean java, boolean mobil) {
        this.nombre = nombre;
        this.inicial = inicial;
        Web = web;
        Java = java;
        Mobil = mobil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInicial() {
        return inicial;
    }

    public boolean isWeb() {
        return Web;
    }

    public boolean isJava() {
        return Java;
    }

    public boolean isMobil() {
        return Mobil;
    }
}
