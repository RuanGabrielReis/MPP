package fabrica;

import produtos.Catalogo;
import produtos.CatalogoDisney;
import produtos.Player;
import produtos.PlayerDisney;

public class FabricaDisney implements FabricaStreaming {

    @Override
    public Catalogo criarCatalogo() {
        return new CatalogoDisney();
    }

    @Override
    public Player criarPlayer() {
        return new PlayerDisney();
    }
}