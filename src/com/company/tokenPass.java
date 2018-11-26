package com.company;

public class tokenPass {
    private int[] board;
    private int currentPlayer;
    public void TokenPass(int playerCount){
        board = new int[playerCount];
        for(int i = 0; i < playerCount; i++){
            board[i] = 1 + (int) (10 * Math.random());
        }

    }
    public void distributeCurrentPlayerTokens(){
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;

        while(numToDistribute > 0){
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

}
