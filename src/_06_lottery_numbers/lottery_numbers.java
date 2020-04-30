package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
public static void main(String[] args) {
	Random gen = new Random(); 
JOptionPane.showMessageDialog(null, "roll for lottery");
int randomNumber = gen.nextInt(10);
}
}

