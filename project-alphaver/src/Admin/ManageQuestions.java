/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import Models.DBConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikai
 */
public class ManageQuestions extends javax.swing.JFrame {
    private int examId = -1;
    private int manageId = -1;
    private int[] manageAnswerId = new int[4];
    /**
     * Creates new form ManageQuestions
     */
    public ManageQuestions(int examId) {
        this.examId = examId;
        initComponents();
        this.initAlgos();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionField = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        aCheckbox = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        answerAfield = new javax.swing.JTextArea();
        bCheckbox = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        answerBfield = new javax.swing.JTextArea();
        dCheckbox = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        answerDfield = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        answerCfield = new javax.swing.JTextArea();
        cCheckbox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        poinField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        warnLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListQuestions = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Question");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Question");

        questionField.setColumns(20);
        questionField.setRows(5);
        jScrollPane2.setViewportView(questionField);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Answers");

        aCheckbox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        aCheckbox.setText("A");

        answerAfield.setColumns(20);
        answerAfield.setRows(5);
        jScrollPane3.setViewportView(answerAfield);

        bCheckbox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bCheckbox.setText("B");

        answerBfield.setColumns(20);
        answerBfield.setRows(5);
        jScrollPane4.setViewportView(answerBfield);

        dCheckbox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dCheckbox.setText("D");

        answerDfield.setColumns(20);
        answerDfield.setRows(5);
        jScrollPane5.setViewportView(answerDfield);

        answerCfield.setColumns(20);
        answerCfield.setRows(5);
        jScrollPane6.setViewportView(answerCfield);

        cCheckbox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cCheckbox.setText("C");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Poin");

        poinField.setText("0");
        poinField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                poinFieldKeyTyped(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        warnLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        warnLabel.setForeground(new java.awt.Color(255, 22, 44));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(434, 434, 434))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBtn)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(poinField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dCheckbox)
                            .addComponent(bCheckbox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cCheckbox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aCheckbox, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(warnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(poinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(cancelBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(warnLabel))
        );

        tableListQuestions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "id", "question", "poin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListQuestions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListQuestionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListQuestions);
        if (tableListQuestions.getColumnModel().getColumnCount() > 0) {
            tableListQuestions.getColumnModel().getColumn(0).setResizable(false);
            tableListQuestions.getColumnModel().getColumn(1).setResizable(false);
            tableListQuestions.getColumnModel().getColumn(2).setResizable(false);
            tableListQuestions.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
        );

        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void poinFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poinFieldKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)) evt.consume();
    }//GEN-LAST:event_poinFieldKeyTyped

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        new ManageExam().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        String question = this.questionField.getText();
        String poin = this.poinField.getText();
        
        if(question.length() < 1) {
            this.warnLabel.setText("Question can't be empty!");
            return;
        }
        
        if(poin.length() < 1) {
            this.warnLabel.setText("Poin can't be empty!");
            return;
        }
        
        int generatedId = -1;
        
        try {
            String query = "INSERT INTO questions (exam_id, question, poin) VALUES (" + this.examId + ",'" + question + "'," + Integer.parseInt(poin) + ")";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query, java.sql.PreparedStatement.RETURN_GENERATED_KEYS);
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows > 0) {
                java.sql.ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedId = generatedKeys.getInt(1);
                }
            } else {
                this.initAlgos();
                return;
            }
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        try {
            String query = "INSERT INTO answers (questions_id, choice, answer, isRight) VALUES (" + generatedId + ",'A','" + this.answerAfield.getText() + "'," + this.aCheckbox.isSelected() + ")";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        try {
            String query = "INSERT INTO answers (questions_id, choice, answer, isRight) VALUES (" + generatedId + ",'B','" + this.answerBfield.getText() + "'," + this.bCheckbox.isSelected() + ")";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        try {
            String query = "INSERT INTO answers (questions_id, choice, answer, isRight) VALUES (" + generatedId + ",'C','" + this.answerCfield.getText() + "'," + this.cCheckbox.isSelected() + ")";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        try {
            String query = "INSERT INTO answers (questions_id, choice, answer, isRight) VALUES (" + generatedId + ",'D','" + this.answerDfield.getText() + "'," + this.dCheckbox.isSelected() + ")";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        this.initAlgos();
    }//GEN-LAST:event_addBtnMouseClicked

    private void tableListQuestionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListQuestionsMouseClicked
        int row = tableListQuestions.rowAtPoint(evt.getPoint());
        
        this.manageId = Integer.parseInt(tableListQuestions.getValueAt(row, 1).toString());
        this.questionField.setText(tableListQuestions.getValueAt(row, 2).toString());
        this.poinField.setText(tableListQuestions.getValueAt(row, 3).toString());
        
        try {
            String query = "SELECT * FROM answers WHERE questions_id = " + this.manageId + " ORDER BY choice";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.Statement statement = Vconn.createStatement();
            java.sql.ResultSet res = statement.executeQuery(query);
               
            int index = 0;
            while (res.next()) {
                this.manageAnswerId[index] = res.getInt(1);

                switch (index) {
                    case 0:
                        this.aCheckbox.setSelected(res.getBoolean(5));
                        this.answerAfield.setText(res.getString(4));
                        break;
                    case 1:
                        this.bCheckbox.setSelected(res.getBoolean(5));
                        this.answerBfield.setText(res.getString(4));
                        break;
                    case 2:
                        this.cCheckbox.setSelected(res.getBoolean(5));
                        this.answerCfield.setText(res.getString(4));
                        break;
                    case 3:
                        this.dCheckbox.setSelected(res.getBoolean(5));
                        this.answerDfield.setText(res.getString(4));
                        break;
                }

                index++;
            }
        }catch(HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
           this.initAlgos();
           return;
        }
        
        this.addBtn.setVisible(false);
        this.updateBtn.setVisible(true);
        this.deleteBtn.setVisible(true);
        this.cancelBtn.setVisible(true);
    }//GEN-LAST:event_tableListQuestionsMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
       this.initAlgos();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        try {
            String query = "DELETE FROM answers WHERE questions_id = " + this.manageId + ";";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute();
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        try {
            String query = "DELETE FROM questions WHERE exam_id = " + this.examId + ";";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute();
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        this.initAlgos();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        String question = this.questionField.getText();
        String poin = this.poinField.getText();
        
        if(question.length() < 1) {
            this.warnLabel.setText("Question can't be empty!");
            return;
        }
        
        if(poin.length() < 1) {
            this.warnLabel.setText("Poin can't be empty!");
            return;
        }
        
        int generatedId = -1;
        
        try {
            String query = "UPDATE questions SET question = '" + question + "', poin = " + poin + " WHERE id = " + this.manageId + ";";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        try {
            String query = "UPDATE answers SET answer = '" + this.answerAfield.getText() + "', isRight = " + this.aCheckbox.isSelected() + " WHERE questions_id = " + this.manageId + " AND choice = 'A';";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        try {
            String query = "UPDATE answers SET answer = '" + this.answerBfield.getText() + "', isRight = " + this.bCheckbox.isSelected() + " WHERE questions_id = " + this.manageId + " AND choice = 'B';";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        try {
            String query = "UPDATE answers SET answer = '" + this.answerCfield.getText() + "', isRight = " + this.cCheckbox.isSelected() + " WHERE questions_id = " + this.manageId + " AND choice = 'C';";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        try {
            String query = "UPDATE answers SET answer = '" + this.answerDfield.getText() + "', isRight = " + this.dCheckbox.isSelected() + " WHERE questions_id = " + this.manageId + " AND choice = 'D';";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.PreparedStatement statement = Vconn.prepareStatement(query);
            statement.execute(); 
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        
        this.initAlgos();
    }//GEN-LAST:event_updateBtnMouseClicked
    
    private void initAlgos() {
       this.questionField.setText("");
       this.poinField.setText("");
       this.answerAfield.setText("");
       this.answerBfield.setText("");
       this.answerCfield.setText("");
       this.answerDfield.setText("");
       this.warnLabel.setText("");
       this.aCheckbox.setSelected(false);
       this.bCheckbox.setSelected(false);
       this.cCheckbox.setSelected(false);
       this.dCheckbox.setSelected(false);
       this.addBtn.setVisible(true);
       this.updateBtn.setVisible(false);
       this.deleteBtn.setVisible(false);
       this.cancelBtn.setVisible(false);
       this.manageId = -1;
       
       this.showData();
    }
    
    private void showData() {
       int counter = 1;
        try {
            String query = "SELECT * FROM questions WHERE exam_id = " + this.examId + " ORDER BY id";
            java.sql.Connection Vconn = (Connection)DBConnection.configDB();
            java.sql.Statement statement = Vconn.createStatement();
            java.sql.ResultSet res = statement.executeQuery(query);
            
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            model.addColumn("No");
            model.addColumn("ID");
            model.addColumn("Questions");
            model.addColumn("Poins");
            
            while (res.next()){
                model.addRow(new Object[]{
                    counter++, res.getInt(1), res.getString(3), res.getInt(4)
                });
            }
            
            tableListQuestions.setModel(model);
            tableListQuestions.getTableHeader().setResizingAllowed(false);
        }catch(HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
           return;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageQuestions(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aCheckbox;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea answerAfield;
    private javax.swing.JTextArea answerBfield;
    private javax.swing.JTextArea answerCfield;
    private javax.swing.JTextArea answerDfield;
    private javax.swing.JCheckBox bCheckbox;
    private javax.swing.JButton backBtn;
    private javax.swing.JCheckBox cCheckbox;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JCheckBox dCheckbox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField poinField;
    private javax.swing.JTextArea questionField;
    private javax.swing.JTable tableListQuestions;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel warnLabel;
    // End of variables declaration//GEN-END:variables
}
