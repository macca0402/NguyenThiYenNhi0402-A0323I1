package mvc.controller;

import mvc.view.CounterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CounterView ctv;
    public CounterListener(){
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Ban da nhan nut ");
        String src=e.getActionCommand();
        System.out.println("Ban da nhan nut "+ src);

        if(src.equals("UP")){
            this.ctv.increaseView();
        } else if (src.equals("DOWN")){
            this.ctv.decreaseView();
        }
    }
}
