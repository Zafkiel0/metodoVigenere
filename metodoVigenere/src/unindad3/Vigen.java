package unindad3;

public class Vigen {
    /*Declarar el abecedario  */
    public static String abecedario="abcdefghijklmnñopqrstuvwxyz";
    /*Declarar texto y declarar clave */
    public static String texto;
    public static String clave;
   /*Constructor pide clave y texto */
    public Vigen (String texto,String clave){
        this.texto=texto;

        this.clave=claDe(clave); 

    }

    public static String encriptarText(){
        String textencriptar="";
        String textoTr=texto.toLowerCase();

        for (int i=0,cont=0;i<texto.length();i++,cont=(cont+1)%clave.length()){
            if(abecedario.indexOf(textoTr.charAt(i))!=-1){
                int temporal=(abecedario.indexOf(textoTr.charAt(i))+
                abecedario.indexOf(clave.charAt(cont)))%abecedario.length();
            
                textencriptar+=(abecedario.indexOf(texto.charAt(i))!=-1)?
                abecedario.charAt(temporal):String.valueOf(abecedario.charAt(temporal)).toUpperCase();

            }else{
                cont-=1;
                textencriptar+=texto.charAt(i);
            }
           

        }
        return textencriptar;
    }

    public static String desencriptar(){
        String desencriptarText="";
        String textTrans=texto.toLowerCase();
        for (int i=0,cont=0;i<textTrans.length();i++,cont=(cont+1)
        %clave.length()){
            if(abecedario.indexOf(textTrans.charAt(i))!=-1){
                int temporal=(abecedario.indexOf(textTrans.charAt(i))-abecedario.indexOf(clave.charAt(cont)));
                temporal=(temporal<0)?(temporal+abecedario.length()):temporal;
                desencriptarText+=(abecedario.indexOf(texto.charAt(i))!=-1)?abecedario.charAt(temporal):String.valueOf(abecedario.charAt(temporal)).toUpperCase();
            }else{
                cont=-1;
                desencriptarText+=texto.charAt(i);
            }
        }
        return desencriptarText;
    }

    public static String claDe(String clave){
        String resultText="";
        for(int i=0;i<clave.length();i++){
            if((abecedario.indexOf(clave.charAt(i))!=-1)||(abecedario.indexOf(String.valueOf(abecedario.charAt(i)).toLowerCase())!=-1))
            resultText+=clave.charAt(i);

        }
        return resultText;
    }
}
