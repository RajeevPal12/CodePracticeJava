package com.trie.service;

import java.util.Stack;

public class TrieInsertAndSearch {
	private static final int ALPHABET_SIZE=26;
	static class TriesNode{
		boolean isleaf;
		TriesNode childs[];
		TriesNode(){
			isleaf=false;
			childs=new TriesNode[ALPHABET_SIZE];
			for (int i = 0; i < ALPHABET_SIZE; i++)
				childs[i] =null;
		}
	}
	private static void deleteNodes(TriesNode root, char[] ch){
		System.out.println("1");
		Stack<TriesNode> stack=new Stack<>();
		int strlen=ch.length;
		TriesNode ptr=root;
		int i;
		for(i=0;i<strlen;i++){
			System.out.print("  "+i+" ");
			if(ptr.childs[ch[i]-'a']==null){
				System.out.println("String Not Exist!");
				break;
			}
			stack.push(ptr);
			ptr=ptr.childs[ch[i]-'a'];
		}
		if(i==strlen){
			System.out.println(" found ");
			if(ptr.isleaf)
			{   System.out.println(" 2 ");
				while(!stack.isEmpty())
				{	System.out.println(" 3 ");
					boolean isnull=true;
					for (int j = 0; i < ALPHABET_SIZE; i++)
						if(ptr.childs[i]!=null)
						{   System.out.print(" 4 ");
							if(j==0)
								ptr.isleaf=false;
							isnull=false;
							break;
						}
					if(isnull){
						System.out.println(" 5 ");
						ptr=stack.pop();
						ptr.childs[ch[i-1]-'a']=null;
					}
					else
						break;
				}
			}
		}
	}
	private static boolean search(TriesNode root, char[] ch) {
		int strlen=ch.length;
		TriesNode ptr=root;
		for(int i=0;i<strlen;i++){
			if(ptr.childs[ch[i]-'a']==null){
				return false;
			}
			ptr=ptr.childs[ch[i]-'a'];
		}
		return (ptr!=null&&ptr.isleaf);
	}
	private static void insert(TriesNode root, char[] ch) {
		int strlen=ch.length;
		TriesNode ptr=root;
		for(int i=0;i<strlen;i++){
			if(ptr.childs[ch[i]-'a']==null){
				ptr.childs[ch[i]-'a']=new TriesNode();
			}
			ptr=ptr.childs[ch[i]-'a'];
		}
		ptr.isleaf=true;
	}
	public static void main(String[] args) {
	
		 // Input keys (use only 'a' through 'z' and lower case)
	    String keys[] = {"the", "a", "there", "answer", "any",
	                     "by", "bye", "their"};
	 
	    TriesNode root = new TriesNode();
	    // Construct trie
	    for (int i = 0; i < keys.length; i++)
	        insert(root, keys[i].toCharArray());
	 
	    // Search for different keys
	    System.out.println("  the:"+search(root, "the".toCharArray()) );
	    System.out.println("  these:"+ search(root, "these".toCharArray()) );
	    System.out.println("  their:"+ search(root, "their".toCharArray()) );
	    System.out.println("  thaw:"+ search(root, "thaw".toCharArray()));
	    deleteNodes(root,"the".toCharArray());
	    System.out.println("  the:"+search(root, "the".toCharArray()) );
	    
	}
}
