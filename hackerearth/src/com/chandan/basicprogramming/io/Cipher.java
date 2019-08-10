package com.chandan.basicprogramming.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author chandankumarjena
 * to design a cipher, output will be an encrypted string.
 * input- Abd4! , 2
 * output - Cdf6!
 */
public class Cipher {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		char []cipherText = bufferedReader.readLine().toCharArray();
		int shift = Integer.parseInt(bufferedReader.readLine());
		
		for (int i = 0; i < cipherText.length; i++) {
			//character from A-Z
			if (cipherText[i] >= 65 && cipherText[i] <=90) {
				//shift if exceed 90 +
				if((cipherText[i] + shift) > 90) {
					int offset = ((cipherText[i] + shift) - 65)%26;
					cipherText[i] = (char)(65+offset);
				} else {
					cipherText[i] = (char)(cipherText[i]+shift);
				}
			}
			//character from a-z
			if(cipherText[i] >= 97 && cipherText[i] <=122) {
				//shift if excced 122+
				if((cipherText[i] + shift) > 90) {
					int offset = ((cipherText[i] + shift) - 97)%26;
					cipherText[i] = (char)(97+offset);
				} else {
					cipherText[i] = (char)(cipherText[i]+shift);
				}
			}
			//character from 0-9
			if(cipherText[i] >= 48 && cipherText[i] <=57) {
				//shift if exceed 57+
				if((cipherText[i] + shift) > 57) {
					int offset = ((cipherText[i] + shift) - 48)%10;
					cipherText[i] = (char)(48+offset);
				}else {
					cipherText[i] = (char)(cipherText[i]+shift);
				}
			}
			
		}
		String cipherString = String.copyValueOf(cipherText);
		System.out.println(cipherString);
		

	}

}
