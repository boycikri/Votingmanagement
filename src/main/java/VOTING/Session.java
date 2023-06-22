/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VOTING;

/**
 *
 * @author 62813
 */
public class Session {
    private static String data;
    private static int id_user;
    private static int id_kandidat;
    
   public static void setData(String dataUser){
        Session.data = dataUser;
    }
    public static String getData(){
        return data;
    }

public static void setid(int id){
        Session.id_user = id;
    }
    public static int getid (){
        return id_user;
    }

public static void setid_kandidat(int id_kandidat){
        Session.id_kandidat = id_kandidat;
    }
    public static int getid_kandidat (){
        return id_kandidat;
    }
}

