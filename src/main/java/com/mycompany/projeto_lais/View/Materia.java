    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_lais.View;

import com.mycompany.projeto_lais.Controller.Materia_Controller;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Artur
 */
public class Materia extends javax.swing.JFrame {
private Materia_Controller c = new Materia_Controller (this);
    /**
     * Creates new form Main
     */
    public Materia() {
        initComponents();
        iniciar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text1 = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        text9 = new javax.swing.JLabel();
        text10 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        text7 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        text8 = new javax.swing.JLabel();
        text11 = new javax.swing.JLabel();
        text12 = new javax.swing.JLabel();
        text13 = new javax.swing.JLabel();
        text16 = new javax.swing.JLabel();
        text15 = new javax.swing.JLabel();
        text14 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        jLabel0 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        text1.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(148, 0, 211));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("+");
        text1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text1);
        text1.setBounds(30, 78, 350, 148);

        text5.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text5.setForeground(new java.awt.Color(148, 0, 211));
        text5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text5.setText("+");
        text5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text5);
        text5.setBounds(32, 240, 350, 148);

        text6.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text6.setForeground(new java.awt.Color(148, 0, 211));
        text6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text6.setText("+");
        text6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text6);
        text6.setBounds(400, 242, 350, 148);

        text9.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text9.setForeground(new java.awt.Color(148, 0, 211));
        text9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text9.setText("+");
        text9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text9);
        text9.setBounds(32, 402, 350, 148);

        text10.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text10.setForeground(new java.awt.Color(148, 0, 211));
        text10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text10.setText("+");
        text10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text10);
        text10.setBounds(400, 402, 350, 148);

        text3.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text3.setForeground(new java.awt.Color(148, 0, 211));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("+");
        text3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text3);
        text3.setBounds(768, 78, 350, 148);

        text7.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text7.setForeground(new java.awt.Color(148, 0, 211));
        text7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text7.setText("+");
        text7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text7);
        text7.setBounds(768, 240, 350, 148);

        text4.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text4.setForeground(new java.awt.Color(148, 0, 211));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("+");
        text4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text4);
        text4.setBounds(1138, 78, 350, 148);

        text8.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text8.setForeground(new java.awt.Color(148, 0, 211));
        text8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text8.setText("+");
        text8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text8);
        text8.setBounds(1136, 240, 350, 148);

        text11.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text11.setForeground(new java.awt.Color(148, 0, 211));
        text11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text11.setText("+");
        text11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text11);
        text11.setBounds(766, 402, 350, 148);

        text12.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text12.setForeground(new java.awt.Color(148, 0, 211));
        text12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text12.setText("+");
        text12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text12);
        text12.setBounds(1136, 404, 350, 148);

        text13.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text13.setForeground(new java.awt.Color(148, 0, 211));
        text13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text13.setText("+");
        text13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text13);
        text13.setBounds(32, 562, 350, 148);

        text16.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text16.setForeground(new java.awt.Color(148, 0, 211));
        text16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text16.setText("+");
        text16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text16);
        text16.setBounds(1136, 564, 350, 148);

        text15.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text15.setForeground(new java.awt.Color(148, 0, 211));
        text15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text15.setText("+");
        text15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text15);
        text15.setBounds(768, 566, 350, 148);

        text14.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text14.setForeground(new java.awt.Color(148, 0, 211));
        text14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text14.setText("+");
        text14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text14);
        text14.setBounds(400, 564, 350, 148);

        text2.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        text2.setForeground(new java.awt.Color(148, 0, 211));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("+");
        text2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(text2);
        text2.setBounds(400, 78, 350, 148);

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setPreferredSize(new java.awt.Dimension(200, 80));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(768, 77, 350, 150);

        btn5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setPreferredSize(new java.awt.Dimension(200, 80));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(32, 239, 350, 150);

        btn9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setPreferredSize(new java.awt.Dimension(200, 80));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(32, 401, 350, 150);

        btn10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn10.setPreferredSize(new java.awt.Dimension(200, 80));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10);
        btn10.setBounds(400, 401, 350, 150);

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setPreferredSize(new java.awt.Dimension(200, 80));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(32, 77, 350, 150);

        btn6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setPreferredSize(new java.awt.Dimension(200, 80));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(400, 239, 350, 150);

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setIconTextGap(1);
        btn2.setPreferredSize(new java.awt.Dimension(200, 80));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(400, 77, 350, 150);

        btn11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn11.setPreferredSize(new java.awt.Dimension(200, 80));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11);
        btn11.setBounds(768, 401, 350, 150);

        btn7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setPreferredSize(new java.awt.Dimension(200, 80));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(768, 239, 350, 150);

        btn14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn14.setPreferredSize(new java.awt.Dimension(200, 80));
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14);
        btn14.setBounds(400, 563, 350, 150);

        btn13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn13.setPreferredSize(new java.awt.Dimension(200, 80));
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13);
        btn13.setBounds(32, 563, 350, 150);

        btn15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn15.setPreferredSize(new java.awt.Dimension(200, 80));
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15);
        btn15.setBounds(768, 563, 350, 150);

        btn4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setPreferredSize(new java.awt.Dimension(200, 80));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(1136, 77, 350, 150);

        btn16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn16.setPreferredSize(new java.awt.Dimension(200, 80));
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn16);
        btn16.setBounds(1136, 563, 350, 150);

        btn8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setPreferredSize(new java.awt.Dimension(200, 80));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(1136, 239, 350, 150);

        btn12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn12.setPreferredSize(new java.awt.Dimension(200, 80));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12);
        btn12.setBounds(1136, 401, 350, 150);

        jLabel0.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0.setText("Disciplinas");
        getContentPane().add(jLabel0);
        jLabel0.setBounds(4, 0, 1870, 59);

        jMenu1.setText("Operações");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Editar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Excluir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1870, 892));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
       c.cadastrarBotao(text12.getText());
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
c.cadastrarBotao(text2.getText());        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        c.cadastrarBotao(text1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       c.cadastrarBotao(text3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        c.cadastrarBotao(text4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        c.cadastrarBotao(text5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      c.cadastrarBotao(text6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
      c.cadastrarBotao(text7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
     c.cadastrarBotao(text8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
     c.cadastrarBotao(text9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        c.cadastrarBotao(text10.getText());
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
    c.cadastrarBotao(text11.getText());
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
       c.cadastrarBotao(text13.getText());
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        c.cadastrarBotao(text14.getText());
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        c.cadastrarBotao(text15.getText());
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        c.cadastrarBotao(text16.getText());
    }//GEN-LAST:event_btn16ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       c.editarMateria();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        c.excluirMateria();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Materia().setVisible(true);
            }
        });
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn10() {
        return btn10;
    }

    public void setBtn10(JButton btn10) {
        this.btn10 = btn10;
    }

    public JButton getBtn11() {
        return btn11;
    }

    public void setBtn11(JButton btn11) {
        this.btn11 = btn11;
    }

    public JButton getBtn12() {
        return btn12;
    }

    public void setBtn12(JButton btn12) {
        this.btn12 = btn12;
    }

    public JButton getBtn13() {
        return btn13;
    }

    public void setBtn13(JButton btn13) {
        this.btn13 = btn13;
    }

    public JButton getBtn14() {
        return btn14;
    }

    public void setBtn14(JButton btn14) {
        this.btn14 = btn14;
    }

    public JButton getBtn15() {
        return btn15;
    }

    public void setBtn15(JButton btn15) {
        this.btn15 = btn15;
    }

    public JButton getBtn16() {
        return btn16;
    }

    public void setBtn16(JButton btn16) {
        this.btn16 = btn16;
    }

    public Materia_Controller getC() {
        return c;
    }

    public void setC(Materia_Controller c) {
        this.c = c;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public void setBtn9(JButton btn9) {
        this.btn9 = btn9;
    }

    public JLabel getjLabel0() {
        return jLabel0;
    }

    public void setjLabel0(JLabel jLabel0) {
        this.jLabel0 = jLabel0;
    }

    public JLabel getText1() {
        return text1;
    }

    public void setText1(JLabel text1) {
        this.text1 = text1;
    }

    public JLabel getText10() {
        return text10;
    }

    public void setText10(JLabel text10) {
        this.text10 = text10;
    }

    public JLabel getText11() {
        return text11;
    }

    public void setText11(JLabel text11) {
        this.text11 = text11;
    }

    public JLabel getText12() {
        return text12;
    }

    public void setText12(JLabel text12) {
        this.text12 = text12;
    }

    public JLabel getText13() {
        return text13;
    }

    public void setText13(JLabel text13) {
        this.text13 = text13;
    }

    public JLabel getText14() {
        return text14;
    }

    public void setText14(JLabel text14) {
        this.text14 = text14;
    }

    public JLabel getText15() {
        return text15;
    }

    public void setText15(JLabel text15) {
        this.text15 = text15;
    }

    public JLabel getText16() {
        return text16;
    }

    public void setText16(JLabel text16) {
        this.text16 = text16;
    }

    public JLabel getText2() {
        return text2;
    }

    public void setText2(JLabel text2) {
        this.text2 = text2;
    }

    public JLabel getText3() {
        return text3;
    }

    public void setText3(JLabel text3) {
        this.text3 = text3;
    }

    public JLabel getText4() {
        return text4;
    }

    public void setText4(JLabel text4) {
        this.text4 = text4;
    }

    public JLabel getText5() {
        return text5;
    }

    public void setText5(JLabel text5) {
        this.text5 = text5;
    }

    public JLabel getText6() {
        return text6;
    }

    public void setText6(JLabel text6) {
        this.text6 = text6;
    }

    public JLabel getText7() {
        return text7;
    }

    public void setText7(JLabel text7) {
        this.text7 = text7;
    }

    public JLabel getText8() {
        return text8;
    }

    public void setText8(JLabel text8) {
        this.text8 = text8;
    }

    public JLabel getText9() {
        return text9;
    }

    public void setText9(JLabel text9) {
        this.text9 = text9;
    }

    
    public JLabel getjLabel2() {
        return text2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.text2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return text1;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.text1 = jLabel3;
    }

    public JLabel getjLabel4() {
        return text5;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.text5 = jLabel4;
    }

    public JLabel getjLabel5() {
        return text6;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.text6 = jLabel5;
    }

    public JLabel getjLabel6() {
        return text9;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.text9 = jLabel6;
    }

    public JLabel getjLabel7() {
        return text10;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.text10 = jLabel7;
    }

    public JLabel getjLabel8() {
        return text3;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.text3 = jLabel8;
    }

    public JLabel getjLabel9() {
        return text7;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.text7 = jLabel9;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text10;
    private javax.swing.JLabel text11;
    private javax.swing.JLabel text12;
    private javax.swing.JLabel text13;
    private javax.swing.JLabel text14;
    private javax.swing.JLabel text15;
    private javax.swing.JLabel text16;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    private javax.swing.JLabel text9;
    // End of variables declaration//GEN-END:variables
public void iniciar(){
    c.iniciar();
}

 public void iprimir_Na_Tela(String message) {
       JOptionPane.showMessageDialog(null, message);
    }
}
