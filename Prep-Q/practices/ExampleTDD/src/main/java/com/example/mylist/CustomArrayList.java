package com.example.mylist;

public class CustomArrayList {
	private int[] numbers;
	private int index;
	
	public CustomArrayList(){
		index=-1;
		numbers=new int[100];
		
	}
	
	public CustomArrayList(int length){
		index=-1;
		numbers=new int[length];
		
	}
	
	public void add(int value) {
		numbers[++index]=value;
	}
	public int size() {
		return index+1;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
			for(int x=0; x<=index; x++) {
					sb.append(numbers[x]+",");
			}
		sb.replace(sb.length()-1, sb.length(),"");	
		sb.append("]");
		return sb.toString();
	}
	public void remove(int idx) {
		// logic
	}
	
}
