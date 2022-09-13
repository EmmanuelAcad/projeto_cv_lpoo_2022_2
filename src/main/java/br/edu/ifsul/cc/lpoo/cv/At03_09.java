/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv;

/**
 *
 * @author Ws
 */
public class At03_09 {

    public At03_09(String texto) {
        
    }
    
    /* java.lang.object é classe pai de todas as outras classes, por isso, todas as classes
    herdam os métodos dessa classe. Não é preciso importar essa classe pois ela sempre é
    importada para todas as classes.
    Nesse caso, At03_09 é uma classe filha de java.lang.object e a seguir serão usados
    métodos de java.lang.object pois essa classe os herdou.
    
    java.lang.class é outra classe padrão, que funciona como interface para as classes,
    é construida automaticamente ao se declarar uma classe.
    Também serão usados métodos de java.lang.class a seguir.
    */
    
    public static void main(String[] Args) {
        
        At03_09 obj_1 = new At03_09("abc");
        
        At03_09 obj_2 = new At03_09("abc");
        
        /* Ao se usar system.out.prinln ou comandos similares, é automaticamente realizado
        o método toString. O resultado retorna informações do objeto em forma de string,
        é recomendado que se sobreponha essa classe para filtrar o resultado.
        O retorno padrão desse método é
        
        return getClass().getName() + "@"
              + Integer.toHexString(hashCode());
        
        Por isso o retorno não será abc, mas sim, a classe do objeto, nome, @, e código hash.
        
        getClass é um método de java.lang.object
        getName é um método de java.lang.class
        */
        
        System.out.println(obj_1);
        
        /* O método equals retorna true se os objetos forem iguais e false se forem diferentes,
        nesse caso, os objetos são ponteiros, por isso o resultado de equals será false,
        pois apontam para locais diferentes, para comparar o valor armazenado no local apontado
        seria necessário sobrepor o método.
        
        Esse é um método de java.lang.object
        */
        
        System.out.println(obj_1.equals(obj_2));
        
        /* O operador instanceof verifica se um objeto pertence a uma classe
        nesse caso obj_1 pertence a classe At03_09, que é filha da super classe Object de java.lang.object
        por isso o operador retorna verdadeiro para as duas comparações.
        */
        
        System.out.println(obj_1 instanceof Object);
        System.out.println(obj_1 instanceof At03_09);
        
        /* JPA é uma especificação que descreve como os projetos java devem ser escritos
        para serem implementados em um banco de dados. Para usar o JPA são usados artefatos
        de javax.persistence
        JPA funciona com mapeamento objeto relacional onde as classes, atributos e objetos
        do java são, respectivamente, tabela, coluna e registro no banco de dados.
        O JPA disponibiliza anotações como Table, Column e Id para permitir que os frameworks
        possam reconhecer e transformar nosso projeto java em um banco de dados.
        A principal vantagem de usar JPA é que pode-se transformar um mesmo projeto java
        em diferentes tipos de banco de dados sem precisar mudar o código.
        */
    }
}
