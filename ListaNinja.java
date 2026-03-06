package exercicios;

import java.util.LinkedList;

public class ListaNinja {
    static void main(String[] args) {

        LinkedList<Ninjas> listaDeNinjas = new LinkedList<>();

        listaDeNinjas.add(new Ninjas("Aderson", 19, "Aldeia da folha"));
        listaDeNinjas.add(new Ninjas("Naruto", 22, "Aldeia da folha"));
        listaDeNinjas.add(new Ninjas("Kakashi", 32, "Aldeia da folha"));
        listaDeNinjas.add(new Ninjas("Hashirama", 35, "Anbu"));
        listaDeNinjas.add(new Ninjas("Sasuke", 60, "Aldeia da terra"));
        listaDeNinjas.add(new Ninjas("Tobirama", 29, "Aldeia da agua"));
        listaDeNinjas.add(new Ninjas("Hinata", 15, "Aldeia do Vento"));

        System.out.println("---------------------- LISTAR NINJAS ------------------------------");

        for (Ninjas ninja: listaDeNinjas){
            System.out.println(ninja);
        }

        System.out.println("---------------------- ADICIONAR NINJA NO INICIO ------------------------------");

        listaDeNinjas.addFirst(new Ninjas("Oliveira", 20, "Aldeia do ar"));
        for (Ninjas ninja: listaDeNinjas){
            System.out.println(ninja);
        }

        System.out.println("---------------------- Remover NINJA DO INICIO ------------------------------");

        Ninjas removido = listaDeNinjas.removeFirst();
        listaDeNinjas.removeFirst();
        System.out.println("ninja removido:" + removido);

        System.out.println("---------------------- MUDANÇAS DOS NINJAS ------------------------------");

        for (Ninjas ninja: listaDeNinjas){
            System.out.println(ninja);
        }

        System.out.println("---------------------- PROCURAR POR INDICE ------------------------------");

        Ninjas quintoNinja = listaDeNinjas.get(5);
        System.out.println("quinto ninja: " + quintoNinja);

    }
}