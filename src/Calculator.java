import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {

    //JLabel and JTextField for interest
    private JTextField calcJTextField;

    //JPanel to hold numbers
    private JPanel numberJPanel;
    private JButton oneJButton;
    private JButton twoJButton;
    private JButton threeJButton;
    private JButton fourJButton;
    private JButton fiveJButton;
    private JButton sixJButton;
    private JButton sevenJButton;
    private JButton eightJButton;
    private JButton nineJButton;
    private JButton zeroJButton;
    private JButton doubleZeroJButton;

    //JPanel to hold operators
    private JPanel OPJPanel;

    //OPJPanel operators
    private JButton plusJButton;
    private JButton minusJButton;
    private JButton timesJButton;
    private JButton divideJButton;
    private JButton equalsJButton;
    private JButton dotJButton;

    //JPanel to hold clear
    private JPanel clearJPanel;

    //Clear panel buttons
    private JButton cJButton;
    private JButton caJButton;

    //JButton to initiate calculation
    private JButton calculateJButton;

    //constructor
    public Calculator() {
        createUserInterface();
    }

    //method to create & position the GUI components
    private void createUserInterface() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        // top text field
        calcJTextField = new JTextField();
        calcJTextField.setBounds(20, 24, 450, 30);
        calcJTextField.setHorizontalAlignment(JTextField.RIGHT);
        calcJTextField.setEditable(false);
        calcJTextField.setBackground(Color.WHITE);
        contentPane.add(calcJTextField);

        // number panel
        numberJPanel = new JPanel();
        numberJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        numberJPanel.setLayout(null);
        numberJPanel.setBounds(10, 100, 170, 260);
        contentPane.add(numberJPanel);
        numberJPanel.setVisible(true);

        // set all buttons
        // button 1
        oneJButton = new JButton();
        oneJButton.setBounds(10, 10, 50, 60);
        oneJButton.setText("1");
        oneJButton.setBackground(Color.CYAN);
        // output - all buttons follow same pattern
        oneJButton.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {
                                             calcJTextField.setText(calcJTextField.getText() + "1");
                                         }
                                     }
        );
        numberJPanel.add(oneJButton);

        // button 2
        twoJButton = new JButton();
        twoJButton.setBounds(60, 10, 50, 60);
        twoJButton.setText("2");
        twoJButton.setBackground(Color.CYAN);
        twoJButton.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {
                                             calcJTextField.setText(calcJTextField.getText() + "2");
                                         }
                                     }
        );
        numberJPanel.add(twoJButton);

        // button 3
        threeJButton = new JButton();
        threeJButton.setBounds(110, 10, 50, 60);
        threeJButton.setText("3");
        threeJButton.setBackground(Color.CYAN);
        numberJPanel.add(threeJButton);
        threeJButton.addActionListener(new ActionListener() {
                                           public void actionPerformed(ActionEvent e) {
                                               calcJTextField.setText(calcJTextField.getText() + "3");
                                           }
                                       }
        );

        // button 4
        fourJButton = new JButton();
        fourJButton.setBounds(10, 70, 50, 60);
        fourJButton.setText("4");
        fourJButton.setBackground(Color.CYAN);
        numberJPanel.add(fourJButton);
        fourJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "4");
            }
        });

        // button 5
        fiveJButton = new JButton();
        fiveJButton.setBounds(60, 70, 50, 60);
        fiveJButton.setText("5");
        fiveJButton.setBackground(Color.CYAN);
        numberJPanel.add(fiveJButton);
        fiveJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "5");
            }
        });

        // button 6
        sixJButton = new JButton();
        sixJButton.setBounds(110, 70, 50, 60);
        sixJButton.setText("6");
        sixJButton.setBackground(Color.CYAN);
        numberJPanel.add(sixJButton);
        sixJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "6");
            }
        });

        // button 7
        sevenJButton = new JButton();
        sevenJButton.setBounds(10, 130, 50, 60);
        sevenJButton.setText("7");
        sevenJButton.setBackground(Color.CYAN);
        numberJPanel.add(sevenJButton);
        sevenJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "7");
            }
        });

        // button 8
        eightJButton = new JButton();
        eightJButton.setBounds(60, 130, 50, 60);
        eightJButton.setText("8");
        eightJButton.setBackground(Color.CYAN);
        numberJPanel.add(eightJButton);
        eightJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "8");
            }
        });

        // button 9
        nineJButton = new JButton();
        nineJButton.setBounds(110, 130, 50, 60);
        nineJButton.setText("9");
        nineJButton.setBackground(Color.CYAN);
        numberJPanel.add(nineJButton);
        nineJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "9");
            }
        });

        // button 0
        zeroJButton = new JButton();
        zeroJButton.setBounds(10, 190, 50, 60);
        zeroJButton.setText("0");
        zeroJButton.setBackground(Color.CYAN);
        numberJPanel.add(zeroJButton);
        zeroJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "0");
            }
        });

        // button 00
        doubleZeroJButton = new JButton();
        doubleZeroJButton.setBounds(60, 190, 100, 60);
        doubleZeroJButton.setText("00");
        doubleZeroJButton.setBackground(Color.CYAN);
        numberJPanel.add(doubleZeroJButton);
        doubleZeroJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "00");
            }
        });
        // operation panel
        OPJPanel = new JPanel();
        OPJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        OPJPanel.setLayout(null);
        OPJPanel.setBounds(210, 100, 125, 260);
        contentPane.add(OPJPanel);
        OPJPanel.setVisible(true);

        // operation panel buttons
        // plus button
        plusJButton = new JButton();
        plusJButton.setBounds(10, 10, 50, 160);
        plusJButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        plusJButton.setText("+");
        plusJButton.setBackground(Color.CYAN);
        plusJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "+");
            }
        });
        OPJPanel.add(plusJButton);

        // minus button
        minusJButton = new JButton();
        minusJButton.setBounds(65, 10, 50, 60);
        minusJButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        minusJButton.setText("-");
        minusJButton.setBackground(Color.CYAN);
        minusJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "-");
            }
        });
        OPJPanel.add(minusJButton);

        // times button
        timesJButton = new JButton();
        timesJButton.setBounds(65, 70, 50, 60);
        timesJButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        timesJButton.setText("*");
        timesJButton.setBackground(Color.CYAN);
        timesJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "*");
            }
        });
        OPJPanel.add(timesJButton);

        // divide button
        divideJButton = new JButton();
        divideJButton.setBounds(65, 130, 50, 60);
        divideJButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        divideJButton.setText("/");
        divideJButton.setBackground(Color.CYAN);
        divideJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + "/");
            }
        });
        OPJPanel.add(divideJButton);

        // equals button
        equalsJButton = new JButton();
        equalsJButton.setBounds(65, 190, 50, 60);
        equalsJButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        equalsJButton.setText("=");
        equalsJButton.setBackground(Color.CYAN);
        equalsJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        OPJPanel.add(equalsJButton);

        // dot button
        dotJButton = new JButton();
        dotJButton.setBounds(10, 190, 50, 60);
        dotJButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        dotJButton.setText(".");
        dotJButton.setBackground(Color.CYAN);
        dotJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText(calcJTextField.getText() + ".");
            }
        });

        OPJPanel.add(dotJButton);

        // clearJPanel
        clearJPanel = new JPanel();
        clearJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        clearJPanel.setLayout(null);
        clearJPanel.setBounds(350, 100, 125, 130);
        contentPane.add(clearJPanel);
        clearJPanel.setVisible(true);

        // clear buttons
        // C button
        cJButton = new JButton();
        cJButton.setBounds(10, 10, 105, 50);
        cJButton.setText("C");
        cJButton.setBackground(Color.CYAN);
        clearJPanel.add(cJButton);
        // action listener to clear last num using substring
        cJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = calcJTextField.getText();
                // take off end of substring
                calcJTextField.setText(s.substring(0, s.length() - 1));
            }
        });

        // Ca button
        caJButton = new JButton();
        caJButton.setBounds(10, 70, 105, 50);
        caJButton.setText("C/A");
        caJButton.setBackground(Color.CYAN);
        // action listener to clear all by resetting string
        caJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcJTextField.setText("");
            }
        });
        clearJPanel.add(caJButton);

        // calculate button
        calculateJButton = new JButton();
        calculateJButton.setBounds(345, 260, 135, 100);
        calculateJButton.setText("Calculate");
        calculateJButton.setBackground(Color.CYAN);
        contentPane.add(calculateJButton);
        calculateJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // call calculate method
                calculate();
            }
        });

        setTitle("Calculator");
        setSize(510, 450);
        setVisible(true);
    }

    public void calculate() {
        // cast calc input into variable s
        String s = calcJTextField.getText();
        // run loop until + - * / found
        // keep track of nums before
        // keeps track of nums after
        // if not num found, use operation on num
        // gather num from Double.parse a substring
        boolean add = false;
        boolean subtract = false;
        boolean multiply = false;
        boolean firstHalf = true;
        // dive not necessary, used as else

        int opIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            // first half cases
            if (firstHalf) {
                // addition case
                if (s.charAt(i) == '+') {
                    add = true;
                    firstHalf = false;
                    opIndex = i;
                } // subtraction case
                else if (s.charAt(i) == '-' && i != 0) {
                    // check for repeat - (negatives)
                    boolean negative = false;
                    boolean doubleneg = false;

                    // handle double negatives
                    if (s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                        doubleneg = true;
                    }
                    // ensure negative check only runs when no double negative
                    if (!doubleneg) {
                        for (int j = i + 1; j < s.length(); j++) {
                            if (s.charAt(j) == '-') {
                                negative = true;
                            }
                        }
                    }

                    // continue main loop if this is negative, not operation
                    if (negative) {
                        continue;
                    }

                    subtract = true;
                    firstHalf = false;
                    opIndex = i;
                } // multiply case
                else if (s.charAt(i) == '*') {
                    multiply = true;
                    firstHalf = false;
                    opIndex = i;
                } // divide case
                else if (s.charAt(i) == '/') {
                    firstHalf = false;
                    opIndex = i;
                }

            }
            // if second half, time to calculate
            if (!firstHalf) {
                try {
                    // first num comes from double before operator
                    double first = Double.parseDouble(s.substring(0, opIndex));
                    // second num comes from double after operator
                    double second = Double.parseDouble(s.substring(opIndex + 1));
                    // add
                    if (add) {
                        double r = first + second;
                        calcJTextField.setText(Double.toString(r));
                    } // subtract
                    else if (subtract) {
                        double r = first - second;
                        calcJTextField.setText(Double.toString(r));
                    } // multiply
                    else if (multiply) {
                        double r = first * second;
                        calcJTextField.setText(Double.toString(r));
                    } // divide
                    else {
                        // cant divide by 0
                        if (second == 0) {
                            throw new Exception("ERROR");
                        }
                        double r = first / second;
                        calcJTextField.setText(Double.toString(r));
                    }
                    // catch operatoins being input wrongly
                } catch (Exception NumberFormatException) {
                    calcJTextField.setText("ERROR");
                }
            }

        }

    }
}