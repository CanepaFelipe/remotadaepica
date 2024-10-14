import java.util.ArrayList;

public class Alumno extends Persona{/*EXTENDS ES PQ HEREDA DE PERSONAS*/
    private String legajo;
    private ArrayList<Integer> notas = new ArrayList<>();

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
public float getPromedio(){
        /*for (int i;i<notas.stream().count();i++);*/
    float suma = 0;
    for (float nota:notas){
        suma += nota;
    }
        return suma/ notas.size();
}
}
