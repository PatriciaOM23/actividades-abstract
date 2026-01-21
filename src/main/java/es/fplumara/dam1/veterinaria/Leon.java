package es.fplumara.dam1.veterinaria;

public class Leon extends Animal{
    public Leon() {
    }

    @Override
    public String sonido() {
        return "grrrrrrrr";
    }

    @Override
    public String ficha() {
        return "Leon:\n" +
                "- 4 patas, 1 melena ";
    }
}
