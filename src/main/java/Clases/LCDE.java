/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 *
 * @author Usuario
 */
public class LCDE<E> implements List<E>,Iterable<E>, Serializable {
    private  Node<E> first;

    @Override
    public int size() {
        if(this.isEmpty())
            return 0;
        int cont = 1;
        Node<E> viajero= first.getNext();
        while(viajero!=first){
            cont+=1;
            viajero= viajero.getNext();
        }
        return cont;
    }

    public  Node<E> getFirst() {
        return first;
    }

    public void setFirst(Node<E> first) {
        this.first = first;
    }
    @Override
    public boolean isEmpty() {
        return  first == null;
    }

    @Override
    public boolean contains(Object o) {
        if(!this.isEmpty()){
            Node<E> viajero=first;
            for(int i=0; i<this.size(); i++){
                if(viajero.getContent().equals(o)){
                    return true;
                }
                viajero=viajero.getNext();
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
    
        Iterator<E> it= new Iterator<E>() {
            Node<E> cursor=first;
            @Override
            public boolean hasNext() {
                return cursor != null;
            }

            @Override
            public E next() {
                E e = cursor.getContent();
                if(cursor.getNext() == first){
                    cursor = null;
                }else{
                    cursor = cursor.getNext();
                }
                return e;
            }
//            int contador=0;
//            @Override
//            public boolean hasNext() {
//               return contador++!=size();  
//            }
//
//            @Override
//            public E next() {
//                E e= get(contador);
//                
//                return e;
//            }
//            
        };
                return it;
                
    }
    


   
    @Override
    public boolean add(E e) {
        if(e==null) 
            return false;
        Node<E> nodo= new Node(e);
        if(this.isEmpty()){
            first=nodo;
            first.setNext(first);
            first.setPrevious(first);
            return true;
        }
        Node<E> last = first.getPrevious();   
        nodo.setNext(first);
        nodo.setPrevious(last);
        first.setPrevious(nodo);
        last.setNext(nodo);
        return true;
    }
    
    public E obtenerSiguiente(E e){
        
        return get_Nodo_(e).getNext().getContent();
    }
    
    
    public E obtenerPrevio(E e){
        
        return get_Nodo_(e).getPrevious().getContent();
    }

    @Override
     public String toString() {
        
        String result = "{";
        Node<E> viajero= first.getNext();
        result+= first.getContent()+", ";
        for (viajero=first.getNext();  viajero!=first; viajero=viajero.getNext()) {
            result+= viajero.getContent()+", ";
        }
        
        return result + "}";
    }
       
    
    @Override
    public boolean remove(Object o) {
        if(this.isEmpty() || o==null)
            return false;
        Node<E> viajero = this.first;
        for (int i=0; i<this.size(); i++){
            if(viajero.getContent().equals(o)){
                if(viajero.equals(first)&& this.size()==1){
                    this.clear();
                    return true;                   
                }
                viajero.getPrevious().setNext(viajero.getNext());
                viajero.getNext().setPrevious(viajero.getPrevious());
                if(viajero.equals(first)){
                    first=viajero.getNext();
                }
                return true;
            }
            viajero=viajero.getNext();
        }
        return false;
    }



    @Override
    public void clear() {
        first=null;
    }

   @Override
    public E get(int index) {
        if (!isEmpty()) {
            if (index >= 0 && index < size()+1) {
                Node<E> viajero = first;
                for (int i = 1; i < index; i++) {
                    viajero = viajero.getNext();
                }
                return viajero.getContent();
            } 
        }
        return null;
    }
    
    public E getCopy(E e){
        if (!isEmpty()) {
            Node<E> viajero = first;
            for (int i =0; i < this.size(); i++) {
                viajero = viajero.getNext();
                if(viajero.getContent().equals(e))
                    return viajero.getContent();
            }
        } 
        return null;
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
     private Node<E> get_Nodo_(E e) {
        if (!isEmpty()&& e!=null) {
                Node<E> viajero = first;
                for(int i = 0; i < size(); i++) {
                    if(viajero.getContent().equals(e)){
                        return viajero;
                    }
                    viajero = viajero.getNext();
                }     
        }
        return first;
    }

   


     


    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Spliterator<E> spliterator() {
        return List.super.spliterator(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return List.super.toArray(generator); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return List.super.removeIf(filter); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Stream<E> stream() {
        return List.super.stream(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Stream<E> parallelStream() {
        return List.super.parallelStream(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        List.super.replaceAll(operator); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void sort(Comparator<? super E> c) {
        List.super.sort(c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
