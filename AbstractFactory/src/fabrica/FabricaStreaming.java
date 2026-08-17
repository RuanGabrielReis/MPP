package fabrica;

import produtos.Catalogo;
import produtos.Player;

public interface FabricaStreaming {

    Catalogo criarCatalogo();

    Player criarPlayer();
}