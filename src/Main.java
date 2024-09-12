import br.com.poo.bootcamp.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Java");
    curso1.setDescricao("Aprendendo Java do zero");
    curso1.setCargaHoraria(40);

    Curso curso2 = new Curso();
    curso2.setTitulo("SpringBoot");
    curso2.setDescricao("Aprendendo SpringBoot do zero");
    curso2.setCargaHoraria(20);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("SpringBoot no mercado de trabalho");
    mentoria1.setDescricao("As adversidades do Spring boot no mercado de trabalho");
    mentoria1.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Java developer");
    bootcamp.setDescricao("Descrição");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev devErnandes = new Dev();
    devErnandes.setNome("Ernandes");
    devErnandes.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos" + devErnandes.getConteudosInscritos());
    devErnandes.progredir();
    devErnandes.progredir();
    System.out.println("Conteudos inscritos" + devErnandes.getConteudosInscritos());
    System.out.println("XP acumulado: " + devErnandes.calcularTotalXp());

    System.out.println("--------------------------------------------------");

    Dev devDouglas = new Dev();
    devDouglas.setNome("Douglas");
    devDouglas.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos" + devDouglas.getConteudosInscritos());
    devDouglas.progredir();
    System.out.println("Conteudos inscritos" + devDouglas.getConteudosInscritos());
    System.out.println("XP acumulado: " + devDouglas.calcularTotalXp());


    }


}






