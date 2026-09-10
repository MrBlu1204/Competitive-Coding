class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();

        int i = 0;
        
        while(i < words.length){
            int lineStart = i;
            int lineLength = words[i].length();
            i++;

            while(i< words.length && lineLength+1+words[i].length() <= maxWidth){
                lineLength += 1 + words[i].length();
                i++;
            }

            int numWords = i - lineStart;
            int wordGaps = numWords - 1;

            StringBuilder line = new StringBuilder();

            if(i == words.length || numWords == 1 ){

                for(int j = lineStart ; j < i ; j++){
                    if(j>lineStart){
                        line.append(" ");
                    }
                    line.append(words[j]);
                }

                while(line.length() < maxWidth){
                    line.append(" ");
                }

            }else{
                
                int totalChars = 0;
                for (int j = lineStart; j < i; j++){
                    totalChars += words[j].length();
                }
                int totalSpaces = maxWidth - totalChars;
                int spacePer = totalSpaces / wordGaps;
                int extraSpaces = totalSpaces % wordGaps;
                for (int j = lineStart; j < i; j++) {
                    if (j > lineStart) {
                        int spaces = spacePer + (j - lineStart <= extraSpaces ? 1 : 0);
                        for (int s = 0; s < spaces; s++){
                             line.append(' ');
                        }
                    }
                    line.append(words[j]);
                }


            }

            result.add(line.toString());

        }

        return result;
        
    }
}