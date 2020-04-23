package gtu;

public class Win16Q_3C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceStatus rs = new ResourceStatus();
		System.out.println("ResourceStatus Matrix is : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				int c = i + j ;//0 1 2 1 2 3 2 3 4
				rs.statusRef[i][j] = Integer.parseInt(args[c]);
				System.out.print(rs.statusRef[i][j]+"\t");
			}
			System.out.println();
		}
		rs.processStatusCount();
	}
}



@SuppressWarnings("serial")
class InvalidResourceException extends Exception
{
	
	public InvalidResourceException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	
}
class ResourceStatus
{
	int statusRef[][] = new int[3][3];
	int free , occupied , inaccess ;
	 public void processStatusCount() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (statusRef[i][j] == 0) {
					free++ ;
				}else if (statusRef[i][j] == 1) {
					occupied++ ;
				}else{
					inaccess++ ;
				}
			}
		}
		System.out.print("Number of free resources = "+free+"\n");
		System.out.print("Number of occupied resources = "+occupied+"\n");
		System.out.print("Number of inaccessible resources = "+inaccess+"\n");
		
		try {
			if (occupied > free) {
				throw new InvalidResourceException("occupied resources exceeded than free");
			}
		} catch (InvalidResourceException e) {
			// TODO: handle exception
		System.out.println(e);
		
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
				 	if (statusRef[i][j] == 1) {
					statusRef[i][j] = 0;
				 	}
				}
			}
			System.out.println("Modified resource status is : ");
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
				
					System.out.print(statusRef[i][j]+"\t");
				}
				System.out.println();
			}
		}
	}
}