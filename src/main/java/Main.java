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
		//System.out.println(q1(q,4));
		
		Queue<Time> t = new Queue<Time>();
		Time m = new Time(1,40,20);
		t.insert(m);
		m = new Time(2,30,1);
		t.insert(m);
		m = new Time(5,50,10);
		t.insert(m);
		System.out.println(q2a(t));
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
	
	public static Time q2a(Queue<Time> q) {
		q.insert(null);
		boolean b = false;
		Time f = q.head();
		q.insert(q.remove());
		Time l = q.head();
		while(b!=true) {
			q.insert(q.remove());
			if(q.head()!=f) {
				l = q.head();
				q.insert(q.remove());
			}
			else
				b = true;
		}
		int s, m, h;
		if(l.getSecond()-f.getSecond()<0) {
			s = 60+(l.getSecond()-f.getSecond());
			m = -1;
			if(l.getMinute()-f.getMinute()<0) {
				m+=60+(l.getMinute()-f.getMinute());
				h = (l.getHour()-f.getHour())-1;
			}
			else {
				m += l.getMinute()-f.getMinute();
				h = (l.getHour()-f.getHour())-1;
			}
		}
		else {
			s = l.getSecond()-f.getSecond();
			if(l.getMinute()-f.getMinute()<0) {
				m = 60+(l.getMinute()-f.getMinute());
				h = (l.getHour()-f.getHour())-1;
			}
			else {
				m = l.getMinute()-f.getMinute();
				h = (l.getHour()-f.getHour())-1;
			}
		}
		Time d = new Time(h , m , s);
		return d;
	}
	
	public static void q2b(Queue<Time> q) {
		q.insert(null);
		int s, m, h;
		
	}

		public static <T> Queue<T> q3(Queue<T> q){
		int c = 1;
		q.insert(null);
		while(q.head()!=null) {
			T x = q.head();
			q.insert(q.remove());
			while(q.head()!=null) {
				if(q.head()==x)
					q.remove();
				if(q.head()!=null)
					q.insert(q.remove());
			}
			q.insert(q.remove());
			for (int i = 0; i < c; i++) {
				q.insert(q.remove());
			}
			c++;
		}
		q.remove();
		return q;
	}

}
