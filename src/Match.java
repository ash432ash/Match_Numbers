import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class Match extends javax.swing.JFrame 
{
    
Timer t,ti;
int high;
String tihigh="";
public Match() throws IOException 
{
initComponents();
this.setTitle("Match The Numbers");
String username = System.getProperty("user.name");
File f1 = new File("C:\\Users\\"+username+"\\Desktop\\player.txt");
if(!f1.exists())
{
f1.createNewFile(); // if file already exists will do nothing 
FileOutputStream fos = new FileOutputStream(f1);
DataOutputStream dos=new DataOutputStream(fos);
dos.writeUTF("00 "+"00");
dos.writeUTF(""+0);
fos.close();
}
FileInputStream fis=new FileInputStream(f1);
DataInputStream dis=new DataInputStream(fis);
try
{
while(true)
{
tihigh=dis.readUTF();
String hi=dis.readUTF();
high=Integer.parseInt(hi);
s2.setText(hi);
s3.setText(tihigh.substring(0,3)+": "+tihigh.substring(3,5));
}
}
catch(Exception e)
{
if(tihigh=="")
{
tihigh="00 00";
high=0;
}
}   
fis.close();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        s1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        res = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        colon = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        mili = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Match A Stack");
        setBackground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        b4.setBackground(new java.awt.Color(153, 255, 255));
        b4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b4.setBorderPainted(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(153, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b1.setBorderPainted(false);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(153, 255, 255));
        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b2.setBorderPainted(false);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b2MousePressed(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(153, 255, 255));
        b3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b3.setBorderPainted(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(153, 255, 255));
        b8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b8.setBorderPainted(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(153, 255, 255));
        b5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b5.setBorderPainted(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(153, 255, 255));
        b6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b6.setBorderPainted(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(153, 255, 255));
        b7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b7.setBorderPainted(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(153, 255, 255));
        b11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b11.setBorderPainted(false);
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setBackground(new java.awt.Color(153, 255, 255));
        b12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b12.setBorderPainted(false);
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(153, 255, 255));
        b9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b9.setBorderPainted(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setBackground(new java.awt.Color(153, 255, 255));
        b10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b10.setBorderPainted(false);
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b15.setBackground(new java.awt.Color(153, 255, 255));
        b15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b15.setBorderPainted(false);
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.setBackground(new java.awt.Color(153, 255, 255));
        b16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b16.setBorderPainted(false);
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b13.setBackground(new java.awt.Color(153, 255, 255));
        b13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b13.setBorderPainted(false);
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.setBackground(new java.awt.Color(153, 255, 255));
        b14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b14.setBorderPainted(false);
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("    SCORE");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        s1.setEditable(false);
        s1.setBackground(new java.awt.Color(153, 255, 255));
        s1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        s1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        s1.setText("0");
        s1.setAlignmentX(1.0F);
        s1.setAlignmentY(1.0F);
        s1.setAutoscrolls(false);
        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("START");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        res.setBackground(new java.awt.Color(153, 255, 255));
        res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        res.setText("RESTART");
        res.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        res.setBorderPainted(false);
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(153, 255, 255));
        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setText("CLOSE");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        close.setBorderPainted(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(153, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setText(" HIGH SCORE");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        s2.setEditable(false);
        s2.setBackground(new java.awt.Color(153, 255, 255));
        s2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        s2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        s2.setText("0");
        s2.setAlignmentX(1.0F);
        s2.setAlignmentY(1.0F);
        s2.setAutoscrolls(false);
        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(153, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("TIME");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        s3.setEditable(false);
        s3.setBackground(new java.awt.Color(153, 255, 255));
        s3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        s3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        s3.setText("00 : 00");
        s3.setAlignmentX(1.0F);
        s3.setAlignmentY(1.0F);
        s3.setAutoscrolls(false);
        s3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        colon.setBackground(new java.awt.Color(51, 255, 255));
        colon.setFont(colon.getFont().deriveFont(colon.getFont().getStyle() | java.awt.Font.BOLD, colon.getFont().getSize()+7));
        colon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colon.setText(":");

        sec.setBackground(new java.awt.Color(51, 255, 255));
        sec.setFont(sec.getFont().deriveFont(sec.getFont().getStyle() | java.awt.Font.BOLD, sec.getFont().getSize()+7));
        sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sec.setText("00");

        mili.setBackground(new java.awt.Color(102, 255, 255));
        mili.setFont(mili.getFont().deriveFont(mili.getFont().getStyle() | java.awt.Font.BOLD, mili.getFont().getSize()+7));
        mili.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mili.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(colon, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mili, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mili))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(res, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(s3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  int a[][]=new int[4][4];
  int b[][]=new int[4][4];
  int score=0;
  int w=0;
  int h=0;
  int st=0;
  int sp=0;
  int sec1=0,mili1=0;
  int m,n,c,d;
  private class startch implements ActionListener
  {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
InputStream music;
try{
music=Match.class.getResourceAsStream("Windows Ding.wav");
AudioStream audios=new AudioStream(music);
AudioPlayer.player.start(audios);
}
catch(Exception e1){
JOptionPane.showMessageDialog(null,e1.getLocalizedMessage());
} 
            if(m==0&&n==0||c==0&&d==0)
         b1.setText("");
          if(m==0&&n==1||c==0&&d==1)
         b2.setText("");
          if(m==0&&n==2||c==0&&d==2)
         b3.setText("");
          if(m==0&&n==3||c==0&&d==3)
         b4.setText("");
          if(m==1&&n==0||c==1&&d==0)
         b5.setText("");
          if(m==1&&n==1||c==1&&d==1)
         b6.setText("");
          if(m==1&&n==2||c==1&&d==2)
         b7.setText("");
          if(m==1&&n==3||c==1&&d==3)
         b8.setText("");
          if(m==2&&n==0||c==2&&d==0)
         b9.setText("");
          if(m==2&&n==1||c==2&&d==1)
         b10.setText("");
          if(m==2&&n==2||c==2&&d==2)
         b11.setText("");
          if(m==2&&n==3||c==2&&d==3)
         b12.setText("");
          if(m==3&&n==0||c==3&&d==0)
         b13.setText("");
          if(m==3&&n==1||c==3&&d==1)
         b14.setText("");
          if(m==3&&n==2||c==3&&d==2)
         b15.setText("");
          if(m==3&&n==3||c==3&&d==3)
         b16.setText("");
         t.stop();
        }
  }
    long startTime;
    public void start() 
    {
        startTime =System.currentTimeMillis();
    }

    public long getTimePassed() 
    {
            return (System.currentTimeMillis() - startTime);   
    }
private class startch1 implements ActionListener
{

        @Override
        public void actionPerformed(ActionEvent e) {
            long s=getTimePassed();
            long t1,t2;
        t1=(s%1000)/10;
        t2=s/1000;
        if(t2<=9)
        sec.setText("0"+t2);
        else
        sec.setText(""+t2);
        if(t1<=9)
        mili.setText("0"+t1);
        else
        mili.setText(""+t1);
        }
    }
  
  
public void restart()
{
int i,j;
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
   a[i][j]=0;
   b[i][j]=0;
}
}
score=0;
ti.stop();
s1.setText(""+score);
b1.setText("");
b2.setText("");
b3.setText("");
b4.setText("");
b5.setText("");
b6.setText("");
b7.setText("");
b8.setText("");
b9.setText("");
b10.setText("");
b11.setText("");
b12.setText("");
b13.setText("");
b14.setText("");
b15.setText("");
b16.setText("");
sec.setText("00");
mili.setText("00");
mili1=0;
sec1=0;
st=0;
sp=0;
}
  public void create()
  {
   
    int x,y;
    int c=0;
    int t1=1;
    int i,j;
    if(w!=0)
    restart();
         while(c!=2)
         {
           x=(int)(4*Math.random());
           y=(int)(4*Math.random());
           if(a[x][y]==0)
           {
               a[x][y]=t1++;
               if(t1==9)
               {
                   t1=1;
                   c++;
               }  
           }
         }
          s1.setText(""+score);
          w++;
  }
 
  
  
  
  
  
  public void set(int b[][],int c1,int d1) 
{
 
    c=c1;
    d=d1;
    m=-1;
    n=-1;
    st++;
    if(st==1)
    {
    ti=new Timer(0,new startch1());
    start();
    ti.start();
    }
       b[c][d]=1;
       h++;
       int i,j;
       int y=0;
       if(h==2)
       {
           
       for(i=0;i<4;i++)
       {
       for(j=0;j<4;j++)
       {
       if(i!=c||j!=d)
       {
       if(b[i][j]==1)
       {
       y=a[i][j];
       m=i;
       n=j;
       break;
       }
       }
       }
       if(m!=-1&&n!=-1)
       break;
       }
       
       h=0;
       if(y==a[c][d])
       {
InputStream music;
try{
music=Match.class.getResourceAsStream("Windows Error.wav");
AudioStream audios=new AudioStream(music);
AudioPlayer.player.start(audios);
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
}
        score=score+2;
        b[c][d]=-1;
        b[m][n]=-1;
        sp++;
        if(sp==8)
        ti.stop();
       }
       else if(m==-1&&n==-1)
       h=1;
       else
       {
       t=new Timer (100,new startch());
       score=score-1;
       b[c][d]=0;
       b[m][n]=0;
       t.start();
       }
       s1.setText(""+score);
       }
       if(sp==8)
       {
       String curr=sec.getText()+" "+mili.getText();
       if(tihigh.equals("00 00")||curr.compareTo(tihigh)<=0)
       {
        try {
            if((curr.compareTo(tihigh)==0&&score>high)||curr.compareTo(tihigh)<0||tihigh.equals("00 00"))
            high=score;
            File f1 = new File("C:\\Users\\Ayush Verma\\Desktop\\player.txt");
            FileOutputStream fos = new FileOutputStream(f1, false);
            DataOutputStream dos=new DataOutputStream(fos);
            s2.setText(""+high);
            s3.setText(curr.substring(0,3)+": "+curr.substring(3,5));
            dos.writeUTF(curr);
            dos.writeUTF(""+high);
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(Match.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       }
       }
  
  
  
  
  
  
  
  
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       if(w==0)
        create();
       b4.setText(""+a[0][3]);
       if(b[0][3]!=-1)
       set(b,0,3);
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
   if(w==0)
        create();
       b1.setText(""+a[0][0]);
   if(b[0][0]!=-1)
   set(b,0,0);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       if(w==0)
        create();
       b2.setText(""+a[0][1]);
        if(b[0][1]!=-1)
        set(b,0,1);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       if(w==0)
        create();
         b3.setText(""+a[0][2]);
       if(b[0][2]!=-1)
        set(b,0,2);
    }//GEN-LAST:event_b3ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
    if(w==0)
        create();  
     b8.setText(""+a[1][3]);
      if(b[1][3]!=-1)
       set(b,1,3);
    }//GEN-LAST:event_b8ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
    if(w==0)
        create();   
    b5.setText(""+a[1][0]);
       if(b[1][0]!=-1)
        set(b,1,0);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
    if(w==0)
        create();
        b6.setText(""+a[1][1]);
      if(b[1][1]!=-1)
        set(b,1,1);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
    if(w==0)
        create();
        b7.setText(""+a[1][2]);
        if(b[1][2]!=-1)
        set(b,1,2);
    }//GEN-LAST:event_b7ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
    if(w==0)
        create(); 
        b11.setText(""+a[2][2]);
       if(b[2][2]!=-1)
        set(b,2,2);
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
    if(w==0)
        create();
        b12.setText(""+a[2][3]);
        if(b[2][3]!=-1)
        set(b,2,3);
    }//GEN-LAST:event_b12ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
    if(w==0)
        create();
        b9.setText(""+a[2][0]);
       if(b[2][0]!=-1)
        set(b,2,0);
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
    if(w==0)
        create();
        b10.setText(""+a[2][1]);
       if(b[2][1]!=-1)
        set(b,2,1);
    }//GEN-LAST:event_b10ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
    if(w==0)
        create();
        b15.setText(""+a[3][2]);
      if(b[3][2]!=-1)
        set(b,3,2);
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
    if(w==0)
        create();
        b16.setText(""+a[3][3]);
       if(b[3][3]!=-1)
        set(b,3,3);
    }//GEN-LAST:event_b16ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
    if(w==0)
        create();
        b13.setText(""+a[3][0]);
        if(b[3][0]!=-1)
        set(b,3,0);
       
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed

       if(w==0)
        create();
        b14.setText(""+a[3][1]);
        if(b[3][1]!=-1)
        set(b,3,1);
    }//GEN-LAST:event_b14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        create();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed

    }//GEN-LAST:event_s1ActionPerformed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
    create();
    }//GEN-LAST:event_resActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
     System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3ActionPerformed

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
       
    }//GEN-LAST:event_b1MouseEntered

    private void b2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MousePressed
        
    }//GEN-LAST:event_b2MousePressed

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
         
    }//GEN-LAST:event_b2MouseEntered
     
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
               
        /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 try {
                     new Match().setVisible(true);
                 } catch (IOException ex) {
                     Logger.getLogger(Match.class.getName()).log(Level.SEVERE, null, ex);
                 }
               
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton close;
    private javax.swing.JLabel colon;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel mili;
    private javax.swing.JButton res;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JLabel sec;
    // End of variables declaration//GEN-END:variables
}

