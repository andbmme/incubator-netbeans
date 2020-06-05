/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.j2ee.ddloaders.web.multiview;

/**
 * EjbRefPanel.java
 * Panel for adding/editing EJB references and/or EJB local references
 *
 * Created on April 13, 2005
 * @author  mkuchtiak
 */
public class EjbRefPanel extends javax.swing.JPanel {

    /** Creates new form ResRefPanel */
    public EjbRefPanel() {
        initComponents();
    }

    void setEjbName(String name) {
        nameTF.setText(name);
    }

    void setBeanType(String value) {
        beanTypeCB.setSelectedItem(value);
    }
    
    void setInterfaceType(String value) {
        interfaceTypeCB.setSelectedItem(value);
    }
    
    void setHome(String value) {
        homeTF.setText(value);
    }
    
    void setInterface(String value) {
        interfaceTF.setText(value);
    }
    
    void setLink(String value) {
        linkTF.setText(value);
    }
    
    void setDescription(String value) {
        descriptionTA.setText(value);
    }
    
    String getEjbName() {
        return nameTF.getText();
    }
    
    String getBeanType() {
        return (String)beanTypeCB.getSelectedItem();
    }
    
    String getInterfaceType() {
        return (String)interfaceTypeCB.getSelectedItem();
    }
    
    String getHome() {
        return homeTF.getText();
    }

    String getInterface() {
        return interfaceTF.getText();
    }
    
    String getLink() {
        return linkTF.getText();
    }
    
    String getDescription() {
        return descriptionTA.getText();
    }
    
    javax.swing.JTextField getNameTF() {
        return nameTF;
    }
    
    javax.swing.JTextField getHomeTF() {
        return homeTF;
    }
    
    javax.swing.JTextField getInterfaceTF() {
        return interfaceTF;
    }
    
    javax.swing.JComboBox getInterfaceTypeCB() {
        return interfaceTypeCB;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        beanTypeLabel = new javax.swing.JLabel();
        beanTypeCB = new javax.swing.JComboBox();
        interfaceTypeLabel = new javax.swing.JLabel();
        interfaceTypeCB = new javax.swing.JComboBox();
        homeLabel = new javax.swing.JLabel();
        homeTF = new javax.swing.JTextField();
        interfaceLabel = new javax.swing.JLabel();
        interfaceTF = new javax.swing.JTextField();
        linkLabel = new javax.swing.JLabel();
        linkTF = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descSP = new javax.swing.JScrollPane();
        descriptionTA = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        nameLabel.setLabelFor(nameTF);
        org.openide.awt.Mnemonics.setLocalizedText(nameLabel, org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_EjbRefName")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(nameLabel, gridBagConstraints);

        nameTF.setColumns(30);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(nameTF, gridBagConstraints);

        beanTypeLabel.setLabelFor(beanTypeCB);
        org.openide.awt.Mnemonics.setLocalizedText(beanTypeLabel, org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_EjbRefType")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(beanTypeLabel, gridBagConstraints);

        beanTypeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Session", "Entity" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(beanTypeCB, gridBagConstraints);

        interfaceTypeLabel.setLabelFor(interfaceTypeCB);
        org.openide.awt.Mnemonics.setLocalizedText(interfaceTypeLabel, org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_EjbInterfaceType")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(interfaceTypeLabel, gridBagConstraints);

        interfaceTypeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Remote", "Local" }));
        interfaceTypeCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                interfaceTypeCBItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(interfaceTypeCB, gridBagConstraints);

        homeLabel.setLabelFor(homeTF);
        org.openide.awt.Mnemonics.setLocalizedText(homeLabel, org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_EjbHome")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(homeLabel, gridBagConstraints);

        homeTF.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(homeTF, gridBagConstraints);

        interfaceLabel.setLabelFor(interfaceTF);
        org.openide.awt.Mnemonics.setLocalizedText(interfaceLabel, org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_EjbRemote")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(interfaceLabel, gridBagConstraints);

        interfaceTF.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(interfaceTF, gridBagConstraints);

        linkLabel.setLabelFor(linkTF);
        org.openide.awt.Mnemonics.setLocalizedText(linkLabel, org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_EjbLink")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(linkLabel, gridBagConstraints);

        linkTF.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(linkTF, gridBagConstraints);

        descriptionLabel.setLabelFor(descriptionTA);
        org.openide.awt.Mnemonics.setLocalizedText(descriptionLabel, org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_description")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 0);
        add(descriptionLabel, gridBagConstraints);

        descriptionTA.setRows(3);
        descSP.setViewportView(descriptionTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 12, 0, 12);
        add(descSP, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void interfaceTypeCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_interfaceTypeCBItemStateChanged
        if ("Remote".equals(interfaceTypeCB.getSelectedItem())) { //NOI18N
            interfaceLabel.setText(org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_EjbRemote"));
        } else {
            interfaceLabel.setText(org.openide.util.NbBundle.getMessage(EjbRefPanel.class, "LBL_EjbLocal"));
        }
    }//GEN-LAST:event_interfaceTypeCBItemStateChanged
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox beanTypeCB;
    private javax.swing.JLabel beanTypeLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane descSP;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTA;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JTextField homeTF;
    private javax.swing.JLabel interfaceLabel;
    private javax.swing.JTextField interfaceTF;
    private javax.swing.JComboBox interfaceTypeCB;
    private javax.swing.JLabel interfaceTypeLabel;
    private javax.swing.JLabel linkLabel;
    private javax.swing.JTextField linkTF;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTF;
    // End of variables declaration//GEN-END:variables
    
}
