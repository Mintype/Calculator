package com.smallplayz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static String num = "";
    static boolean booperiod = true;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JButton buttonClear =new JButton("CLEAR");
        JButton buttonDelete =new JButton("DELETE");

        JButton button0 =new JButton("0");
        JButton button1 =new JButton("1");
        JButton button2 =new JButton("2");
        JButton button3 =new JButton("3");
        JButton button4 =new JButton("4");
        JButton button5 =new JButton("5");
        JButton button6 =new JButton("6");
        JButton button7 =new JButton("7");
        JButton button8 =new JButton("8");
        JButton button9 =new JButton("9");

        JButton buttonEqual =new JButton("=");
        JButton buttonPlusOrMinus =new JButton("+/-");
        JButton buttonDivision =new JButton("/");
        JButton buttonMultiplication =new JButton("X");
        JButton buttonSubtraction =new JButton("-");
        JButton buttonAddition =new JButton("+");
        JButton buttonPeriod =new JButton(".");


        JTextField textField = new JTextField();
        textField.setEditable(false);

        ImageIcon image = new ImageIcon("Logo.png"); // create an image icon

        Color color=new Color(115, 147, 179);

        textField.setBounds(15,15, 285,85);
        buttonClear.setBounds(15,115,85,50);
        buttonDelete.setBounds(115,115,85,50);
        buttonDivision.setBounds(215,115,85,50);
        button7.setBounds(15,180, 60,50);
        button8.setBounds(90,180, 60,50);
        button9.setBounds(165,180, 60,50);
        buttonMultiplication.setBounds(240,180, 60,50);
        button4.setBounds(15,245, 60,50);
        button5.setBounds(90,245, 60,50);
        button6.setBounds(165,245, 60,50);
        buttonSubtraction.setBounds(240,245, 60,50);
        button1.setBounds(15,310, 60,50);
        button2.setBounds(90,310, 60,50);
        button3.setBounds(165,310, 60,50);
        buttonAddition.setBounds(240,310, 60,50);
        buttonPlusOrMinus.setBounds(15,375, 60,50);
        button0.setBounds(90,375, 60,50);
        buttonPeriod.setBounds(165,375, 60,50);
        buttonEqual.setBounds(240,375, 60,50);

        //button9.setBounds(164,180, 56,50);


        textField.setFont(new Font("Verdana",Font.BOLD,35));

        frame.add(textField);
        frame.add(buttonClear);
        frame.add(buttonDelete);

        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        frame.add(buttonEqual);
        frame.add(buttonPlusOrMinus);
        frame.add(buttonDivision);
        frame.add(buttonMultiplication);
        frame.add(buttonSubtraction);
        frame.add(buttonAddition);
        frame.add(buttonPeriod);

        buttonClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text Cleared");
                num="";
                textField.setText("");
            }
        });
        button0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(textField.getText().equals("")){}
                else{
                    System.out.println("Text added: '0'");
                    num=textField.getText()+"0";
                }
                textField.setText(num);
            }
        });
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '1'");
                num=textField.getText()+"1";
                textField.setText(num);
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '2'");
                num=textField.getText()+"2";
                textField.setText(num);
            }
        });
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '3'");
                num=textField.getText()+"3";
                textField.setText(num);
            }
        });
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '4'");
                num=textField.getText()+"4";
                textField.setText(num);
            }
        });
        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '5'");
                num=textField.getText()+"5";
                textField.setText(num);
            }
        });
        button6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '6'");
                num=textField.getText()+"6";
                textField.setText(num);
            }
        });
        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '7'");
                num=textField.getText()+"7";
                textField.setText(num);
            }
        });
        button8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '8'");
                num=textField.getText()+"8";
                textField.setText(num);
            }
        });
        button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Text added: '9'");
                num=textField.getText()+"9";
                textField.setText(num);
            }
        });
        buttonPeriod.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                    for(int i = 0; i<num.length(); i++){
                        if(num.charAt(i) == '+'){
                            booperiod=true;
                        }
                    }
                if(booperiod) {
                    System.out.println("Text added: '.'");
                    num = textField.getText() + ".";
                    textField.setText(num);
                    booperiod=false;
                }
            }
        });
        buttonPlusOrMinus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(num.charAt(0)=='-'){
                    num=num.replace("-", "");
                    System.out.println("Text added: '+/-'");
                }
                else{
                    System.out.println("Text added: '+/-'");
                    num="-"+textField.getText();
                }
                textField.setText(num);
            }
        });
        buttonDelete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String num1 = "";
                System.out.println("Text.lastCharacter Deleted");
                for(int i = 0; i<num.length()-1; i++){
                    num1 = num1+num.charAt(i);
                }
                num = num1;
                textField.setText(num);
            }
        });

        buttonDivision.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean j = false;
                for(int i = 0; i<num.length(); i++){
                    if(num.charAt(i) == '-'||num.charAt(i) == '+'||num.charAt(i) == '/'||num.charAt(i) == '*'){
                        j=true;
                        break;
                    }
                }

                if(num.charAt(num.length()-1) == '-'||num.charAt(num.length()-1) == '+'||num.charAt(num.length()-1) == '/'||num.charAt(num.length()-1) == '*'||j){}
                else{
                    System.out.println("Text added: '/'");
                    num=textField.getText()+"/";
                }
                textField.setText(num);
            }
        });
        buttonMultiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean j = false;
                for(int i = 0; i<num.length(); i++){
                    if(num.charAt(i) == '-'||num.charAt(i) == '+'||num.charAt(i) == '/'||num.charAt(i) == '*'){
                        j=true;
                        break;
                    }
                }
                if(num.charAt(num.length()-1) == '-'||num.charAt(num.length()-1) == '+'||num.charAt(num.length()-1) == '/'||num.charAt(num.length()-1) == '*' ||j){}
                else{
                    System.out.println("Text added: '*'");
                    num=textField.getText()+"*";
                }
                textField.setText(num);
            }
        });
        buttonSubtraction.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean j = false;
                for(int i = 0; i<num.length(); i++){
                    if(num.charAt(i) == '-'||num.charAt(i) == '+'||num.charAt(i) == '/'||num.charAt(i) == '*'){
                        j=true;
                        break;
                    }
                }
                if(num.charAt(num.length()-1) == '-'||num.charAt(num.length()-1) == '+'||num.charAt(num.length()-1) == '/'||num.charAt(num.length()-1) == '*'||j){}
                else{
                    System.out.println("Text added: '-'");
                    num=textField.getText()+"-";
                }
                textField.setText(num);
            }
        });
        buttonAddition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean j = false;
                for(int i = 0; i<num.length(); i++){
                    if(num.charAt(i) == '-'||num.charAt(i) == '+'||num.charAt(i) == '/'||num.charAt(i) == '*'){
                        j=true;
                        break;
                    }
                }
                if(num.charAt(num.length()-1) == '-'||num.charAt(num.length()-1) == '+'||num.charAt(num.length()-1) == '/'||num.charAt(num.length()-1) == '*'||j){}
                else{
                    System.out.println("Text added: '+'");
                    num=textField.getText()+"+";
                }
                textField.setText(num);
            }
        });
        buttonEqual.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int intat = 0, length = num.length();
                char charat = 'e';
                for(int i = 0; i<num.length(); i++) {
                    if(num.charAt(i) == '+'||num.charAt(i) == '-'||num.charAt(i) == '*'||num.charAt(i) == '/') {
                        intat=i+1;
                        charat=num.charAt(i);
                    }
                }
                System.out.println(intat + " " + charat);
                String x1 = "", y1 = "";
                double x = 0.0, y = 0.0;
                for(int i = 0; i<intat-1; i++)
                    x1 = x1+num.charAt(i);
                for(int i = intat; i<length; i++)
                    y1 = y1+num.charAt(i);
                System.out.println(x1 + "\n" + y1);
                x = Double.parseDouble(x1);
                y = Double.parseDouble(y1);

                double z = 0;
                if(charat == '+')
                    z = x+y;
                else if(charat == '-')
                    z = x-y;
                else if(charat == '*')
                    z = x*y;
                else if(charat == '/')
                    z = x/y;
                String finalstr=String.valueOf(z);
                int h = 0;
                if(finalstr.charAt(finalstr.length()-2) == '.' && finalstr.charAt(finalstr.length()-1) == '0' ) {
                    h = (int) z;
                    finalstr=String.valueOf(h);
                }
                num = finalstr;
                textField.setText(num);
            }
        });


        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(color);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(330,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
