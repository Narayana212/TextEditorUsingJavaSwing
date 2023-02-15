import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
class Draw extends JPanel{
    JPanel p2;
    String mo="";

    int s1,s2=0;
    int i=-1;
    int x,y,w,h=0;
    int r,w1,h1=0;
    int x1,y1,x2,y2=0;
    int[] a2={0,0,0};
    int[] a3={0,0,0};
    int[] a4={0,0,0,0,0};
    int[] a5={0,0,0,0,0};

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(x,y,w,h);
        g.drawLine(x1,y1,x2,y2);
        g.drawOval(r,r,w1,h1);
        g.drawPolygon(a2,a3,3);
        g.drawPolygon(a4,a5,5);
        g.drawString(mo,s1,s2);
    }

    Draw(){
        Border bor1=BorderFactory.createLineBorder(Color.BLACK);
        JPanel p3= new JPanel();
        p3.setBounds(0,90,550,580);
        p3.setBorder(bor1);
        p3.setBackground(new Color(196,194,197));
        JPanel p4= new JPanel();
        p4.setBounds(0,0,550,45);
        p4.add(new Label("Sketch Pad"));
        p4.setLayout(new FlowLayout());
        p4.setBorder(bor1);
        JPanel p5= new JPanel();
        p5.setBounds(0,45,550,45);
        p5.setLayout(new FlowLayout());
        p5.setBorder(bor1);
        Button Rect=new Button("Rectangle");
        Button Rect1=new Button("Line");
        Button Rect2=new Button("Oval");
        Button Rect3=new Button("Triangle");
        Button Rect4=new Button("Pentagon");
        Button Rect5=new Button("Clear");
        p5.add(Rect);
        p5.add(Rect1);
        p5.add(Rect2);
        p5.add(Rect3);
        p5.add(Rect4);
        p5.add(Rect5);
        setVisible(true);
        setLayout(null);
        add(p4);
        add(p5);
        setBorder(bor1);
        Rect.addActionListener((ActionEvent)->{
            x=50;y=100;h=75;w=100;
            repaint();
        });
        Rect1.addActionListener((ActionEvent)->{
            y1=y2=125;
            x1=170;x2=270;
            repaint();
        });
        Rect2.addActionListener((ActionEvent)->{
            r=150;w1=h1=100;
            repaint();
        });
        Rect3.addActionListener((ActionEvent)->{
            a2[0]=200;
            a2[1]=400;
            a2[2]=100;
            a3[0]=200;
            a3[1]=400;
            a3[2]=300;
            repaint();
        });
        Rect4.addActionListener((ActionEvent)->{
            a4[0]=150;
            a4[1]=250;
            a4[2]=325;
            a4[3]=375;
            a4[4]=250;
            //a4[5]=275;
            //a4[6]=100;
            a5[0]=150;
            a5[1]=100;
            a5[2]=125;
            a5[3]=225;
            a5[4]=250;
            //a5[5]=375;
            //a5[6]=300;
            repaint();
        });
        Rect5.addActionListener((ActionEvent)->{
            a4[0]=0;a4[1]=0;a4[2]=0;a4[3]=0;a4[4]=0;
            a5[0]=0;a5[1]=0;a5[2]=0;a5[3]=0;a5[4]=0;
            a2[0]=0;
            a2[1]=0;
            a2[2]=0;
            a3[0]=0;
            a3[1]=0;
            a3[2]=0;
            x=y=w=h=0;
            r=w1=h1=0;
            x1=y1=x2=y2=0;
            repaint();
        });



    }
}
class mytexteditor extends JFrame implements ActionListener, KeyListener,MouseListener{
    int counter,counter1=0;
    JPanel p1;
    String val="0";
    int rx,ry;
    JButton b;
    JButton i;
    JButton u;
    JButton s;
    Element gh;
    JComboBox font;
    String[] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    JTextPane ta;
    int x5,y5;

    JButton r,l,c,j;
    String[] sizes={"8","9","10","11","12","14","16","18","20","22","24","26","28","32","36","40","44","48","52","58","64","72"};
    JMenuBar mb;
    JComboBox size;
    int jk,jk1=0;
    Label l3,l4;
    int x1[]={10,20,20,10};
    int y1[]={10,20,10,20};
    StyledDocument doc1;


    mytexteditor(){
        super("Text Editor");
        doc1=new StyledDocument() {
            @Override
            public Style addStyle(String nm, Style parent) {
                return null;
            }

            @Override
            public void removeStyle(String nm) {

            }

            @Override
            public Style getStyle(String nm) {
                return null;
            }

            @Override
            public void setCharacterAttributes(int offset, int length, AttributeSet s, boolean replace) {

            }

            @Override
            public void setParagraphAttributes(int offset, int length, AttributeSet s, boolean replace) {

            }

            @Override
            public void setLogicalStyle(int pos, Style s) {

            }

            @Override
            public Style getLogicalStyle(int p) {
                return null;
            }

            @Override
            public Element getParagraphElement(int pos) {
                return null;
            }

            @Override
            public Element getCharacterElement(int pos) {
                return null;
            }

            @Override
            public Color getForeground(AttributeSet attr) {
                return null;
            }

            @Override
            public Color getBackground(AttributeSet attr) {
                return null;
            }

            @Override
            public Font getFont(AttributeSet attr) {
                return null;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public void addDocumentListener(DocumentListener listener) {

            }

            @Override
            public void removeDocumentListener(DocumentListener listener) {

            }

            @Override
            public void addUndoableEditListener(UndoableEditListener listener) {

            }

            @Override
            public void removeUndoableEditListener(UndoableEditListener listener) {

            }

            @Override
            public Object getProperty(Object key) {
                return null;
            }

            @Override
            public void putProperty(Object key, Object value) {

            }

            @Override
            public void remove(int offs, int len) throws BadLocationException {

            }

            @Override
            public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {

            }

            @Override
            public String getText(int offset, int length) throws BadLocationException {
                return null;
            }

            @Override
            public void getText(int offset, int length, Segment txt) throws BadLocationException {

            }

            @Override
            public Position getStartPosition() {
                return null;
            }

            @Override
            public Position getEndPosition() {
                return null;
            }

            @Override
            public Position createPosition(int offs) throws BadLocationException {
                return null;
            }

            @Override
            public Element[] getRootElements() {
                return new Element[0];
            }

            @Override
            public Element getDefaultRootElement() {
                return null;
            }

            @Override
            public void render(Runnable r) {

            }
        };
        gh= new Element() {
            @Override
            public Document getDocument() {
                return null;
            }

            @Override
            public Element getParentElement() {
                return null;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public AttributeSet getAttributes() {
                return null;
            }

            @Override
            public int getStartOffset() {
                return 0;
            }

            @Override
            public int getEndOffset() {
                return 0;
            }

            @Override
            public int getElementIndex(int offset) {
                return 0;
            }

            @Override
            public int getElementCount() {
                return 0;
            }

            @Override
            public Element getElement(int index) {
                return null;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }
        };
        Button b0=new Button("Find all");
        Button b2=new Button("Find Next");
        Button b3=new Button("Replace");
        Button b4=new Button("Replace all");
        Draw FH=new Draw();
        FH.setBounds(720,0,550,670);
        p1=new JPanel();
        l3=new Label("Word count:"+jk);
        l4=new Label("Character count:"+jk1);
        b=new JButton("𝗕");
        i=new JButton("𝐼");
        u=new JButton("U̲");
        s=new JButton("S");
        r=new JButton("<<<<<");
        l=new JButton(">>>>>");
        //c=new JButton("c");
        //j=new JButton("j");
        font=new JComboBox(fonts);
        size=new JComboBox(sizes);
        ta=new JTextPane();
        font.setSelectedItem("Arial");
        font.addActionListener((ActionEvent a)->{
            doc1 = (StyledDocument) ta.getDocument();
            int end = ta.getSelectionEnd();
            int start = ta.getSelectionStart();
            if (start == end) {
                return;
            }
            gh = doc1.getCharacterElement(start);
            AttributeSet as = gh.getAttributes();
            MutableAttributeSet bolded = new SimpleAttributeSet(as.copyAttributes());
            StyleConstants.setFontFamily(bolded, font.getSelectedItem().toString());
            doc1.setCharacterAttributes(start, ta.getSelectedText().length(), bolded, true);
        });
        mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenu Editor=new JMenu("Editor");
        JMenuItem m4=new JMenuItem("Copy");
        JMenuItem m3=new JMenuItem("Paste");
        JMenuItem m5=new JMenuItem("Cut");
        JMenuItem m10=new JMenuItem("To Upper Case");
        JMenuItem m11=new JMenuItem("To Lower Case");
        JMenuItem m7=new JMenuItem("New");
        JMenuItem m6=new JMenuItem("Select All");
        JMenuItem m1=new JMenuItem("save");
        JMenuItem m2=new JMenuItem("open");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        JLabel l1=new JLabel("Find");
        JLabel l2=new JLabel("Replace");
        b.setBounds(5,7,50,25);
        i.setBounds(55,7,50,25);
        u.setBounds(105,7,50,25);
        s.setBounds(155,7,50,25);
        r.setBounds(210,7,100,25);
        l.setBounds(310,7,100,25);
        //c.setBounds(310,7,50,25);
        //j.setBounds(360,7,50,25);
        font.setBounds(415,7,150,25);
        size.setBounds(565,7,100,25);
        l1.setBounds(20,37,30,10);
        tf1.setBounds(0,50,650,30);
        l2.setBounds(20,82,55,17);
        tf2.setBounds(0,100,650,30);
        b0.setBounds(140,135,55,25);
        b2.setBounds(210,135,60,25);
        b3.setBounds(290,135,60,25);
        b4.setBounds(360,135,70,25);
        ta.setBounds(20,165,630,460);
        l3.setBounds(10,650,100,30);
        l4.setBounds(120,650,130,30);
        p1.setLayout(null);
        p1.setSize(700,670);
        Border br= BorderFactory.createLineBorder(Color.BLACK);
        p1.setBorder(br);
        p1.add(b);
        add(FH);
        p1.add(i);
        p1.add(u);
        p1.add(s);
        p1.add(font);
        p1.add(size);
        p1.add(r);
        p1.add(l);
        //p1.add(c);
        //p1.add(j);
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(b0);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(ta);
        p1.add(l3);
        p1.add(l4);
        p1.setLayout(null);
        add(p1);
        setLayout(null);
        size.setSelectedItem("34");
        size.addActionListener((ActionEvent a1)->{
            doc1 = (StyledDocument) ta.getDocument();
            int end = ta.getSelectionEnd();
            Object kl=size.getSelectedItem();
            int i = Integer.valueOf((String) kl);
            int start = ta.getSelectionStart();
            if (start == end) {
                return;
            }
            gh = doc1.getCharacterElement(start);
            AttributeSet as = gh.getAttributes();
            MutableAttributeSet bolded = new SimpleAttributeSet(as.copyAttributes());
            StyleConstants.setFontSize(bolded,i);
            doc1.setCharacterAttributes(start, ta.getSelectedText().length(), bolded, true);
        });
        //ta.setLineWrap(true);
        //ta.setWrapStyleWord(true);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        file.addSeparator();
        file.add(m7);
        mb.add(file);
        setJMenuBar(mb);
        Editor.add(m3);
        Editor.addSeparator();
        Editor.add(m4);
        Editor.addSeparator();
        Editor.add(m5);
        Editor.addSeparator();
        Editor.add(m6);
        Editor.addSeparator();
        Editor.add(m10);
        Editor.addSeparator();
        Editor.add(m11);
        mb.add(Editor);
        JMenu Review=new JMenu("Review");
        JMenu Help=new JMenu("Help");
        mb.add(Review);
        mb.add(Help);
        m2.addActionListener((ActionEvent a3)->{
            JFileChooser fc=new JFileChooser();
            fc.showOpenDialog(this);
            File f = fc.getSelectedFile();
            try{
                FileInputStream fi=new FileInputStream(f);
                byte b[]=new byte[fi.available()];
                fi.read(b);
                String str=new String(b);
                ta.setText(str);
                fi.close();
            }
            catch(Exception e){

            }
        });
        m4.addActionListener((ActionEvent a4)->{
            ta.copy();
        });
        m5.addActionListener((ActionEvent a4)->{
            ta.cut();
        });
        m3.addActionListener((ActionEvent a4)->{
            ta.paste();
        });
        m6.addActionListener((ActionEvent a4)->{
            ta.selectAll();
        });
        b.addActionListener((ActionEvent a4)->{
            counter++;
            if(counter%2==1){
                doc1 = (StyledDocument) ta.getDocument();
                int end = ta.getSelectionEnd();
                int start = ta.getSelectionStart();
                if (start == end) {
                    return;
                }
                gh = doc1.getCharacterElement(start);
                AttributeSet as = gh.getAttributes();
                MutableAttributeSet bolded = new SimpleAttributeSet(as.copyAttributes());
                StyleConstants.setBold(bolded, !StyleConstants.isBold(as));
                doc1.setCharacterAttributes(start, ta.getSelectedText().length(), bolded, true);
            }
            else{
                ta.setFont(new Font(ta.getFont().getFamily(),Font.PLAIN,ta.getFont().getSize()));
            }
        });
        i.addActionListener((ActionEvent a4)->{
            counter1++;
            if(counter1%2==1){
                doc1= (StyledDocument) ta.getDocument();
                int end = ta.getSelectionEnd();
                int start = ta.getSelectionStart();
                if (start == end) {
                    return;
                }
                gh = doc1.getCharacterElement(start);
                AttributeSet as = gh.getAttributes();
                MutableAttributeSet bolded = new SimpleAttributeSet(as.copyAttributes());
                StyleConstants.setItalic(bolded, !StyleConstants.isItalic(as));
                doc1.setCharacterAttributes(start, ta.getSelectedText().length(), bolded, true);
            }
            else{
                ta.setFont(new Font(ta.getFont().getFamily(),Font.PLAIN,ta.getFont().getSize()));
            }

        });
        m1.addActionListener((ActionEvent a4)->{
            JPanel Sfo = new JPanel(new GridLayout(2,1));
            JLabel fileLabel = new JLabel("Filename      :- ");
            JLabel dirLabel = new JLabel("Save The File To :- ");
            JTextField fileName = new JTextField();
            JTextField dirName = new JTextField();

            Sfo.add(fileLabel);
            Sfo.add(fileName);
            Sfo.add(dirLabel);
            Sfo.add(dirName);

            JOptionPane.showMessageDialog(this,Sfo);
            String fileContent = ta.getText();
            String filePath = dirName.getText();

            try {
                BufferedWriter writeContent = new BufferedWriter(new FileWriter(filePath));
                writeContent.write(fileContent);
                writeContent.close();
                JOptionPane.showMessageDialog(this,"File is Successfully saved!");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });
        m7.addActionListener((ActionEvent a4)->{
            ta.setText(" ");
        });
        u.addActionListener((ActionEvent a4)->{
            doc1= (StyledDocument) ta.getDocument();
            int end = ta.getSelectionEnd();
            int start = ta.getSelectionStart();
            if (start == end) {
                return;
            }
            gh = doc1.getCharacterElement(start);
            AttributeSet as = gh.getAttributes();
            MutableAttributeSet bolded = new SimpleAttributeSet(as.copyAttributes());
            StyleConstants.setUnderline(bolded, !StyleConstants.isUnderline(as));
            doc1.setCharacterAttributes(start, ta.getSelectedText().length(), bolded, true);
        });
        s.addActionListener((ActionEvent a4)->{
            doc1 = (StyledDocument) ta.getDocument();
            int end = ta.getSelectionEnd();
            int start = ta.getSelectionStart();
            if (start == end) {
                return;
            }
            gh = doc1.getCharacterElement(start);
            AttributeSet as = gh.getAttributes();
            MutableAttributeSet bolded = new SimpleAttributeSet(as.copyAttributes());
            StyleConstants.setStrikeThrough(bolded, !StyleConstants.isStrikeThrough(as));
            doc1.setCharacterAttributes(start, ta.getSelectedText().length(), bolded, true);
        });
        b0.addActionListener((ActionEvent a4)->{
            String text=ta.getText();
            char ch[]=text.toCharArray();
            for(int i=0;i<=ch.length;i++){
                System.out.println(ch[i]);
            }

        });
        JMenuItem Review1=new JMenuItem("Review");
        Review.add(Review1);
        JMenuItem Help1=new JMenuItem("Help");
        Help.add(Help1);
        Review1.addActionListener((ActionEvent a4)->{
            JOptionPane.showMessageDialog(this,"Done By R.L.Narayana 2110110301");
        });
        Help1.addActionListener((ActionEvent a4)->{
            JOptionPane.showMessageDialog(this,"You Can Email me lr888@snu.edn.in");
        });
        b3.addActionListener((ActionEvent a4)->{
            String text=ta.getText();
            ta.setText(text.replaceFirst(tf1.getText(),tf2.getText()));
        });
        b4.addActionListener((ActionEvent a4)->{
            String text=ta.getText();
            ta.setText(text.replaceAll(tf1.getText(),tf2.getText()));
        });
        ta.addKeyListener(this);
        //creating Sketch pad
        Border bor1=BorderFactory.createLineBorder(Color.BLACK);
        r.addActionListener((ActionEvent a2)->{
            ta.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        });
        l.addActionListener((ActionEvent a2)->{
            ta.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        });
        /*c.addActionListener((ActionEvent a2)->{
            doc1=ta.getStyledDocument();
            SimpleAttributeSet simple= new SimpleAttributeSet();
            StyleConstants.setAlignment(simple,StyleConstants.ALIGN_JUSTIFIED);
            doc1.setCharacterAttributes(0, doc1.getLength(), simple, false);
        });*/
        m10.addActionListener((ActionEvent a2)->{
            String upper=ta.getSelectedText();
            String upper1=upper.toUpperCase();
            ta.setText(ta.getText().replaceAll(upper,upper1));
        });
        m11.addActionListener((ActionEvent a2)->{
            String lower=ta.getSelectedText();
            String lower1=lower.toLowerCase();
            ta.setText(ta.getText().replaceAll(lower,lower1));
        });
        FH.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e1){
                rx=e1.getX();
                ry=e1.getY();

                if(rx==50){
                    FH.mo="You can change size now(Drag and Release)";
                    val="1";
                }
                else if(rx==150){
                    FH.mo="You can change size now(Drag and Release)";
                    val="2";
                }
                else if(ry==100){
                    FH.mo="You can change size now(Drag and Release)";
                    val="3";
                }
                else if(ry==175){
                    FH.mo="You can change size now(Drag and Release)";
                    val="4";
                }
                else{
                    FH.mo="";
                }
                FH.s1=rx;
                FH.s2=ry;
                FH.repaint();

            }




            @Override
            public void mouseReleased(MouseEvent e5) {
                x5=e5.getX();
                y5=e5.getY();
                if(val=="2"){
                    FH.w+=x5;
                    FH.repaint();
                }
                System.out.println(x5);
            }
        });
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {
        String text = ta.getText();
        for (jk1 = 0; jk1 <= text.length(); jk1++) {
            jk1++;
            l4.setText("Character count:" + jk1);
        }
        char space=e.getKeyChar();
        String ans=Character.toString(space);
        String[] tex =text.split(" ");
        jk=tex.length;
        l3.setText("Word count:"+jk);
        }
    }

//@Author Narayana(2110110301)
public class Main {
    public static void main(String[] args){
        mytexteditor f=new mytexteditor();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}