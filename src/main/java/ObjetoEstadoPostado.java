public class ObjetoEstadoPostado implements ObjetoEstado{

    private ObjetoEstadoPostado(){};
    private static ObjetoEstadoPostado instance = new ObjetoEstadoPostado();

    public static ObjetoEstadoPostado getInstance(){
        return instance;
    }

    @Override
    public String getEstadoObjeto() {
        return "Postado";
    }
}
