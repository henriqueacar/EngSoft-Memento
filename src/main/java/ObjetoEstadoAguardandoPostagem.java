public class ObjetoEstadoAguardandoPostagem implements ObjetoEstado{

    private ObjetoEstadoAguardandoPostagem(){};
    private static ObjetoEstadoAguardandoPostagem instance = new ObjetoEstadoAguardandoPostagem();

    public static ObjetoEstadoAguardandoPostagem getInstance(){
        return instance;
    }

    @Override
    public String getEstadoObjeto() {
        return "Aguardando postagem";
    }
}