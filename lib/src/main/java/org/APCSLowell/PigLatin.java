package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    String vowels = "aeiouAEIOU";
        for(int i = 0; i<sWord.length(); i++){
            if(vowels.indexof(sWord.charAt(i))!= -1){
                return i;
            }
        }
        return -1;
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        if(firstVowel == 0){
            return sWord + "way";
        }
        if(firstVowell == -1){
            return sWord + "ay";
        }
        String start = sWord.substring(0,firstVowel);
        String rest = sWord.substring(firstvowel);
        return null;
    }
}
