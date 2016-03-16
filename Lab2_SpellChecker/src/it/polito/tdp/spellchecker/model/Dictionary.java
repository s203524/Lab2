package it.polito.tdp.spellchecker.model;

import java.util.LinkedList;
import java.util.List;

public class Dictionary {
	
	protected List<String> enDictionary;
	protected List<String> itDictionary;
	protected List<RichWord> richWord;
	
	public Dictionary(){
		super();
		this.enDictionary = new LinkedList<String>();
		this.itDictionary = new LinkedList<String>();
		this.richWord = new LinkedList<RichWord>();
	}

	public String loadDictionary(){
		return null;
	}
	
	public List<RichWord> spellCheckText(List<String> inputTextList){
		
		//Implementare il metodo per poter eseguire il controllo ortografico del testo in input. 
		if(inputTextList.get(0).compareTo("En")==0){
			for(String s:inputTextList){
				if(enDictionary.contains(s)){
					RichWord tempRw = new RichWord(s, true);
					richWord.add(tempRw);
				}
				else{
					RichWord tempRw = new RichWord(s, false);
					richWord.add(tempRw);
				}
			}
		}
		for(String s:inputTextList){
			if(itDictionary.contains(s)){
				RichWord tempRw = new RichWord(s, true);
				richWord.add(tempRw);
			}
			else{
				RichWord tempRw = new RichWord(s, false);
				richWord.add(tempRw);
			}
		}
		return richWord;
	}
}
