/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayintarlasi;

import javax.swing.JButton;

/**
 *
 * @author Özgür
 */
public class Btn extends JButton{
    private int row, col, count;
    private boolean mine, flag;

    public Btn(int row, int col) {
        this.row = row;
        this.col = col;
        this.count = 0;
        this.mine = false;
        this.flag = false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isMine() {
        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
        
    
}
