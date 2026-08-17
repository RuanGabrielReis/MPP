package fabrica;

import produtos.Catalogo;
import produtos.CatalogoNetflix;
import produtos.Player;
import produtos.PlayerNetflix;

public class FabricaNetflix implements FabricaStreaming {

    @Override
    public Catalogo criarCatalogo() {
        return new CatalogoNetflix();
    }

    @Override
    public Player criarPlayer() {
        return new PlayerNetflix();
    }
}