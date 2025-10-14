let f=[1,2,3,4,5,6,7];
let res=f.filter((ele)=>ele %2 ==0);
console.log("filter:",res);

let sum=f.reduce((sum,current)=>sum+current,0);
console.log("sum:",sum);

