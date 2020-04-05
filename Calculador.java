public class Calculador extends javax.swing.JFrame {

    String memoria;
    String signo;
    String memoria2;
    
    public Calculador() {
        initComponents();
        setLocation(500,200);
        setTitle("calculadora sencilla");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton21 = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();
        uno = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        masmenos = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        divisor = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        por = new javax.swing.JButton();
        inversa = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        CE = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        c = new javax.swing.JButton();

        jButton21.setText("jButton21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(102, 102, 255));
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(102, 102, 255));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(102, 102, 255));
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(102, 102, 255));
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(102, 102, 255));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(102, 102, 255));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(102, 102, 255));
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(102, 102, 255));
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(102, 102, 255));
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(102, 102, 255));
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        masmenos.setBackground(new java.awt.Color(102, 102, 255));
        masmenos.setText("+/-");

        punto.setBackground(new java.awt.Color(102, 102, 255));
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        divisor.setBackground(new java.awt.Color(102, 102, 255));
        divisor.setText("/");
        divisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisorActionPerformed(evt);
            }
        });

        resultado.setBackground(new java.awt.Color(102, 102, 255));
        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        por.setBackground(new java.awt.Color(102, 102, 255));
        por.setText("*");
        por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porActionPerformed(evt);
            }
        });

        inversa.setBackground(new java.awt.Color(102, 102, 255));
        inversa.setText("1/x");
        inversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inversaActionPerformed(evt);
            }
        });

        mas.setBackground(new java.awt.Color(102, 102, 255));
        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        CE.setBackground(new java.awt.Color(102, 102, 255));
        CE.setText("CE");
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        menos.setBackground(new java.awt.Color(102, 102, 255));
        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        c.setBackground(new java.awt.Color(102, 102, 255));
        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inversa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(divisor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inversa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtPantalla.setText(txtPantalla.getText()+"1");
    }                                   

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtPantalla.setText(txtPantalla.getText()+"2");
    }                                   

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtPantalla.setText(txtPantalla.getText()+"3");
    }                                    

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {                                       
        txtPantalla.setText(txtPantalla.getText()+"4");
    }                                      

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        txtPantalla.setText(txtPantalla.getText()+"5");
    }                                     

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtPantalla.setText(txtPantalla.getText()+"6");
    }                                    

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {                                      
        txtPantalla.setText(txtPantalla.getText()+"7");
    }                                     

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtPantalla.setText(txtPantalla.getText()+"8");
    }                                    

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {                                      
        txtPantalla.setText(txtPantalla.getText()+"9");
    }                                     

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtPantalla.setText(txtPantalla.getText()+"0");
    }                                    

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String cadena;
        cadena=txtPantalla.getText();
        
        if(cadena.length()<=0){
            txtPantalla.setText("0.");
        }
        else{
            if(!existepunto(txtPantalla.getText())){
                txtPantalla.setText(txtPantalla.getText()+".");
                
            }
        }
    }                                     

    private void cActionPerformed(java.awt.event.ActionEvent evt) {                                  
        String cadena;
        cadena=txtPantalla.getText();
        if(cadena.length()>0){
            cadena=cadena.substring(0,cadena.length()-1);
            txtPantalla.setText(cadena);
        }
    }                                 

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {                                   
        txtPantalla.setText(" ");
    }                                  

    private void inversaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String cadena;
        double numero;
        cadena=txtPantalla.getText();
        if(cadena.length()>0){
            numero=1/(Double.parseDouble(cadena));
            txtPantalla.setText(String.valueOf(numero));
        }
    }                                       

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {                                      
    if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="-";
        txtPantalla.setText("");
    }
    }                                     

    private void masActionPerformed(java.awt.event.ActionEvent evt) {                                    
       if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="+";
        txtPantalla.setText("");
    }
    }                                   

    private void porActionPerformed(java.awt.event.ActionEvent evt) {                                    
        if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="*";
        txtPantalla.setText("");
    }
    }                                   

    private void divisorActionPerformed(java.awt.event.ActionEvent evt) {                                        
       if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="/";
        txtPantalla.setText("");
    }
    }                                       

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String resultado;
        memoria2=txtPantalla.getText();
        if(!memoria2.equals("")){
            resultado=calculadora(memoria, memoria2, signo);
            txtPantalla.setText(resultado);
        }
    }                                         
    public static boolean existepunto(String cadena){
        boolean resultado;
        resultado=false;
        for(int i=0;i<cadena.length();i++){
            if(cadena.substring(i, i+1).equals(".")){
                resultado=true;
                break;
            }
        }
        return resultado;        
    }
    public static String calculadora(String memoria,String memoria2,String signo){
        Double resultado=0.0;
        String respuesta;
        if(signo.equals("-")){
            resultado=Double.parseDouble(memoria)-Double.parseDouble(memoria2);
        }
        if(signo.equals("+")){
            resultado=Double.parseDouble(memoria)+Double.parseDouble(memoria2);
        }
        if(signo.equals("*")){
            resultado=Double.parseDouble(memoria)*Double.parseDouble(memoria2);
        }
        if(signo.equals("/")){
            resultado=Double.parseDouble(memoria)/Double.parseDouble(memoria2);
        }
        respuesta=resultado.toString();
        return respuesta;
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
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CE;
    private javax.swing.JButton c;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton divisor;
    private javax.swing.JButton dos;
    private javax.swing.JButton inversa;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton mas;
    private javax.swing.JButton masmenos;
    private javax.swing.JButton menos;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton por;
    private javax.swing.JButton punto;
    private javax.swing.JButton resultado;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JButton uno;
    // End of variables declaration                   
}
