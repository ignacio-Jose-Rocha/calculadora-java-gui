/*
hecho por ignacio rocha como practica 

*/
package calculadora;
public class calculador extends javax.swing.JFrame {
    String memoria;
    String signo;
    String memoria1;
    public calculador() {
        initComponents();
        setTitle("calculadora cientifica");
        setLocation(500,200);
        this.setResizable(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        txtPantalla = new javax.swing.JTextField();
        uno = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        inversa = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        divisor = new javax.swing.JButton();
        por = new javax.swing.JButton();
        procentaje = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        CE = new javax.swing.JButton();
        c = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        cambiar = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        log = new javax.swing.JButton();
        cero = new javax.swing.JButton();

        jButton11.setText("jButton4");

        jButton16.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPantalla.setBackground(new java.awt.Color(0, 204, 204));
        txtPantalla.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtPantalla.setForeground(new java.awt.Color(0, 153, 204));
        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(0, 204, 204));
        uno.setForeground(new java.awt.Color(0, 153, 204));
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(0, 204, 204));
        siete.setForeground(new java.awt.Color(0, 153, 204));
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(0, 204, 204));
        dos.setForeground(new java.awt.Color(0, 153, 204));
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(0, 204, 204));
        cuatro.setForeground(new java.awt.Color(0, 153, 204));
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(0, 204, 204));
        cinco.setForeground(new java.awt.Color(0, 153, 204));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(0, 204, 204));
        ocho.setForeground(new java.awt.Color(0, 153, 204));
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(0, 204, 204));
        tres.setForeground(new java.awt.Color(0, 153, 204));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(0, 204, 204));
        seis.setForeground(new java.awt.Color(0, 153, 204));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(0, 204, 204));
        nueve.setForeground(new java.awt.Color(0, 153, 204));
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        inversa.setBackground(new java.awt.Color(0, 204, 204));
        inversa.setForeground(new java.awt.Color(0, 153, 204));
        inversa.setText("1/x");
        inversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inversaActionPerformed(evt);
            }
        });

        mas.setBackground(new java.awt.Color(0, 204, 204));
        mas.setForeground(new java.awt.Color(0, 153, 204));
        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        menos.setBackground(new java.awt.Color(0, 204, 204));
        menos.setForeground(new java.awt.Color(0, 153, 204));
        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        divisor.setBackground(new java.awt.Color(0, 204, 204));
        divisor.setForeground(new java.awt.Color(0, 153, 204));
        divisor.setText("/");
        divisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisorActionPerformed(evt);
            }
        });

        por.setBackground(new java.awt.Color(0, 204, 204));
        por.setForeground(new java.awt.Color(0, 153, 204));
        por.setText("*");
        por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porActionPerformed(evt);
            }
        });

        procentaje.setBackground(new java.awt.Color(0, 204, 204));
        procentaje.setForeground(new java.awt.Color(0, 153, 204));
        procentaje.setText("%");
        procentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procentajeActionPerformed(evt);
            }
        });

        resultado.setBackground(new java.awt.Color(0, 204, 204));
        resultado.setForeground(new java.awt.Color(0, 153, 204));
        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        CE.setBackground(new java.awt.Color(0, 204, 204));
        CE.setForeground(new java.awt.Color(0, 153, 204));
        CE.setText("CE");
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        c.setBackground(new java.awt.Color(0, 204, 204));
        c.setForeground(new java.awt.Color(0, 153, 204));
        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        punto.setBackground(new java.awt.Color(0, 204, 204));
        punto.setForeground(new java.awt.Color(0, 153, 204));
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        cambiar.setBackground(new java.awt.Color(0, 204, 204));
        cambiar.setForeground(new java.awt.Color(0, 153, 204));
        cambiar.setText("+/-");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });

        raiz.setBackground(new java.awt.Color(0, 204, 204));
        raiz.setForeground(new java.awt.Color(0, 153, 204));
        raiz.setText("âˆš");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(0, 204, 204));
        log.setForeground(new java.awt.Color(0, 153, 204));
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(0, 204, 204));
        cero.setForeground(new java.awt.Color(0, 153, 204));
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(procentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(divisor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inversa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inversa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(procentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"1");
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
       txtPantalla.setText(txtPantalla.getText()+"3");
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"6");
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"9");
    }//GEN-LAST:event_nueveActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        txtPantalla.setText(txtPantalla.getText()+"0");
    }//GEN-LAST:event_ceroActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
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
    }//GEN-LAST:event_puntoActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
            String resultado;
        memoria1=txtPantalla.getText();
        if(!memoria1.equals("")){
            resultado=calculadora(memoria, memoria1, signo);
            txtPantalla.setText(resultado);
        }
    }//GEN-LAST:event_resultadoActionPerformed

    private void inversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inversaActionPerformed
                                               
        String cadena;
        double numero;
        cadena=txtPantalla.getText();
        if(cadena.length()>0){
            numero=1/(Double.parseDouble(cadena));
            txtPantalla.setText(String.valueOf(numero));
        }
                 
    }//GEN-LAST:event_inversaActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
                                         
       if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="+";
        txtPantalla.setText("");
    
    }            
    }//GEN-LAST:event_masActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="-";
        txtPantalla.setText("");
    }
    }//GEN-LAST:event_menosActionPerformed

    private void divisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisorActionPerformed
                                                
       if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="/";
        txtPantalla.setText("");
    
    }  
    }//GEN-LAST:event_divisorActionPerformed

    private void porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porActionPerformed
                               
        if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="*";
        txtPantalla.setText("");
    }
    }//GEN-LAST:event_porActionPerformed

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
        txtPantalla.setText(" ");
    }//GEN-LAST:event_CEActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        String cadena;
        cadena=txtPantalla.getText();
        if(cadena.length()>0){
            cadena=cadena.substring(0,cadena.length()-1);
            txtPantalla.setText(cadena);
        }
    }//GEN-LAST:event_cActionPerformed

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        Double numero;
        String cadena;
        cadena=txtPantalla.getText();
        if(cadena.length()>0){
            numero=(-1)*Double.parseDouble(cadena);
            txtPantalla.setText(numero.toString());
        }
    }//GEN-LAST:event_cambiarActionPerformed

    private void procentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procentajeActionPerformed
       if(!txtPantalla.getText().equals(" ")){
        memoria=txtPantalla.getText();
        signo="%";
        txtPantalla.setText("");
       }
    }//GEN-LAST:event_procentajeActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
       if(!txtPantalla.getText().equals(" ")){
        String cadena;
        double numero;
        cadena=txtPantalla.getText();
        if(cadena.length()>0){
            numero=Math.sqrt(Double.parseDouble(cadena));
            txtPantalla.setText(String.valueOf(numero));}}
    }//GEN-LAST:event_raizActionPerformed
    
    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        if(!txtPantalla.getText().equals(" ")){
        String cadena;
        double numero;
        cadena=txtPantalla.getText();
        if(cadena.length()>0){
            numero=Math.log10(Double.parseDouble(cadena));
            txtPantalla.setText(String.valueOf(numero));}}
    }//GEN-LAST:event_logActionPerformed
                                         
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
    public static String calculadora(String memoria,String memoria1,String signo){
        Double resultado=0.0;
        String respuesta;
        if(signo.equals("-")){
            resultado=Double.parseDouble(memoria)-Double.parseDouble(memoria1);
        }
        if(signo.equals("+")){
            resultado=Double.parseDouble(memoria)+Double.parseDouble(memoria1);
        }
        if(signo.equals("*")){
            resultado=Double.parseDouble(memoria)*Double.parseDouble(memoria1);
        }
        if(signo.equals("/")){
            resultado=Double.parseDouble(memoria)/Double.parseDouble(memoria1);
        }
        if(signo.equals("%")){
            resultado=(Double.parseDouble(memoria)*Double.parseDouble(memoria1))/100;
        } 
       
        respuesta=resultado.toString();
        return respuesta;
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CE;
    private javax.swing.JButton c;
    private javax.swing.JButton cambiar;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton divisor;
    private javax.swing.JButton dos;
    private javax.swing.JButton inversa;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton16;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton log;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton por;
    private javax.swing.JButton procentaje;
    private javax.swing.JButton punto;
    private javax.swing.JButton raiz;
    private javax.swing.JButton resultado;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
