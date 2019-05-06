package br.pro.hashi.ensino.desagil.desafio.model;




public class HumanPlayer extends Player {
    private CpuPlayer cpuPlayer;
    private Element target;

    public HumanPlayer(int row, int col, Board board) {
        super(row, col, board);
    }


    public void moveUp() {
        if(cpuPlayer.getCol() == target.getCol() && cpuPlayer.getRow() == target.getRow()){
            move(0,0);
        }
        else {
            if (row > 0 && !board.isWall(row - 1, col)) {
                move(-1, 0);
            }
        }
    }

    public void moveRight() {
        if(cpuPlayer.getCol() == target.getCol() && cpuPlayer.getRow() == target.getRow()){
            move(0,0);
        }
        else{
            if (col < board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
                move(0, 1);
            }
        }
    }

    public void moveDown() {
        if(cpuPlayer.getCol() == target.getCol() && cpuPlayer.getRow() == target.getRow()){
            move(0,0);
        }
        else{
            if (row < board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
                move(1, 0);
            }
        }
    }

    public void moveLeft() {
        if(cpuPlayer.getCol() == target.getCol() && cpuPlayer.getRow() == target.getRow()){
            move(0,0);
        }
        else{
            if (col > 0 && !board.isWall(row, col - 1)) {
                move(0, -1);
            }
        }
    }
}
