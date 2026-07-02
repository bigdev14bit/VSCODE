from movie import Movie

class MovieRating:
    def __init__(self):
        self.movies = []

    def add_movie(self, title, year, director, genre):
        mov = Movie(title, year, director, genre)
        self.movies.append(mov)

    def get_movie(self):
        return self.movies
    
    def rate_movie(self, title: str, rating: int) -> None:

        if 0 > rating > 5:
            raise ValueError("Rating Must Be Between 0 and 5.")
        for movie in self.movies:
            if movie.title == title.lower():
                movie.rating.append(rating)