package Calculator;


/**
 *
 * @author anmijurane
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
//        color_pos();
    }
        
    public static int respCorrect;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Resp_buenas = new javax.swing.JLabel();
        Resp_malas = new javax.swing.JLabel();
        Calf_txt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        aprobar_o_no = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Respuestas Correctas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Respuetas Incorrectas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        Resp_buenas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Resp_buenas.setForeground(new java.awt.Color(45, 136, 45));
        Resp_buenas.setText("jLabel4");
        getContentPane().add(Resp_buenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 80, 40));

        Resp_malas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Resp_malas.setForeground(new java.awt.Color(170, 108, 57));
        Resp_malas.setText("jLabel5");
        getContentPane().add(Resp_malas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 70, 40));

        Calf_txt.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        Calf_txt.setText("10");
        getContentPane().add(Calf_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, 60));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Calificación");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(170, 57, 57));
        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        aprobar_o_no.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        aprobar_o_no.setForeground(new java.awt.Color(51, 102, 255));
        aprobar_o_no.setText("¡¡¡¡¡FELICIDADES TERMINASTE!!!!!");
        getContentPane().add(aprobar_o_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Resultado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }
    
    //random rnd = new random();
    
    /*public void prueba(){
        Processo.ArrResultExt.add((int)random.getRandom(0,5));
        Processo.ArrResultExt.add((int)random.getRandom(0,5));
        Processo.ArrResultExt.add((int)random.getRandom(0,5));
        Processo.ArrResultExt.add((int)random.getRandom(0,5));
        Processo.ArrResultExt.add((int)random.getRandom(0,5));
    }*/

    public static void setResult_ext(int Correct, int Incorrect){  
        
        respCorrect = Correct;
        
        Resp_buenas.setText(""+Correct);
        Resp_malas.setText(""+Incorrect);
        
        Calf_txt.setText("" + respCorrect);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Calf_txt;
    private static javax.swing.JLabel Resp_buenas;
    private static javax.swing.JLabel Resp_malas;
    private static javax.swing.JLabel aprobar_o_no;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
