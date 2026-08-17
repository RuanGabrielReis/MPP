import fabrica.FabricaDisney;
import fabrica.FabricaNetflix;
import fabrica.FabricaStreaming;
import produtos.Catalogo;
import produtos.Player;

public class Main {

    public static void main(String[] args) {

        FabricaStreaming fabrica = new FabricaNetflix();

        Catalogo catalogo = fabrica.criarCatalogo();
        Player player = fabrica.criarPlayer();

        catalogo.mostrarFilmes();
        player.reproduzir();
    }
}