import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    Frame calculatorFrame = new Frame();
    TextField displayText;
    Button button_add;
    Button button_1;
    Button button_2;
    Button button_3 ;
    Button button_sub = new Button();
    Button button_4 = new Button();
    Button button_5 = new Button();
    Button button_6 = new Button();
    Button button_mul = new Button();
    Button button_7 = new Button();
    Button button_8 = new Button();
    Button button_9 = new Button();
    Button button_div = new Button();
    Button button_decPo = new Button();
    Button button_0 = new Button();
    Button button_clear = new Button();
    Button button_equal = new Button();
    //Button button_exit = new Button();
    String tempnum1;
    String tempnum2;
    String[] symbol = new String[4];
    double[] num1 = new double[4];
    int arrayIndex = 0;
    double num2 = 0;


    Calculator(){
        displayText = new TextField();
        displayText.setBounds(20,50,280,20);
        button_add = new Button("+");
        button_add.setBounds(20,80,60,20);
        button_1 = new Button("1");
        button_1.setBounds(90,80,60,20);
        button_2 = new Button("2");
        button_2.setBounds(160,80,60,20);
        button_3 = new Button("3");
        button_3.setBounds(230,80,60,20);

        button_sub = new Button("-");
        button_sub.setBounds(20,110,60,20);
        button_4 = new Button("4");
        button_4.setBounds(90,110,60,20);
        button_5 = new Button("5");
        button_5.setBounds(160,110,60,20);
        button_6 = new Button("6");
        button_6.setBounds(230,110,60,20);



        button_mul = new Button("*");
        button_mul.setBounds(20,140,60,20);
        button_7 = new Button("7");
        button_7.setBounds(90,140,60,20);
        button_8 = new Button("8");
        button_8.setBounds(160,140,60,20);
        button_9 = new Button("9");
        button_9.setBounds(230,140,60,20);

        button_div = new Button("/");
        button_div.setBounds(20,170,60,20);
        button_decPo = new Button(".");
        button_decPo.setBounds(90,170,60,20);
        button_0 = new Button("0");
        button_0.setBounds(160,170,60,20);
        button_clear = new Button("C");
        button_clear.setBounds(230,170,60,20);

        button_equal = new Button("=");
        button_equal.setBounds(125,200,60,20);


        calculatorFrame.add(displayText);
        calculatorFrame.add(button_add);
        calculatorFrame.add(button_1);
        calculatorFrame.add(button_2);
        calculatorFrame.add(button_3);
        calculatorFrame.add(button_sub);
        calculatorFrame.add(button_4);
        calculatorFrame.add(button_5);
        calculatorFrame.add(button_6);
        calculatorFrame.add(button_mul);
        calculatorFrame.add(button_7);
        calculatorFrame.add(button_8);
        calculatorFrame.add(button_9);
        calculatorFrame.add(button_div);
        calculatorFrame.add(button_decPo);
        calculatorFrame.add(button_0);
        calculatorFrame.add(button_clear);
        calculatorFrame.add(button_equal);
        calculatorFrame.setSize(350,250);
        calculatorFrame.setBackground(Color.CYAN);
        calculatorFrame.setLayout(null);
        calculatorFrame.setVisible(true);
        calculatorFrame.setTitle("Calculator");

    }

    public void actionPerformance()
    {
        button_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                symbol[arrayIndex] = "+";
                num1[arrayIndex] = Double.parseDouble(tempnum1);
                arrayIndex++;
                displayText.setText(tempnum1+" + ");
            }
        });
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"1");
            }
        });
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"2");
            }
        });
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"3");
            }
        });


        button_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                symbol[arrayIndex] = "-";
                num1[arrayIndex] = Double.parseDouble(tempnum1);
                arrayIndex++;
                displayText.setText(tempnum1+" - ");
            }
        });
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"4");
            }
        });
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"5");
            }
        });
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"6");
            }
        });


        button_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                symbol[arrayIndex] = "*";
                num1[arrayIndex] = Double.parseDouble(tempnum1);
                arrayIndex++;
                displayText.setText(tempnum1+" * ");
            }
        });
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"7");
            }
        });
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"8");
            }
        });
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"9");
            }
        });

        button_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                symbol[arrayIndex] = "/";
                num1[arrayIndex] = Double.parseDouble(tempnum1);
                arrayIndex++;
                displayText.setText(tempnum1+" / ");
            }
        });
        button_decPo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+".");
            }
        });
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempnum1 = displayText.getText();
                displayText.setText(tempnum1+"0");
            }
        });
        button_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = 0;
                num1[1] = 0;
                displayText.setText("");
            }
        });
        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = displayText.getText();
                String[] temp2 = temp.split(" ");
                num1[0] = Double.parseDouble(temp2[0]);
                symbol[0] = temp2[1];
                num1[1] = Double.parseDouble(temp2[2]);
                if(temp2[1].contains("+"))
                {

                    double tempValue = num1[0] + num1[1];
                    displayText.setText(temp+ " = " + tempValue);
                } else if (temp2[1].contains("-")) {
                    double tempValue = num1[0] - num1[1];
                    displayText.setText(temp+ " = " + tempValue);

                }
                else if (temp2[1].contains("*")) {
                    double tempValue = num1[0] * num1[1];
                    displayText.setText(temp+ " = " + tempValue);

                }
                else if (temp2[1].contains("/")) {
                    double tempValue = num1[0] / num1[1];
                    displayText.setText(temp+ " = " + tempValue);

                }
            }
        });
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.actionPerformance();

    }
}
