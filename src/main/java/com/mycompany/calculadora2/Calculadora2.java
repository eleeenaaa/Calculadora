/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora2;

/**
 *
 * @author admin
 */
public class Calculadora2 {
	private int num1;
	private int num2;
	
	public Calculadora2(int a,int b) {
		num1=a;
		num2=b;
	}
	public int suma() {
		int result=num1+num2;
		return result;
	}
	public int resta() {
		int result;
		if(!resta2()) {
			 result=num2-num1;
		}else {
			 result=num1-num2;
		}
		return result;
	}
	public int multiplica() {
		int result=num1*num2;
		return result;
	}
	public int divide() {
		int result=num1/num2;
		return result;
	}
	public boolean resta2() {
		if(num1>num2) {
			return true;
		}else {
			return false;
		}	
	}

	public Integer divide2() {
		int result;
		if(num2==0) {
			return null;
		}
		 result=num1/num2;
		return result;
	}
	
	
	public Integer factorial() {
		Integer result=1;
		int i=1;
		
		if(num1>=0) {
			while(i<=num1) {
				result=result*i;
				i++;
			}
		}else {
				result=null;
			}

		return result;
	}
	
}