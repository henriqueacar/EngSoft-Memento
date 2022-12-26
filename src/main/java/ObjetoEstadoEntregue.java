public class ObjetoEstadoEntregue implements ObjetoEstado{

    private ObjetoEstadoEntregue(){};
    private static ObjetoEstadoEntregue instance = new ObjetoEstadoEntregue();

    public static ObjetoEstadoEntregue getInstance(){
        return instance;
    }

    @Override
    public String getEstadoObjeto() {
        return "Entregue";
    }
}
