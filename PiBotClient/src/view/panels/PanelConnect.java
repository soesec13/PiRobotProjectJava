/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.panels;

import java.io.IOException;
import javax.swing.JOptionPane;
import network.AbstractNetwork;
import network.NetworkController;
import network.TestNetworkController;
import testEnviromnet.TestEnviroment;

/**
 *
 * @author Sebi
 */
public class PanelConnect extends javax.swing.JPanel {

    private  TestEnviroment testEnv;
    private AbstractNetwork network=new NetworkController();
    public PanelConnect(TestEnviroment testEnv) {
        this.testEnv=testEnv;
        initComponents();
    }
    private PanelConnect() {
        initComponents();
    }

    public AbstractNetwork getNetwork()
    {
        return network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbType = new javax.swing.JComboBox();
        pNetwork = new javax.swing.JPanel();
        lbAddress = new javax.swing.JLabel();
        tfIp = new javax.swing.JTextField();
        lbPort = new javax.swing.JLabel();
        tfPort = new javax.swing.JTextField();
        bConnect = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.BorderLayout(10, 20));

        cbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Test Enviroment", "PiBot" }));
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeonChangeType(evt);
            }
        });
        jPanel1.add(cbType, java.awt.BorderLayout.PAGE_START);

        pNetwork.setLayout(new java.awt.GridLayout(2, 0, 5, 5));

        lbAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAddress.setText("IP Address:");
        pNetwork.add(lbAddress);
        pNetwork.add(tfIp);

        lbPort.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPort.setText("Port:");
        pNetwork.add(lbPort);
        pNetwork.add(tfPort);

        jPanel1.add(pNetwork, java.awt.BorderLayout.CENTER);

        bConnect.setText("Connect");
        bConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConnectActionPerformed(evt);
            }
        });
        jPanel1.add(bConnect, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(19, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTypeonChangeType(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeonChangeType
        if(((String)cbType.getSelectedItem()).equals("PiBot"))
        {
            network=new NetworkController();
        }else{
            network=new TestNetworkController();
        }
    }//GEN-LAST:event_cbTypeonChangeType

    private void bConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConnectActionPerformed
        if(network instanceof NetworkController)
        {
            try {
                ((NetworkController)network).connect(tfIp.getText(), Integer.parseInt(tfPort.getText()));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            ((TestNetworkController)network).connect(testEnv);
        }
    }//GEN-LAST:event_bConnectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConnect;
    private javax.swing.JComboBox cbType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbPort;
    private javax.swing.JPanel pNetwork;
    private javax.swing.JTextField tfIp;
    private javax.swing.JTextField tfPort;
    // End of variables declaration//GEN-END:variables
}