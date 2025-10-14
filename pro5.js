let add=(a,b)=>a+b;

console.log(add(2,3));

let max_num=(a,b,c)=>{
    if(a>=b && a>=c) return a;
    else if(b>=a && b>=c) return b;
    else return c;
    }
    console.log("max num:",max_num(1,2,3));
    