public class ObjetoEstadoPerdido implements ObjetoEstado{

    private ObjetoEstadoPerdido(){};
    private static ObjetoEstadoPerdido instance = new ObjetoEstadoPerdido();

    public static ObjetoEstadoPerdido getInstance(){
        return instance;
    }

    @Override
    public String getEstadoObjeto() {
        return "Perdido";
    }
}