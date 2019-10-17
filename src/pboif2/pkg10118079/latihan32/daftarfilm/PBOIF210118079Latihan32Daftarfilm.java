/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118079.latihan32.daftarfilm;

/**
 *
 * @author user
 */
public class PBOIF210118079Latihan32Daftarfilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Film n = new Film();
        n.nama="Venom";
        n.genre="Action , Horor ,Scifi";
        n.rating=8.5;
        n.duration=120;
        n.nowPlaying(n.nama,n.genre,n.rating,n.duration) ;
        
        Film n2 = new Film();
        n2.nama="Small Foot";
        n2.genre="Animation";
        n2.rating=9.0;
        n2.duration=96;
        n2.nowPlaying(n2.nama,n2.genre,n2.rating,n2.duration) ;
        
        Film n3 = new Film();
        n3.nama="Crazy Rich Asian";
        n3.genre="Comedy";
        n3.rating=7.8;
        n3.duration=119;
        n3.nowPlaying(n3.nama,n3.genre,n3.rating,n3.duration) ;
        
        Film n4 = new Film();
        n4.nama="Asih";
        n4.genre=" Horor ";
        n4.rating=6.0;
        n4.duration=100;
        n4.nowPlaying(n4.nama,n4.genre,n4.rating,n4.duration) ;
    
    }
    
}
