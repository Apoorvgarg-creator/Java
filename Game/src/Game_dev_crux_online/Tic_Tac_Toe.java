package Game_dev_crux_online;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tic_Tac_Toe extends JFrame implements ActionListener {
	public static int Board_size=3;
	public static enum GameStatus{
		Incomplete,Xwins,Owins,draw
	}
	private JButton[][] buttons=new JButton[Board_size][Board_size];
	boolean crossTurn=true;
	public  Tic_Tac_Toe() {
		super.setTitle("TIC TAC TOE");
		super.setSize(800,800);
		GridLayout grid=new GridLayout(Board_size,Board_size);
		super.setLayout(grid);
		Font font=new Font("Comic Sans",1,150);
		for(int row=0;row<Board_size;row++) {
			for(int col=0;col<Board_size;col++) {
				JButton button=new JButton("");
				buttons[row][col]=button;
				button.setFont(font);
				button.addActionListener(this);
				super.add(button);
			}
		}
		super.setResizable(false);
		super.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton=(JButton)e.getSource();
		makeMove(clickedButton);
		GameStatus gs=this.getGameStatus();
		if(gs==GameStatus.Incomplete) {
			return ;
		}
		declareWinner(gs);
		int choice=JOptionPane.showConfirmDialog(this, "Do you want to restart the game");
		if(choice==JOptionPane.YES_OPTION) {
			for(int row=0;row<Board_size;row++) {
				for(int col=0;col<Board_size;col++) {
					buttons[row][col].setText("");
				}
			}
			crossTurn=true;
			}else
				super.dispose();
	}
	private void declareWinner(GameStatus gs) {
		if(gs==GameStatus.Xwins) {
			JOptionPane.showMessageDialog(this, "X-WINS");
		}
		else if(gs==GameStatus.Owins) {
			JOptionPane.showMessageDialog(this, "O-WINS");
		}else  {
			JOptionPane.showMessageDialog(this, "DRAW");
		}
		
	}
	private GameStatus getGameStatus() {
		String text1="";
		String text2="";
		int row=0,col=0;
		//text inside row
		row=0;
		while(row<Board_size) {
			col=0;
			while(col<Board_size-1){
				text1=buttons[row][col].getText();
				text2=buttons[row][col+1].getText();
				if(!text1.equals(text2) || text1.length()==0) {
					break;
				}col++;
			}if(col==Board_size-1) {
				if(text1.equals("X")) {
					return GameStatus.Xwins;
				}else {
					return GameStatus.Owins;
				}
			}
			row++;
		}
		//text inside col
		col=0;
		row=0;
		while(col<Board_size) {
			row=0;
			while(row<Board_size-1){
				text1=buttons[row][col].getText();
				text2=buttons[row+1][col].getText();
				if(!text1.equals(text2) || text1.length()==0) {
					break;
				}row++;
			}if(row==Board_size-1) {
				if(text1.equals("X")) {
					return GameStatus.Xwins;
				}else {
					return GameStatus.Owins;
				}
			}
			col++;
		}
		//Diagonal 1
		col=0;
		row=0;
		while(row<Board_size-1) {
				text1=buttons[row][col].getText();
				text2=buttons[row+1][col+1].getText();
				if(!text1.equals(text2) || text1.length()==0) {
					break;
				}row++;
				col++;
		}if(row==Board_size-1 && col==Board_size-1) {
				if(text1.equals("X")) {
					return GameStatus.Xwins;
				}else {
					return GameStatus.Owins;
				}
			}
		//Diagonal 2
				col=Board_size-1;
				row=0;
				while(row<Board_size-1) {
						text1=buttons[row][col].getText();
						text2=buttons[row+1][col-1].getText();
						if(!text1.equals(text2) || text1.length()==0) {
							break;
						}row++;
						col--;
				}if(row==Board_size-1 && col==0) {
						if(text1.equals("X")) {
							return GameStatus.Xwins;
						}else {
							return GameStatus.Owins;
						}
					}
				String txt="";
				for(row=0;row<Board_size;row++) {
					for(col=0;col<Board_size;col++) {
						txt=buttons[row][col].getText();
						if(txt.length()==0) {
							return GameStatus.Incomplete;
						}
					}
				}
			
		
		return GameStatus.draw;
	}
	private void makeMove(JButton clickedButton) {
		String btntext=clickedButton.getText();
		if(btntext.length()>0) {
		JOptionPane.showMessageDialog(this, "INVALID MOVE");
		
		}else {
			if(crossTurn) {
				clickedButton.setText("X");
			}else {
				clickedButton.setText("O");
			}
			crossTurn=!crossTurn;
		}
	}
}
