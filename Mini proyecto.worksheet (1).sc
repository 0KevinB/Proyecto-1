// Simpson 1/3
def simpson( f:Double=>Double, a:Double, b:Double):Double = {
    (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}

simpson(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
simpson(x => (3*math.pow(x,2)), 0,2)
simpson(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
simpson(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
simpson(x => (math.pow(math.E, x)), 0, 1)
simpson(x => (1/math.sqrt(x-1)),2,3)
simpson(x => (1/(1 + math.pow(x,2))),0,1)

// Simpson compuesta
def compuesta( f:Double=>Double, a:Double, b:Double):Double = {
    val n = 2
    val h = (b-a)/n
    val r = (1 to n/2).toList
    val suma = r.map(j => (f(a+2*j*h-2)+4*f(a+2*j*h-1)+f(a+2*j*h))).sum
    (h/3)* suma
}
/*
def compuesta( f:Double=>Double, a:Double, b:Double):Double = {
    val n = 4
    val h = (b-a)/n
    val r = (1 to (n/2)).toList
    val xj = r.map(j => a + j*h)
    val suma = xj.map(x => (f(2*x-2)+4*f(2*x-1)+f(2*x))).sum
    (h/3)* suma
}
*/
compuesta(x => (-math.pow(x, 2) + 8*x - 12), 3, 5)
compuesta(x => (3*math.pow(x,2)), 0,2)
compuesta(x => (x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)), -1, 1)
compuesta(x => ((2*x+1)/(math.pow(x,2) + x)),1,2)
compuesta(x => (math.pow(math.E, x)), 0, 1)
compuesta(x => (1/math.sqrt(x-1)),2,3)
compuesta(x => (1/(1 + math.pow(x,2))),0,1)
