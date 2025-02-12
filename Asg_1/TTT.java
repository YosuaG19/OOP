package Asg_1;
import java.util.*;
public class TTT {
    char Board[][]={
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}
    };
        
    Scanner sc = new Scanner(System.in);
    int count = 0;
    Boolean win = false;

    void p_board(){
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(Board[i][j]);
                System.out.print(" ");
            }
            System.err.println("");
        }
    }

    void Player(int turn){
        System.out.print("Player " + turn + ": ");
        int p2r = sc.nextInt(), p2c = sc.nextInt();
        if(Board[p2c][p2r] == 'X' || Board[p2c][p2r] == 'O' ){
            System.out.println("Already taken");
            Player(turn);
        }else {
            Board[p2c][p2r] = turn == 1 ? 'O' : 'X';
            p_board();
        }
    }

    boolean validation(){
        Boolean win = false;
        if (Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2] && Board[0][0] != '-') win = true;
        if (Board[0][0]==Board[0][1] && Board[0][1]==Board[0][2] && Board[0][0] != '-') win = true;
        if (Board[0][0]==Board[1][0] && Board[1][0]==Board[2][0] && Board[0][0] != '-') win = true;
        if (Board[0][1]==Board[1][1] && Board[1][1]==Board[2][1] && Board[0][1] != '-') win = true;
        if (Board[0][2]==Board[1][2] && Board[1][2]==Board[2][2] && Board[0][2] != '-') win = true;
        if (Board[0][2]==Board[1][1] && Board[1][1]==Board[2][0] && Board[0][2] != '-') win = true;
        if (Board[1][0]==Board[1][1] && Board[1][1]==Board[1][2] && Board[1][0] != '-') win = true;
        if (Board[2][0]==Board[2][1] && Board[2][1]==Board[2][2] && Board[2][0] != '-') win = true;

        return win;
    }
    
    void Logic() {
        p_board();
        do {
            int turn = count % 2 + 1;
            Player(turn);
            win = validation();
            if (win) {
                System.out.println("Player "+ turn +" Win");
                return;
            }
            count ++;
            if (count == 9) System.out.println("It's a TIE");
        } while (!win && count != 9);
    }
}
