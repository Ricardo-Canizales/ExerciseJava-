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
