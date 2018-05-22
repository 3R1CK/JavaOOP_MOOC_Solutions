
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if(!this.guessedLetters.contains(letter)){
            this.guessedLetters = this.guessedLetters.concat(letter);
            
            if(!this.word.contains(letter)){
                this.numberOfFaults++;
            }
        }
        // if the letter has already been guessed, nothing happens
       
        // it the word does not contains the guessed letter, number of faults increase
         if(this.guessedLetters.contains(letter)){
             
        }
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        int counter=0;
        String theWord="";
        while(counter<this.word.length()){
        // if the letter in turn is within the guessed words, put it in to the hidden word
        String transf = "";
        char wordCurrChar = this.word.charAt(counter);       
        transf= transf+wordCurrChar;
        if(this.guessedLetters.contains(transf)){
            theWord = theWord + wordCurrChar;
        }else{
            theWord = theWord + '_';
        }
        // if the letter is not among guessed, replace it with _ in the hidden word 
           
            
           
            counter++;
            
        }
       

        // return the hidden word at the end
        return theWord;
    }
}
