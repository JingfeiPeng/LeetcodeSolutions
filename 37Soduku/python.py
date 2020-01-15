class Solution(object):
    def solveSudoku(self, board):
        solver(board)
    
    def solver(board):
        for i in range(9):
            for j in range(9):
                if (board[i][j] == '.'):
                    count = '1'
                    while (count <= '9'):
                        if (isValid(i,j,board, count)):
                            print("ok")
    
    def isValid(row, col, board, c):
        for i in range(9):
            if board[row][i] == c:
                return False
            
        for i in range(9):
            if board[i][col] == c:
                return False
            
        int startRow = int(row/3)*3
        int startCol = int(col/3)*3
        
        for i in range(3):
            for j in range(3):
                if (board[startRow+i][startCol+j] == c):
                    return False
        
        return True
            