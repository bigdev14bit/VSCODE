class Board:
    def __init__(self):
        self.board = [[" ", " ", " "], [" ", " ", " "], [" ", " ", " "]]

    def display_board(self):
        for item in self.board:
            for items in item:
                print(items, end=" | ")
            print()
            print("-" * 12)

    def place_symbol(self, row, column, symbol):
        SYMBOL = "XO"
        self.board[row][column] = symbol

    def is_empty(self, row, column):
        if self.board[row][column] = " ":
            return True
        else:
            return False
