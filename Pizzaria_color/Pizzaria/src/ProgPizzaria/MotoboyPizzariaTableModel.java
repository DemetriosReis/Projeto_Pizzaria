package ProgPizzaria;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jayana
 */
public class MotoboyPizzariaTableModel extends AbstractTableModel {

    private ArrayList<MotoboyPizzaria> dadosmoto;
    private String[] colunasmoto = {"Nome", "CPF", "Telefone", "E-mail", "Veiculo", "CNH", "Validade"};

    public MotoboyPizzariaTableModel() {
        dadosmoto = new ArrayList();
    }

    @Override
    public String getColumnName(int column) {
        return colunasmoto[column];
    }

    @Override
    public int getRowCount() {
        return dadosmoto.size();
    }

    @Override
    public int getColumnCount() {
        return colunasmoto.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                return dadosmoto.get(linha).getNome();
            }
            case 1 -> {
                return dadosmoto.get(linha).getCPF();
            }
            case 2 -> {
                return dadosmoto.get(linha).getTel();
            }
            case 3 -> {
                return dadosmoto.get(linha).getEmail();
            }
            case 4 -> {
                return dadosmoto.get(linha).getVeiculo();
            }
            case 5 -> {
                return dadosmoto.get(linha).getCNH();
            }
            case 6 -> {
                return dadosmoto.get(linha).getValidadeCNH();
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                dadosmoto.get(linha).setNome((String) valor);
                break;
            }
            case 1 -> {
                dadosmoto.get(linha).setCPF((String) valor);
                break;
            }
            case 2 -> {
                dadosmoto.get(linha).setTel((String) valor);
                break;
            }
            case 3 -> {
                dadosmoto.get(linha).setEmail((String) valor);
                break;
            }
            case 4 -> {
                dadosmoto.get(linha).setVeiculo((String) valor);
                break;
            }
            case 5 -> {
                dadosmoto.get(linha).setCNH((String) valor);
                break;
            }
            case 6 -> {
                dadosmoto.get(linha).setValidadeCNH((String) valor);
                break;
            }
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(MotoboyPizzaria m) {
        this.dadosmoto.add(m);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dadosmoto.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public MotoboyPizzaria getDados(int linha) {
        return dadosmoto.get(linha);
    }
}
