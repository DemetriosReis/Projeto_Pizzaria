package ProgPizzaria;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jayana
 */
public class PizzasPizzariaTableModel extends AbstractTableModel {

    private ArrayList<PizzasPizzaria> dadospizza;
    private String[] colunaspizza = {"Nome", "Base", "1º Ingrediente", "2º Ingrediente", "3º Ingrediente", "Borda"};
    private String[] Ingrediente1 = {" ", "Frango", "Presunto", "Calabresa", "Ervilha", "Milho", "Cebola", "Bacon", "Tomate", "Ovo", "Palmito", "Nenhum"};
    private String[] Ingrediente2 = {" ", "Frango", "Presunto", "Calabresa", "Ervilha", "Milho", "Cebola", "Bacon", "Tomate", "Ovo", "Palmito", "Nenhum"};
    private String[] Ingrediente3 = {" ", "Frango", "Presunto", "Calabresa", "Ervilha", "Milho", "Cebola", "Bacon", "Tomate", "Ovo", "Palmito", "Nenhum"};

    public PizzasPizzariaTableModel() {
        dadospizza = new ArrayList();
    }

    @Override
    public int getRowCount() {
        return dadospizza.size();
    }

    @Override
    public int getColumnCount() {
        return colunaspizza.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunaspizza[column];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                return dadospizza.get(linha).getNomeSabor();
            }
            case 1 -> {
                return dadospizza.get(linha).getBase();
            }
            case 2 -> {
                return dadospizza.get(linha).getIngrediente1();
            }
            case 3 -> {
                return dadospizza.get(linha).getIngrediente2();
            }
            case 4 -> {
                return dadospizza.get(linha).getIngrediente3();
            }
            case 5 -> {
                return dadospizza.get(linha).getBorda();
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0 -> {
                dadospizza.get(linha).setNomeSabor((String) valor);
                break;
            }
            case 1 -> {
                dadospizza.get(linha).setBase((String) valor);
                break;
            }
            case 2 -> {
                dadospizza.get(linha).setIngrediente1((String) valor);
                break;
            }
            case 3 -> {
                dadospizza.get(linha).setIngrediente2((String) valor);
                break;
            }
            case 4 -> {
                dadospizza.get(linha).setIngrediente3((String) valor);
                break;
            }
            case 5 -> {
                dadospizza.get(linha).setBorda((String) valor);
                break;
            }
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(PizzasPizzaria s) {
        this.dadospizza.add(s);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dadospizza.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public PizzasPizzaria getDados(int linha) {
        return dadospizza.get(linha);
    }

}
