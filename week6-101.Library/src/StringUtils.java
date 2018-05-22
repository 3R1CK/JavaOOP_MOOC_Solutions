/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emeji
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
       String trimWord = word.trim();
       String trimSearched = searched.trim();
        
        return trimWord.toUpperCase().contains(trimSearched.toUpperCase());
    }

}
