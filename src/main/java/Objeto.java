import java.util.ArrayList;
import java.util.List;

public class Objeto {
    private ObjetoEstado estado;
    private List<ObjetoEstado> memento = new ArrayList<>();

    public ObjetoEstado getEstado() {
        return estado;
    }

    public void setEstado(ObjetoEstado estado) {
        this.estado = estado;
        this.memento.add(estado);
    }

    public void restauraEstado(int indice){
        if(indice < 0 || indice > this.memento.size()-1)
            throw new IllegalArgumentException("Índice inválido");

        this.estado = this.memento.get(indice);

        this.memento.subList(indice+1, this.memento.size()).clear();

    }

    public List<ObjetoEstado> getEstados(){
        return this.memento;
    }
}
