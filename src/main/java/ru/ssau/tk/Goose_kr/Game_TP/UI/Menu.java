package ru.ssau.tk.Goose_kr.Game_TP.UI;
import ru.ssau.tk.Goose_kr.Game_TP.Game.GuessingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {
public Menu(){
    super("GuessingGame");
   /* Image image = new ImageIcon("ФонДляПрограмки.png").getImage();
    setContentPane(new JPanel(new BorderLayout()){
        @Override
        protected void paintComponent(Graphics g){g.drawImage(image,0,0, null);}
    });*/
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(200,200,400,100);
    getContentPane().setLayout(new FlowLayout());
    JButton button = new JButton("Start game");
    JButton button1 = new JButton("Connect");
    getContentPane().add(button);
    getContentPane().add(button1);
    setVisible(true);
  //  menuGame.add(createGuessingGame());
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            //Тут пишем запуск программы
        }
    });

}

    /*private JMenu createGuessingGame() {
        return null;
    }*/

    public static void main(String[] args) {
        JFrame menu = new Menu();
        menu.setVisible(true);
    }
}
