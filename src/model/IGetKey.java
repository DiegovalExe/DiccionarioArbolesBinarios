package model;

//Codigo Extraido de: https://github.com/malonso-uvg/uvg2023ed10/blob/main/10_ABB/src/IGetKey.java
public interface IGetKey<K, V> {
    K getKeyFromValue(V value);
}
