
package com;
import java.awt.*;
import javax.swing.*;
public class Draw extends JFrame
{
    private MyPanel music = null ;

    public static void main(String[] args)
    {

        Draw qwe = new Draw();

    }

    private Draw()
    {
        music = new MyPanel();
        this.add(music);
        this.setSize(1000,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel	//我自己的面板，用于绘图和实现绘图区域
{
    //覆盖JPanel的paint方法
    //Graphics是绘图的重要类，可以理解成一支画笔
    public void paint(Graphics g)
    {
        //1.调用父类函数完成初始化
        super.paint(g);		//这句话不能少
        //System.out.println("被调用");		//证明别调用

        g.drawLine(10, 10, 10,50);
        //第一个行谱子
        {
            g.drawLine(10, 10, 980, 10);
            g.drawLine(10, 20, 980, 20);
            g.drawLine(10, 30, 980, 30);
            g.drawLine(10, 40, 980, 40);
            g.drawLine(10, 50, 980, 50);
        }

        //第一行的音符
        {
            g.setFont(new Font("Tahoma",Font.PLAIN,25));
            g.drawString("9", 40, 28);
            g.drawString("8", 40, 48);

            g.drawLine(80, 10, 80, 40);
            g.fillOval(80, 5, 15, 10);
            g.fillOval(80, 20, 15, 10);
            g.setColor(Color.black);

            g.drawLine(120, 10, 120, 40);
            g.fillOval(120, 5, 15, 10);
            g.fillOval(120, 20, 15, 10);

            g.drawLine(230, 20, 230, 40);
            g.fillOval(230, 15, 15, 10);
            g.fillOval(230, 25, 15, 10);

            g.drawLine(260, 0, 260, 110);


            for (int i = 0, b = 300; i<3; i++, b+=40) {
                g.drawLine(b, 20, b, 50);
                g.fillOval(b, 15, 15, 10);
                g.fillOval(b, 25, 15, 10);
            }
            g.fillRect(300, 50, 80, 3);

            g.drawLine(470, 0, 470, 110);

            for (int i = 0, b = 520; i<2; i++, b+=40) {
                g.drawLine(b, 10, b, 50);
                g.fillOval(b, 5, 15, 10);
                g.fillOval(b, 15, 15, 10);
            }
            g.fillRect(520, 50, 40, 3);

            for (int i = 0, b = 640; i<3; i++, b+=40) {
                g.drawLine(b, 20, b, 50);
                g.fillOval(b, 15, 15, 10);
                g.fillOval(b, 25, 15, 10);
            }
            g.fillRect(640, 50, 80, 3);

            for (int i = 0, b = 800; i<2; i++, b+=40) {
                g.drawLine(b, 10, b, 50);
                g.fillOval(b, 5, 15, 10);
                g.fillOval(b, 15, 15, 10);
            }
            g.fillRect(800, 50, 40, 3);
            g.drawLine(750, 0, 750, 110);

            g.drawLine(980, 0, 980, 110);

        }

        // 第二行的音符
        {
            g.setFont(new Font("Tahoma",Font.PLAIN,25));
            g.drawString("9", 40, 88);
            g.drawString("8", 40, 108);
            for (int i = 0, b = 150; i<3; i++, b+=40) {
                g.drawLine(b, 70, b, 110);
                g.fillOval(b, 65, 15, 10);
                g.fillOval(b, 75, 15, 10);
            }
            g.fillRect(150, 110, 80, 3);

            for (int i = 0, b = 350; i<2; i++, b+=40) {
                g.drawLine(b, 70, b, 110);
                g.fillOval(b, 65, 15, 10);
                g.fillOval(b, 75, 15, 10);
            }
            g.fillRect(350, 110, 40, 3);

            for (int i = 0, b = 550; i<2; i++, b+=40) {
                g.drawLine(b, 70, b, 110);
                g.drawOval(b-15, 95, 15, 10);
                g.drawOval(b-15, 105, 15, 10);
            }

            for (int i = 0, b = 660; i<1; i++, b+=40) {
                g.drawLine(b, 70, b, 110);
                g.drawOval(b-15, 95, 15, 10);
                g.drawOval(b-15, 105, 15, 10);
            }
            for (int i = 0, b = 700; i<1; i++, b+=40) {
                g.drawLine(b, 70, b, 110);
                g.fillOval(b-15, 95, 15, 10);
                g.fillOval(b-15, 105, 15, 10);
            }
            for (int i = 0, b = 900; i<2; i++, b+=40) {
                g.drawLine(b, 70, b, 110);
                g.fillOval(b, 65, 15, 10);
                g.fillOval(b, 75, 15, 10);
            }
            g.fillRect(900, 110, 40, 3);
        }
        //第二行谱子
        {
            g.drawLine(10, 70, 980, 70);
            g.drawLine(10, 80, 980, 80);
            g.drawLine(10, 90, 980, 90);
            g.drawLine(10, 100, 980, 100);
            g.drawLine(10, 110, 980, 110);
        }
        // 第三行音符
        {
            for (int i = 0, b = 50; i<3; i++, b+=30) {
                g.drawLine(b, 150, b, 200);
                g.fillOval(b, 145, 15, 10);
                g.fillOval(b, 165, 15, 10);
            }
            g.fillRect(50, 200, 60, 3);
            for (int i = 0, b = 200; i<3; i++, b+=30) {
                g.drawLine(b, 150, b, 190);
                g.fillOval(b, 145, 15, 10);
                g.fillOval(b, 165, 15, 10);
            }
            g.fillRect(200, 190, 60, 3);
            g.drawLine(300, 150, 300, 250);
            g.drawLine(600, 150, 600, 250);
            g.drawLine(900, 150, 900, 250);

            for (int i = 0, b = 350; i<3; i++, b+=40) {
                g.drawLine(b, 150, b, 190);
                g.fillOval(b, 145, 15, 10);
                g.fillOval(b, 155, 15, 10);
            }
            for (int i = 0, b = 630; i<3; i++, b+=40) {
                g.drawLine(b, 150, b, 190);
                g.fillOval(b, 145, 15, 10);
                g.fillOval(b, 155, 15, 10);
            }
            g.fillRect(630, 190, 80, 3);
            for (int i = 0, b = 930; i<1; i++, b+=40) {
                g.drawLine(b, 150, b, 190);
                g.drawOval(b-15, 145, 15, 10);
                g.drawOval(b-15, 155, 15, 10);
            }
            for (int i = 0, b = 950; i<1; i++, b+=40) {
                g.drawLine(b, 150, b, 190);
                g.fillOval(b-15, 145, 15, 10);
                g.fillOval(b-15, 155, 15, 10);
            }
        }
        //第三行谱子
        {
            g.drawLine(10, 150, 980, 150);
            g.drawLine(10, 160, 980, 160);
            g.drawLine(10, 170, 980, 170);
            g.drawLine(10, 180, 980, 180);
            g.drawLine(10, 190, 980, 190);
        }
        // 第四行音符
        {
            for (int i = 0, b = 30; i < 3; i++, b += 40) {
                g.drawLine(b, 210, b, 250);
                g.fillOval(b, 205, 15, 10);
                g.fillOval(b, 215, 15, 10);
            }
            g.fillRect(30, 250, 80, 3);
            for (int i = 0, b = 250; i < 2; i++, b += 30) {
                g.drawLine(b, 210, b, 240);
                g.fillOval(b, 205, 15, 10);
                g.fillOval(b, 215, 15, 10);
            }
            g.fillRect(250, 240, 30, 3);
            for (int i = 0, b = 400; i < 3; i++, b += 30) {
                g.drawLine(b, 200, b, 240);
                g.fillOval(b - 15, 230, 15, 10);
                g.fillOval(b - 15, 240, 15, 10);
            }
            g.fillRect(400, 200, 80, 3);
            for (int i = 0, b = 650; i < 3; i++, b += 30) {
                g.drawLine(b, 200, b, 240);
                g.drawOval(b - 15, 230, 15, 10);
                g.drawOval(b - 15, 240, 15, 10);
            }
            for (int i = 0, b = 930; i < 1; i++, b += 40) {
                g.drawLine(b, 210, b, 250);
                g.drawOval(b - 15, 200, 15, 10);
                g.drawOval(b - 15, 210, 15, 10);
            }
            for (int i = 0, b = 930; i < 1; i++, b += 40) {
                g.drawLine(b, 210, b, 250);
                g.fillOval(b - 15, 200, 15, 10);
                g.fillOval(b - 15, 210, 15, 10);
            }
        }
        //第四行谱子
        {
            g.drawLine(10, 210, 980, 210);
            g.drawLine(10, 220, 980, 220);
            g.drawLine(10, 230, 980, 230);
            g.drawLine(10, 240, 980, 240);
            g.drawLine(10, 250, 980, 250);
        }
        // 第五行谱子
        {
            g.drawString("4", 40, 388);
            g.drawString("4", 40, 408);
            g.drawString("4", 40, 308);
            g.drawString("4", 40, 328);
            for (int i = 0, b = 100; i<3; i++, b+=50) {
                g.drawLine(b, 290, b, 330);
                g.fillOval(b, 280, 15, 10);
                g.fillOval(b, 295, 15, 10);
            }
            g.fillRect(100, 330, 100, 4);

            for (int i = 0, b = 400; i<2; i++, b+=40) {
                g.drawLine(b, 290, b, 330);
                g.fillOval(b, 285, 15, 10);
                g.fillOval(b, 295, 15, 10);
            }
            g.fillRect(400, 330, 40, 3);

            g.drawLine(300, 290, 300, 410);
            g.drawLine(550, 290, 550, 410);
            g.drawLine(950, 290, 950, 410);

            for (int i = 0, b = 600; i<2; i++, b+=40) {
                g.drawLine(b, 290, b, 320);
                g.drawOval(b, 285, 15, 10);
                g.drawOval(b, 295, 15, 10);
            }
            g.fillRect(600, 320, 40, 3);
            for (int i = 0, b = 700; i<1; i++, b+=40) {
                g.drawLine(b, 290, b, 320);
                g.drawOval(b-15, 310, 15, 10);
                g.drawOval(b-15, 320, 15, 10);
            }
            for (int i = 0, b = 750; i<1; i++, b+=40) {
                g.drawLine(b, 290, b, 320);
                g.fillOval(b-15, 310, 15, 10);
                g.fillOval(b-15, 320, 15, 10);
            }
            for (int i = 0, b = 800; i<3; i++, b+=30) {
                g.drawLine(b, 290, b, 320);
                g.fillOval(b, 285, 15, 10);
                g.fillOval(b, 295, 15, 10);
            }
            g.fillRect(800, 320, 60, 3);
        }
        //第五行谱子
        {
            g.drawLine(10, 290, 980, 290);
            g.drawLine(10, 300, 980, 300);
            g.drawLine(10, 310, 980, 310);
            g.drawLine(10, 320, 980, 320);
            g.drawLine(10, 330, 980, 330);
        }

        {
            for (int i = 0, b = 80; i<3; i++, b+=30) {
                g.drawLine(b, 370, b, 410);
                g.fillOval(b, 375, 15, 10);
                g.fillOval(b, 365, 15, 10);
            }
            g.fillRect(80, 410, 60, 3);
            for (int i = 0, b = 250; i<2; i++, b+=30) {
                g.drawLine(b, 370, b, 410);
                g.fillOval(b, 360, 15, 10);
                g.fillOval(b, 365, 15, 10);
            }
            g.fillRect(250, 410, 30, 3);
            for (int i = 0, b = 400; i<3; i++, b+=40) {
                g.drawLine(b, 370, b, 410);
                g.fillOval(b, 375, 15, 10);
                g.fillOval(b, 365, 15, 10);
            }
            for (int i = 0, b = 600; i<3; i++, b+=40) {
                g.drawLine(b, 370, b, 410);
                g.fillOval(b, 375, 15, 10);
                g.fillOval(b, 365, 15, 10);
            }
            g.fillRect(600, 410, 80, 3);
            for (int i = 0, b = 900; i<1; i++, b+=40) {
                g.drawLine(b, 370, b, 410);
                g.drawOval(b-15, 375, 15, 10);
                g.drawOval(b-15, 365, 15, 10);
            }
            for (int i = 0, b = 930; i<1; i++, b+=40) {
                g.drawLine(b, 370, b, 410);
                g.fillOval(b-15, 365, 15, 10);
                g.fillOval(b-15, 375, 15, 10);
            }
        }
        //第六行谱子
        {
            g.drawLine(10, 370, 980, 370);
            g.drawLine(10, 380, 980, 380);
            g.drawLine(10, 390, 980, 390);
            g.drawLine(10, 400, 980, 400);
            g.drawLine(10, 410, 980, 410);
        }




    }
}
