import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HomeInventory implements ActionListener{

    static JFrame fr ;
    static GridBagConstraints c = new GridBagConstraints();
    static JButton b[],searchButton[],button;
    static JLabel l[];
    static JTextField[] t;
    static JComboBox<String> cmb;
    static JCheckBox ch;
    static JPanel p1,p2;

    private static void addComponentToPane(Container pane) {
        pane.setLayout(new GridBagLayout());

        addToolbar(pane);
        addComponents(pane);
    }

    private static void addComponents(Container pane) {
        l = new JLabel[9];
        t = new JTextField[10];

        l[0] = new JLabel("Inventory Item");
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10,10,0,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(l[0],c);

        t[0] = new JTextField();
        t[0].setPreferredSize(new Dimension(400,25));
        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 5;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.WEST;
        pane.add(t[0],c);

        l[1] = new JLabel("Location");
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(10,10,0,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(l[1],c);

        t[1] = new JTextField();
        t[1].setPreferredSize(new Dimension(270,25));
        t[1].setFont(new Font("Arial", Font.PLAIN, 12));
        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 3;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.WEST;
        pane.add(t[1],c);

        ch = new JCheckBox("Marked?");
        c = new GridBagConstraints();
        c.gridx = 5;
        c.gridy = 1;
        c.insets = new Insets(10,10,0,0);
        c.anchor = GridBagConstraints.WEST;
        pane.add(ch,c);


        l[2] = new JLabel("Serial No.");
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(10,10,0,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(l[2],c);

        t[2] = new JTextField();
        t[2].setPreferredSize(new Dimension(270,25));
        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 2;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.WEST;
        pane.add(t[2],c);

        l[3] = new JLabel("Purchased Price");
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(10,10,0,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(l[3],c);

        t[3] = new JTextField();
        c = new GridBagConstraints();
        t[3].setPreferredSize(new Dimension(160, 25));
        c.gridx = 2;
        c.gridy = 3;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.WEST;
        pane.add(t[3],c);

        l[4] = new JLabel("Date Purchased");
        c = new GridBagConstraints();
        c.gridx = 3;
        c.gridy = 3;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(l[4],c);

        t[4] = new JTextField();
        t[4].setPreferredSize(new Dimension(160, 25));
        c = new GridBagConstraints();
        c.gridx = 5;
        c.gridy = 3;
        c.gridwidth = 2;
        c.insets = new Insets(10,10,0,10);
        c.anchor = GridBagConstraints.WEST;
        pane.add(t[4],c);
        
        l[5] = new JLabel("Store/Website");
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 4;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(l[5],c);

        t[5] = new JTextField();
        t[5].setPreferredSize(new Dimension(400,25));
        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 5;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.WEST;
        pane.add(t[5],c);

        l[6] = new JLabel("Note");
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 5;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(l[6],c);

        t[6] = new JTextField();
        t[6].setPreferredSize(new Dimension(400,25));
        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 5;
        c.gridwidth = 5;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.WEST;
        pane.add(t[6],c);

        l[7] = new JLabel("Photo");
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 6;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(l[7],c);
        
        t[7] = new JTextField();
        t[7].setPreferredSize(new Dimension(400,25));
        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 6;
        c.gridwidth = 5;
        c.insets = new Insets(10,0,0,10);
        c.anchor = GridBagConstraints.WEST;
        pane.add(t[7],c);
        
        button = new JButton("...");
        button.setPreferredSize(new Dimension(60,30));
        c = new GridBagConstraints();
        c.gridx = 6;
        c.gridy = 6;
        c.insets = new Insets(10,0,0,0);
        c.anchor = GridBagConstraints.WEST;
        pane.add(button,c);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                photoButtonActionPerfomed(ae);
            }
        });

        searchPanel(pane);
        photoPanel(pane);
    }

    private static void photoPanel(Container pane) {
        p2 = new JPanel();
        p2.setPreferredSize(new Dimension(240,160));
        p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        c = new GridBagConstraints();
        c.gridx = 4;
        c.gridy = 7;
        c.gridwidth = 3;
        c.insets = new Insets(10,0,10,10);
        c.anchor = GridBagConstraints.EAST;
        pane.add(p2,c);

    }

    private static void searchPanel(Container pane) {
        p1 = new JPanel();
        searchButton = new JButton[26];

        p1.setPreferredSize(new Dimension(240, 160));
        p1.setLayout(new GridBagLayout());
        p1.setBorder(BorderFactory.createTitledBorder("Item Search"));

        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 7;
        c.gridwidth = 3;
        c.insets = new Insets(10,10,10,0);
        c.anchor = GridBagConstraints.CENTER;
        pane.add(p1,c);

        int x = 0, y = 0;

        for(int i = 0; i<26; i++){
            searchButton[i] = new JButton();
            searchButton[i].setText(String.valueOf((char) (65 + i)));
            searchButton[i].setFont(new Font("Arial", Font.BOLD, 12));
            searchButton[i].setMargin(new Insets(-10, -10, -10, -10));
            sizeButton(searchButton[i], new Dimension(37, 27));
            searchButton[i].setBackground(Color.YELLOW);
            c = new GridBagConstraints();
            c.gridx = x;
            c.gridy = y;
            p1.add(searchButton[i], c);
            
            searchButton[i].addActionListener(new ActionListener (){
                public void actionPerformed(ActionEvent e)
                {
                    searchButtonActionPerformed(e);
                }
            });
            x++;
            
            if (x % 6 == 0)
            {
                x = 0;
                y++;
            }
        }
    }


    protected static void searchButtonActionPerformed(ActionEvent e) {
    }

    protected static void photoButtonActionPerfomed(ActionEvent ae) {
    }

    private static void addToolbar(Container pane) {
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);
        toolbar.setBackground(Color.BLUE);
        toolbar.setOrientation(SwingConstants.VERTICAL);

        Dimension dim = new Dimension(70,50);

        b = new JButton[8];

        b[1] = new JButton(" New    ");
        b[2] = new JButton("Delete  ");
        b[3] = new JButton("Save    ");
        b[4] = new JButton("Previous");
        b[5] = new JButton("Next     ");
        b[6] = new JButton("Print    ");
        b[7] = new JButton("Exit     ");

        for(int i=1; i<8; i++){
            if(i==4 || i==6 ){
                toolbar.addSeparator();
            }
            b[i].setFont(new Font("Vardana",Font.PLAIN,14));
            b[i].setHorizontalTextPosition(SwingConstants.CENTER);
            sizeButton(b[i],dim);
            toolbar.add(b[i]);
        }

        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 8;
        c.fill = GridBagConstraints.VERTICAL;
        
        pane.add(toolbar,c);

        b[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (JOptionPane.showConfirmDialog(null, "Any unsaved changes will be lost.\nAre you sure you want to exit?", "Exit Program", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    ch.setSelected(false);
                    for(int i=0; i<10; i++){
                        t[i].setText("");
                    }
                   
                }
            }
        });

        b[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });

        b[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });

        b[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });

        b[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });

        b[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
            }
        });

        b[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                fr.dispose();
            }
        });
    }

    public static void createAndShowGUI(){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        }catch(Exception e){}
        fr = new JFrame("Home Inventory");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addComponentToPane(fr.getContentPane());

        fr.pack();
        fr.setVisible(true);        
    } 

    private static void sizeButton(JButton bo, Dimension d){
        bo.setPreferredSize(d);
        bo.setMinimumSize(d);
        bo.setMaximumSize(d);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}