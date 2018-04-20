public class hmk3
{
	public static void main ( String[] args )
	{
		// small test graph, comment in to test
		/*
		person t1 = new person( 9, 10, 4.25 );
		person t2 = new person( 18, 34, 12.94 );
		person t3 = new person( 29, 21, 5.08 );
		person t4 = new person( 11, 30, 18.95 );
		person t5 = new person( 38, 34, 20.44 );
		person t6 = new person( 24, 21, 16.61 );
		graph test = new graph( 6 );
		test.insertvertex( t1 );
		test.insertvertex( t2 );
		test.insertvertex( t3 );
		test.insertvertex( t4 );
		test.insertvertex( t5 );
		test.insertvertex( t6 );
		test.generateroutes();
		test.mst( t3 );
		test.printresult();
		*/
		// small test graph should print:
		/*
		SOLUTION:
		s 29, 21
		d 24, 21
		l 5.0
		s 29, 21
		d 38, 34
		l 15.811388300841896
		s 24, 21
		d 18, 34
		l 14.317821063276353
		s 24, 21
		d 9, 10
		l 18.601075237738275
		s 18, 34
		d 11, 30
		l 8.06225774829855
		t 61.792542350155074
		*/

		// larger graph, more realistic test case
		person p1 = new person( 9, 10, 4.25 );
		person p2 = new person( 18, 34, 12.94 );
		person p3 = new person( 29, 21, 5.08 );
		person p4 = new person( 11, 30, 18.95 );
		person p5 = new person( 38, 10, 0.71 );
		person p6 = new person( 16, 2, 10.41 );
		person p7 = new person( 22, 23, 13.88 );
		person p8 = new person( 39, 5, 5.19 );
		person p9 = new person( 32, 31, 20.81 );
		person p10 = new person( 39, 27, 12.12 );
		person p11 = new person( 2, 37, 3.44 );
		person p12 = new person( 14, 17, 16.98 );
		person p13 = new person( 39, 22, 5.52 );
		person p14 = new person( 30, 14, 6.21 );
		person p15 = new person( 25, 4, 19.75 );
		person p16 = new person( 38, 34, 20.44 );
		person p17 = new person( 17, 18, 8.98 );
		person p18 = new person( 18, 39, 9.67 );
		person p19 = new person( 38, 19, 10.37 );
		person p20 = new person( 27, 2, 23.91 );
		person p21 = new person( 31, 17, 24.60 );
		person p22 = new person( 4, 0, 13.14 );
		person p23 = new person( 1, 38, 13.83 );
		person p24 = new person( 33, 8, 2.37 );
		person p25 = new person( 7, 28, 3.07 );
		person p26 = new person( 24, 21, 16.61 );
		person p27 = new person( 5, 29, 17.30 );
		person p28 = new person( 12, 31, 5.84 );
		person p29 = new person( 34, 33, 6.53 );
		person p30 = new person( 37, 30, 7.92 );

		graph mygraph = new graph( 30 );

		mygraph.insertvertex( p1 );
		mygraph.insertvertex( p2 );
		mygraph.insertvertex( p3 );
		mygraph.insertvertex( p4 );
		mygraph.insertvertex( p5 );
		mygraph.insertvertex( p6 );
		mygraph.insertvertex( p7 );
		mygraph.insertvertex( p8 );
		mygraph.insertvertex( p9 );
		mygraph.insertvertex( p10 );
		mygraph.insertvertex( p11 );
		mygraph.insertvertex( p12 );
		mygraph.insertvertex( p13 );
		mygraph.insertvertex( p14 );
		mygraph.insertvertex( p15 );
		mygraph.insertvertex( p16 );
		mygraph.insertvertex( p17 );
		mygraph.insertvertex( p18 );
		mygraph.insertvertex( p19 );
		mygraph.insertvertex( p20 );
		mygraph.insertvertex( p21 );
		mygraph.insertvertex( p22 );
		mygraph.insertvertex( p23 );
		mygraph.insertvertex( p24 );
		mygraph.insertvertex( p25 );
		mygraph.insertvertex( p26 );
		mygraph.insertvertex( p27 );
		mygraph.insertvertex( p28 );
		mygraph.insertvertex( p29 );
		mygraph.insertvertex( p30 );

		mygraph.generateroutes();
		mygraph.mst( p12 );
		mygraph.printresult();
	}
}
