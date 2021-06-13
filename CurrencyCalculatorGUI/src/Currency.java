

	import javax.swing.JOptionPane;



	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */

	/**
	 *
	 * @author kartik
	 */
	public class Currency extends javax.swing.JFrame {

	    /**
	     * Creates new form Currency
	     */
	    public Currency() {
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        amount = new javax.swing.JTextField();
	        from = new javax.swing.JComboBox<>();
	        to = new javax.swing.JComboBox<>();
	        jButton1 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jLabel1.setText("Enter Amount");

	        jLabel3.setText("To");

	        jLabel4.setText("From");

	        amount.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                amountActionPerformed(evt);
	            }
	        });

	        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INR", "USD" }));

	        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INR", "USD" }));

	        jButton1.setText("Convert");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(145, 145, 145)
	                        .addComponent(jLabel2))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(73, 73, 73)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel1)
	                            .addComponent(jLabel4)
	                            .addComponent(jLabel3))
	                        .addGap(58, 58, 58)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(amount)
	                            .addComponent(from, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(to, 0, 188, Short.MAX_VALUE)))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(194, 194, 194)
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(134, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(61, 61, 61)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel1)
	                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(52, 52, 52)
	                .addComponent(jLabel2)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4)
	                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(55, 55, 55)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel3)
	                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
	                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(22, 22, 22)
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }// </editor-fold>                        

	    private void amountActionPerformed(java.awt.event.ActionEvent evt) 
	    {                                       
	        // TODO add your handling code here:
	    }                                      

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
	    {                                         
	    	Double total; 
	        Double Amount = Double.parseDouble(amount.getText());
	        if(from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "INR")
	        {
	            total = Amount * 73;
	            JOptionPane.showMessageDialog(this, "Total Amount Will be =  " + total.toString());
	           
	        }
	        else  if(from.getSelectedItem().toString() == "INR" && to.getSelectedItem().toString() == "USD")
	        {
	            total = Amount/73;
	            JOptionPane.showMessageDialog(this, "Your Amount will be " + total.toString());
	        }      
	        else  if(from.getSelectedItem().toString() == "INR" && to.getSelectedItem().toString() == "INR")
	        {
	            total = Amount;
	            JOptionPane.showMessageDialog(this, "Your Amount will be " + total.toString());
	        }    
	        else  if(from.getSelectedItem().toString() == "USD" && to.getSelectedItem().toString() == "USD")
	        {
	            total = Amount;
	            JOptionPane.showMessageDialog(this, "Your Amount will be " + total.toString());
	        }        
	    }
	        
	                                           

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Currency().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JTextField amount;
	    private javax.swing.JComboBox<String> from;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JComboBox<String> to;
	    // End of variables declaration                   
	}

