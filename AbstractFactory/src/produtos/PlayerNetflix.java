package produtos;

public class PlayerNetflix implements Player {

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo filme pela Netflix");
    }
}