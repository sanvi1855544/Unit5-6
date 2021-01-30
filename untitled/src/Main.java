
class Main {
    public static void main(String[] args) {
        //Unit 6 Question 1
        String[] arrayOfStrings = {"card", "thunder","hinge", "trailing", "batting"};
        //enhanced for loop iterates over array and only prints if string has ing substring
        for(String word : arrayOfStrings){
            if(word.contains("ing")==true){
                System.out.println(word);
            }
        }
    }

}


