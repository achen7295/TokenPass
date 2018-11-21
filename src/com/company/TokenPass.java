package com.company;

public class TokenPass {
    private int[] board;
    private int currentplayer;

    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            board[i] = 1 + (int) (10 * Math.random());
        }
    }

    public void distributeCurrentPlayerTokens()
    {
            int nextPlayer = currentplayer;
            int numToDistribute = board[currentplayer];
            board[currentplayer] = 0;

            while (numToDistribute > 0){
                nextPlayer = (nextPlayer + 1) % board.length;
                board[nextPlayer]++;
                numToDistribute--;
        }
    }
}
