public class ObjetoEstadoEmTransito implements ObjetoEstado{

    private ObjetoEstadoEmTransito(){};
    private static ObjetoEstadoEmTransito instance = new ObjetoEstadoEmTransito();

    public static ObjetoEstadoEmTransito getInstance(){
        return instance;
    }

    @Override
    public String getEstadoObjeto() {
        return "Em transito";
    }
}