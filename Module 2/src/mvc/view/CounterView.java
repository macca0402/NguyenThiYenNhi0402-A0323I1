package mvc.view;

import mvc.controller.CounterListener;
import mvc.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;

    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ActionListener ac= new CounterListener();

        jButton_up = new JButton("UP");
        jButton_up.addActionListener(ac);

        jButton_down = new JButton("DOWN");
        jButton_down.addActionListener(ac);

        jLabel_value = new JLabel(this.counterModel.getValue() + "",JLabel.CENTER);

        JPanel jPanel=new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up,BorderLayout.WEST);
        jPanel.add(jLabel_value,BorderLayout.CENTER);
        jPanel.add(jButton_down,BorderLayout.EAST);

        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);

    }
    public void increaseView(){
        this.counterModel.increase();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void decreaseView(){
        this.counterModel.decrease();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
}
