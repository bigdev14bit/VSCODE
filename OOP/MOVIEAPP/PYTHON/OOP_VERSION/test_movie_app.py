from movie import Movie
from movie_rating import MovieRating

class TestMovie:

    def test_movie(self):

        Movie("Koto Aye", "2000", "Yekini", "Horror")

class TestRating:
    def setUp(self):
        self.movie_rating = MovieRating()

    def test_add_movie(self):
        assert len(self.movie_rating.movies) == 0
        self.movie_rating.add_movie("Koto Aye", "2000", "Yekini", "Horror")
        assert len(self.movie_rating.movies) == 1

    def test_rate_movie(self):
        assert len(self.movie_rating.rate_movie()) == 0
        self.movie_rating.rate_movie("Koto Aye", 5)
        assert len(self.movie_rating.rate_movie()) == 1
        self.movie_rating.rate_movie("Koto Aye", 5)
        assert len(self.movie_rating.rate_movie()) == 2 
