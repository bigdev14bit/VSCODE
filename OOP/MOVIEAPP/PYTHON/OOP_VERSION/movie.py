class Movie:
    def __init__(self, title, year, director, genre):
        self.title = title
        self.year = year
        self.director = director
        self.genre = genre

    def __repr__(self):
        return f"{self.title} {self.year} {self.director} {self.genre}"