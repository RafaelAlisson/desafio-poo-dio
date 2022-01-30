import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDolaci = new Dev();
        devDolaci.setNome("Dolaci");
        devDolaci.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dolaci: " + devDolaci.getConteudosInscritos());
        devDolaci.progredir();
        devDolaci.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dolaci: " + devDolaci.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dolaci: " + devDolaci.getConteudosConcluidos());
        System.out.println("XP:" + devDolaci.calcularTotalXp());

        System.out.println("-------");

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Renato: " + devRenato.getConteudosInscritos());
        devRenato.progredir();
        devRenato.progredir();
        devRenato.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Renato:" + devRenato.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Renato:" + devRenato.getConteudosConcluidos());
        System.out.println("XP:" + devRenato.calcularTotalXp());

    }

}
