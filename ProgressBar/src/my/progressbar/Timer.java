/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.progressbar;

import javax.swing.SwingWorker;

/**
 *
 * @author katrinaeaton
 */
public class Timer extends SwingWorker<Timer, Void> {
//    public void countDown() {
//        SwingWorker worker = new SwingWorker<Timer, Void>(){

    @Override
//    protected Timer doInBackground<Timer, Void>(){
//    }
    
    protected Timer doInBackground(){
        
        Timer countDown = new Timer();
        for(int i=0;i<=20;i++) {
            try {
                Thread.sleep(500);
                setProgress(5 * i);
                System.out.println(i);
                if (i == 9){
                    System.out.println("Half way there!");
//                    jProgressBar1.setString("Half way there!");
                }
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        return null;
    }
    
    public static void main(String args[]) {
    }
}
