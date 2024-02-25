package yuval;

public class L25_2 {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.insert(2);
		q.insert(4);
		q.insert(4);
		q.insert(4);
		q.insert(8);
		q.insert(5);
		q.insert(8);
		System.out.println(q1(q,4));
	}
	//page 151
	public static boolean q1(Queue<Integer> q, int x) {
		q.insert(null);
		boolean b = false;
		while(q.head()!=null) {
			if(q.head()==x) {
				q.insert(q.remove());
				if(q.head()!=null)
					if(q.head()==x)
						b = true;
			}
			if(q.head()!=null)
				q.insert(q.remove());
		}
		q.remove();
		return b;
	}

}
