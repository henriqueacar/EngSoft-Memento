public class ObjetoEstadoEmRotaDeEntrega implements ObjetoEstado {

    private ObjetoEstadoEmRotaDeEntrega() {}
    private static ObjetoEstadoEmRotaDeEntrega instance = new ObjetoEstadoEmRotaDeEntrega();

    public static ObjetoEstadoEmRotaDeEntrega getInstance() {
        return instance;
    }

    @Override
    public String getEstadoObjeto() {
        return "Em rota de entrega";
    }
}