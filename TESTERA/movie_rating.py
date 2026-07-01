print("Welcom To A Movie Rating System")
print()

storage = []

menu = """
1. Add A Movie.
2. Rate A Movie.
3. Get Average Rating For A Movie.
4. View Average Rating For All Movie.
5. Exit.
"""

print(menu)
print()

while True:
   print()
   userInput = input("Enter Option: ")

   if userInput == "5":
       print()
       print("Exit Successfully.")
       break
   
   elif userInput == "1":
       print("=" * 60)
       print("Add Movie.")
       print("=" * 60)
       print()

       title = input("Enter Movie Title: ")
       director = input("Enter Director's Name: ")
       genre = input("Enter Movie Genre: ")
       duration = input("Enter Movie Duration: ")

       movie = {"title": title,
              "director": director,
              "genre": genre,
              "duration": duration,
              "rating": []}
       storage.append(movie)
       print(f"Successfully Added: ''{movie["title"]}''")

   elif userInput == "2":
       print("=" * 60)
       print("Rate A Movie.")
       print("=" * 60)
       print()
       count = 1

       if len(storage) == 0:
           print("No Movie In The System.")
       else:
           print("=" * 70)
           for books in storage:
               print(f"Movie--{count}. \nTitle: ''{books["title"]}''.\n")
               count = count + 1
           print("=" * 70)

           print()
           choice = int(input("Enter Movie Number To Rate: "))
           chosen_choice = choice - 1
           if chosen_choice > 0 and chosen_choice <= len(storage):
               selected_movie = storage[chosen_choice]

               print(f"Title: ''{selected_movie["title"]}''")
               print()
               selected = input(f"Enter Rating For ''{selected_movie["title"]}'': ")

   elif userInput == "3":
       print("=" * 60)
       print("Get Average Rating For Each Movie.")
       print("=" * 60)
       print()

   elif userInput == "4":
       print("=" * 60)

   else:
       print("Invalid Input.")


