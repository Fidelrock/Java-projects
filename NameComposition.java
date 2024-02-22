//Composition example
public class NameComposition{

protected String first; //E.g, "William"
protected String middle; //E.g, "Jefferson"
protected String last; // E.g , "Clinton"

public name(){//default constractor
}
public name(String first, String last){
    this.first= first;
    this.last = last;

}
public name(String first,String middle,String last){

    this(first,last);
    this.middle =middle;
}
public String getfirst(){
    return first;
}
public String getmiddle(){
    return middle;

}
public String getlast(){
    return last;
}
public void setfirst(String first){
    this.first =first;
}
public void setmiddle(String middle){
    this.middle = middle;
}

public void setlast(String last){
    this.last = last;
}

public String toString(){

    String s=new String();
    if(first != null) s += first +" ";
    if(middle != null) s += middle+ " ";
    if(last != null) s += last + " ";

    return s.trim();
}

}