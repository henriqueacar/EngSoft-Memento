public class ObjetoEstadoExtraviado implements ObjetoEstado{

    private ObjetoEstadoExtraviado(){};
    private static ObjetoEstadoExtraviado instance = new ObjetoEstadoExtraviado();

    public static ObjetoEstadoExtraviado getInstance(){
        return instance;
    }

    @Override
    public String getEstadoObjeto() {
        return "Extraviado";
    }
}
