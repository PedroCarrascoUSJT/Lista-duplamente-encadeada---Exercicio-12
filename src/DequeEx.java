class DequeEx {

    class Nodo
    {
       public Object data;
       public Nodo linke,linkd; 
    }
 
 
     Nodo ini,fim;
     
     DequeEx(){
         ini = null;
         fim = null;
     }
     
     void incIni(Object objeto){
        Nodo nodo = new Nodo();
        nodo.data = objeto;
        if(ini == null)
        {
            fim = nodo;
            ini = nodo;
        }
        else
        {
            nodo.linkd = ini;
            ini = nodo;
        }
     }
     
     void incFim(Object objeto){
        Nodo nodo = new Nodo();
        nodo.data = objeto;

        if(fim == null)
        {
            nodo.linkd = null;
            ini = nodo;
        }
        else{
            nodo.linkd = null;
            nodo.linke = fim;
            fim.linkd = nodo;
            fim = nodo;
        }

        fim = nodo;
     }
     
     Object retIni(){  
        Object aux1 = ini.data;
        ini = ini.linkd;
        ini.linke = null;
        return aux1;
     }		 
 
     Object retFim(){
        Object aux1 = fim.data;
        fim = fim.linke;
        fim.linkd = null;
        return aux1;
     }		 
 
     public String toString(){
         Nodo aux = ini;
         String s = "[ "; 
         while(aux!=null){
             s += aux.data + " ";
             aux = aux.linkd;
         }	
         s += "]";
         return s;
     }		  
 
     public static void main(String args[]){
         
         DequeEx d1 = new DequeEx();
 
         System.out.println("Incluindo no Inicio A, B, C, D, E, F...");
         d1.incIni('A');
         d1.incIni('B');
         d1.incIni('C');
         d1.incIni('D');
         d1.incIni('E');
         d1.incIni('F');
 
         System.out.println(d1);
 
         System.out.println("Incluindo no Final 1, 2, 3, 4, 5, 6...");
         d1.incFim(1);
         d1.incFim(2);
         d1.incFim(3);
         d1.incFim(4);
         d1.incFim(5);
         d1.incFim(6);
         
         System.out.println(d1);
         
         System.out.println("retirando do inicio: "+d1.retIni());
         System.out.println(d1);
         
         System.out.println("retirando do final: "+d1.retFim());
         System.out.println(d1);
         
         System.out.println("retirando do inicio: "+d1.retIni());
         System.out.println(d1);
         
         System.out.println("retirando do final: "+d1.retFim());
         System.out.println(d1);
 
     }
 
 }	