package com.company;

public class Runner {
    /*
    We were given runner code however it did not include  next player or the gameOver functionality

     */
    public static void main(String[] args) {
        TokenPass game1 = new TokenPass(6);

        while(game1.gameOver() < 0){
            game1.printBoard();
            game1.distributCurrentPlayerTokens();
            game1.nextPlayer();
        }
        game1.printBoard();
        System.out.println("Game Winnter: Player " + game1.gameOver());

    }
}
