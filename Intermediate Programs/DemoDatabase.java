
import java.sql.*;
import java.math.*;

Public class DemoDatabase(){

  public static void main(String[]args){

    CREATE DATABASE People;
    CREATE TABLE Youths(
        PersonID Varchar;
        LastName Varchar;
        FirstName Varchar;
        Address Varchar;
        City Varchar ;
    );
  }
}
