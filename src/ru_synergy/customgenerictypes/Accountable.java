package ru_synergy.customgenerictypes;

public interface Accountable <T> {
    T getId();
    void setId(T id);
    int getSum();
    void setSum(int sum);
}
