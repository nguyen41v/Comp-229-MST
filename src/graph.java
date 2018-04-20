import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class graph
{
	int dim;
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
		HashMap<person, HashMap<person, route>> tempmatrix = deepcloneHM( matrix );
		// set of unknown persons from original matrix
		Set<person> unknown = tempmatrix.keySet();
		// empty set of known persons
		Set<person> known = new HashSet<person>();
		
		// YOUR CODE HERE!!!
		// REMEMBER TO STORE YOUR ANSWER IN "result"

	}

	// creates a deep copy of a HashMap<person, HashMap<person, route>> matrix
	public static <k1, k2, v> HashMap<k1, HashMap<k2, v>> deepcloneHM( HashMap<k1, HashMap<k2, v>> input )
	{
		HashMap<k1, HashMap<k2, v>> copy = new HashMap<k1, HashMap<k2, v>>();
		for ( Map.Entry<k1, HashMap<k2, v>> E : input.entrySet() )
		{
			copy.put( E.getKey(), new HashMap<k2, v>( E.getValue() ) );
		}

		return copy;
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
}
