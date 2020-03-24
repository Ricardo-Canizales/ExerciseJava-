# ExerciseJava-JavaScript
Java-JavaScript Exercises- Ricardo Canizales

On this Exercise i need to sort char of a string, and also kep all in lowercase and without punctuation.

THE SOLUTION IN JAVA:

public class SortingCharEx {
    
    public static void main(String args[]) {
        char temp;
        String sortedStr="";
        String input = "When not studying nuclear physics, Bambi likes to play beach volleyball.";
        input = input.replaceAll("\\p{Punct}", "");
        input = input.toLowerCase();

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < charArray.length; j++) {

                if (charArray[i] < charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;

                }
            }
        }

        for (int k = 0; k < charArray.length; k++) {
            sortedStr = sortedStr + charArray[k];
        }

        System.out.println("Hey Dr x, this is your block text with letters in sorted :" + sortedStr);
    }
    
    
    
}

OUTPUT:

Hey Dr x, this is your block text with letters in sorted :          aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy

THE SOLUTION IN JAVASCRIPT:

<!DOCTYPE html>
<html>
 <body>

 <p>On this exercise i will sorted the String: "When not studying nuclear physics, Bambi likes to play beach volleyball." pushing the next button</p>

 <button onclick="myFunction()">Run</button>

 <p id="Sorted"></p>

 <script>

   function myFunction() {

     var str = "When not studying nuclear physics, Bambi likes to play beach volleyball.";
	 var res = str.toLowerCase();
     var finalString = res.replace(/[.,\/#!$%\^&\*;:{}=\-_`~()]/g,""); 
     finalString = finalString.split("");
     finalString = finalString.sort();
     finalString = finalString.join("");
	 
    
     document.getElementById("Sorted").innerHTML = finalString;
}
 </script>

 </body>
</html>
