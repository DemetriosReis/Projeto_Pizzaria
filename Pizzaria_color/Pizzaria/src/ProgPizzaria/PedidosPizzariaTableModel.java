package ProgPizzaria;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jayana
 */
public class PedidosPizzariaTableModel extends AbstractTableModel {

    private ArrayList<PedidosPizzaria> dadospedido;
    private String[] colunaspedido = {"Numero do pedido", "Pizza", "Bebida", "Total", "Forma de pagamento"};

    public PedidosPizzariaTableModel() {
        dadospedido = new ArrayList();
    }

    @Override
    public int getRowCount() {
        return dadospedido.size();
    }

    @Override
    public int getColumnCount() {
        return colunaspedido.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunaspedido[column];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                return dadospedido.get(linha).getNumeroPedido();
            }
            case 1 -> {
                return dadospedido.get(linha).getPizza();
            }
            case 2 -> {
                return dadospedido.get(linha).getBebida();
            }
            case 3 -> {
                return dadospedido.get(linha).getValorPedido();
            }
            case 4 -> {
                return dadospedido.get(linha).getFormaPagamento();
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                dadospedido.get(linha).setNumeroPedido(Integer.parseInt((String) valor));
                break;
            }
            case 1 -> {
                dadospedido.get(linha).setPizza((String) valor);
                break;
            }
            case 2 -> {
                dadospedido.get(linha).setBebida((String) valor);
                break;
            }
            case 3 -> {
                dadospedido.get(linha).setValorPedido(Double.parseDouble((String) valor));
                break;
            }
            case 4 -> {
                dadospedido.get(linha).setFormaPagamento((String) valor);
                break;
            }

        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(PedidosPizzaria p) {
        this.dadospedido.add(p);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dadospedido.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public PedidosPizzaria getDados(int linha) {
        return dadospedido.get(linha);
    }

}
