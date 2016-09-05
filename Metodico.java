import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Diego on 01/09/2016.
 */


public class Metodico {


    public Metodico() {
    }

    public ArrayList<Developers> desarrolladores(Set<Developers> set){

        ArrayList<Developers> lista = new ArrayList<Developers>();
        for(Developers dev: set){
            lista.add(dev);
        }

        return lista;


    }

    public ArrayList<Developers> javaSinWeb(Set<Developers> set){

        ArrayList<Developers> lista = new ArrayList<Developers>();
        for(Developers dev: set){
            if (dev.isJava()&& !dev.isWeb()){
                lista.add(dev);
            }

        }

        return lista;


    }
    public ArrayList<Developers> WebCelnoJava(Set<Developers> set){

        ArrayList<Developers> lista = new ArrayList<Developers>();
        for(Developers dev: set){
            if(dev.isWeb() && dev.isMobil() && !dev.isJava()){
                lista.add(dev);

            }

        }

        return lista;


    }
    public ArrayList<Developers> WeboCelnoJava(Set<Developers> set){

        ArrayList<Developers> lista = new ArrayList<Developers>();
        for(Developers dev: set){
            if((dev.isWeb() || dev.isMobil()) && !dev.isJava()){
                lista.add(dev);

            }

        }

        return lista;


    }
    public String JavaSubWeb(Set<Developers> set){

        ArrayList<Developers> java = new ArrayList<Developers>();
        ArrayList<Developers> web = new ArrayList<Developers>();
        for(Developers dev: set){
            if(dev.isWeb()){
                web.add(dev);

            }
            else if(dev.isJava()){
                java.add(dev);
            }
        }

        boolean acontecimiento = true;
        for(Developers dev: web){
            if (!web.contains(dev)){
                acontecimiento = false;
            }
        }
        if (acontecimiento){
            return "Java es un subconjunto de Web";
        }
        else{
            return "Java no es un subconjunto de Web";
        }
    }

    public String MayorDevs(Set<Developers> set){

        int ContJava = 0, ContWeb = 0, ContMob = 0;

        for(Developers dev: set){
            if(dev.isJava()){
                ContJava++;
            }
            if(dev.isWeb()){
                ContWeb++;
            }
            if(dev.isMobil()){
                ContMob++;
            }
        }
        if(ContJava > ContWeb && ContJava > ContMob){
            return "Los Desarrolladores de Java hacen el grupo mas grande";
        }
        else if(ContWeb > ContJava && ContWeb > ContMob){
            return "Los Desarrolladores de Java hacen el grupo mas grande";
        }
        else if(ContMob > ContWeb && ContMob > ContJava){
            return "Los Desarrolladores de Java hacen el grupo mas grande";
        }
        else if(ContJava == ContWeb && ContJava > ContMob){
            return "Los Desarrolladores de Java y Web hacen el grupo mas "
                    + "grande, tienen la misma cantidad de Developers";
        }
        else if(ContJava == ContMob && ContJava > ContWeb){
            return "Los Desarrolladores de Java y Mobil hacen el grupo mas "
                    + "grande, tienen la misma cantidad de Developers";
        }
        else if(ContWeb == ContMob && ContWeb > ContJava){
            return "Los Desarrolladores de Web y Mobil hacen el grupo mas "
                    + "grande, tiene la misma cantidad de Developers";
        }
        else{
            return "Todos los grupos tiene el mismo tamanio";
        }

    }
    public ArrayList<Developers> MayorOrden(Set<Developers> set, String string){

        ArrayList<Developers> web = new ArrayList<Developers>();
        ArrayList<Developers> java = new ArrayList<Developers>();
        ArrayList<Developers> mobil = new ArrayList<Developers>();


        for(Developers dev: set){
            if(dev.isJava()){
                java.add(dev);

            }
            if(dev.isWeb()){
                web.add(dev);

            }
            if(dev.isMobil()){
                mobil.add(dev);

            }

            if(string == "Los Desarrolladores de Java hacen el grupo mas grande"){

            }


        }
    }