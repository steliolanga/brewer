package co.mz.schoolCtrl.enumerator;

import java.util.Arrays;
import java.util.List;


public enum Semester   {



    PRIMEIRO("1 Semestre"),
    SEGUNDO("2 Semestre"),
    TERCEIRO("3 Semestre"),
    QUARTO("4 Semestre"),
    QUINTO("5 Semestre"),

    SEXTO("6 Semestre"),
    SETIMO("7 Semestre"),
    OITAVO("8 Semestre");




    Semester (String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name();
    }

    private static final List<Semester> LIST;

    static {
        List<Semester> list = Arrays.asList(PRIMEIRO, SEGUNDO, TERCEIRO,QUARTO,QUINTO,SEXTO,SETIMO);
        LIST = list;
    }

    public static List<Semester> getAll(){
        return LIST;
    }
}
