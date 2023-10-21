package q1.extract_method.refactored;

import java.util.List;

//import p5.extract_method_typeparameterize.refactored.Graph;

class Graph{
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      // other implementation
	  myFunction(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      // other implementation
	  myFunction(edgeList, p);
      return null;
   }

   // TODO: Your answer
   <T extends Graph> void myFunction(List<T> objs, String p) {
	   for(T obj: objs) {
		   if(obj.contains(p)) {
			   System.out.println(obj);
		   }
	   }
   }
}

class Node extends Graph{
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Graph{
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}