package br.com.machinelearning_weka;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 * Classe principal para de execucao do algoritmo
 * de aprendizado de maquina supervisionado Naive Bayes do Weka
 *
 */
public class Principal 
{
    public static void main( String[] args ) throws Exception
    {
    	// Importa o dataset do arquivo fornecido
        DataSource ds = new DataSource("emprestimo.arff");
        Instances instances = ds.getDataSet(); 
        
        // Indicando qual coluna esta a classe (valor previsto pelo algoritmo)
        instances.setClassIndex(4);
        
        // Instanciando o objeto do algoritmo classificador
        NaiveBayes nb = new NaiveBayes();
        
        // Passando as instancias para o classificador
        nb.buildClassifier(instances);
        
        // Criando uma nova instancia
        Instance novo = new DenseInstance(5);
        novo.setDataset(instances);
        novo.setValue(0, ">=51");
        novo.setValue(1, "baixa");
        novo.setValue(2, "ruim");
        novo.setValue(3, "0-2000");
        
        double probabilidade[] = nb.distributionForInstance(novo);
        // Respeitando a ordem definida no arquivo
        System.out.println("Sim: " + probabilidade[1]);
        System.out.println("Nao: " + probabilidade[0]);
        
    }
}
