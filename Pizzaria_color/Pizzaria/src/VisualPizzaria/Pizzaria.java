package VisualPizzaria;

/**
 *
 * @author Jayana
 */

import ProgPizzaria.ClientePizzariaTableModel;
import ProgPizzaria.ClientePizzaria;
import ProgPizzaria.MotoboyPizzariaTableModel;
import ProgPizzaria.MotoboyPizzaria;
import ProgPizzaria.PedidosPizzariaTableModel;
import ProgPizzaria.PedidosPizzaria;
import ProgPizzaria.PizzasPizzariaTableModel;
import ProgPizzaria.PizzasPizzaria;
import ProgPizzaria.EnderecoPizzariaTableModel;
import ProgPizzaria.EnderecoPizzaria;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class Pizzaria extends javax.swing.JFrame {

    double TotalP = 0;

    ClientePizzariaTableModel tableClientePizza = new ClientePizzariaTableModel();
    MotoboyPizzariaTableModel tableMotoboyPizza = new MotoboyPizzariaTableModel();
    PedidosPizzariaTableModel tablePedidosPizza = new PedidosPizzariaTableModel();
    PizzasPizzariaTableModel tablePizzasPizza = new PizzasPizzariaTableModel();
    EnderecoPizzariaTableModel tableEnderecoPizza = new EnderecoPizzariaTableModel();

    public Pizzaria() {
        initComponents();

        jTClientePizzaria.setVisible(true);
        jTClientePizzaria.setModel(tableClientePizza);
        btnSalvarCliente.setEnabled(false);
        btnCancelarCliente.setEnabled(false);
        btnSalvarMotoboy.setEnabled(false);
        btnCancelarMotoboy.setEnabled(false);
        txtTel.setEnabled(false);
        txtNome.setEnabled(false);
        txtCPF.setEnabled(false);
        txtDataNasc.setEnabled(false);

        jTMotoboy.setVisible(true);
        jTMotoboy.setModel(tableMotoboyPizza);
        txtNomeMotoboy.setEnabled(false);
        txtCPFMotoboy.setEnabled(false);
        txtTelMotoboy.setEnabled(false);
        txtEmailMotoboy.setEnabled(false);
        txtCNH.setEnabled(false);
        txtValidadeCNH.setEnabled(false);
        btnMoto.setEnabled(false);
        btnBike.setEnabled(false);

        jTPedidosPizza.setVisible(true);
        jTPedidosPizza.setModel(tablePedidosPizza);
        txtNumeroPedido.setEnabled(false);
        txtValorTotal.setEditable(false);
        cbMussPedido.setEnabled(false);
        cbPortuguesaPedido.setEnabled(false);
        cbFrangoPedido.setEnabled(false);
        cbCalabresaPedido.setEnabled(false);
        btnMussBroto.setEnabled(false);
        btnPortBroto.setEnabled(false);
        btnFrangoBroto.setEnabled(false);
        btnCalBroto.setEnabled(false);
        btnMussGrande.setEnabled(false);
        btnPortGrande.setEnabled(false);
        btnFrangoGrande.setEnabled(false);
        btnCalGrande.setEnabled(false);
        cbCoca.setEnabled(false);
        cbGuarana.setEnabled(false);
        cbFantaLa.setEnabled(false);
        cbFantaUva.setEnabled(false);
        btnCredito.setEnabled(false);
        btnDebito.setEnabled(false);
        btnDinheiro.setEnabled(false);
        btnTotalPedido.setEnabled(false);
        btnFazerPedido.setEnabled(false);
        btnCancelarPedido.setEnabled(false);

        jTPizzasPizza.setVisible(true);
        jTPizzasPizza.setModel(tablePizzasPizza);
        btnAdicionarPizza.setEnabled(false);
        btnCancelarPizza.setEnabled(false);
        txtSabor.setEnabled(false);
        btnMussBase.setEnabled(false);
        btnCheddarBase.setEnabled(false);
        btnCatuBase.setEnabled(false);
        btnMussBorda.setEnabled(false);
        btnCatuBorda.setEnabled(false);
        btnCheddarBorda.setEnabled(false);
        btnSemBorda.setEnabled(false);
        comboIngrediente1.setEnabled(false);
        comboIngrediente2.setEnabled(false);
        comboIngrediente3.setEnabled(false);

        jTEnderecoPizzaria.setVisible(true);
        jTEnderecoPizzaria.setModel(tableEnderecoPizza);
        btnAdicionarEndereco.setEnabled(false);
        btnCancelarEndereco.setEnabled(false);
        txtCEP.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        Pizzaria = new javax.swing.JTabbedPane();
        pnlCliente = new javax.swing.JPanel();
        ScrollCliente = new javax.swing.JScrollPane();
        jTClientePizzaria = new javax.swing.JTable();
        PainelDados = new javax.swing.JPanel();
        lblTel = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDataNasc = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        txtTel = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtDataNasc = new javax.swing.JFormattedTextField();
        btnExcluirCliente = new javax.swing.JButton();
        btnAdicionarCliente = new javax.swing.JButton();
        btnAtualizarCliente = new javax.swing.JButton();
        pnlEnd = new javax.swing.JPanel();
        painelEnd = new javax.swing.JPanel();
        lblCEP = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnBuscarCEP = new javax.swing.JButton();
        btnAdicionarEndereco = new javax.swing.JButton();
        btnCancelarEndereco = new javax.swing.JButton();
        txtCEP = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEnderecoPizzaria = new javax.swing.JTable();
        btnNovoEndereco = new javax.swing.JButton();
        btnAtualizarEndereco = new javax.swing.JButton();
        btnExcluirEndereco = new javax.swing.JButton();
        pnlMoto = new javax.swing.JPanel();
        PainelMotoboy = new javax.swing.JPanel();
        txtNomeMotoboy = new javax.swing.JTextField();
        lblNomeMotoboy = new javax.swing.JLabel();
        lblCPFMotoboy = new javax.swing.JLabel();
        txtCPFMotoboy = new javax.swing.JFormattedTextField();
        txtTelefoneMotoboy = new javax.swing.JLabel();
        txtTelMotoboy = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmailMotoboy = new javax.swing.JTextField();
        lblCNH = new javax.swing.JLabel();
        lblVeiculo = new javax.swing.JLabel();
        txtCNH = new javax.swing.JFormattedTextField();
        lblValidade = new javax.swing.JLabel();
        txtValidadeCNH = new javax.swing.JFormattedTextField();
        btnBike = new javax.swing.JRadioButton();
        btnMoto = new javax.swing.JRadioButton();
        btnSalvarMotoboy = new javax.swing.JButton();
        btnCancelarMotoboy = new javax.swing.JButton();
        ScrollMoto = new javax.swing.JScrollPane();
        jTMotoboy = new javax.swing.JTable();
        btnAdicionarMotoboy = new javax.swing.JButton();
        btnAtualizarMotoboy = new javax.swing.JButton();
        btnExcluirMotoboy = new javax.swing.JButton();
        pnlPedidos = new javax.swing.JPanel();
        pnlPedido = new javax.swing.JPanel();
        lblNumeroPedido = new javax.swing.JLabel();
        pnlCardapio = new javax.swing.JPanel();
        PnlPizza = new javax.swing.JPanel();
        btnMussBroto = new javax.swing.JRadioButton();
        btnMussGrande = new javax.swing.JRadioButton();
        lblBrotoN = new javax.swing.JLabel();
        lblGrandeN = new javax.swing.JLabel();
        btnPortBroto = new javax.swing.JRadioButton();
        btnCalBroto = new javax.swing.JRadioButton();
        btnFrangoBroto = new javax.swing.JRadioButton();
        btnPortGrande = new javax.swing.JRadioButton();
        btnFrangoGrande = new javax.swing.JRadioButton();
        btnCalGrande = new javax.swing.JRadioButton();
        cbPortuguesaPedido = new javax.swing.JRadioButton();
        cbMussPedido = new javax.swing.JRadioButton();
        cbFrangoPedido = new javax.swing.JRadioButton();
        cbCalabresaPedido = new javax.swing.JRadioButton();
        pnlBebidas = new javax.swing.JPanel();
        cbCoca = new javax.swing.JRadioButton();
        cbGuarana = new javax.swing.JRadioButton();
        cbFantaUva = new javax.swing.JRadioButton();
        cbFantaLa = new javax.swing.JRadioButton();
        pnlFormaPagamento = new javax.swing.JPanel();
        btnCredito = new javax.swing.JRadioButton();
        btnDebito = new javax.swing.JRadioButton();
        btnDinheiro = new javax.swing.JRadioButton();
        pnlTotalPedido = new javax.swing.JPanel();
        txtValorTotal = new javax.swing.JFormattedTextField();
        btnTotalPedido = new javax.swing.JButton();
        btnFazerPedido = new javax.swing.JButton();
        btnCancelarPedido = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTPedidosPizza = new javax.swing.JTable();
        txtNumeroPedido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnNovoPedido = new javax.swing.JButton();
        btnAtualizarPedido = new javax.swing.JButton();
        btnExcluirPedido = new javax.swing.JButton();
        pnlPizza = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPizzasPizza = new javax.swing.JTable();
        pnlCriacao = new javax.swing.JPanel();
        txtSabor = new javax.swing.JTextField();
        lblNomeSabor = new javax.swing.JLabel();
        pnlIngredientes = new javax.swing.JPanel();
        comboIngrediente1 = new javax.swing.JComboBox<>();
        comboIngrediente2 = new javax.swing.JComboBox<>();
        comboIngrediente3 = new javax.swing.JComboBox<>();
        pnlBorda = new javax.swing.JPanel();
        btnMussBorda = new javax.swing.JRadioButton();
        btnCatuBorda = new javax.swing.JRadioButton();
        btnCheddarBorda = new javax.swing.JRadioButton();
        btnSemBorda = new javax.swing.JRadioButton();
        btnAdicionarPizza = new javax.swing.JButton();
        btnCancelarPizza = new javax.swing.JButton();
        pnlIngredientes1 = new javax.swing.JPanel();
        btnMussBase = new javax.swing.JRadioButton();
        btnCheddarBase = new javax.swing.JRadioButton();
        btnCatuBase = new javax.swing.JRadioButton();
        btnNovaPizza = new javax.swing.JButton();
        btnAtualizarPizza = new javax.swing.JButton();
        btnExcluirPizza = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 205, 142));

        Pizzaria.setBackground(new java.awt.Color(255, 255, 255));
        Pizzaria.setForeground(new java.awt.Color(181, 42, 4));
        Pizzaria.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Pizzaria.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Pizzaria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pizzaria.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Pizzaria.setInheritsPopupMenu(true);
        Pizzaria.setMaximumSize(new java.awt.Dimension(10000000, 10000000));
        Pizzaria.setMinimumSize(new java.awt.Dimension(83, 151));
        Pizzaria.setPreferredSize(new java.awt.Dimension(10000000, 10000000));
        Pizzaria.setRequestFocusEnabled(false);

        pnlCliente.setBackground(new java.awt.Color(248, 239, 217));

        jTClientePizzaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Telefone", "CPF", "Nome", "Data de nasc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTClientePizzaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientePizzariaMouseClicked(evt);
            }
        });
        ScrollCliente.setViewportView(jTClientePizzaria);

        PainelDados.setBackground(new java.awt.Color(248, 239, 217));
        PainelDados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        lblTel.setText("Telefone");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblDataNasc.setText("Data de Nasc.");

        lblNome.setText("Nome");

        lblCPF.setText("CPF");

        btnSalvarCliente.setBackground(new java.awt.Color(126, 169, 44));
        btnSalvarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarCliente.setText("SALVAR");
        btnSalvarCliente.setBorder(null);
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente.setBackground(new java.awt.Color(181, 42, 4));
        btnCancelarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCliente.setText("CANCELAR");
        btnCancelarCliente.setBorder(null);
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PainelDadosLayout = new javax.swing.GroupLayout(PainelDados);
        PainelDados.setLayout(PainelDadosLayout);
        PainelDadosLayout.setHorizontalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome)
                        .addGap(6, 6, 6))
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDadosLayout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDadosLayout.createSequentialGroup()
                        .addComponent(lblDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(lblCPF)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataNasc)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCliente)
                    .addComponent(btnCancelarCliente))
                .addGap(40, 40, 40))
        );

        btnExcluirCliente.setBackground(new java.awt.Color(251, 191, 88));
        btnExcluirCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirCliente.setText("EXCLUIR");
        btnExcluirCliente.setBorder(null);
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnAdicionarCliente.setBackground(new java.awt.Color(251, 191, 88));
        btnAdicionarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarCliente.setText("NOVO");
        btnAdicionarCliente.setBorder(null);
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });

        btnAtualizarCliente.setBackground(new java.awt.Color(251, 191, 88));
        btnAtualizarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarCliente.setText("ATUALIZAR");
        btnAtualizarCliente.setBorder(null);
        btnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClienteLayout.createSequentialGroup()
                        .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScrollCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarCliente)
                    .addComponent(btnAtualizarCliente)
                    .addComponent(btnExcluirCliente))
                .addGap(14, 14, 14))
        );

        Pizzaria.addTab("CLIENTE", pnlCliente);

        pnlEnd.setBackground(new java.awt.Color(248, 239, 217));

        painelEnd.setBackground(new java.awt.Color(248, 239, 217));
        painelEnd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N
        painelEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblCEP.setText("CEP");

        lblEndereco.setText("Endereço");

        lblComplemento.setText("Complemento");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        lblNumero.setText("Nº");

        btnBuscarCEP.setBackground(new java.awt.Color(251, 191, 88));
        btnBuscarCEP.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCEP.setText("GOOGLE MAPS");
        btnBuscarCEP.setBorder(null);
        btnBuscarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCEPActionPerformed(evt);
            }
        });

        btnAdicionarEndereco.setBackground(new java.awt.Color(126, 169, 44));
        btnAdicionarEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionarEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarEndereco.setText("SALVAR");
        btnAdicionarEndereco.setBorder(null);
        btnAdicionarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEnderecoActionPerformed(evt);
            }
        });

        btnCancelarEndereco.setBackground(new java.awt.Color(181, 42, 4));
        btnCancelarEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEndereco.setText("CANCELAR");
        btnCancelarEndereco.setBorder(null);
        btnCancelarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEnderecoActionPerformed(evt);
            }
        });

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelEndLayout = new javax.swing.GroupLayout(painelEnd);
        painelEnd.setLayout(painelEndLayout);
        painelEndLayout.setHorizontalGroup(
            painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEndLayout.createSequentialGroup()
                        .addComponent(lblCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelEndLayout.createSequentialGroup()
                        .addGroup(painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEndLayout.createSequentialGroup()
                                .addComponent(lblComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                            .addGroup(painelEndLayout.createSequentialGroup()
                                .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco)
                                .addGap(18, 18, 18)
                                .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelEndLayout.createSequentialGroup()
                                .addComponent(btnAdicionarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))))
        );
        painelEndLayout.setVerticalGroup(
            painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCEP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCEP)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarEndereco)
                    .addComponent(btnCancelarEndereco))
                .addGap(13, 13, 13))
        );

        jTEnderecoPizzaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CEP", "Endereço", "Numero", "Complemento", "Bairro", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTEnderecoPizzaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEnderecoPizzariaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTEnderecoPizzaria);

        btnNovoEndereco.setBackground(new java.awt.Color(251, 191, 88));
        btnNovoEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNovoEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoEndereco.setText("NOVO");
        btnNovoEndereco.setBorder(null);
        btnNovoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEnderecoActionPerformed(evt);
            }
        });

        btnAtualizarEndereco.setBackground(new java.awt.Color(251, 191, 88));
        btnAtualizarEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizarEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarEndereco.setText("ATUALIZAR");
        btnAtualizarEndereco.setBorder(null);
        btnAtualizarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarEnderecoActionPerformed(evt);
            }
        });

        btnExcluirEndereco.setBackground(new java.awt.Color(251, 191, 88));
        btnExcluirEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirEndereco.setText("EXCLUIR");
        btnExcluirEndereco.setBorder(null);
        btnExcluirEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEnderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEndLayout = new javax.swing.GroupLayout(pnlEnd);
        pnlEnd.setLayout(pnlEndLayout);
        pnlEndLayout.setHorizontalGroup(
            pnlEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEndLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnlEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEndLayout.createSequentialGroup()
                        .addComponent(btnNovoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(btnAtualizarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(btnExcluirEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        pnlEndLayout.setVerticalGroup(
            pnlEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEndLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirEndereco)
                    .addComponent(btnAtualizarEndereco)
                    .addComponent(btnNovoEndereco))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Pizzaria.addTab("ENDEREÇO", pnlEnd);

        pnlMoto.setBackground(new java.awt.Color(248, 239, 217));

        PainelMotoboy.setBackground(new java.awt.Color(248, 239, 217));
        PainelMotoboy.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        lblNomeMotoboy.setText("Nome");

        lblCPFMotoboy.setText("CPF");

        try {
            txtCPFMotoboy.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFMotoboyActionPerformed(evt);
            }
        });

        txtTelefoneMotoboy.setText("Telefone");

        try {
            txtTelMotoboy.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmail.setText("E-mail");

        lblCNH.setText("CNH");

        lblVeiculo.setText("Veículo");

        try {
            txtCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblValidade.setText("Validade da CNH");

        try {
            txtValidadeCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBike.setBackground(new java.awt.Color(248, 239, 217));
        btnBike.setText("Bicicleta");
        btnBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBikeActionPerformed(evt);
            }
        });

        btnMoto.setBackground(new java.awt.Color(248, 239, 217));
        btnMoto.setText("Moto");
        btnMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotoActionPerformed(evt);
            }
        });

        btnSalvarMotoboy.setBackground(new java.awt.Color(126, 169, 44));
        btnSalvarMotoboy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarMotoboy.setText("SALVAR");
        btnSalvarMotoboy.setBorder(null);
        btnSalvarMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMotoboyActionPerformed(evt);
            }
        });

        btnCancelarMotoboy.setBackground(new java.awt.Color(181, 42, 4));
        btnCancelarMotoboy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarMotoboy.setText("CANCELAR");
        btnCancelarMotoboy.setBorder(null);
        btnCancelarMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMotoboyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelMotoboyLayout = new javax.swing.GroupLayout(PainelMotoboy);
        PainelMotoboy.setLayout(PainelMotoboyLayout);
        PainelMotoboyLayout.setHorizontalGroup(
            PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMotoboyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelMotoboyLayout.createSequentialGroup()
                        .addComponent(lblVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBike, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelMotoboyLayout.createSequentialGroup()
                        .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelMotoboyLayout.createSequentialGroup()
                                .addComponent(lblCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCNH))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelMotoboyLayout.createSequentialGroup()
                                .addComponent(txtTelefoneMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelMotoboyLayout.createSequentialGroup()
                                .addComponent(lblNomeMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeMotoboy))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelMotoboyLayout.createSequentialGroup()
                                .addComponent(btnSalvarMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelMotoboyLayout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMotoboyLayout.createSequentialGroup()
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmailMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMotoboyLayout.createSequentialGroup()
                                        .addComponent(lblValidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValidadeCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PainelMotoboyLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblCPFMotoboy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFMotoboy)))))
                .addContainerGap())
        );
        PainelMotoboyLayout.setVerticalGroup(
            PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMotoboyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMotoboy)
                    .addComponent(txtNomeMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPFMotoboy)
                    .addComponent(txtCPFMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneMotoboy)
                    .addComponent(txtTelMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmailMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVeiculo)
                    .addComponent(btnBike)
                    .addComponent(btnMoto))
                .addGap(8, 8, 8)
                .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNH)
                    .addComponent(txtCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidade)
                    .addComponent(txtValidadeCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarMotoboy)
                    .addComponent(btnCancelarMotoboy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTMotoboy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "Email", "Veiculo", "CNH", "Validade "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTMotoboy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMotoboyMouseClicked(evt);
            }
        });
        ScrollMoto.setViewportView(jTMotoboy);

        btnAdicionarMotoboy.setBackground(new java.awt.Color(251, 191, 88));
        btnAdicionarMotoboy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionarMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarMotoboy.setText("ADICIONAR");
        btnAdicionarMotoboy.setBorder(null);
        btnAdicionarMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMotoboyActionPerformed(evt);
            }
        });

        btnAtualizarMotoboy.setBackground(new java.awt.Color(251, 191, 88));
        btnAtualizarMotoboy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizarMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarMotoboy.setText("ATUALIZAR");
        btnAtualizarMotoboy.setBorder(null);
        btnAtualizarMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarMotoboyActionPerformed(evt);
            }
        });

        btnExcluirMotoboy.setBackground(new java.awt.Color(251, 191, 88));
        btnExcluirMotoboy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirMotoboy.setText("EXCLUIR");
        btnExcluirMotoboy.setBorder(null);
        btnExcluirMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMotoboyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMotoLayout = new javax.swing.GroupLayout(pnlMoto);
        pnlMoto.setLayout(pnlMotoLayout);
        pnlMotoLayout.setHorizontalGroup(
            pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMotoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMotoLayout.createSequentialGroup()
                        .addComponent(btnAdicionarMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221)
                        .addComponent(btnAtualizarMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollMoto)
                    .addComponent(PainelMotoboy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMotoLayout.setVerticalGroup(
            pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirMotoboy)
                    .addComponent(btnAtualizarMotoboy)
                    .addComponent(btnAdicionarMotoboy))
                .addGap(134, 134, 134))
        );

        Pizzaria.addTab("ENTREGADOR", pnlMoto);

        pnlPedidos.setBackground(new java.awt.Color(248, 239, 217));
        pnlPedidos.setMaximumSize(new java.awt.Dimension(32767, 50000));
        pnlPedidos.setPreferredSize(new java.awt.Dimension(1853, 500));
        pnlPedidos.setRequestFocusEnabled(false);

        pnlPedido.setBackground(new java.awt.Color(248, 239, 217));
        pnlPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N
        pnlPedido.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N

        lblNumeroPedido.setText("Numero do pedido");

        pnlCardapio.setBackground(new java.awt.Color(248, 239, 217));
        pnlCardapio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Cardápio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        PnlPizza.setBackground(new java.awt.Color(248, 239, 217));
        PnlPizza.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Sabores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        btnMussBroto.setBackground(new java.awt.Color(248, 239, 217));
        btnMussBroto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMussBrotoActionPerformed(evt);
            }
        });

        btnMussGrande.setBackground(new java.awt.Color(248, 239, 217));
        btnMussGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMussGrandeActionPerformed(evt);
            }
        });

        lblBrotoN.setText("Broto");

        lblGrandeN.setText("Grande");

        btnPortBroto.setBackground(new java.awt.Color(248, 239, 217));
        btnPortBroto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPortBrotoActionPerformed(evt);
            }
        });

        btnCalBroto.setBackground(new java.awt.Color(248, 239, 217));
        btnCalBroto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalBrotoActionPerformed(evt);
            }
        });

        btnFrangoBroto.setBackground(new java.awt.Color(248, 239, 217));
        btnFrangoBroto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrangoBrotoActionPerformed(evt);
            }
        });

        btnPortGrande.setBackground(new java.awt.Color(248, 239, 217));
        btnPortGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPortGrandeActionPerformed(evt);
            }
        });

        btnFrangoGrande.setBackground(new java.awt.Color(248, 239, 217));
        btnFrangoGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrangoGrandeActionPerformed(evt);
            }
        });

        btnCalGrande.setBackground(new java.awt.Color(248, 239, 217));
        btnCalGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalGrandeActionPerformed(evt);
            }
        });

        cbPortuguesaPedido.setBackground(new java.awt.Color(248, 239, 217));
        cbPortuguesaPedido.setText("Portuguesa");
        cbPortuguesaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPortuguesaPedidoActionPerformed(evt);
            }
        });

        cbMussPedido.setBackground(new java.awt.Color(248, 239, 217));
        cbMussPedido.setText("Mussarela");
        cbMussPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMussPedidoActionPerformed(evt);
            }
        });

        cbFrangoPedido.setBackground(new java.awt.Color(248, 239, 217));
        cbFrangoPedido.setText("Frango com catupiry");
        cbFrangoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFrangoPedidoActionPerformed(evt);
            }
        });

        cbCalabresaPedido.setBackground(new java.awt.Color(248, 239, 217));
        cbCalabresaPedido.setText("Calabresa");
        cbCalabresaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCalabresaPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlPizzaLayout = new javax.swing.GroupLayout(PnlPizza);
        PnlPizza.setLayout(PnlPizzaLayout);
        PnlPizzaLayout.setHorizontalGroup(
            PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPizzaLayout.createSequentialGroup()
                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFrangoPedido)
                    .addComponent(cbPortuguesaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMussPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCalabresaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalBroto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFrangoBroto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalGrande, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFrangoGrande, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPizzaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBrotoN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPortBroto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMussBroto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrandeN)
                    .addGroup(PnlPizzaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMussGrande)
                            .addComponent(btnPortGrande))))
                .addContainerGap())
        );
        PnlPizzaLayout.setVerticalGroup(
            PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPizzaLayout.createSequentialGroup()
                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrotoN)
                    .addComponent(lblGrandeN))
                .addGap(12, 12, 12)
                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPizzaLayout.createSequentialGroup()
                        .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnlPizzaLayout.createSequentialGroup()
                                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PnlPizzaLayout.createSequentialGroup()
                                        .addComponent(cbPortuguesaPedido)
                                        .addGap(26, 26, 26))
                                    .addComponent(cbMussPedido))
                                .addGap(26, 26, 26))
                            .addComponent(cbFrangoPedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlPizzaLayout.createSequentialGroup()
                        .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPortBroto)
                            .addComponent(btnPortGrande))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlPizzaLayout.createSequentialGroup()
                                .addComponent(btnMussGrande)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PnlPizzaLayout.createSequentialGroup()
                                .addComponent(btnMussBroto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFrangoBroto)
                                    .addComponent(btnFrangoGrande))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(PnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalBroto)
                    .addComponent(btnCalGrande)
                    .addComponent(cbCalabresaPedido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBebidas.setBackground(new java.awt.Color(248, 239, 217));
        pnlBebidas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Bebidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        cbCoca.setBackground(new java.awt.Color(248, 239, 217));
        cbCoca.setText("Coca-cola");
        cbCoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCocaActionPerformed(evt);
            }
        });

        cbGuarana.setBackground(new java.awt.Color(248, 239, 217));
        cbGuarana.setText("Guarana");
        cbGuarana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGuaranaActionPerformed(evt);
            }
        });

        cbFantaUva.setBackground(new java.awt.Color(248, 239, 217));
        cbFantaUva.setText("Fanta uva");
        cbFantaUva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFantaUvaActionPerformed(evt);
            }
        });

        cbFantaLa.setBackground(new java.awt.Color(248, 239, 217));
        cbFantaLa.setText("Fanta laranja");
        cbFantaLa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFantaLaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBebidasLayout = new javax.swing.GroupLayout(pnlBebidas);
        pnlBebidas.setLayout(pnlBebidasLayout);
        pnlBebidasLayout.setHorizontalGroup(
            pnlBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBebidasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbGuarana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFantaLa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBebidasLayout.createSequentialGroup()
                        .addGroup(pnlBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbFantaUva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCoca, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBebidasLayout.setVerticalGroup(
            pnlBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBebidasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbCoca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGuarana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFantaUva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFantaLa)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout pnlCardapioLayout = new javax.swing.GroupLayout(pnlCardapio);
        pnlCardapio.setLayout(pnlCardapioLayout);
        pnlCardapioLayout.setHorizontalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardapioLayout.createSequentialGroup()
                .addComponent(PnlPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCardapioLayout.setVerticalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlCardapioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCardapioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PnlPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlFormaPagamento.setBackground(new java.awt.Color(248, 239, 217));
        pnlFormaPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        btnCredito.setBackground(new java.awt.Color(248, 239, 217));
        btnCredito.setText("Cartão de crédito");
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });

        btnDebito.setBackground(new java.awt.Color(248, 239, 217));
        btnDebito.setText("Cartão de débito");
        btnDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebitoActionPerformed(evt);
            }
        });

        btnDinheiro.setBackground(new java.awt.Color(248, 239, 217));
        btnDinheiro.setText("Dinheiro");
        btnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinheiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormaPagamentoLayout = new javax.swing.GroupLayout(pnlFormaPagamento);
        pnlFormaPagamento.setLayout(pnlFormaPagamentoLayout);
        pnlFormaPagamentoLayout.setHorizontalGroup(
            pnlFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormaPagamentoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormaPagamentoLayout.setVerticalGroup(
            pnlFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCredito)
                    .addComponent(btnDebito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDinheiro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTotalPedido.setBackground(new java.awt.Color(248, 239, 217));
        pnlTotalPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        txtValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        btnTotalPedido.setBackground(new java.awt.Color(251, 191, 88));
        btnTotalPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTotalPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnTotalPedido.setText("TOTAL");
        btnTotalPedido.setBorder(null);
        btnTotalPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTotalPedidoLayout = new javax.swing.GroupLayout(pnlTotalPedido);
        pnlTotalPedido.setLayout(pnlTotalPedidoLayout);
        pnlTotalPedidoLayout.setHorizontalGroup(
            pnlTotalPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValorTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTotalPedidoLayout.setVerticalGroup(
            pnlTotalPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTotalPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotalPedido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFazerPedido.setBackground(new java.awt.Color(126, 169, 44));
        btnFazerPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFazerPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnFazerPedido.setText("FAZER PEDIDO");
        btnFazerPedido.setBorder(null);
        btnFazerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerPedidoActionPerformed(evt);
            }
        });

        btnCancelarPedido.setBackground(new java.awt.Color(181, 42, 4));
        btnCancelarPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPedido.setText("CANCELAR PEDIDO");
        btnCancelarPedido.setBorder(null);
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });

        jTPedidosPizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero do pedido", "Pizza", "Bebida", "Total", "Forma de pagamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTPedidosPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPedidosPizzaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTPedidosPizza);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*Máx.9 caracteres");

        javax.swing.GroupLayout pnlPedidoLayout = new javax.swing.GroupLayout(pnlPedido);
        pnlPedido.setLayout(pnlPedidoLayout);
        pnlPedidoLayout.setHorizontalGroup(
            pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidoLayout.createSequentialGroup()
                .addGroup(pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPedidoLayout.createSequentialGroup()
                        .addGroup(pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPedidoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlFormaPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPedidoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnFazerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pnlTotalPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPedidoLayout.setVerticalGroup(
            pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidoLayout.createSequentialGroup()
                .addGroup(pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlPedidoLayout.createSequentialGroup()
                        .addGroup(pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroPedido)
                            .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPedidoLayout.createSequentialGroup()
                        .addComponent(pnlTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFazerPedido)
                            .addComponent(btnCancelarPedido))
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovoPedido.setBackground(new java.awt.Color(251, 191, 88));
        btnNovoPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNovoPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoPedido.setText("NOVO");
        btnNovoPedido.setBorder(null);
        btnNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPedidoActionPerformed(evt);
            }
        });

        btnAtualizarPedido.setBackground(new java.awt.Color(251, 191, 88));
        btnAtualizarPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPedido.setText("ATUALIZAR");
        btnAtualizarPedido.setBorder(null);
        btnAtualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarPedidoActionPerformed(evt);
            }
        });

        btnExcluirPedido.setBackground(new java.awt.Color(251, 191, 88));
        btnExcluirPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirPedido.setText("EXCLUIR");
        btnExcluirPedido.setBorder(null);
        btnExcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPedidosLayout = new javax.swing.GroupLayout(pnlPedidos);
        pnlPedidos.setLayout(pnlPedidosLayout);
        pnlPedidosLayout.setHorizontalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPedidosLayout.createSequentialGroup()
                        .addComponent(btnNovoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(btnExcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPedidosLayout.setVerticalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidosLayout.createSequentialGroup()
                .addComponent(pnlPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoPedido)
                    .addComponent(btnAtualizarPedido)
                    .addComponent(btnExcluirPedido))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Pizzaria.addTab("PEDIDO", pnlPedidos);

        pnlPizza.setBackground(new java.awt.Color(248, 239, 217));

        jTPizzasPizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Base", "1º Ingrediente", "2º Ingrediente", "3º Ingrediente", "Borda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTPizzasPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPizzasPizzaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTPizzasPizza);
        if (jTPizzasPizza.getColumnModel().getColumnCount() > 0) {
            jTPizzasPizza.getColumnModel().getColumn(3).setResizable(false);
        }

        pnlCriacao.setBackground(new java.awt.Color(248, 239, 217));
        pnlCriacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Monte sua pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        lblNomeSabor.setText("Nome do sabor");

        pnlIngredientes.setBackground(new java.awt.Color(248, 239, 217));
        pnlIngredientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Ingredientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        comboIngrediente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Frango", "Presunto", "Calabresa", "Ervilha", "Milho", "Cebola", "Bacon", "Tomate", "Ovo", "Palmito" }));

        comboIngrediente2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Frango", "Presunto", "Calabresa", "Ervilha", "Milho", "Cebola", "Bacon", "Tomate", "Ovo", "Palmito" }));

        comboIngrediente3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Frango", "Presunto", "Calabresa", "Ervilha", "Milho", "Cebola", "Bacon", "Tomate", "Ovo", "Palmito" }));

        javax.swing.GroupLayout pnlIngredientesLayout = new javax.swing.GroupLayout(pnlIngredientes);
        pnlIngredientes.setLayout(pnlIngredientesLayout);
        pnlIngredientesLayout.setHorizontalGroup(
            pnlIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngredientesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(comboIngrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(comboIngrediente2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(comboIngrediente3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnlIngredientesLayout.setVerticalGroup(
            pnlIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngredientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIngrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboIngrediente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboIngrediente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pnlBorda.setBackground(new java.awt.Color(248, 239, 217));
        pnlBorda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Borda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        btnMussBorda.setBackground(new java.awt.Color(248, 239, 217));
        btnMussBorda.setText("Mussarela");
        btnMussBorda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMussBordaActionPerformed(evt);
            }
        });

        btnCatuBorda.setBackground(new java.awt.Color(248, 239, 217));
        btnCatuBorda.setText("Catupiry");
        btnCatuBorda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatuBordaActionPerformed(evt);
            }
        });

        btnCheddarBorda.setBackground(new java.awt.Color(248, 239, 217));
        btnCheddarBorda.setText("Cheddar");
        btnCheddarBorda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheddarBordaActionPerformed(evt);
            }
        });

        btnSemBorda.setBackground(new java.awt.Color(248, 239, 217));
        btnSemBorda.setText("Sem borda");
        btnSemBorda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemBordaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBordaLayout = new javax.swing.GroupLayout(pnlBorda);
        pnlBorda.setLayout(pnlBordaLayout);
        pnlBordaLayout.setHorizontalGroup(
            pnlBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnMussBorda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnCatuBorda)
                .addGap(102, 102, 102)
                .addComponent(btnCheddarBorda)
                .addGap(88, 88, 88)
                .addComponent(btnSemBorda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBordaLayout.setVerticalGroup(
            pnlBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBordaLayout.createSequentialGroup()
                .addGroup(pnlBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMussBorda)
                    .addComponent(btnCatuBorda)
                    .addComponent(btnCheddarBorda)
                    .addComponent(btnSemBorda))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btnAdicionarPizza.setBackground(new java.awt.Color(126, 169, 44));
        btnAdicionarPizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionarPizza.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarPizza.setText("ADICIONAR PIZZA");
        btnAdicionarPizza.setBorder(null);
        btnAdicionarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarPizzaActionPerformed(evt);
            }
        });

        btnCancelarPizza.setBackground(new java.awt.Color(181, 42, 4));
        btnCancelarPizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarPizza.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPizza.setText("CANCELAR PIZZA");
        btnCancelarPizza.setBorder(null);
        btnCancelarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPizzaActionPerformed(evt);
            }
        });

        pnlIngredientes1.setBackground(new java.awt.Color(248, 239, 217));
        pnlIngredientes1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 42, 4)), "Base", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(181, 42, 4))); // NOI18N

        btnMussBase.setBackground(new java.awt.Color(248, 239, 217));
        btnMussBase.setText("Mussarela");
        btnMussBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMussBaseActionPerformed(evt);
            }
        });

        btnCheddarBase.setBackground(new java.awt.Color(248, 239, 217));
        btnCheddarBase.setText("Cheddar");
        btnCheddarBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheddarBaseActionPerformed(evt);
            }
        });

        btnCatuBase.setBackground(new java.awt.Color(248, 239, 217));
        btnCatuBase.setText("Catupiry");
        btnCatuBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatuBaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIngredientes1Layout = new javax.swing.GroupLayout(pnlIngredientes1);
        pnlIngredientes1.setLayout(pnlIngredientes1Layout);
        pnlIngredientes1Layout.setHorizontalGroup(
            pnlIngredientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngredientes1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnMussBase, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnCheddarBase, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(btnCatuBase, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlIngredientes1Layout.setVerticalGroup(
            pnlIngredientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngredientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnMussBase)
                .addComponent(btnCheddarBase)
                .addComponent(btnCatuBase))
        );

        javax.swing.GroupLayout pnlCriacaoLayout = new javax.swing.GroupLayout(pnlCriacao);
        pnlCriacao.setLayout(pnlCriacaoLayout);
        pnlCriacaoLayout.setHorizontalGroup(
            pnlCriacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriacaoLayout.createSequentialGroup()
                .addGroup(pnlCriacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCriacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCriacaoLayout.createSequentialGroup()
                            .addComponent(lblNomeSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCriacaoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(pnlCriacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pnlBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlIngredientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlCriacaoLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnAdicionarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(btnCancelarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        pnlCriacaoLayout.setVerticalGroup(
            pnlCriacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriacaoLayout.createSequentialGroup()
                .addGroup(pnlCriacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeSabor)
                    .addComponent(txtSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlIngredientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCriacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarPizza)
                    .addComponent(btnCancelarPizza)))
        );

        btnNovaPizza.setBackground(new java.awt.Color(251, 191, 88));
        btnNovaPizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNovaPizza.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaPizza.setText("NOVA");
        btnNovaPizza.setBorder(null);
        btnNovaPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPizzaActionPerformed(evt);
            }
        });

        btnAtualizarPizza.setBackground(new java.awt.Color(251, 191, 88));
        btnAtualizarPizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizarPizza.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPizza.setText("ATUALIZAR");
        btnAtualizarPizza.setBorder(null);
        btnAtualizarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarPizzaActionPerformed(evt);
            }
        });

        btnExcluirPizza.setBackground(new java.awt.Color(251, 191, 88));
        btnExcluirPizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirPizza.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirPizza.setText("EXCLUIR");
        btnExcluirPizza.setBorder(null);
        btnExcluirPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPizzaLayout = new javax.swing.GroupLayout(pnlPizza);
        pnlPizza.setLayout(pnlPizzaLayout);
        pnlPizzaLayout.setHorizontalGroup(
            pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlPizzaLayout.createSequentialGroup()
                            .addComponent(btnNovaPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(200, 200, 200)
                            .addComponent(btnAtualizarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluirPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlPizzaLayout.setVerticalGroup(
            pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaPizza)
                    .addComponent(btnAtualizarPizza)
                    .addComponent(btnExcluirPizza))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Pizzaria.addTab("PIZZA", pnlPizza);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pizzaria, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pizzaria, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        if ((txtNome.getText().length() > 0) && (txtTel.getText().length() > 0) && (txtCPF.getText().length() > 0)) {
            ClientePizzaria a = new ClientePizzaria();

            a.setTel(txtTel.getText());
            a.setCPF(txtCPF.getText());
            a.setNome(txtNome.getText());
            a.setDataNasc(txtDataNasc.getText());

            tableClientePizza.addRow(a);
            txtTel.setText("");
            txtNome.setText("");
            txtCPF.setText("");
            txtDataNasc.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed
        txtTel.setEnabled(true);
        txtNome.setEnabled(true);
        txtCPF.setEnabled(true);
        txtDataNasc.setEnabled(true);
        btnSalvarCliente.setEnabled(true);
        btnCancelarCliente.setEnabled(true);
    }//GEN-LAST:event_btnAdicionarClienteActionPerformed


    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        txtTel.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtDataNasc.setText("");
        txtTel.setEnabled(false);
        txtNome.setEnabled(false);
        txtCPF.setEnabled(false);
        txtDataNasc.setEnabled(false);
        btnSalvarCliente.setEnabled(false);
        btnCancelarCliente.setEnabled(false);
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        if (jTClientePizzaria.getSelectedRow() != -1) {
            tableClientePizza.removeRow(jTClientePizzaria.getSelectedRow());
            txtTel.setText("");
            txtNome.setText("");
            txtCPF.setText("");
            txtDataNasc.setText("");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClienteActionPerformed
        if (jTClientePizzaria.getSelectedRow() != -1) {
            tableClientePizza.setValueAt(txtTel.getText(), jTClientePizzaria.getSelectedRow(), 0);
            tableClientePizza.setValueAt(txtCPF.getText(), jTClientePizzaria.getSelectedRow(), 1);
            tableClientePizza.setValueAt(txtNome.getText(), jTClientePizzaria.getSelectedRow(), 2);
            tableClientePizza.setValueAt(txtDataNasc.getText(), jTClientePizzaria.getSelectedRow(), 3);
        }
    }//GEN-LAST:event_btnAtualizarClienteActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed

    }//GEN-LAST:event_txtTelActionPerformed

    private void jTClientePizzariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientePizzariaMouseClicked
        ClientePizzaria a = tableClientePizza.getDados(jTClientePizzaria.getSelectedRow());
        txtTel.setText(a.getTel());
        txtCPF.setText(a.getCPF());
        txtNome.setText(a.getNome());
        txtDataNasc.setText(a.getDataNasc());
    }//GEN-LAST:event_jTClientePizzariaMouseClicked

    private void btnBuscarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCEPActionPerformed
        try {
            URI link = new URI("www.google.com.br/maps");
            Desktop.getDesktop().browse(link);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O link não está funcionando, utilize o Google");
        }
    }//GEN-LAST:event_btnBuscarCEPActionPerformed

    private void txtCPFMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFMotoboyActionPerformed

    }//GEN-LAST:event_txtCPFMotoboyActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed

    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnExcluirMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMotoboyActionPerformed
        if (jTMotoboy.getSelectedRow() != -1) {
            tableMotoboyPizza.removeRow(jTMotoboy.getSelectedRow());
            txtTelMotoboy.setText("");
            txtNomeMotoboy.setText("");
            txtCPFMotoboy.setText("");
            txtEmailMotoboy.setText("");
            txtCNH.setText("");
            txtValidadeCNH.setText("");
        }
    }//GEN-LAST:event_btnExcluirMotoboyActionPerformed

    private void btnAdicionarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEnderecoActionPerformed
        if ((txtCEP.getText().length() > 0) && (txtEndereco.getText().length() > 0) && (txtNumero.getText().length() > 0) 
            && (txtBairro.getText().length() > 0) && (txtCidade.getText().length() > 0)) {
            EnderecoPizzaria e = new EnderecoPizzaria();

            e.setCEP(txtCEP.getText());
            e.setEndereco(txtEndereco.getText());
            e.setNumero(txtNumero.getText());

            if (txtComplemento.getText().length() == 0) {
                e.setComplemento("Não há");
            } else {
                e.setComplemento(txtComplemento.getText());
            }

            e.setBairro(txtBairro.getText());
            e.setCidade(txtCidade.getText());

            tableEnderecoPizza.addRow(e);
            txtCEP.setText("");
            txtEndereco.setText("");
            txtNumero.setText("");
            txtComplemento.setText("");
            txtBairro.setText("");
            txtCidade.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }//GEN-LAST:event_btnAdicionarEnderecoActionPerformed

    private void btnMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotoActionPerformed
        txtCNH.setEnabled(true);
        txtValidadeCNH.setEnabled(true);
        btnBike.setSelected(false);
    }//GEN-LAST:event_btnMotoActionPerformed

    private void btnAdicionarMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMotoboyActionPerformed
        txtNomeMotoboy.setEnabled(true);
        txtCPFMotoboy.setEnabled(true);
        txtTelMotoboy.setEnabled(true);
        txtEmailMotoboy.setEnabled(true);
        btnMoto.setEnabled(true);
        btnBike.setEnabled(true);
        btnSalvarMotoboy.setEnabled(true);
        btnCancelarMotoboy.setEnabled(true);
    }//GEN-LAST:event_btnAdicionarMotoboyActionPerformed

    private void btnCancelarMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMotoboyActionPerformed
        txtTelMotoboy.setText("");
        txtNomeMotoboy.setText("");
        txtCPFMotoboy.setText("");
        txtEmailMotoboy.setText("");
        txtCNH.setText("");
        txtValidadeCNH.setText("");
        txtTelMotoboy.setEnabled(false);
        txtNomeMotoboy.setEnabled(false);
        txtCPFMotoboy.setEnabled(false);
        txtCNH.setEnabled(false);
        txtValidadeCNH.setEnabled(false);
        btnSalvarMotoboy.setEnabled(false);
        btnCancelarMotoboy.setEnabled(false);
    }//GEN-LAST:event_btnCancelarMotoboyActionPerformed

    private void btnBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBikeActionPerformed
        txtCNH.setEnabled(false);
        txtValidadeCNH.setEnabled(false);
        txtCNH.setText("");
        txtValidadeCNH.setText("");
        btnMoto.setSelected(false);
    }//GEN-LAST:event_btnBikeActionPerformed

    private void btnSalvarMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMotoboyActionPerformed
        if ((txtNomeMotoboy.getText().length() > 0) && (txtTelMotoboy.getText().length() > 0) && (txtCPFMotoboy.getText().length() > 0)
            && (txtEmailMotoboy.getText().length() > 0) && (txtCNH.getText().length() > 0) && (txtValidadeCNH.getText().length() > 0)) {
            MotoboyPizzaria m = new MotoboyPizzaria();

            m.setTel(txtTelMotoboy.getText());
            m.setCPF(txtCPFMotoboy.getText());
            m.setNome(txtNomeMotoboy.getText());
            m.setEmail(txtEmailMotoboy.getText());

            if (btnMoto.isSelected()) {
                m.setVeiculo(btnMoto.getText());
                m.setCNH(txtCNH.getText());
                m.setValidadeCNH(txtValidadeCNH.getText());
            }
            
            if (btnBike.isSelected()) {
                m.setVeiculo(btnBike.getText());
                m.setCNH("Não há");
                m.setValidadeCNH("Não há");
            }
            
            tableMotoboyPizza.addRow(m);
            txtTelMotoboy.setText("");
            txtNomeMotoboy.setText("");
            txtCPFMotoboy.setText("");
            txtEmailMotoboy.setText("");
            txtCNH.setText("");
            txtValidadeCNH.setText("");
            btnMoto.setSelected(false);
            btnBike.setSelected(false);
            
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }//GEN-LAST:event_btnSalvarMotoboyActionPerformed

    private void btnAtualizarMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarMotoboyActionPerformed
        if (jTMotoboy.getSelectedRow() != -1) {
            tableMotoboyPizza.setValueAt(txtNomeMotoboy.getText(), jTMotoboy.getSelectedRow(), 0);
            tableMotoboyPizza.setValueAt(txtCPFMotoboy.getText(), jTMotoboy.getSelectedRow(), 1);
            tableMotoboyPizza.setValueAt(txtTelMotoboy.getText(), jTMotoboy.getSelectedRow(), 2);
            tableMotoboyPizza.setValueAt(txtEmailMotoboy.getText(), jTMotoboy.getSelectedRow(), 3);

            if (btnMoto.isSelected()) {
                tableMotoboyPizza.setValueAt(btnMoto.getText(), jTMotoboy.getSelectedRow(), 4);
                tableMotoboyPizza.setValueAt(txtCNH.getText(), jTMotoboy.getSelectedRow(), 5);
                tableMotoboyPizza.setValueAt(txtValidadeCNH.getText(), jTMotoboy.getSelectedRow(), 6);
            }

            if (btnBike.isSelected()) {
                tableMotoboyPizza.setValueAt(btnBike.getText(), jTMotoboy.getSelectedRow(), 4);
                tableMotoboyPizza.setValueAt("Não há", jTMotoboy.getSelectedRow(), 5);
                tableMotoboyPizza.setValueAt("Não há", jTMotoboy.getSelectedRow(), 6);
            }
            
            txtTelMotoboy.setText("");
            txtNomeMotoboy.setText("");
            txtCPFMotoboy.setText("");
            txtEmailMotoboy.setText("");
            txtCNH.setText("");
            txtValidadeCNH.setText("");
            btnMoto.setSelected(false);
            btnBike.setSelected(false);
        }
    }//GEN-LAST:event_btnAtualizarMotoboyActionPerformed

    private void jTMotoboyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMotoboyMouseClicked
        MotoboyPizzaria m = tableMotoboyPizza.getDados(jTMotoboy.getSelectedRow());
        txtNomeMotoboy.setText(m.getNome());
        txtTelMotoboy.setText(m.getTel());
        txtCPFMotoboy.setText(m.getCPF());
        txtEmailMotoboy.setText(m.getEmail());

        if (m.getVeiculo().equals("Moto")) {
            btnBike.setSelected(false);
            btnMoto.setSelected(true);
            txtCNH.setText(m.getCNH());
            txtValidadeCNH.setText(m.getValidadeCNH());
        } else if (m.getVeiculo().equals("Bicicleta")) {
            btnMoto.setSelected(false);
            btnBike.setSelected(true);
            txtCNH.setText("");
            txtValidadeCNH.setText("");
            txtCNH.setEnabled(false);
            txtValidadeCNH.setEnabled(false);
        }
    }//GEN-LAST:event_jTMotoboyMouseClicked


    private void btnFazerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerPedidoActionPerformed
        if ((txtNumeroPedido.getText().length() > 0)) {
            PedidosPizzaria p = new PedidosPizzaria();
            p.setNumeroPedido(Integer.parseInt(txtNumeroPedido.getText()));
            p.setValorPedido(Double.parseDouble(txtValorTotal.getText()));

            if (btnCredito.isSelected()) {
                p.setFormaPagamento(btnCredito.getText());
            }
            if (btnDebito.isSelected()) {
                p.setFormaPagamento(btnDebito.getText());
            }
            if (btnDinheiro.isSelected()) {
                p.setFormaPagamento(btnDinheiro.getText());
            }

            if (btnMussGrande.isSelected()) {
                p.setPizza(cbMussPedido.getText() + " grande");
            }
            if (btnMussBroto.isSelected()) {
                p.setPizza(cbMussPedido.getText() + " broto");
            }
            if (btnPortGrande.isSelected()) {
                p.setPizza(cbPortuguesaPedido.getText() + " grande");
            }
            if (btnPortBroto.isSelected()) {
                p.setPizza(cbPortuguesaPedido.getText() + " broto");
            }
            if (btnCalGrande.isSelected()) {
                p.setPizza(cbCalabresaPedido.getText() + " grande");
            }
            if (btnCalBroto.isSelected()) {
                p.setPizza(cbCalabresaPedido.getText() + " broto");
            }
            if (btnFrangoGrande.isSelected()) {
                p.setPizza(cbFrangoPedido.getText() + " grande");
            }
            if (btnFrangoBroto.isSelected()) {
                p.setPizza(cbFrangoPedido.getText() + " broto");
            }
            if (!btnMussGrande.isSelected() && !btnMussBroto.isSelected() && !btnPortGrande.isSelected() && !btnPortBroto.isSelected() && !btnCalGrande.isSelected()
                    && !btnCalBroto.isSelected() && !btnFrangoGrande.isSelected() && !btnFrangoBroto.isSelected()) {
                p.setPizza("Nenhuma pizza selecionada");
            }

            if (cbCoca.isSelected()) {
                p.setBebida(cbCoca.getText());
            }
            if (cbFantaLa.isSelected()) {
                p.setBebida(cbFantaLa.getText());
            }
            if (cbFantaUva.isSelected()) {
                p.setBebida(cbFantaUva.getText());
            }
            if (cbGuarana.isSelected()) {
                p.setBebida(cbGuarana.getText());
            }
            if (!cbGuarana.isSelected() && !cbFantaUva.isSelected() && !cbFantaLa.isSelected() && !cbCoca.isSelected()) {
                p.setBebida("Nenhuma bebida selecionada");
            }

            TotalP = 0;
            txtNumeroPedido.setText("");
            txtValorTotal.setText("");
            cbMussPedido.setSelected(false);
            cbPortuguesaPedido.setSelected(false);
            cbFrangoPedido.setSelected(false);
            cbCalabresaPedido.setSelected(false);
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
            cbCoca.setSelected(false);
            cbGuarana.setSelected(false);
            cbFantaLa.setSelected(false);
            cbFantaUva.setSelected(false);
            btnCredito.setSelected(false);
            btnDebito.setSelected(false);
            btnDinheiro.setSelected(false);
            btnMussBroto.setEnabled(false);
            btnPortBroto.setEnabled(false);
            btnFrangoBroto.setEnabled(false);
            btnCalBroto.setEnabled(false);
            btnMussGrande.setEnabled(false);
            btnPortGrande.setEnabled(false);
            btnFrangoGrande.setEnabled(false);
            btnCalGrande.setEnabled(false);
            tablePedidosPizza.addRow(p);          
        } else {
            JOptionPane.showMessageDialog(null, "Preencher o campo numero do pedido!");
        }
    }//GEN-LAST:event_btnFazerPedidoActionPerformed

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        TotalP = 0;
        txtNumeroPedido.setText("");
        txtNumeroPedido.setEnabled(false);
        txtValorTotal.setEditable(false);
        txtValorTotal.setText("");
        cbMussPedido.setEnabled(false);
        cbPortuguesaPedido.setEnabled(false);
        cbFrangoPedido.setEnabled(false);
        cbCalabresaPedido.setEnabled(false);
        btnMussBroto.setEnabled(false);
        btnPortBroto.setEnabled(false);
        btnFrangoBroto.setEnabled(false);
        btnCalBroto.setEnabled(false);
        btnMussGrande.setEnabled(false);
        btnPortGrande.setEnabled(false);
        btnFrangoGrande.setEnabled(false);
        btnCalGrande.setEnabled(false);
        cbCoca.setEnabled(false);
        cbGuarana.setEnabled(false);
        cbFantaLa.setEnabled(false);
        cbFantaUva.setEnabled(false);
        btnCredito.setEnabled(false);
        btnDebito.setEnabled(false);
        btnDinheiro.setEnabled(false);
        btnTotalPedido.setEnabled(false);
        btnFazerPedido.setEnabled(false);

        cbMussPedido.setSelected(false);
        cbPortuguesaPedido.setSelected(false);
        cbFrangoPedido.setSelected(false);
        cbCalabresaPedido.setSelected(false);
        btnMussBroto.setSelected(false);
        btnPortBroto.setSelected(false);
        btnFrangoBroto.setSelected(false);
        btnCalBroto.setSelected(false);
        btnMussGrande.setSelected(false);
        btnPortGrande.setSelected(false);
        btnFrangoGrande.setSelected(false);
        btnCalGrande.setSelected(false);
        cbCoca.setSelected(false);
        cbGuarana.setSelected(false);
        cbFantaLa.setSelected(false);
        cbFantaUva.setSelected(false);
        btnCredito.setSelected(false);
        btnDebito.setSelected(false);
        btnDinheiro.setSelected(false);
        btnTotalPedido.setSelected(false);
        btnFazerPedido.setSelected(false);
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed


    private void btnTotalPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPedidoActionPerformed
        if (btnMussGrande.isSelected() || btnMussBroto.isSelected() || btnPortBroto.isSelected() || btnPortGrande.isSelected() || btnCalBroto.isSelected()
            || btnCalGrande.isSelected() || btnFrangoBroto.isSelected() || btnFrangoGrande.isSelected() || cbCoca.isSelected() || cbFantaLa.isSelected()
            || cbFantaUva.isSelected() || cbGuarana.isSelected()) {

            if (btnMussGrande.isSelected()) {
                TotalP += 50.00;
            }
            if (btnMussBroto.isSelected()) {
                TotalP += 30.00;
            }
            if (btnPortBroto.isSelected()) {
                TotalP += 30.00;
            }
            if (btnPortGrande.isSelected()) {
                TotalP += 50.00;
            }
            if (btnCalBroto.isSelected()) {
                TotalP += 30.00;
            }
            if (btnCalGrande.isSelected()) {
                TotalP += 50.00;
            }
            if (btnFrangoBroto.isSelected()) {
                TotalP += 30.00;
            }
            if (btnFrangoGrande.isSelected()) {
                TotalP += 50.00;
            }

            if (cbCoca.isSelected()) {
                TotalP += 10.00;
            }
            if (cbFantaLa.isSelected()) {
                TotalP += 10.00;
            }
            if (cbFantaUva.isSelected()) {
                TotalP += 10.00;
            }
            if (cbGuarana.isSelected()) {
                TotalP += 10.00;
            }
            txtValorTotal.setText(String.valueOf(TotalP)); 
            btnFazerPedido.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado");
        }
       
    }//GEN-LAST:event_btnTotalPedidoActionPerformed

    private void btnNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPedidoActionPerformed
        txtNumeroPedido.setEnabled(true);
        cbMussPedido.setEnabled(true);
        cbPortuguesaPedido.setEnabled(true);
        cbFrangoPedido.setEnabled(true);
        cbCalabresaPedido.setEnabled(true);
        cbCoca.setEnabled(true);
        cbGuarana.setEnabled(true);
        cbFantaLa.setEnabled(true);
        cbFantaUva.setEnabled(true);
        btnCredito.setEnabled(true);
        btnDebito.setEnabled(true);
        btnDinheiro.setEnabled(true);
        btnTotalPedido.setEnabled(true);
        btnCancelarPedido.setEnabled(true);
        TotalP = 0;
        txtValorTotal.setText("");
        txtNumeroPedido.setText("");
        cbMussPedido.setSelected(false);
        cbPortuguesaPedido.setSelected(false);
        cbFrangoPedido.setSelected(false);
        cbCalabresaPedido.setSelected(false);
        btnMussBroto.setSelected(false);
        btnPortBroto.setSelected(false);
        btnFrangoBroto.setSelected(false);
        btnCalBroto.setSelected(false);
        btnMussGrande.setSelected(false);
        btnPortGrande.setSelected(false);
        btnFrangoGrande.setSelected(false);
        btnCalGrande.setSelected(false);
        cbCoca.setSelected(false);
        cbGuarana.setSelected(false);
        cbFantaLa.setSelected(false);
        cbFantaUva.setSelected(false);
        btnCredito.setSelected(false);
        btnDebito.setSelected(false);
        btnDinheiro.setSelected(false);
    }//GEN-LAST:event_btnNovoPedidoActionPerformed

    private void btnAtualizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPedidoActionPerformed
        if (jTPedidosPizza.getSelectedRow() != -1) {
            tablePedidosPizza.setValueAt(txtNumeroPedido.getText(), jTPedidosPizza.getSelectedRow(), 0);
            tablePedidosPizza.setValueAt(txtValorTotal.getText(), jTPedidosPizza.getSelectedRow(), 3);

            if (btnCredito.isSelected()) {
                tablePedidosPizza.setValueAt(btnCredito.getText(), jTPedidosPizza.getSelectedRow(), 4);
            }
            if (btnDebito.isSelected()) {
                tablePedidosPizza.setValueAt(btnDebito.getText(), jTPedidosPizza.getSelectedRow(), 4);
            }
            if (btnDinheiro.isSelected()) {
                tablePedidosPizza.setValueAt(btnDinheiro.getText(), jTPedidosPizza.getSelectedRow(), 4);
            }

            if (btnMussGrande.isSelected()) {
                tablePedidosPizza.setValueAt(cbMussPedido.getText() + " grande", jTPedidosPizza.getSelectedRow(), 1);
            }
            if (btnMussBroto.isSelected()) {
                tablePedidosPizza.setValueAt(cbMussPedido.getText() + " broto", jTPedidosPizza.getSelectedRow(), 1);
            }
            if (btnPortGrande.isSelected()) {
                tablePedidosPizza.setValueAt(cbPortuguesaPedido.getText() + " grande", jTPedidosPizza.getSelectedRow(), 1);
            }
            if (btnPortBroto.isSelected()) {
                tablePedidosPizza.setValueAt(cbPortuguesaPedido.getText() + " broto", jTPedidosPizza.getSelectedRow(), 1);
            }
            if (btnCalGrande.isSelected()) {
                tablePedidosPizza.setValueAt(cbCalabresaPedido.getText() + " grande", jTPedidosPizza.getSelectedRow(), 1);
            }
            if (btnCalBroto.isSelected()) {
                tablePedidosPizza.setValueAt(cbCalabresaPedido.getText() + " broto", jTPedidosPizza.getSelectedRow(), 1);
            }
            if (btnFrangoGrande.isSelected()) {
                tablePedidosPizza.setValueAt(cbFrangoPedido.getText() + " grande", jTPedidosPizza.getSelectedRow(), 1);
            }
            if (btnFrangoBroto.isSelected()) {
                tablePedidosPizza.setValueAt(cbFrangoPedido.getText() + " broto", jTPedidosPizza.getSelectedRow(), 1);
            }
            if (!btnMussGrande.isSelected() && !btnMussBroto.isSelected() && !btnPortGrande.isSelected() && !btnPortBroto.isSelected() && !btnCalGrande.isSelected()
                    && !btnCalBroto.isSelected() && !btnFrangoGrande.isSelected() && !btnFrangoBroto.isSelected()) {
                tablePedidosPizza.setValueAt("Nenhuma pizza selecionada", jTPedidosPizza.getSelectedRow(), 1);
            }

            if (cbCoca.isSelected()) {
                tablePedidosPizza.setValueAt(cbCoca.getText(), jTPedidosPizza.getSelectedRow(), 2);
            }
            if (cbFantaLa.isSelected()) {
                tablePedidosPizza.setValueAt(cbFantaLa.getText(), jTPedidosPizza.getSelectedRow(), 2);
            }
            if (cbFantaUva.isSelected()) {
                tablePedidosPizza.setValueAt(cbFantaUva.getText(), jTPedidosPizza.getSelectedRow(), 2);
            }
            if (cbGuarana.isSelected()) {
                tablePedidosPizza.setValueAt(cbGuarana.getText(), jTPedidosPizza.getSelectedRow(), 2);
            }
            if (!cbGuarana.isSelected() && !cbFantaUva.isSelected() && !cbFantaLa.isSelected() && !cbCoca.isSelected()) {
                tablePedidosPizza.setValueAt("Nenhuma bebida  selecionada", jTPedidosPizza.getSelectedRow(), 2);
            }
        }
    }//GEN-LAST:event_btnAtualizarPedidoActionPerformed

    private void btnExcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPedidoActionPerformed
        if (jTPedidosPizza.getSelectedRow() != -1) {
            tablePedidosPizza.removeRow(jTPedidosPizza.getSelectedRow());
            TotalP = 0;
            txtNumeroPedido.setText("");
            txtValorTotal.setEditable(false);
            txtValorTotal.setText("");
            cbMussPedido.setSelected(false);
            cbPortuguesaPedido.setSelected(false);
            cbFrangoPedido.setSelected(false);
            cbCalabresaPedido.setSelected(false);
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
            cbCoca.setSelected(false);
            cbGuarana.setSelected(false);
            cbFantaLa.setSelected(false);
            cbFantaUva.setSelected(false);
            btnCredito.setSelected(false);
            btnDebito.setSelected(false);
            btnDinheiro.setSelected(false);
            btnMussBroto.setEnabled(false);
            btnPortBroto.setEnabled(false);
            btnFrangoBroto.setEnabled(false);
            btnCalBroto.setEnabled(false);
            btnMussGrande.setEnabled(false);
            btnPortGrande.setEnabled(false);
            btnFrangoGrande.setEnabled(false);
            btnCalGrande.setEnabled(false);
            btnFazerPedido.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirPedidoActionPerformed

    private void btnMussBrotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMussBrotoActionPerformed
        btnMussGrande.setSelected(false);
        btnMussBroto.setSelected(true);
    }//GEN-LAST:event_btnMussBrotoActionPerformed

    private void btnMussGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMussGrandeActionPerformed
        btnMussBroto.setSelected(false);
        btnMussGrande.setSelected(true);
    }//GEN-LAST:event_btnMussGrandeActionPerformed

    private void btnPortBrotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortBrotoActionPerformed
        btnPortGrande.setSelected(false);
        btnPortBroto.setSelected(true);
    }//GEN-LAST:event_btnPortBrotoActionPerformed

    private void btnPortGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortGrandeActionPerformed
        btnPortBroto.setSelected(false);
        btnPortGrande.setSelected(true);
    }//GEN-LAST:event_btnPortGrandeActionPerformed

    private void btnFrangoBrotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrangoBrotoActionPerformed
        btnFrangoGrande.setSelected(false);
        btnFrangoBroto.setSelected(true);
    }//GEN-LAST:event_btnFrangoBrotoActionPerformed

    private void btnFrangoGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrangoGrandeActionPerformed
        btnFrangoBroto.setSelected(false);
        btnFrangoGrande.setSelected(true);
    }//GEN-LAST:event_btnFrangoGrandeActionPerformed

    private void btnCalBrotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalBrotoActionPerformed
        btnCalGrande.setSelected(false);
        btnCalBroto.setSelected(true);
    }//GEN-LAST:event_btnCalBrotoActionPerformed

    private void btnCalGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalGrandeActionPerformed
        btnCalBroto.setSelected(false);
        btnCalGrande.setSelected(true);
    }//GEN-LAST:event_btnCalGrandeActionPerformed

    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed
        if (btnCredito.isSelected()) {
            btnDinheiro.setSelected(false);
            btnDebito.setSelected(false);
        }
    }//GEN-LAST:event_btnCreditoActionPerformed

    private void btnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinheiroActionPerformed
        if (btnDinheiro.isSelected()) {
            btnCredito.setSelected(false);
            btnDebito.setSelected(false);
        }
    }//GEN-LAST:event_btnDinheiroActionPerformed

    private void btnDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebitoActionPerformed
        if (btnDebito.isSelected()) {
            btnDinheiro.setSelected(false);
            btnCredito.setSelected(false);
        }
    }//GEN-LAST:event_btnDebitoActionPerformed

    private void btnNovaPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPizzaActionPerformed
        btnAdicionarPizza.setEnabled(true);
        btnCancelarPizza.setEnabled(true);
        txtSabor.setEnabled(true);
        btnMussBase.setEnabled(true);
        btnCheddarBase.setEnabled(true);
        btnCatuBase.setEnabled(true);
        btnMussBorda.setEnabled(true);
        btnCatuBorda.setEnabled(true);
        btnCheddarBorda.setEnabled(true);
        btnSemBorda.setEnabled(true);
        comboIngrediente1.setEnabled(true);
        comboIngrediente2.setEnabled(true);
        comboIngrediente3.setEnabled(true);
        comboIngrediente1.setSelectedItem("Nenhum");
        comboIngrediente2.setSelectedItem("Nenhum");
        comboIngrediente3.setSelectedItem("Nenhum");
    }//GEN-LAST:event_btnNovaPizzaActionPerformed

    private void btnAtualizarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPizzaActionPerformed
        if (jTPizzasPizza.getSelectedRow() != -1) {
            tablePizzasPizza.setValueAt(txtSabor.getText(), jTPizzasPizza.getSelectedRow(), 0);

            if (btnMussBase.isSelected()) {
                tablePizzasPizza.setValueAt(btnMussBase.getText(), jTPizzasPizza.getSelectedRow(), 1);
            }
            if (btnCheddarBase.isSelected()) {
                tablePizzasPizza.setValueAt(btnCheddarBase.getText(), jTPizzasPizza.getSelectedRow(), 1);
            }
            if (btnCatuBase.isSelected()) {
                tablePizzasPizza.setValueAt(btnCatuBase.getText(), jTPizzasPizza.getSelectedRow(), 1);
            }
            
            if (btnMussBorda.isSelected()) {
                tablePizzasPizza.setValueAt(btnMussBorda.getText(), jTPizzasPizza.getSelectedRow(), 5);
            }
            if (btnCatuBorda.isSelected()) {
                tablePizzasPizza.setValueAt(btnCatuBorda.getText(), jTPizzasPizza.getSelectedRow(), 5);
            }
            if (btnCheddarBorda.isSelected()) {
                tablePizzasPizza.setValueAt(btnCheddarBorda.getText(), jTPizzasPizza.getSelectedRow(), 5);
            }
            if (btnSemBorda.isSelected()) {
                tablePizzasPizza.setValueAt(btnSemBorda.getText(), jTPizzasPizza.getSelectedRow(), 5);
            }
            
            if (comboIngrediente1.getSelectedItem().equals("Frango")) {
                tablePizzasPizza.setValueAt("Frango", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Presunto")) {
                tablePizzasPizza.setValueAt("Presunto", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Calabresa")) {
                tablePizzasPizza.setValueAt("Calabresa", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Ervilha")) {
                tablePizzasPizza.setValueAt("Ervilha", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Milho")) {
                tablePizzasPizza.setValueAt("Milho", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Cebola")) {
                tablePizzasPizza.setValueAt("Cebola", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Bacon")) {
                tablePizzasPizza.setValueAt("Bacon", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Tomate")) {
                tablePizzasPizza.setValueAt("Tomate", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Ovo")) {
                tablePizzasPizza.setValueAt("Ovo", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Palmito")) {
                tablePizzasPizza.setValueAt("Palmito", jTPizzasPizza.getSelectedRow(), 2);
            }
            if (comboIngrediente1.getSelectedItem().equals("Nenhum")) {
                tablePizzasPizza.setValueAt("Nenhum", jTPizzasPizza.getSelectedRow(), 2);
            }

            if (comboIngrediente2.getSelectedItem().equals("Frango")) {
                tablePizzasPizza.setValueAt("Frango", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Presunto")) {
                tablePizzasPizza.setValueAt("Presunto", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Calabresa")) {
                tablePizzasPizza.setValueAt("Calabresa", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Ervilha")) {
                tablePizzasPizza.setValueAt("Ervilha", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Milho")) {
                tablePizzasPizza.setValueAt("Milho", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Cebola")) {
                tablePizzasPizza.setValueAt("Cebola", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Bacon")) {
                tablePizzasPizza.setValueAt("Bacon", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Tomate")) {
                tablePizzasPizza.setValueAt("Tomate", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Ovo")) {
                tablePizzasPizza.setValueAt("Ovo", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Palmito")) {
                tablePizzasPizza.setValueAt("Palmito", jTPizzasPizza.getSelectedRow(), 3);
            }
            if (comboIngrediente2.getSelectedItem().equals("Nenhum")) {
                tablePizzasPizza.setValueAt("Nenhum", jTPizzasPizza.getSelectedRow(), 3);
            }

            if (comboIngrediente3.getSelectedItem().equals("Frango")) {
                tablePizzasPizza.setValueAt("Frango", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Presunto")) {
                tablePizzasPizza.setValueAt("Presunto", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Calabresa")) {
                tablePizzasPizza.setValueAt("Calabresa", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Ervilha")) {
                tablePizzasPizza.setValueAt("Ervilha", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Milho")) {
                tablePizzasPizza.setValueAt("Milho", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Cebola")) {
                tablePizzasPizza.setValueAt("Cebola", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Bacon")) {
                tablePizzasPizza.setValueAt("Bacon", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Tomate")) {
                tablePizzasPizza.setValueAt("Tomate", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Ovo")) {
                tablePizzasPizza.setValueAt("Ovo", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Palmito")) {
                tablePizzasPizza.setValueAt("Palmito", jTPizzasPizza.getSelectedRow(), 4);
            }
            if (comboIngrediente3.getSelectedItem().equals("Nenhum")) {
                tablePizzasPizza.setValueAt("Nenhum", jTPizzasPizza.getSelectedRow(), 4);
            }
        }
    }//GEN-LAST:event_btnAtualizarPizzaActionPerformed

    private void btnExcluirPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPizzaActionPerformed
        if (jTPizzasPizza.getSelectedRow() != -1) {
            tablePizzasPizza.removeRow(jTPizzasPizza.getSelectedRow());
            txtSabor.setText(" ");
            btnMussBase.setSelected(false);
            btnCheddarBase.setSelected(false);
            btnCatuBase.setSelected(false);
            btnMussBorda.setSelected(false);
            btnCatuBorda.setSelected(false);
            btnCheddarBorda.setSelected(false);
            btnSemBorda.setSelected(false);
            comboIngrediente1.setSelectedItem("Nenhum");
            comboIngrediente2.setSelectedItem("Nenhum");
            comboIngrediente3.setSelectedItem("Nenhum");
        }
    }//GEN-LAST:event_btnExcluirPizzaActionPerformed

    private void btnAdicionarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarPizzaActionPerformed
        if (txtSabor.getText().length() > 0) {
            PizzasPizzaria s = new PizzasPizzaria();
            s.setNomeSabor(txtSabor.getText());

            if (btnMussBase.isSelected()) {
                s.setBase(btnMussBase.getText());
            }
            if (btnCheddarBase.isSelected()) {
                s.setBase(btnCheddarBase.getText());
            }
            if (btnCatuBase.isSelected()) {
                s.setBase(btnCatuBase.getText());
            }

            if (btnMussBorda.isSelected()) {
                s.setBorda(btnMussBorda.getText());
            }
            if (btnCatuBorda.isSelected()) {
                s.setBorda(btnCatuBorda.getText());
            }
            if (btnCheddarBorda.isSelected()) {
                s.setBorda(btnCheddarBorda.getText());
            }
            if (btnSemBorda.isSelected()) {
                s.setBorda(btnSemBorda.getText());
            }

            if (comboIngrediente1.getSelectedItem().equals("Frango")) {
                s.setIngrediente1("Frango");
            }
            if (comboIngrediente1.getSelectedItem().equals("Presunto")) {
                s.setIngrediente1("Presunto");
            }
            if (comboIngrediente1.getSelectedItem().equals("Calabresa")) {
                s.setIngrediente1("Calabresa");
            }
            if (comboIngrediente1.getSelectedItem().equals("Ervilha")) {
                s.setIngrediente1("Ervilha");
            }
            if (comboIngrediente1.getSelectedItem().equals("Milho")) {
                s.setIngrediente1("Milho");
            }
            if (comboIngrediente1.getSelectedItem().equals("Cebola")) {
                s.setIngrediente1("Cebola");
            }
            if (comboIngrediente1.getSelectedItem().equals("Bacon")) {
                s.setIngrediente1("Bacon");
            }
            if (comboIngrediente1.getSelectedItem().equals("Tomate")) {
                s.setIngrediente1("Tomate");
            }
            if (comboIngrediente1.getSelectedItem().equals("Ovo")) {
                s.setIngrediente1("Ovo");
            }
            if (comboIngrediente1.getSelectedItem().equals("Palmito")) {
                s.setIngrediente1("Palmito");
            }
            if (comboIngrediente1.getSelectedItem().equals("Nenhum")) {
                s.setIngrediente1("Nenhum");
            }

            if (comboIngrediente2.getSelectedItem().equals("Frango")) {
                s.setIngrediente2("Frango");
            }
            if (comboIngrediente2.getSelectedItem().equals("Presunto")) {
                s.setIngrediente2("Presunto");
            }
            if (comboIngrediente2.getSelectedItem().equals("Calabresa")) {
                s.setIngrediente2("Calabresa");
            }
            if (comboIngrediente2.getSelectedItem().equals("Ervilha")) {
                s.setIngrediente2("Ervilha");
            }
            if (comboIngrediente2.getSelectedItem().equals("Milho")) {
                s.setIngrediente2("Milho");
            }
            if (comboIngrediente2.getSelectedItem().equals("Cebola")) {
                s.setIngrediente2("Cebola");
            }
            if (comboIngrediente2.getSelectedItem().equals("Bacon")) {
                s.setIngrediente2("Bacon");
            }
            if (comboIngrediente2.getSelectedItem().equals("Tomate")) {
                s.setIngrediente2("Tomate");
            }
            if (comboIngrediente2.getSelectedItem().equals("Ovo")) {
                s.setIngrediente2("Ovo");
            }
            if (comboIngrediente2.getSelectedItem().equals("Palmito")) {
                s.setIngrediente2("Palmito");
            }
            if (comboIngrediente2.getSelectedItem().equals("Nenhum")) {
                s.setIngrediente2("Nenhum");
            }

            if (comboIngrediente3.getSelectedItem().equals("Frango")) {
                s.setIngrediente3("Frango");
            }
            if (comboIngrediente3.getSelectedItem().equals("Presunto")) {
                s.setIngrediente3("Presunto");
            }
            if (comboIngrediente3.getSelectedItem().equals("Calabresa")) {
                s.setIngrediente3("Calabresa");
            }
            if (comboIngrediente3.getSelectedItem().equals("Ervilha")) {
                s.setIngrediente3("Ervilha");
            }
            if (comboIngrediente3.getSelectedItem().equals("Milho")) {
                s.setIngrediente3("Milho");
            }
            if (comboIngrediente3.getSelectedItem().equals("Cebola")) {
                s.setIngrediente3("Cebola");
            }
            if (comboIngrediente3.getSelectedItem().equals("Bacon")) {
                s.setIngrediente3("Bacon");
            }
            if (comboIngrediente3.getSelectedItem().equals("Tomate")) {
                s.setIngrediente3("Tomate");
            }
            if (comboIngrediente3.getSelectedItem().equals("Ovo")) {
                s.setIngrediente3("Ovo");
            }
            if (comboIngrediente3.getSelectedItem().equals("Palmito")) {
                s.setIngrediente3("Palmito");
            }
            if (comboIngrediente3.getSelectedItem().equals("Nenhum")) {
                s.setIngrediente3("Nenhum");
            }

            tablePizzasPizza.addRow(s);
            txtSabor.setText("");
            btnCheddarBorda.setSelected(false);
            btnCatuBorda.setSelected(false);
            btnMussBorda.setSelected(false);
            btnSemBorda.setSelected(false);
            btnCheddarBase.setSelected(false);
            btnCatuBase.setSelected(false);
            btnMussBase.setSelected(false);
            comboIngrediente1.setSelectedItem("Nenhum");
            comboIngrediente2.setSelectedItem("Nenhum");
            comboIngrediente3.setSelectedItem("Nenhum");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }//GEN-LAST:event_btnAdicionarPizzaActionPerformed

    private void btnCancelarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPizzaActionPerformed
        txtSabor.setText(" ");
        btnAdicionarPizza.setEnabled(false);
        btnCancelarPizza.setEnabled(false);
        txtSabor.setEnabled(false);
        btnMussBase.setEnabled(false);
        btnCheddarBase.setEnabled(false);
        btnCatuBase.setEnabled(false);
        btnMussBorda.setEnabled(false);
        btnCatuBorda.setEnabled(false);
        btnCheddarBorda.setEnabled(false);
        btnSemBorda.setEnabled(false);
        btnMussBase.setSelected(false);
        btnCheddarBase.setSelected(false);
        btnCatuBase.setSelected(false);
        btnMussBorda.setSelected(false);
        btnCatuBorda.setSelected(false);
        btnCheddarBorda.setSelected(false);
        btnSemBorda.setSelected(false);
        comboIngrediente1.setEnabled(false);
        comboIngrediente2.setEnabled(false);
        comboIngrediente3.setEnabled(false);
        comboIngrediente1.setSelectedItem("Nenhum");
        comboIngrediente2.setSelectedItem("Nenhum");
        comboIngrediente3.setSelectedItem("Nenhum");
    }//GEN-LAST:event_btnCancelarPizzaActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void cbPortuguesaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPortuguesaPedidoActionPerformed
        if (cbPortuguesaPedido.isSelected()) {
            btnPortBroto.setEnabled(true);
            btnPortGrande.setEnabled(true);
            cbMussPedido.setSelected(false);
            cbCalabresaPedido.setSelected(false);
            cbFrangoPedido.setSelected(false);
            btnMussBroto.setEnabled(false);
            btnMussGrande.setEnabled(false);
            btnFrangoBroto.setEnabled(false);
            btnFrangoGrande.setEnabled(false);
            btnCalBroto.setEnabled(false);
            btnCalGrande.setEnabled(false);
            btnMussBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalBroto.setSelected(false);
            btnCalGrande.setSelected(false);
        }
    }//GEN-LAST:event_cbPortuguesaPedidoActionPerformed

    private void cbMussPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMussPedidoActionPerformed
        if (cbMussPedido.isSelected()) {
            btnMussBroto.setEnabled(true);
            btnMussGrande.setEnabled(true);
            cbPortuguesaPedido.setSelected(false);
            cbCalabresaPedido.setSelected(false);
            cbFrangoPedido.setSelected(false);
            btnFrangoBroto.setEnabled(false);
            btnFrangoGrande.setEnabled(false);
            btnCalBroto.setEnabled(false);
            btnCalGrande.setEnabled(false);
            btnPortBroto.setEnabled(false);
            btnPortGrande.setEnabled(false);
            btnPortBroto.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalBroto.setSelected(false);
            btnCalGrande.setSelected(false);
        }
    }//GEN-LAST:event_cbMussPedidoActionPerformed

    private void cbFrangoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFrangoPedidoActionPerformed
        if (cbFrangoPedido.isSelected()) {
            btnFrangoBroto.setEnabled(true);
            btnFrangoGrande.setEnabled(true);
            cbMussPedido.setSelected(false);
            cbCalabresaPedido.setSelected(false);
            cbPortuguesaPedido.setSelected(false);
            btnCalBroto.setEnabled(false);
            btnCalGrande.setEnabled(false);
            btnPortBroto.setEnabled(false);
            btnPortGrande.setEnabled(false);
            btnMussBroto.setEnabled(false);
            btnMussGrande.setEnabled(false);
            btnPortBroto.setSelected(false);
            btnPortGrande.setSelected(false);
            btnMussBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnCalBroto.setSelected(false);
            btnCalGrande.setSelected(false);
        }
    }//GEN-LAST:event_cbFrangoPedidoActionPerformed

    private void cbCalabresaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCalabresaPedidoActionPerformed
        if (cbCalabresaPedido.isSelected()) {
            btnCalBroto.setEnabled(true);
            btnCalGrande.setEnabled(true);
            cbMussPedido.setSelected(false);
            cbFrangoPedido.setSelected(false);
            cbPortuguesaPedido.setSelected(false);
            btnPortBroto.setEnabled(false);
            btnPortGrande.setEnabled(false);
            btnMussBroto.setEnabled(false);
            btnMussGrande.setEnabled(false);
            btnFrangoBroto.setEnabled(false);
            btnFrangoGrande.setEnabled(false);
            btnPortBroto.setSelected(false);
            btnPortGrande.setSelected(false);
            btnMussBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnFrangoGrande.setSelected(false);
        }
    }//GEN-LAST:event_cbCalabresaPedidoActionPerformed

    private void cbCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCocaActionPerformed
        if (cbCoca.isSelected()) {
            cbGuarana.setSelected(false);
            cbFantaLa.setSelected(false);
            cbFantaUva.setSelected(false);
        }
    }//GEN-LAST:event_cbCocaActionPerformed

    private void cbGuaranaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGuaranaActionPerformed
        if (cbGuarana.isSelected()) {
            cbCoca.setSelected(false);
            cbFantaLa.setSelected(false);
            cbFantaUva.setSelected(false);
        }
    }//GEN-LAST:event_cbGuaranaActionPerformed

    private void cbFantaUvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFantaUvaActionPerformed
        if (cbFantaUva.isSelected()) {
            cbGuarana.setSelected(false);
            cbFantaLa.setSelected(false);
            cbCoca.setSelected(false);
        }
    }//GEN-LAST:event_cbFantaUvaActionPerformed

    private void cbFantaLaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFantaLaActionPerformed
        if (cbFantaLa.isSelected()) {
            cbGuarana.setSelected(false);
            cbCoca.setSelected(false);
            cbFantaUva.setSelected(false);
        }
    }//GEN-LAST:event_cbFantaLaActionPerformed

    private void jTPedidosPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPedidosPizzaMouseClicked
        PedidosPizzaria p = tablePedidosPizza.getDados(jTPedidosPizza.getSelectedRow());
        txtNumeroPedido.setText(String.valueOf(p.getNumeroPedido()));
        txtValorTotal.setText(String.valueOf(p.getValorPedido()));

        if (p.getFormaPagamento().equals("Cartão de crédito")) {
            btnDebito.setSelected(false);
            btnDinheiro.setSelected(false);
            btnCredito.setSelected(true);
        }
        if (p.getFormaPagamento().equals("Cartão de débito")) {
            btnCredito.setSelected(false);
            btnDinheiro.setSelected(false);
            btnDebito.setSelected(true);
        }
        if (p.getFormaPagamento().equals("Dinheiro")) {
            btnDebito.setSelected(false);
            btnCredito.setSelected(false);
            btnDinheiro.setSelected(true);
        }

        if (p.getPizza().equals("Mussarela broto")) {
            btnMussBroto.setSelected(true);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
            btnMussBroto.setEnabled(true);
            btnMussGrande.setEnabled(true);
            cbMussPedido.setEnabled(true);
            cbMussPedido.setSelected(true);
        }
        if (p.getPizza().equals("Mussarela grande")) {
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(true);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
            btnMussBroto.setEnabled(true);
            btnMussGrande.setEnabled(true);
            cbMussPedido.setEnabled(true);
            cbMussPedido.setSelected(true);
        }
        if (p.getPizza().equals("Portuguesa broto")) {
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(true);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
            btnPortBroto.setEnabled(true);
            btnPortGrande.setEnabled(true);
            cbPortuguesaPedido.setEnabled(true);
            cbPortuguesaPedido.setSelected(true);
        }
        if (p.getPizza().equals("Portuguesa grande")) {
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(true);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
            btnPortBroto.setEnabled(true);
            btnPortGrande.setEnabled(true);
            cbPortuguesaPedido.setEnabled(true);
            cbPortuguesaPedido.setSelected(true);
        }
        if (p.getPizza().equals("Frango com catupiry broto")) {
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(true);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
            btnFrangoBroto.setEnabled(true);
            btnFrangoGrande.setEnabled(true);
            cbFrangoPedido.setEnabled(true);
            cbFrangoPedido.setSelected(true);
        }
        if (p.getPizza().equals("Frango com catupiry grande")) {
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(true);
            btnCalGrande.setSelected(false);
            btnFrangoBroto.setEnabled(true);
            btnFrangoGrande.setEnabled(true);
            cbFrangoPedido.setEnabled(true);
            cbFrangoPedido.setSelected(true);
        }
        if (p.getPizza().equals("Calabresa broto")) {
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(true);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
            btnCalBroto.setEnabled(true);
            btnCalGrande.setEnabled(true);
            cbCalabresaPedido.setEnabled(true);
            cbCalabresaPedido.setSelected(true);
        }
        if (p.getPizza().equals("Calabresa grande")) {
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(true);
            btnCalBroto.setEnabled(true);
            btnCalGrande.setEnabled(true);
            cbCalabresaPedido.setEnabled(true);
            cbCalabresaPedido.setSelected(true);
        }
        if (p.getPizza().equals("Nenhuma pizza selecionada")) {
            btnMussBroto.setSelected(false);
            btnPortBroto.setSelected(false);
            btnFrangoBroto.setSelected(false);
            btnCalBroto.setSelected(false);
            btnMussGrande.setSelected(false);
            btnPortGrande.setSelected(false);
            btnFrangoGrande.setSelected(false);
            btnCalGrande.setSelected(false);
        }

        if (p.getBebida().equals("Coca-cola")) {
            cbFantaLa.setSelected(false);
            cbGuarana.setSelected(false);
            cbFantaUva.setSelected(false);
            cbCoca.setSelected(true);
        }
        if (p.getBebida().equals("Fanta laranja")) {
            cbFantaLa.setSelected(true);
            cbGuarana.setSelected(false);
            cbFantaUva.setSelected(false);
            cbCoca.setSelected(false);
        }
        if (p.getBebida().equals("Fanta uva")) {
            cbFantaLa.setSelected(false);
            cbGuarana.setSelected(false);
            cbFantaUva.setSelected(true);
            cbCoca.setSelected(false);
        }
        if (p.getBebida().equals("Guarana")) {
            cbFantaLa.setSelected(false);
            cbGuarana.setSelected(true);
            cbFantaUva.setSelected(false);
            cbCoca.setSelected(false);
        }
        if (p.getBebida().equals("Nenhuma bebida selecionada")) {
            cbFantaLa.setSelected(false);
            cbGuarana.setSelected(false);
            cbFantaUva.setSelected(false);
            cbCoca.setSelected(false);
        }
    }//GEN-LAST:event_jTPedidosPizzaMouseClicked

    private void btnMussBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMussBaseActionPerformed
        if (btnMussBase.isSelected()) {
            btnCheddarBase.setSelected(false);
            btnCatuBase.setSelected(false);
        }
    }//GEN-LAST:event_btnMussBaseActionPerformed

    private void btnCheddarBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheddarBaseActionPerformed
        if (btnCheddarBase.isSelected()) {
            btnMussBase.setSelected(false);
            btnCatuBase.setSelected(false);
        }
    }//GEN-LAST:event_btnCheddarBaseActionPerformed

    private void btnCatuBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatuBaseActionPerformed
        if (btnCatuBase.isSelected()) {
            btnMussBase.setSelected(false);
            btnCheddarBase.setSelected(false);
        } 
    }//GEN-LAST:event_btnCatuBaseActionPerformed

    private void btnMussBordaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMussBordaActionPerformed
        if (btnMussBorda.isSelected()) {
            btnCheddarBorda.setSelected(false);
            btnCatuBorda.setSelected(false);
            btnSemBorda.setSelected(false);
        }
    }//GEN-LAST:event_btnMussBordaActionPerformed

    private void btnCatuBordaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatuBordaActionPerformed
        if (btnCatuBorda.isSelected()) {
            btnCheddarBorda.setSelected(false);
            btnMussBorda.setSelected(false);
            btnSemBorda.setSelected(false);
        }
    }//GEN-LAST:event_btnCatuBordaActionPerformed

    private void btnCheddarBordaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheddarBordaActionPerformed
        if (btnCheddarBorda.isSelected()) {
            btnMussBorda.setSelected(false);
            btnCatuBorda.setSelected(false);
            btnSemBorda.setSelected(false);
        }
    }//GEN-LAST:event_btnCheddarBordaActionPerformed

    private void btnSemBordaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemBordaActionPerformed
        if (btnSemBorda.isSelected()) {
            btnCheddarBorda.setSelected(false);
            btnCatuBorda.setSelected(false);
            btnMussBorda.setSelected(false);
        }
    }//GEN-LAST:event_btnSemBordaActionPerformed

    private void jTPizzasPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPizzasPizzaMouseClicked
        PizzasPizzaria s = tablePizzasPizza.getDados(jTPizzasPizza.getSelectedRow());
        txtSabor.setText(s.getNomeSabor());

        if (s.getBase().equals("Mussarela")) {
            btnMussBase.setSelected(true);
            btnCheddarBase.setSelected(false);
            btnCatuBase.setSelected(false);
        }
        if (s.getBase().equals("Cheddar")) {
            btnMussBase.setSelected(false);
            btnCheddarBase.setSelected(true);
            btnCatuBase.setSelected(false);
        }
        if (s.getBase().equals("Catupiry")) {
            btnMussBase.setSelected(false);
            btnCheddarBase.setSelected(false);
            btnCatuBase.setSelected(true);
        }

        if (s.getBorda().equals("Mussarela")) {
            btnMussBorda.setSelected(true);
            btnCheddarBorda.setSelected(false);
            btnCatuBorda.setSelected(false);
            btnSemBorda.setSelected(false);
        }
        if (s.getBorda().equals("Catupiry")) {
            btnMussBorda.setSelected(false);
            btnCheddarBorda.setSelected(false);
            btnCatuBorda.setSelected(true);
            btnSemBorda.setSelected(false);
        }
        if (s.getBorda().equals("Cheddar")) {
            btnMussBorda.setSelected(false);
            btnCheddarBorda.setSelected(true);
            btnCatuBorda.setSelected(false);
            btnSemBorda.setSelected(false);
        }
        if (s.getBorda().equals("Sem borda")) {
            btnMussBorda.setSelected(false);
            btnCheddarBorda.setSelected(false);
            btnCatuBorda.setSelected(false);
            btnSemBorda.setSelected(true);
        }

        if (s.getIngrediente1().equals("Frango")) {
            comboIngrediente1.setSelectedItem("Frango");
        }
        if (s.getIngrediente1().equals("Presunto")) {
            comboIngrediente1.setSelectedItem("Presunto");
        }
        if (s.getIngrediente1().equals("Calabresa")) {
            comboIngrediente1.setSelectedItem("Calabresa");
        }
        if (s.getIngrediente1().equals("Ervilha")) {
            comboIngrediente1.setSelectedItem("Ervilha");
        }
        if (s.getIngrediente1().equals("Milho")) {
            comboIngrediente1.setSelectedItem("Milho");
        }
        if (s.getIngrediente1().equals("Cebola")) {
            comboIngrediente1.setSelectedItem("Cebola");
        }
        if (s.getIngrediente1().equals("Bacon")) {
            comboIngrediente1.setSelectedItem("Bacon");
        }
        if (s.getIngrediente1().equals("Tomate")) {
            comboIngrediente1.setSelectedItem("Tomate");
        }
        if (s.getIngrediente1().equals("Ovo")) {
            comboIngrediente1.setSelectedItem("Ovo");
        }
        if (s.getIngrediente1().equals("Palmito")) {
            comboIngrediente1.setSelectedItem("Palmito");
        }
        if (s.getIngrediente1().equals("Nenhum")) {
            comboIngrediente1.setSelectedItem("Nenhum");
        }

        if (s.getIngrediente2().equals("Frango")) {
            comboIngrediente2.setSelectedItem("Frango");
        }
        if (s.getIngrediente2().equals("Presunto")) {
            comboIngrediente2.setSelectedItem("Presunto");
        }
        if (s.getIngrediente2().equals("Calabresa")) {
            comboIngrediente2.setSelectedItem("Calabresa");
        }
        if (s.getIngrediente2().equals("Ervilha")) {
            comboIngrediente2.setSelectedItem("Ervilha");
        }
        if (s.getIngrediente2().equals("Milho")) {
            comboIngrediente2.setSelectedItem("Milho");
        }
        if (s.getIngrediente2().equals("Cebola")) {
            comboIngrediente2.setSelectedItem("Cebola");
        }
        if (s.getIngrediente2().equals("Bacon")) {
            comboIngrediente2.setSelectedItem("Bacon");
        }
        if (s.getIngrediente2().equals("Tomate")) {
            comboIngrediente2.setSelectedItem("Tomate");
        }
        if (s.getIngrediente2().equals("Ovo")) {
            comboIngrediente2.setSelectedItem("Ovo");
        }
        if (s.getIngrediente2().equals("Palmito")) {
            comboIngrediente2.setSelectedItem("Palmito");
        }
        if (s.getIngrediente2().equals("Nenhum")) {
            comboIngrediente2.setSelectedItem("Nenhum");
        }

        if (s.getIngrediente3().equals("Frango")) {
            comboIngrediente3.setSelectedItem("Frango");
        }
        if (s.getIngrediente3().equals("Presunto")) {
            comboIngrediente3.setSelectedItem("Presunto");
        }
        if (s.getIngrediente3().equals("Calabresa")) {
            comboIngrediente3.setSelectedItem("Calabresa");
        }
        if (s.getIngrediente3().equals("Ervilha")) {
            comboIngrediente3.setSelectedItem("Ervilha");
        }
        if (s.getIngrediente3().equals("Milho")) {
            comboIngrediente3.setSelectedItem("Milho");
        }
        if (s.getIngrediente3().equals("Cebola")) {
            comboIngrediente3.setSelectedItem("Cebola");
        }
        if (s.getIngrediente3().equals("Bacon")) {
            comboIngrediente3.setSelectedItem("Bacon");
        }
        if (s.getIngrediente3().equals("Tomate")) {
            comboIngrediente3.setSelectedItem("Tomate");
        }
        if (s.getIngrediente3().equals("Ovo")) {
            comboIngrediente3.setSelectedItem("Ovo");
        }
        if (s.getIngrediente3().equals("Palmito")) {
            comboIngrediente3.setSelectedItem("Palmito");
        }
        if (s.getIngrediente3().equals("Nenhum")) {
            comboIngrediente3.setSelectedItem("Nenhum");
        }
    }//GEN-LAST:event_jTPizzasPizzaMouseClicked

    private void btnCancelarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEnderecoActionPerformed
        txtCEP.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCEP.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        btnAdicionarEndereco.setEnabled(false);
        btnCancelarEndereco.setEnabled(false);
    }//GEN-LAST:event_btnCancelarEnderecoActionPerformed

    private void btnNovoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEnderecoActionPerformed
        txtCEP.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNumero.setEnabled(true);
        txtComplemento.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        btnAdicionarEndereco.setEnabled(true);
        btnCancelarEndereco.setEnabled(true);
    }//GEN-LAST:event_btnNovoEnderecoActionPerformed

    private void btnAtualizarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarEnderecoActionPerformed
        if (jTEnderecoPizzaria.getSelectedRow() != -1) {
            tableEnderecoPizza.setValueAt(txtCEP.getText(), jTEnderecoPizzaria.getSelectedRow(), 0);
            tableEnderecoPizza.setValueAt(txtEndereco.getText(), jTEnderecoPizzaria.getSelectedRow(), 1);
            tableEnderecoPizza.setValueAt(txtNumero.getText(), jTEnderecoPizzaria.getSelectedRow(), 2);
            tableEnderecoPizza.setValueAt(txtComplemento.getText(), jTEnderecoPizzaria.getSelectedRow(), 3);
            tableEnderecoPizza.setValueAt(txtBairro.getText(), jTEnderecoPizzaria.getSelectedRow(), 4);
            tableEnderecoPizza.setValueAt(txtCidade.getText(), jTEnderecoPizzaria.getSelectedRow(), 5);
        }
    }//GEN-LAST:event_btnAtualizarEnderecoActionPerformed

    private void btnExcluirEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEnderecoActionPerformed
        if (jTEnderecoPizzaria.getSelectedRow() != -1) {
            tableEnderecoPizza.removeRow(jTEnderecoPizzaria.getSelectedRow());
            txtCEP.setText("");
            txtEndereco.setText("");
            txtNumero.setText("");
            txtComplemento.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
        }
    }//GEN-LAST:event_btnExcluirEnderecoActionPerformed

    private void jTEnderecoPizzariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEnderecoPizzariaMouseClicked
        EnderecoPizzaria e = tableEnderecoPizza.getDadosEnd(jTEnderecoPizzaria.getSelectedRow());
        txtCEP.setText(e.getCEP());
        txtEndereco.setText(e.getEndereco());
        txtNumero.setText(e.getNumero());
        txtComplemento.setText(e.getComplemento());
        txtBairro.setText(e.getBairro());
        txtCidade.setText(e.getCidade());
    }//GEN-LAST:event_jTEnderecoPizzariaMouseClicked

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pizzaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizzaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizzaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizzaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizzaria().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelDados;
    private javax.swing.JPanel PainelMotoboy;
    private javax.swing.JTabbedPane Pizzaria;
    private javax.swing.JPanel PnlPizza;
    private javax.swing.JScrollPane ScrollCliente;
    private javax.swing.JScrollPane ScrollMoto;
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnAdicionarEndereco;
    private javax.swing.JButton btnAdicionarMotoboy;
    private javax.swing.JButton btnAdicionarPizza;
    private javax.swing.JButton btnAtualizarCliente;
    private javax.swing.JButton btnAtualizarEndereco;
    private javax.swing.JButton btnAtualizarMotoboy;
    private javax.swing.JButton btnAtualizarPedido;
    private javax.swing.JButton btnAtualizarPizza;
    private javax.swing.JRadioButton btnBike;
    private javax.swing.JButton btnBuscarCEP;
    private javax.swing.JRadioButton btnCalBroto;
    private javax.swing.JRadioButton btnCalGrande;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnCancelarEndereco;
    private javax.swing.JButton btnCancelarMotoboy;
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnCancelarPizza;
    private javax.swing.JRadioButton btnCatuBase;
    private javax.swing.JRadioButton btnCatuBorda;
    private javax.swing.JRadioButton btnCheddarBase;
    private javax.swing.JRadioButton btnCheddarBorda;
    private javax.swing.JRadioButton btnCredito;
    private javax.swing.JRadioButton btnDebito;
    private javax.swing.JRadioButton btnDinheiro;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnExcluirEndereco;
    private javax.swing.JButton btnExcluirMotoboy;
    private javax.swing.JButton btnExcluirPedido;
    private javax.swing.JButton btnExcluirPizza;
    private javax.swing.JButton btnFazerPedido;
    private javax.swing.JRadioButton btnFrangoBroto;
    private javax.swing.JRadioButton btnFrangoGrande;
    private javax.swing.JRadioButton btnMoto;
    private javax.swing.JRadioButton btnMussBase;
    private javax.swing.JRadioButton btnMussBorda;
    private javax.swing.JRadioButton btnMussBroto;
    private javax.swing.JRadioButton btnMussGrande;
    private javax.swing.JButton btnNovaPizza;
    private javax.swing.JButton btnNovoEndereco;
    private javax.swing.JButton btnNovoPedido;
    private javax.swing.JRadioButton btnPortBroto;
    private javax.swing.JRadioButton btnPortGrande;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JButton btnSalvarMotoboy;
    private javax.swing.JRadioButton btnSemBorda;
    private javax.swing.JButton btnTotalPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton cbCalabresaPedido;
    private javax.swing.JRadioButton cbCoca;
    private javax.swing.JRadioButton cbFantaLa;
    private javax.swing.JRadioButton cbFantaUva;
    private javax.swing.JRadioButton cbFrangoPedido;
    private javax.swing.JRadioButton cbGuarana;
    private javax.swing.JRadioButton cbMussPedido;
    private javax.swing.JRadioButton cbPortuguesaPedido;
    private javax.swing.JComboBox<String> comboIngrediente1;
    private javax.swing.JComboBox<String> comboIngrediente2;
    private javax.swing.JComboBox<String> comboIngrediente3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTClientePizzaria;
    private javax.swing.JTable jTEnderecoPizzaria;
    private javax.swing.JTable jTMotoboy;
    private javax.swing.JTable jTPedidosPizza;
    private javax.swing.JTable jTPizzasPizza;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBrotoN;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNH;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPFMotoboy;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblGrandeN;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeMotoboy;
    private javax.swing.JLabel lblNomeSabor;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroPedido;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JPanel painelEnd;
    private javax.swing.JPanel pnlBebidas;
    private javax.swing.JPanel pnlBorda;
    private javax.swing.JPanel pnlCardapio;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlCriacao;
    private javax.swing.JPanel pnlEnd;
    private javax.swing.JPanel pnlFormaPagamento;
    private javax.swing.JPanel pnlIngredientes;
    private javax.swing.JPanel pnlIngredientes1;
    private javax.swing.JPanel pnlMoto;
    private javax.swing.JPanel pnlPedido;
    private javax.swing.JPanel pnlPedidos;
    private javax.swing.JPanel pnlPizza;
    private javax.swing.JPanel pnlTotalPedido;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNH;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCPFMotoboy;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmailMotoboy;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMotoboy;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtSabor;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JFormattedTextField txtTelMotoboy;
    private javax.swing.JLabel txtTelefoneMotoboy;
    private javax.swing.JFormattedTextField txtValidadeCNH;
    private javax.swing.JFormattedTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables

}
