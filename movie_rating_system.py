storage = []
rating = []
movie = {}

def movie_rating_system():
    def welcome_screen(menu):
        menu = """
1. Add A Movie.
2. Rate A Movie.
3. Get Average Rating For A Movie.
4. View Average Rating For All Movie.
5. Exit.
"""
        print(menu)
    welcome_screen()

    def exit():
        print("Exit Successfully.")
    exit()

    def add_movie():
        print("=" * 60)
        print("Add Movie.")
        print("=" * 60)
        print()

        title = input("Enter Movie Title: ")
        director = input("Enter Director's Name: ")
        genre = input("Enter Movie Genre: ")
        duration = input("Enter Movie Duration: ")

        movie["title"] = title
        movie["director"] = director
        movie["genre"] = genre
        movie["duration"] = duration
        storage.append(movie)
        print(movie)
    add_movie()

    def rate_movie():
        print("=" * 60)
        print("Rate A Movie.")
        print("=" * 60)
        print()

        for movies in storage:
            print([movies])
            print()
            print(f"There are {len(storage)} Movies You Can Rate.")
            option = int(input("Enter Number Of Movie To Rate: "))
            chosen = option - 1
            clean_chosen = str(chosen)
            print(f"{clean_chosen["title"]}")
    rate_movie()

    def get_average_rating_for_each_movie():
        print("=" * 60)
        print("Get Average Rating For Each Movie.")
        print("=" * 60)
        print()
    get_average_rating_for_each_movie()
movie_rating_system()

#----------------------------------------------------------------------------------
# ----------MAIN----------
#----------------------------------------------------------------------------------
while True:
    userInput = input("Enter An Option: ")

    if userInput == "5":
        movie_rating_system.exit()
        break
    elif userInput == "1":
        movie_rating_system.add_movie()
    elif userInput == "2":
        movie_rating_system.rate_movie()
    elif userInput == "3":
        movie_rating_system.get_average_rating_for_each_movie()
    elif userInput == "4":
        movie_rating_system.get_average_rating_for_all_movie()
#-------------------------------------------------------------------------------------
