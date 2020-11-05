package exam.test1;

/**
 What can be inserted at //1 and //2?
 1) return a(x)*b(y); 
    and 
    matrix(x, y) = compute(x, y);
 2) return a[x]*b[y]; 
    and  
    matrix[x, y] = compute(x, y);   
 3) return a[x]*b[y]; 
    and 
    matrix[x][y] = compute(x, y);
 4) return a(x)*b(y); 
    and 
    matrix(x)(y) = compute(x, y);
 5) return a[x]*b[y]; 
    and 
    matrix[[x][y]] = compute(x, y);         
 */
public class TestClass14 {
	int[][] matrix = new int[2][3];

	int a[] = { 1, 2, 3 };
	int b[] = { 4, 5, 6 };

	public int compute(int x, int y) {
		// 1 : Insert Line of Code here
		return 0; // fake return for compilation
	}

	public void loadMatrix() {
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				// 2: Insert Line of Code here
			}
		}
	}
}
