package ProgPizzaria;

/**
 *
 * @author Jayana
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EnderecoPizzariaTableModel extends AbstractTableModel {

    private ArrayList<EnderecoPizzaria> dadosend;
    private String[] colunasend = {"CEP", "Endereço", "Numero", "Complemente", "Bairro", "Cidade"};

    public EnderecoPizzariaTableModel() {
        dadosend = new ArrayList();
    }

    @Override
    public String getColumnName(int column) {
        return colunasend[column];
    }

    @Override
    public int getRowCount() {
        return dadosend.size();
    }

    @Override
    public int getColumnCount() {
        return colunasend.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                return dadosend.get(linha).getCEP();
            }
            case 1 -> {
                return dadosend.get(linha).getEndereco();
            }
            case 2 -> {
                return dadosend.get(linha).getNumero();
            }
            case 3 -> {
                return dadosend.get(linha).getComplemento();
            }
            case 4 -> {
                return dadosend.get(linha).getBairro();
            }
            case 5 -> {
                return dadosend.get(linha).getCidade();
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                dadosend.get(linha).setCEP((String) valor);
                break;
            }
            case 1 -> {
                dadosend.get(linha).setEndereco((String) valor);
                break;
            }
            case 2 -> {
                dadosend.get(linha).setNumero((String) valor);
                break;
            }
            case 3 -> {
                dadosend.get(linha).setComplemento((String) valor);
                break;
            }
            case 4 -> {
                dadosend.get(linha).setBairro((String) valor);
                break;
            }
            case 5 -> {
                dadosend.get(linha).setCidade((String) valor);
                break;
            }
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(EnderecoPizzaria e) {
        this.dadosend.add(e);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dadosend.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public EnderecoPizzaria getDadosEnd(int linha) {
        return dadosend.get(linha);
    }

}
