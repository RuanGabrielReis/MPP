public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
    String msg = String.format("O gato %s faz Meow!", getNome());
        System.out.println(msg);
    }
    
}
