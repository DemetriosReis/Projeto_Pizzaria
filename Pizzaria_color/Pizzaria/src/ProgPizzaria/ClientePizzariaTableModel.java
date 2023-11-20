package ProgPizzaria;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jayana
 */

public class ClientePizzariaTableModel extends AbstractTableModel {

    private ArrayList<ClientePizzaria> dados;
    private String[] colunas = {"Telefone", "CPF", "Nome", "Data de nasc."};

    public ClientePizzariaTableModel() {
        dados = new ArrayList();
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                return dados.get(linha).getTel();
            }
            case 1 -> {
                return dados.get(linha).getCPF();
            }
            case 2 -> {
                return dados.get(linha).getNome();
            }
            case 3 -> {
                return dados.get(linha).getDataNasc();
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                dados.get(linha).setTel((String) valor);
                break;
            }
            case 1 -> {
                dados.get(linha).setCPF((String) valor);
                break;
            }
            case 2 -> {
                dados.get(linha).setNome((String) valor);
                break;
            }
            case 3 -> {
                dados.get(linha).setDataNasc((String) valor);
                break;
            }
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(ClientePizzaria a) {
        this.dados.add(a);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public ClientePizzaria getDados(int linha) {
        return dados.get(linha);
    }
}
