class Game:
    def __init__(self):
        self.board = Board()
        self.player_one = None
        self.player_two = None
        self.current_player = None

    def welcome(self):
        welcome = """
TIC   TAC   TOE

Welcome To TicTacToe

Player 1 would play 'X'
Player 2 would play 'O'
        """
        print(welcome)

    def switch_players(self):
        if self.current_player == self.player_one:
            self.current_player == self.player_one
        else:
            self.current_player == self.player_one

    def check_winner(self):
        starting_board = self.board.board

        #for rows
        for row in starting_board:
            if row[0] == row[0] == row[2] != " ":
                return True

        #for column
        for column in range(3):
            if starting_board[0][column] == starting_board[1][column] == starting_board[2][column] != " ":
                return True

        #for diagonal
        if starting_board[0][0] == starting_board[1][1] == starting_board[2][2] != " ":
            return True

        #other diagonal
        if starting_board[0][2]

    def start(self):
        self.welcome()

        playerOne = input("Player 1, Enter Your Name: ")
        playerTwo = input("Player 2, Enter Your Name: ")

        self.player_one = Player(playerOne, "X")
        self.player_two = Player(playerTwo, "O")

        self.current_player = self.player_one

        while True:
            self.board.display()
            self.play_turn()
            self.switch_players()
