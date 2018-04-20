import java.lang.*;

// an edge between 2 "person" objects
public class route
{
	double distance;

	route( double d )
	{
		distance = d;
	}

	route( int x1, int y1, int x2, int y2 )
	{
		double r1 = Math.pow((double)x1-(double)x2, 2);
		double r2 = Math.pow((double)y1-(double)y2, 2);
		distance = Math.sqrt( r1+ r2 );
	}
}
