
class Box
{
    double height;
    double width;
    double depth;
    
    Box(Box b)
    {
    	height=b.height;
    	width=b.width;
    	depth=b.depth;
    }
    Box(double h, double w, double d)
    {
        height=h;
        width=w;
        depth=d;
    }
    
    Box()
    {
        height=-1;
        width=-1;
        depth=-1;
    }
    Box(double len)
    { height=width=depth=len;
        
    }
    double volume()
    {
        return height*width*depth;
    }
}