import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WhileLoops extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(5));
		g.drawRect(10, 10, 760, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g.drawLine(10, 280, 770, 280);
		
		
		//3) Draw a vertical line to bisect the shape again
		g.drawLine(390, 10, 390, 550);
		g.drawLine(390/2, 10, 390/2, 550/2);
		//line thinhg
		int y2 = 20;
		while(y2 < (550/2)-10) {
			y2 += 20;
			g.drawLine(20,20,(390/2)-10,(y2/2));
		}
		//horiz lines
		int y22 = (550/4)+30;
		int i = 0;
		while(i < 10) {
			g.drawLine(20,y22+(i*10),(390/2)-10,y22+(i*10));
			i++;
		}
		//circles
		int i2=0;
		while(i2 < 8) {
			g.drawOval(((390/2)+20)+(i2*10),20+(i2*10),160-(i2*20),120-(i2*20));
			i2++;
		}
		//squares
		int pos = 0;
		while(pos < 7) {
			g.drawRect(((390/2)+20)+(pos*15),((390/2)-30)+(pos*6),10+(pos*10),10+(pos*10));
			pos++;
		}
		//2 to 31 string
		g.drawString("Return a string that sums from 2 to 31", 390+80 , 40);
		String ret = "";
		int sum = 0;
		for(int o = 2; o <= 31; o++) {
			sum += o;
			if(o!=31) {
			ret += (o+" + ");
			}else {
				ret+=o;
			}
		}
		g.drawString(ret, 390 , 80);
		g.drawString("Return the result", 390+140 , 120);
		g.drawString(Integer.toString(sum),390+180 ,160 );
		
		//factorial string
		String str = "";
		int rand = (int)(Math.random()*6)+5 ; 
		int sum2 = 1;
		while(rand >= 1) {
			if(rand != 1) {
			str += (rand + " * ");
			} else {
				str += (rand + " = ");
			}
			sum2 *= rand;
			
		    rand--;
		}
		g.drawString("Return a string factorial from rand(5,10) to 1", 50 , 760/2-70);
		g.drawString(str, 40 , 760/2-30);
		g.drawString(Integer.toString(sum2), 290 , 760/2-30);
	
		//random circles
		for(int i5 = 0; i5 < 50; i5++) {
			int randx = (int)(Math.random()*266)+390 ;
			int randy = (int)(Math.random()*166)+760/2-100;
			int randw = (int)(Math.random()*71)+50;
			g.drawOval(randx,randy,randw,randw);
		}
		
	}
	

	
	
	
	
	public static void main(String[] arg) {
		WhileLoops m = new WhileLoops();
	}
	
	public WhileLoops() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
