import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("curso de JavaScript");
        curso2.setCargaHoraria(4);


//        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Mentoria sobre java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Danilo");

        dev.inscreverBootcamp(bootcamp);
        dev.progredir();

        System.out.println("conteúdos Inscritos :" + dev.getConteudosInscritos());
        System.out.println("conteúdos Inscritos :" + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
    }
}