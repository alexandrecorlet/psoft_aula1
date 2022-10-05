package repository;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import data.Lote;

public class LoteRepository {

    private Map<String, Lote> lotes;

    public LoteRepository() {
        this.lotes = new HashMap<>();
    }

    public String add(Lote lote) {
        String id = lote.getId();
        lotes.put(id, lote);
        return id;
    }

    public Collection<Lote> getAll() {
        return lotes.values();
    }

}
