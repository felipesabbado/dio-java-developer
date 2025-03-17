import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso de Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso JS");
        cursoJS.setDescricao("Curso de JS");
        cursoJS.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Mentoria para Java");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(cursoJava);
        System.out.println(cursoJS);
        System.out.println(mentoriaJava);
    }
}
