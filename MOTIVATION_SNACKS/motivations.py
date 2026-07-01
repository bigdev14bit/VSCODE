def motivation_snacks():

   def count_vowel():
      vowel = "aeiou"

      result_vowel = []
      result_conso = []

      userInput = input("Enter Something?: ")
      cleanInput = userInput.lower()

      for words in cleanInput:
          if words in vowel:
             result_vowel.append(words)
          else:
             result_conso.append(words)

      countOne = len(result_vowel)
      countTwo = len(result_conso)

      print([countOne, countTwo])
   count_vowel()

   def is_space():
      userInput = input("Enter Something?: ")
      cleanInput = userInput.lower()

      if " " in cleanInput:
         print("True")
      else:
         print("False")
   is_space()
motivation_snacks()
