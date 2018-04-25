import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* FIXME Delete this line to use incomplete new graph file
public class graph
{
	static int dim;
	HashMap<person, HashMap<person, route>> matrix;

	// STORE YOUR ANSWER HERE IN "result"
	HashMap<person, HashMap<person, route>> result;

	graph( int dim )
	{
		matrix = new HashMap<person, HashMap<person, route>>( dim );
		result = new HashMap<person, HashMap<person, route>>( dim );
	}

	// inserts unique vertex
	// vertex = person (x coordinate, y coordinate, fare price)
	public boolean insertvertex( person p )
	{
		if ( !matrix.containsKey( p ) )
		{
			matrix.put( p, new HashMap<person, route>( dim ) );

			if ( !result.containsKey( p ) )
			{
				// setting result row as well
				result.put( p, new HashMap<person, route>( dim ) );
			}

			return true;
		}
		else
		{
			System.out.println( "Already inserted " + p );
			return false;
		}
	}

	// this method creates the actual graph (matrix variable) by setting edges/routes
	// assumes all vertices have been inserted already
	// generates an edge from each vertex, to every other vertex
	// edges are undirected, weighted with distance between two vertices
	public void generateroutes()
	{
		for ( person row : matrix.keySet() )
		{
			for ( person column : matrix.keySet() )
			{
				// create route for each possible pair of vertices in this row
				matrix.get(row).put( column, new route( row.xpos, row.ypos, column.xpos, column.ypos ) );
				matrix.get(column).put( row, new route( column.xpos, column.ypos, row.xpos, row.ypos ) );
			}
		}
	}

	// finds the minimum spanning tree
	// stores answer in "result" (a member field of graph)
	// use Prim's algorithm
	public void mst( person start )
	{
		// deep copy of original matrix
		HashMap<person, HashMap<person, route>> tempmatrix = generateUnknown();
		// set of unknown persons from original matrix
		Set<person> unknown = tempmatrix.keySet();
		// empty set of known persons
		Set<person> known = new HashSet<person>();

		person current = start;  // the newest known vertex
		person leastvertex = null;  // smallest unknown weight seen in an iteration
		tempmatrix.get( current ).get( current ).setDistance( 0.0 );  // setting starting point distance to 0
		while ( !unknown.isEmpty() )
		{
			// in case you need this: Double.MAX_VALUE is the maximum value of a double defined in Java, use this instead of the usual "999" we usually use

			// NOTE: result should store 1 set of routes, storing dual results will be INCORRECT
			// i.e. either the upper triangle or the lower triangle of the result matrix should be filled

			// YOUR CODE HERE!!!

			// add current to known set
			// remove current from unknown set
			// iterate through known->unknown edges
				// update unknown edge distances with lesser distances
				// check whether new unknown distance is the smallest seen so far
			// check whether a leastvertex was found, then update result
				// set current to the newest unknown/leastvertex

		}
	}

	// NOT NEEDED, but can help with debugging
	// creates a deep copy of a HashMap<person, HashMap<person, route>> matrix
	public HashMap<person, HashMap<person, route>> deepcloneHM( HashMap<person, HashMap<person, route>> input )
	{
		HashMap<person, HashMap<person, route>> copy = new HashMap<person, HashMap<person, route>>();
		for ( Map.Entry<person, HashMap<person, route>> E : input.entrySet() )
		{
			copy.put( E.getKey(), new HashMap<person, route>( dim ) );


			for ( Map.Entry<person, route> F : (E.getValue()).entrySet() )
			{
				// copy constructor of route used here
				copy.get( E.getKey() ).put( F.getKey(), new route( F.getValue() ) );
			}
		}

		return copy;
	}

	// creates initial "unknown" matrix
	// sets ALL route.distance to Double.MAX_VALUE
	// remember to set starting route.distance to 0
	public HashMap<person, HashMap<person, route>> generateUnknown()
	{
		HashMap<person, HashMap<person, route>> temp = new HashMap<person, HashMap<person, route>>( dim );
		for ( person row : matrix.keySet() )
		{
			temp.put( row, new HashMap<person, route>( dim ) );
		}

		for ( person row : matrix.keySet() )
		{
			for ( person column : matrix.keySet() )
			{
				// create route for each possible pair of vertices in this row
				temp.get(row).put( column, new route( Double.MAX_VALUE ) );
				temp.get(column).put( row, new route( Double.MAX_VALUE ) );
			}
		}

		return temp;
	}

	// prints "result"
	public void printresult()
	{
		double totalweight = 0.0;
		System.out.println( "SOLUTION:" );
		for ( person p : result.keySet() )
		{
			for ( person j : result.get(p).keySet() )
			{
				System.out.println( "s " + p.xpos + ", " + p.ypos );
				System.out.println( "d " + j.xpos + ", " + j.ypos );
				System.out.println( "l " + result.get(p).get(j).distance );
				totalweight += result.get(p).get(j).distance;
			}
		}

		System.out.println( "t " + totalweight );
	}

	// use this to help with debugging
	// prints a HashMap matrix (any matrix passed to this method)
	public void print( HashMap<person, HashMap<person, route>> in )
	{
		double totalweight = 0.0;
		for ( person p : in.keySet() )
		{
			for ( person j : in.get(p).keySet() )
			{
				System.out.print( in.get(p).get(j).distance + " " );
				totalweight += in.get(p).get(j).distance;
			}
			System.out.print( "\n" );
		}

		System.out.println( "t " + totalweight );
	}
}
*/
