
package Useful;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class Display_DateTime extends javax.swing.JFrame {
    private final Timer timer;
    private final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public Display_DateTime() {
        initComponents();

        timer = new Timer(500, (ActionEvent e) -> {
            labelTimeValue.setText(sdf.format(new Date(System.currentTimeMillis())));
        });
        timer.setRepeats(true);

    }

    private void initComponents() {
        buttonStartTime = new javax.swing.JButton();
        buttonStopTime = new javax.swing.JButton();
        labelTimeText = new javax.swing.JLabel();
        labelTimeValue = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 360));

        buttonStartTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonStartTime.setText("StartTime");
        buttonStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartTimeActionPerformed(evt);
            }
        });

        buttonStopTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonStopTime.setText("StopTime");
        buttonStopTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopTimeActionPerformed(evt);
            }
        });

        labelTimeText.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTimeText.setText("Time:");

        labelTimeValue.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTimeValue.setText(".......");

        buttonExit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 51, 51));
        buttonExit.setText("X");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTimeText)
                    .addComponent(buttonStartTime))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelTimeValue)
                        .addGap(0, 152, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonStopTime, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTimeText)
                    .addComponent(labelTimeValue))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonStartTime)
                    .addComponent(buttonStopTime))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartTimeActionPerformed
        labelTimeValue.setText(".......");
        timer.start();
    }//GEN-LAST:event_buttonStartTimeActionPerformed

    private void buttonStopTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStopTimeActionPerformed
        labelTimeValue.setText(".......");
        timer.stop();
    }//GEN-LAST:event_buttonStopTimeActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0x0);
    }//GEN-LAST:event_buttonExitActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.InstantiationException
     */
    public static void main(String args[]) throws java.lang.InstantiationException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display_DateTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Display_DateTime().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonStartTime;
    private javax.swing.JButton buttonStopTime;
    private javax.swing.JLabel labelTimeText;
    private javax.swing.JLabel labelTimeValue;
    // End of variables declaration//GEN-END:variables
}