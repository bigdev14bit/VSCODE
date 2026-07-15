board = [["1", "2", "3"], ["4", "5", "6"], ["7", "8", "9"]]

def display_board():
        for item in board:
            for items in item:
                print(items, end=" | ")
            print()
            print("-" * 12)

display_board()
