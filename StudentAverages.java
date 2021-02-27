public class StudentAverages{

public static void main(String[] args){
double[][] x1 = new double[][]{{50,100,0}, {100,100, 80}}; //test case
System.out.println(arrayToString(studentAverages(x1))); //prints the array as a string
}

public static double[] studentAverages(double[][] x){ //this method takes a 2D array of integers as input, and returns a double represented as an average of the grades
  int n = x.length; //initializes a variable that will account for the length of the array x
  double[] result = new double[n]; //initializes an array that will be as long as the above variable


  for(int i = 0; i < n; i++){
    double total = 0.0; //initializes a variable that will be the sum of the grades
    for(int j = 0; j < x[i].length; j++){
      total += x[i][j]; //accumulation continuously adds the sum of each grade
      double average = total/x[i].length; //this takes the average of that sum

      result[i] = average; //this inputs the average to each index of the result array
    }
  }
  return result;
}
public static String arrayToString(double[] x) { //method imported from class, will convert the array to a string
  String result = "[";
  for (int i = 0; i < x.length - 1; i++) { // all the elements except the last one
    result += x[i] + ", ";
  }
  if (x.length > 0) { // protection from index out of bound error
    result += x[x.length - 1]; // last element
  }
  result += "]";
  return result;
}




}
