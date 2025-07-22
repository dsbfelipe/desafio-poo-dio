import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

    /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Felipe" + devFelipe.getConteudosConcluidos());
        System.out.println("XP: " + devFelipe.calcularTotalXp());

        System.out.println("---------------");
        

        Dev devLauri = new Dev();
        devLauri.setNome("Lauri");
        devLauri.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lauri" + devLauri.getConteudosInscritos());
        devLauri.progredir();
        devLauri.progredir();
        devLauri.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lauri" + devLauri.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lauri" + devLauri.getConteudosConcluidos());
        System.out.println("XP: " + devLauri.calcularTotalXp());
    }
}
