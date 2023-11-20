package ProgPizzaria;

/**
 *
 * @author Jayana
 */
public class PedidosPizzaria {

    protected int NumeroPedido;
    protected double ValorPedido, TotalP;
    protected String Pizza, Bebida, FormaPagamento;

    public int getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(int NumeroPedido) {
        this.NumeroPedido = NumeroPedido;
    }

    public double getValorPedido() {
        return ValorPedido;
    }

    public void setValorPedido(double ValorPedido) {
        this.ValorPedido = ValorPedido;
    }

    public String getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(String FormaPagamento) {
        this.FormaPagamento = FormaPagamento;
    }

    public String getPizza() {
        return Pizza;
    }

    public void setPizza(String Pizza) {
        this.Pizza = Pizza;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }

    public double getTotalP() {
        return TotalP;
    }

    public void setTotalP(double TotalP) {
        this.TotalP = TotalP;
    }
}
