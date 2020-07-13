## Use an if statement to set a condition for executing some instructions. 

For example, if the user rolls the lucky number, print a winning message.
The Boolean data type has values of true and false and can be used for decision making.
Compare values using operators such as greater than (>), less than (<), and equal to (==).
Use a chain of else if statements to set multiple conditions. For example, print a different message for each possible dice roll.
Use an else statement at the end of a chain of conditions to catch any cases that may not be covered explicitly. 
If you cover the cases for 6-sided dice, an else statement would catch the 7 and 8 numbers rolled with an 8-sided dice.
Use a when statement as a compact form of executing code based on comparing a value.
General form of if-else:

### if-else-if statement

  if (condition-is-true) {
  
  execute-this-code
  
  } else if (condition-is-true) {
  
  execute-this-code
  
  } else {
  
  execute-this-code
  
  }
  

### When statement:

  when (variable) {
  
  matches-value -> execute-this-code
  
  matches-value -> execute-this-code
  
  ...
  
  }
