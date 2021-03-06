package fr.isep;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MatrixCalculator extends Remote {
    double[][] multiplication(double[][] firstMatrix, double[][] secondMatrix) throws RemoteException;
    String showMatrix(double[][] matrix) throws RemoteException;
}
